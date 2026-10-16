package com.qonversion.android.sdk.internal.dto.request;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CrashRequest_DeviceInfoJsonAdapter extends r {

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public CrashRequest_DeviceInfoJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("platform", "platform_version", "source", "source_version", "project_key", "uid");
        this.stringAdapter = moshi.c(String.class, x.f35434a, "platform");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(45, "GeneratedJsonAdapter(CrashRequest.DeviceInfo)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public CrashRequest.DeviceInfo fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            if (!reader.o()) {
                String str8 = str2;
                reader.h();
                if (str7 == null) {
                    throw f.f("platform", "platform", reader);
                }
                if (str8 == null) {
                    throw f.f("platformVersion", "platform_version", reader);
                }
                if (str3 == null) {
                    throw f.f("source", "source", reader);
                }
                if (str4 == null) {
                    throw f.f("sourceVersion", "source_version", reader);
                }
                if (str5 == null) {
                    throw f.f("projectKey", "project_key", reader);
                }
                if (str6 != null) {
                    return new CrashRequest.DeviceInfo(str7, str8, str3, str4, str5, str6);
                }
                throw f.f("uid", "uid", reader);
            }
            String str9 = str2;
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    str2 = str9;
                    str = str7;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("platform", "platform", reader);
                    }
                    str2 = str9;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("platformVersion", "platform_version", reader);
                    }
                    str = str7;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw f.l("source", "source", reader);
                    }
                    str2 = str9;
                    str = str7;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw f.l("sourceVersion", "source_version", reader);
                    }
                    str2 = str9;
                    str = str7;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw f.l("projectKey", "project_key", reader);
                    }
                    str2 = str9;
                    str = str7;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw f.l("uid", "uid", reader);
                    }
                    str2 = str9;
                    str = str7;
                default:
                    str2 = str9;
                    str = str7;
            }
        }
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable CrashRequest.DeviceInfo value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("platform");
        this.stringAdapter.toJson(writer, value_.getPlatform());
        writer.w("platform_version");
        this.stringAdapter.toJson(writer, value_.getPlatformVersion());
        writer.w("source");
        this.stringAdapter.toJson(writer, value_.getSource());
        writer.w("source_version");
        this.stringAdapter.toJson(writer, value_.getSourceVersion());
        writer.w("project_key");
        this.stringAdapter.toJson(writer, value_.getProjectKey());
        writer.w("uid");
        this.stringAdapter.toJson(writer, value_.getUid());
        writer.i();
    }
}
