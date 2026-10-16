package com.unity3d.ads.core.data.datasource;

import Ef.A;
import Ef.H;
import ac.C1346a;
import android.content.Context;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import u1.C4212a;
import u1.C4221j;
import u1.InterfaceC4220i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "", "Landroid/content/Context;", "context", "LEf/A;", "dispatcher", "<init>", "(Landroid/content/Context;LEf/A;)V", "Lu1/i;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "createDataStore", "()Lu1/i;", "invoke", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "LEf/A;", "getDispatcher", "()LEf/A;", "cachedDataStore", "Lu1/i;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalRequestDataStoreProvider {

    @Nullable
    private InterfaceC4220i cachedDataStore;

    @NotNull
    private final Context context;

    @NotNull
    private final A dispatcher;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/a;", "it", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "invoke", "(Lu1/a;)Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$createDataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final UniversalRequestStoreOuterClass.UniversalRequestStore invoke(@NotNull C4212a it) {
            AbstractC3340k.e(it, "it");
            return new UniversalRequestStoreSerializer().getDefaultValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$createDataStore$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements tf.a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(UniversalRequestDataStoreProvider.this.getContext(), ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
        }
    }

    public UniversalRequestDataStoreProvider(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
    }

    private final InterfaceC4220i createDataStore() {
        return C4221j.a(new UniversalRequestStoreSerializer(), new C1346a(AnonymousClass1.INSTANCE), null, H.c(this.dispatcher.plus(H.f())), new AnonymousClass2(), 4);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final A getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final InterfaceC4220i invoke() {
        synchronized (this) {
            InterfaceC4220i interfaceC4220i = this.cachedDataStore;
            if (interfaceC4220i != null) {
                return interfaceC4220i;
            }
            InterfaceC4220i interfaceC4220iCreateDataStore = createDataStore();
            this.cachedDataStore = interfaceC4220iCreateDataStore;
            return interfaceC4220iCreateDataStore;
        }
    }
}
