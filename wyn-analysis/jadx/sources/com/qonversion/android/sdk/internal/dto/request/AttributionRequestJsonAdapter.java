package com.qonversion.android.sdk.internal.dto.request;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.ProviderData;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)V", "Lhb/u;", "options", "Lhb/u;", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "environmentAdapter", "Lhb/r;", "stringAdapter", "Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "providerDataAdapter", "nullableStringAdapter", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AttributionRequestJsonAdapter extends r {

    @NotNull
    private final r environmentAdapter;

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r providerDataAdapter;

    @NotNull
    private final r stringAdapter;

    public AttributionRequestJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("d", "v", "access_token", "provider_data", "client_uid");
        x xVar = x.f35434a;
        this.environmentAdapter = moshi.c(Environment.class, xVar, "d");
        this.stringAdapter = moshi.c(String.class, xVar, "v");
        this.providerDataAdapter = moshi.c(ProviderData.class, xVar, "providerData");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "clientUid");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(40, "GeneratedJsonAdapter(AttributionRequest)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public AttributionRequest fromJson(@NotNull w reader) {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        Environment environment = null;
        String str = null;
        String str2 = null;
        ProviderData providerData = null;
        String str3 = null;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                environment = (Environment) this.environmentAdapter.fromJson(reader);
                if (environment == null) {
                    throw f.l("d", "d", reader);
                }
            } else if (iW == 1) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw f.l("v", "v", reader);
                }
            } else if (iW == 2) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw f.l("accessToken", "access_token", reader);
                }
            } else if (iW == 3) {
                providerData = (ProviderData) this.providerDataAdapter.fromJson(reader);
                if (providerData == null) {
                    throw f.l("providerData", "provider_data", reader);
                }
            } else if (iW == 4) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.h();
        if (environment == null) {
            throw f.f("d", "d", reader);
        }
        if (str == null) {
            throw f.f("v", "v", reader);
        }
        if (str2 == null) {
            throw f.f("accessToken", "access_token", reader);
        }
        if (providerData != null) {
            return new AttributionRequest(environment, str, str2, providerData, str3);
        }
        throw f.f("providerData", "provider_data", reader);
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable AttributionRequest value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("d");
        this.environmentAdapter.toJson(writer, value_.getD());
        writer.w("v");
        this.stringAdapter.toJson(writer, value_.getV());
        writer.w("access_token");
        this.stringAdapter.toJson(writer, value_.getAccessToken());
        writer.w("provider_data");
        this.providerDataAdapter.toJson(writer, value_.getProviderData());
        writer.w("client_uid");
        this.nullableStringAdapter.toJson(writer, value_.getClientUid());
        writer.i();
    }
}
