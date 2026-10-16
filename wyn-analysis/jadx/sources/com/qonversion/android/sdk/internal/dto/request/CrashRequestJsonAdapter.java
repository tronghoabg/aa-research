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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequestJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;)V", "Lhb/u;", "options", "Lhb/u;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "exceptionInfoAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;", "deviceInfoAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CrashRequestJsonAdapter extends r {

    @NotNull
    private final r deviceInfoAdapter;

    @NotNull
    private final r exceptionInfoAdapter;

    @NotNull
    private final u options;

    public CrashRequestJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("exception", "device");
        x xVar = x.f35434a;
        this.exceptionInfoAdapter = moshi.c(CrashRequest.ExceptionInfo.class, xVar, "log");
        this.deviceInfoAdapter = moshi.c(CrashRequest.DeviceInfo.class, xVar, "deviceInfo");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(34, "GeneratedJsonAdapter(CrashRequest)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public CrashRequest fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        CrashRequest.ExceptionInfo exceptionInfo = null;
        CrashRequest.DeviceInfo deviceInfo = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                exceptionInfo = (CrashRequest.ExceptionInfo) this.exceptionInfoAdapter.fromJson(reader);
                if (exceptionInfo == null) {
                    throw f.l("log", "exception", reader);
                }
            } else if (iW == 1 && (deviceInfo = (CrashRequest.DeviceInfo) this.deviceInfoAdapter.fromJson(reader)) == null) {
                throw f.l("deviceInfo", "device", reader);
            }
        }
        reader.h();
        if (exceptionInfo == null) {
            throw f.f("log", "exception", reader);
        }
        if (deviceInfo != null) {
            return new CrashRequest(exceptionInfo, deviceInfo);
        }
        throw f.f("deviceInfo", "device", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable CrashRequest value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("exception");
        this.exceptionInfoAdapter.toJson(writer, value_.getLog());
        writer.w("device");
        this.deviceInfoAdapter.toJson(writer, value_.getDeviceInfo());
        writer.i();
    }
}
