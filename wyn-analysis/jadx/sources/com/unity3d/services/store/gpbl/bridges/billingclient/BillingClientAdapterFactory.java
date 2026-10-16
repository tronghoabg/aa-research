package com.unity3d.services.store.gpbl.bridges.billingclient;

import Fe.e;
import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import ef.C2529m;
import ef.C2530n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapterFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lef/n;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "createV8Adapter-IoAF18A", "(Landroid/content/Context;)Ljava/lang/Object;", "createV8Adapter", "", "fallbackVersion", "createV6Adapter", "(Landroid/content/Context;I)Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "createBillingClientAdapter", "(Landroid/content/Context;)Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int fallbackVersion) {
        Object objZ;
        try {
            BillingClientBuilderBridge builder = BillingClientBridge.newBuilder(context);
            AbstractC3340k.d(builder, "builder");
            objZ = new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, fallbackVersion);
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        return (BillingClientAdapter) objZ;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i5 = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i5);
    }

    /* renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m301createV8AdapterIoAF18A(Context context) {
        try {
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.INSTANCE.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return billingClientAdapter;
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            return e.z(th);
        }
    }

    @Nullable
    public final BillingClientAdapter createBillingClientAdapter(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        Object objM301createV8AdapterIoAF18A = m301createV8AdapterIoAF18A(context);
        Throwable thA = C2530n.a(objM301createV8AdapterIoAF18A);
        if (thA != null) {
            objM301createV8AdapterIoAF18A = thA instanceof FallbackException ? createV6Adapter(context, ((FallbackException) thA).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) objM301createV8AdapterIoAF18A;
    }
}
