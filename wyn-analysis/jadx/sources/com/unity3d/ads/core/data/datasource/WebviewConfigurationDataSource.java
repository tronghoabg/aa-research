package com.unity3d.ads.core.data.datasource;

import Fe.e;
import Hf.C0611v;
import Hf.InterfaceC0603m;
import Hf.k0;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;
import tf.q;
import u1.C4212a;
import u1.InterfaceC4220i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "", "Lu1/i;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "webviewConfigurationStore", "<init>", "(Lu1/i;)V", "get", "(Ljf/c;)Ljava/lang/Object;", JsonStorageKeyNames.DATA_KEY, "Lef/C;", "set", "(Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;Ljf/c;)Ljava/lang/Object;", "Lu1/i;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebviewConfigurationDataSource {

    @NotNull
    private final InterfaceC4220i webviewConfigurationStore;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LHf/m;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "", "exception", "Lef/C;", "<anonymous>", "(LHf/m;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(3, interfaceC3103c);
        }

        @Override // tf.q
        @Nullable
        public final Object invoke(@NotNull InterfaceC0603m interfaceC0603m, @NotNull Throwable th, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC3103c);
            anonymousClass2.L$0 = interfaceC0603m;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!(th instanceof C4212a)) {
                    throw th;
                }
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                AbstractC3340k.d(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0603m.emit(defaultInstance, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.U(obj);
            }
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22832 extends AbstractC3471j implements p {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22832(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, InterfaceC3103c<? super C22832> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$data = webViewConfigurationStore;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return new C22832(this.$data, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @Nullable InterfaceC3103c<? super WebviewConfigurationStore.WebViewConfigurationStore> interfaceC3103c) {
            return ((C22832) create(webViewConfigurationStore, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(@NotNull InterfaceC4220i webviewConfigurationStore) {
        AbstractC3340k.e(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    @Nullable
    public final Object get(@NotNull InterfaceC3103c<? super WebviewConfigurationStore.WebViewConfigurationStore> interfaceC3103c) {
        return k0.o(new C0611v(this.webviewConfigurationStore.getData(), new AnonymousClass2(null)), interfaceC3103c);
    }

    @Nullable
    public final Object set(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        Object objA = this.webviewConfigurationStore.a(new C22832(webViewConfigurationStore, null), interfaceC3103c);
        return objA == kf.a.f39711a ? objA : C2515C.f34653a;
    }
}
