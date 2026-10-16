package com.qonversion.android.sdk.internal.dto;

import cb.AbstractC1593a;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/ResponseJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/Response;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/Response;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/Response;)V", "Lhb/u;", "options", "Lhb/u;", "nullableStringAdapter", "Lhb/r;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResponseJsonAdapter extends r {

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    public ResponseJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("client_id", "client_uid", "client_target_id");
        this.nullableStringAdapter = moshi.c(String.class, x.f35434a, "clientId");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(30, "GeneratedJsonAdapter(Response)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public Response fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iW == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iW == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.h();
        return new Response(str, str2, str3);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable Response value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("client_id");
        this.nullableStringAdapter.toJson(writer, value_.getClientId());
        writer.w("client_uid");
        this.nullableStringAdapter.toJson(writer, value_.getClientUid());
        writer.w("client_target_id");
        this.nullableStringAdapter.toJson(writer, value_.getClientTargetId());
        writer.i();
    }
}
