package com.unity3d.ads.core.data.datasource;

import Ef.A;
import Ef.B;
import Ef.E;
import Ef.H;
import Fe.e;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CachedFIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "LEf/A;", "dispatcher", "dataSource", "<init>", "(LEf/A;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;)V", "", "invoke", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "loaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "Ljava/lang/String;", "LEf/E;", "scope", "LEf/E;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CachedFIdDataSource implements FIdDataSource {

    @NotNull
    private final FIdDataSource dataSource;

    @NotNull
    private AtomicBoolean loaded;

    @NotNull
    private E scope;

    @Nullable
    private volatile String value;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        int label;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return CachedFIdDataSource.this.new AnonymousClass1(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
            cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
            return C2515C.f34653a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable Throwable th) {
            H.j(CachedFIdDataSource.this.scope, null);
            CachedFIdDataSource.this.loaded.set(true);
        }
    }

    public CachedFIdDataSource(@NotNull A dispatcher, @NotNull FIdDataSource dataSource) {
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.loaded = new AtomicBoolean(false);
        Kd.a aVarF = H.F(H.c(dispatcher), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(B.f3657a));
        this.scope = aVarF;
        H.D(aVarF, null, new AnonymousClass1(null), 3).invokeOnCompletion(new AnonymousClass2());
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    @Nullable
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
