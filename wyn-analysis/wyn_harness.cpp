#include <dlfcn.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <atomic>
#include <cmath>

using DartPort = int64_t;

enum DartType {
    kNull, kBool, kInt32, kInt64, kDouble, kString, kArray, kTypedData,
    kExternalTypedData, kSendPort, kCapability, kNativePointer
};

struct DartObject {
    int32_t type;
    int32_t padding;
    union {
        bool as_bool;
        int32_t as_int32;
        int64_t as_int64;
        double as_double;
        const char* as_string;
        struct { intptr_t length; DartObject** values; } as_array;
        struct { int32_t type; int32_t padding; intptr_t length; const uint8_t* values; } as_typed_data;
        struct { intptr_t ptr; intptr_t size; void* callback; } as_native_pointer;
    } value;
};

static void dump(DartObject* object, int depth = 0) {
    if (!object) { printf("null-pointer"); return; }
    switch (object->type) {
        case kNull: printf("null"); break;
        case kBool: printf(object->value.as_bool ? "true" : "false"); break;
        case kInt32: printf("%d", object->value.as_int32); break;
        case kInt64: printf("%lld", (long long)object->value.as_int64); break;
        case kDouble: printf("%.12g", object->value.as_double); break;
        case kString: printf("\"%s\"", object->value.as_string); break;
        case kArray:
            printf("[");
            for (intptr_t i = 0; i < object->value.as_array.length; i++) {
                if (i) printf(",");
                dump(object->value.as_array.values[i], depth + 1);
            }
            printf("]");
            break;
        case kNativePointer:
            printf("{native_ptr:%p,size:%lld}", (void*)object->value.as_native_pointer.ptr,
                   (long long)object->value.as_native_pointer.size);
            break;
        default: printf("{type:%d}", object->type);
    }
}

static std::atomic<uintptr_t> database_handle{0};
struct Attempt { int unit, swap, lat_step, lon_step, heading; };
static Attempt attempts[12000];
static constexpr double center_lat = 21.365805;
static constexpr double center_lon = 106.089771;

static bool post_object(DartPort port, DartObject* object) {
    bool has_payload = object && object->type == kArray && object->value.as_array.length >= 2 &&
        object->value.as_array.values[1] && object->value.as_array.values[1]->type != kNull;
    if (port == 42 || has_payload) {
        if (port >= 2000 && port < 14000) {
            Attempt a = attempts[port - 2000];
            printf("MATCH unit=%s swap=%d lat=%.6f lon=%.6f heading=%d ",
                   a.unit ? "rad" : "deg", a.swap,
                   center_lat + a.lat_step * 0.002,
                   center_lon + a.lon_step * 0.002, a.heading);
        }
        printf("POST port=%lld value=", (long long)port);
        dump(object);
        printf("\n");
        fflush(stdout);
    }
    if (port == 42 && object && object->type == kArray && object->value.as_array.length >= 2) {
        DartObject* payload = object->value.as_array.values[1];
        if (payload && payload->type == kArray && payload->value.as_array.length >= 1) {
            DartObject* pointer = payload->value.as_array.values[0];
            if (pointer && pointer->type == kInt64) {
                database_handle.store(static_cast<uintptr_t>(pointer->value.as_int64));
            }
        }
    }
    return true;
}

struct WireU8List { uint8_t* ptr; int32_t len; int32_t padding; };
// Wire layout recovered from the Flutter AOT marshaller.
struct StreetSignConfig {
    double field0;
    int32_t direction;
    int32_t padding;
    double field2;
    double field3;
    double field4;
    double field5;
    double* optional6;
    double* optional7;
    double* optional8;
    double field9;
    double fixed50;
    double field11;
    double fixed75;
};

struct ProbeParam {
    int32_t latitude_e6;
    int32_t longitude_e6;
    double bearing;
    double speed_kmh;
    StreetSignConfig* street_sign_config;
    double* optional_value;
};

int main(int argc, char** argv) {
    if (argc != 3) {
        fprintf(stderr, "usage: %s libwynlib.so data.wmap\n", argv[0]);
        return 2;
    }
    void* lib = dlopen(argv[1], RTLD_NOW | RTLD_LOCAL);
    if (!lib) { fprintf(stderr, "dlopen: %s\n", dlerror()); return 3; }

    auto store_post = reinterpret_cast<void (*)(void*)>(dlsym(lib, "store_dart_post_cobject"));
    auto new_u8 = reinterpret_cast<WireU8List* (*)(int32_t)>(
        dlsym(lib, "frbgen_wyn_cst_new_list_prim_u_8_strict"));
    auto create_db = reinterpret_cast<void (*)(DartPort, WireU8List*)>(
        dlsym(lib, "frbgen_wyn_wire__crate__api__api__wyn_database_create"));
    auto new_probe = reinterpret_cast<ProbeParam* (*)()>(
        dlsym(lib, "frbgen_wyn_cst_new_box_autoadd_speed_limit_probe_param"));
    auto new_f64 = reinterpret_cast<double* (*)(double)>(
        dlsym(lib, "frbgen_wyn_cst_new_box_autoadd_f_64"));
    auto new_ss_config = reinterpret_cast<StreetSignConfig* (*)()>(
        dlsym(lib, "frbgen_wyn_cst_new_box_autoadd_street_sign_config"));
    auto probe_sl = reinterpret_cast<void (*)(DartPort, uintptr_t, ProbeParam*)>(
        dlsym(lib, "frbgen_wyn_wire__crate__api__api__probe_sl"));
    auto probe_ss = reinterpret_cast<void (*)(DartPort, uintptr_t, ProbeParam*)>(
        dlsym(lib, "frbgen_wyn_wire__crate__api__api__probe_ss_list"));
    auto increment_db = reinterpret_cast<void (*)(uintptr_t)>(dlsym(lib,
        "frbgen_wyn_rust_arc_increment_strong_count_RustOpaque_flutter_rust_bridgefor_generatedRustAutoOpaqueInnerWynDatabase"));
    if (!store_post || !new_u8 || !create_db || !new_probe || !new_f64 || !new_ss_config || !probe_sl || !probe_ss || !increment_db) {
        fprintf(stderr, "missing exports\n"); return 4;
    }
    store_post(reinterpret_cast<void*>(&post_object));

    FILE* input = fopen(argv[2], "rb");
    if (!input) { perror("data.wmap"); return 5; }
    fseek(input, 0, SEEK_END);
    long length = ftell(input);
    rewind(input);
    WireU8List* data = new_u8(static_cast<int32_t>(length));
    if (!data || fread(data->ptr, 1, length, input) != static_cast<size_t>(length)) {
        fprintf(stderr, "failed reading database\n"); return 6;
    }
    fclose(input);
    printf("CREATE_DB bytes=%ld wire=%p data=%p len=%d\n", length, data, data->ptr, data->len);
    create_db(42, data);
    for (int i = 0; i < 200 && database_handle.load() == 0; i++) usleep(100000);
    uintptr_t handle = database_handle.load();
    if (!handle) { fprintf(stderr, "database callback timeout\n"); return 7; }
    int port = 2000;
    const double bearings[] = {0.0, 45.0, 90.0, 135.0, 180.0, 225.0, 270.0, 315.0};
    for (int unit = 0; unit < 1; unit++) {
        for (int swap = 0; swap < 1; swap++) {
            for (int lat_step = -10; lat_step <= 10; lat_step++) {
                for (int lon_step = -10; lon_step <= 10; lon_step++) {
                    double lat = center_lat + lat_step * 0.002;
                    double lon = center_lon + lon_step * 0.002;
                    for (int heading_index = 0; heading_index <= 7; heading_index++) {
                        ProbeParam* param = new_probe();
                        memset(param, 0, sizeof(*param));
                        double a = lat;
                        double b = lon;
                        param->latitude_e6 = static_cast<int32_t>((swap ? b : a) * 1000000.0);
                        param->longitude_e6 = static_cast<int32_t>((swap ? a : b) * 1000000.0);
                        param->bearing = bearings[heading_index];
                        param->speed_kmh = 36.0;
                        param->street_sign_config = nullptr;
                        param->optional_value = nullptr;
                        increment_db(handle);
                        attempts[port - 2000] = {unit, swap, lat_step, lon_step, heading_index};
                        probe_sl(port++, handle, param);
                    }
                }
            }
        }
    }
    sleep(60);
    return 0;
}
