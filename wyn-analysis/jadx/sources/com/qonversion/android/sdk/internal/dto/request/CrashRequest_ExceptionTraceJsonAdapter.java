package com.qonversion.android.sdk.internal.dto.request;

import cb.AbstractC1593a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_ExceptionTraceJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;", "listOfExceptionTraceElementAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CrashRequest_ExceptionTraceJsonAdapter extends r {

    @NotNull
    private final r listOfExceptionTraceElementAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r stringAdapter;

    public CrashRequest_ExceptionTraceJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("rawStackTrace", "class", PglCryptUtils.KEY_MESSAGE, "elements");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "rawStackTrace");
        this.listOfExceptionTraceElementAdapter = moshi.c(P.f(List.class, CrashRequest.ExceptionTraceElement.class), xVar, "elements");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(49, "GeneratedJsonAdapter(CrashRequest.ExceptionTrace)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public CrashRequest.ExceptionTrace fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw f.l("rawStackTrace", "rawStackTrace", reader);
                }
            } else if (iW == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw f.l("className", "class", reader);
                }
            } else if (iW == 2) {
                str3 = (String) this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw f.l(PglCryptUtils.KEY_MESSAGE, PglCryptUtils.KEY_MESSAGE, reader);
                }
            } else if (iW == 3 && (list = (List) this.listOfExceptionTraceElementAdapter.fromJson(reader)) == null) {
                throw f.l("elements", "elements", reader);
            }
        }
        reader.h();
        if (str == null) {
            throw f.f("rawStackTrace", "rawStackTrace", reader);
        }
        if (str2 == null) {
            throw f.f("className", "class", reader);
        }
        if (str3 == null) {
            throw f.f(PglCryptUtils.KEY_MESSAGE, PglCryptUtils.KEY_MESSAGE, reader);
        }
        if (list != null) {
            return new CrashRequest.ExceptionTrace(str, str2, str3, list);
        }
        throw f.f("elements", "elements", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable CrashRequest.ExceptionTrace value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("rawStackTrace");
        this.stringAdapter.toJson(writer, value_.getRawStackTrace());
        writer.w("class");
        this.stringAdapter.toJson(writer, value_.getClassName());
        writer.w(PglCryptUtils.KEY_MESSAGE);
        this.stringAdapter.toJson(writer, value_.getMessage());
        writer.w("elements");
        this.listOfExceptionTraceElementAdapter.toJson(writer, value_.getElements());
        writer.i();
    }
}
