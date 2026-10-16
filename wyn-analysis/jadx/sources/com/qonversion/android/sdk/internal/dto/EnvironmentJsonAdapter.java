package com.qonversion.android.sdk.internal.dto;

import cb.AbstractC1593a;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/EnvironmentJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/Environment;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/Environment;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "nullableStringAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnvironmentJsonAdapter extends r {

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public EnvironmentJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("app_version", "carrier", "device_id", "locale", "manufacturer", "model", "os", "os_version", "timezone", "platform", "country", "advertiser_id");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "app_version");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "advertiserId");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(33, "GeneratedJsonAdapter(Environment)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public Environment fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        while (true) {
            String str13 = str;
            String str14 = str2;
            String str15 = str3;
            String str16 = str4;
            String str17 = str5;
            String str18 = str6;
            String str19 = str7;
            String str20 = str8;
            String str21 = str9;
            String str22 = str10;
            String str23 = str11;
            if (!reader.o()) {
                String str24 = str12;
                reader.h();
                if (str13 == null) {
                    throw f.f("app_version", "app_version", reader);
                }
                if (str14 == null) {
                    throw f.f("carrier", "carrier", reader);
                }
                if (str15 == null) {
                    throw f.f("deviceId", "device_id", reader);
                }
                if (str16 == null) {
                    throw f.f("locale", "locale", reader);
                }
                if (str17 == null) {
                    throw f.f("manufacturer", "manufacturer", reader);
                }
                if (str18 == null) {
                    throw f.f("model", "model", reader);
                }
                if (str19 == null) {
                    throw f.f("os", "os", reader);
                }
                if (str20 == null) {
                    throw f.f("osVersion", "os_version", reader);
                }
                if (str21 == null) {
                    throw f.f("timezone", "timezone", reader);
                }
                if (str22 == null) {
                    throw f.f("platform", "platform", reader);
                }
                if (str23 != null) {
                    return new Environment(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
                }
                throw f.f("country", "country", reader);
            }
            String str25 = str12;
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("app_version", "app_version", reader);
                    }
                    str12 = str25;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("carrier", "carrier", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw f.l("deviceId", "device_id", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw f.l("locale", "locale", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw f.l("manufacturer", "manufacturer", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw f.l("model", "model", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw f.l("os", "os", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 7:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw f.l("osVersion", "os_version", reader);
                    }
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                case 8:
                    String str26 = (String) this.stringAdapter.fromJson(reader);
                    if (str26 == null) {
                        throw f.l("timezone", "timezone", reader);
                    }
                    str9 = str26;
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str10 = str22;
                    str11 = str23;
                case 9:
                    String str27 = (String) this.stringAdapter.fromJson(reader);
                    if (str27 == null) {
                        throw f.l("platform", "platform", reader);
                    }
                    str10 = str27;
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str11 = str23;
                case 10:
                    String str28 = (String) this.stringAdapter.fromJson(reader);
                    if (str28 == null) {
                        throw f.l("country", "country", reader);
                    }
                    str11 = str28;
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
                default:
                    str12 = str25;
                    str = str13;
                    str2 = str14;
                    str3 = str15;
                    str4 = str16;
                    str5 = str17;
                    str6 = str18;
                    str7 = str19;
                    str8 = str20;
                    str9 = str21;
                    str10 = str22;
                    str11 = str23;
            }
        }
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable Environment value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("app_version");
        this.stringAdapter.toJson(writer, value_.getApp_version());
        writer.w("carrier");
        this.stringAdapter.toJson(writer, value_.getCarrier());
        writer.w("device_id");
        this.stringAdapter.toJson(writer, value_.getDeviceId());
        writer.w("locale");
        this.stringAdapter.toJson(writer, value_.getLocale());
        writer.w("manufacturer");
        this.stringAdapter.toJson(writer, value_.getManufacturer());
        writer.w("model");
        this.stringAdapter.toJson(writer, value_.getModel());
        writer.w("os");
        this.stringAdapter.toJson(writer, value_.getOs());
        writer.w("os_version");
        this.stringAdapter.toJson(writer, value_.getOsVersion());
        writer.w("timezone");
        this.stringAdapter.toJson(writer, value_.getTimezone());
        writer.w("platform");
        this.stringAdapter.toJson(writer, value_.getPlatform());
        writer.w("country");
        this.stringAdapter.toJson(writer, value_.getCountry());
        writer.w("advertiser_id");
        this.nullableStringAdapter.toJson(writer, value_.getAdvertiserId());
        writer.i();
    }
}
