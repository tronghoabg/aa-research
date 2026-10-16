package com.qonversion.android.sdk.internal.dto.request;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseDetails;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;)V", "Lhb/u;", "options", "Lhb/u;", "", "longAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/internal/dto/Environment;", "environmentAdapter", "stringAdapter", "nullableStringAdapter", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "purchaseDetailsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseRequestJsonAdapter extends r {

    @Nullable
    private volatile Constructor<PurchaseRequest> constructorRef;

    @NotNull
    private final r environmentAdapter;

    @NotNull
    private final r longAdapter;

    @NotNull
    private final r nullableStringAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r purchaseDetailsAdapter;

    @NotNull
    private final r stringAdapter;

    public PurchaseRequestJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("install_date", "device", "version", "access_token", "q_uid", "receipt", "debug_mode", "purchase");
        x xVar = x.f35434a;
        this.longAdapter = moshi.c(Long.TYPE, xVar, "installDate");
        this.environmentAdapter = moshi.c(Environment.class, xVar, "device");
        this.stringAdapter = moshi.c(String.class, xVar, "version");
        this.nullableStringAdapter = moshi.c(String.class, xVar, "clientUid");
        this.purchaseDetailsAdapter = moshi.c(PurchaseDetails.class, xVar, "purchase");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(37, "GeneratedJsonAdapter(PurchaseRequest)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public PurchaseRequest fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        int i5 = -1;
        String str = null;
        Long l10 = null;
        Environment environment = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PurchaseDetails purchaseDetails = null;
        while (reader.o()) {
            switch (reader.W(this.options)) {
                case -1:
                    reader.Y();
                    reader.Z();
                    break;
                case 0:
                    l10 = (Long) this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        throw f.l("installDate", "install_date", reader);
                    }
                    break;
                case 1:
                    environment = (Environment) this.environmentAdapter.fromJson(reader);
                    if (environment == null) {
                        throw f.l("device", "device", reader);
                    }
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw f.l("version", "version", reader);
                    }
                    break;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw f.l("accessToken", "access_token", reader);
                    }
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw f.l("receipt", "receipt", reader);
                    }
                    i5 = -33;
                    break;
                case 6:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw f.l("debugMode", "debug_mode", reader);
                    }
                    break;
                case 7:
                    purchaseDetails = (PurchaseDetails) this.purchaseDetailsAdapter.fromJson(reader);
                    if (purchaseDetails == null) {
                        throw f.l("purchase", "purchase", reader);
                    }
                    break;
            }
        }
        reader.h();
        if (i5 == -33) {
            if (l10 == null) {
                throw f.f("installDate", "install_date", reader);
            }
            long jLongValue = l10.longValue();
            if (environment == null) {
                throw f.f("device", "device", reader);
            }
            if (str2 == null) {
                throw f.f("version", "version", reader);
            }
            if (str3 == null) {
                throw f.f("accessToken", "access_token", reader);
            }
            AbstractC3340k.c(str, "null cannot be cast to non-null type kotlin.String");
            if (str5 == null) {
                throw f.f("debugMode", "debug_mode", reader);
            }
            if (purchaseDetails != null) {
                return new PurchaseRequest(jLongValue, environment, str2, str3, str4, str, str5, purchaseDetails);
            }
            throw f.f("purchase", "purchase", reader);
        }
        Constructor<PurchaseRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PurchaseRequest.class.getDeclaredConstructor(Long.TYPE, Environment.class, String.class, String.class, String.class, String.class, String.class, PurchaseDetails.class, Integer.TYPE, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        }
        if (l10 == null) {
            throw f.f("installDate", "install_date", reader);
        }
        if (environment == null) {
            throw f.f("device", "device", reader);
        }
        if (str2 == null) {
            throw f.f("version", "version", reader);
        }
        if (str3 == null) {
            throw f.f("accessToken", "access_token", reader);
        }
        if (str5 == null) {
            throw f.f("debugMode", "debug_mode", reader);
        }
        if (purchaseDetails == null) {
            throw f.f("purchase", "purchase", reader);
        }
        PurchaseRequest purchaseRequestNewInstance = declaredConstructor.newInstance(l10, environment, str2, str3, str4, str, str5, purchaseDetails, Integer.valueOf(i5), null);
        AbstractC3340k.d(purchaseRequestNewInstance, "newInstance(...)");
        return purchaseRequestNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable PurchaseRequest value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("install_date");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getInstallDate()));
        writer.w("device");
        this.environmentAdapter.toJson(writer, value_.getDevice());
        writer.w("version");
        this.stringAdapter.toJson(writer, value_.getVersion());
        writer.w("access_token");
        this.stringAdapter.toJson(writer, value_.getAccessToken());
        writer.w("q_uid");
        this.nullableStringAdapter.toJson(writer, value_.getClientUid());
        writer.w("receipt");
        this.stringAdapter.toJson(writer, value_.getReceipt());
        writer.w("debug_mode");
        this.stringAdapter.toJson(writer, value_.getDebugMode());
        writer.w("purchase");
        this.purchaseDetailsAdapter.toJson(writer, value_.getPurchase());
        writer.i();
    }
}
