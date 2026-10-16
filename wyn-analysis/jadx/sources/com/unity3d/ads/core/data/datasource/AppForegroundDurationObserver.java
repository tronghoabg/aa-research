package com.unity3d.ads.core.data.datasource;

import Ef.A;
import Ef.B;
import Ef.E;
import Ef.H;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import android.os.SystemClock;
import com.unity3d.services.core.properties.SdkProperties;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AppForegroundDurationObserver;", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "LEf/A;", "defaultDispatcher", "Lkotlin/Function0;", "", "elapsedRealtimeProvider", "initTimeProvider", "<init>", "(Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;LEf/A;Ltf/a;Ltf/a;)V", "currentAccumulatedBackgroundMs", "()J", "Lef/C;", "onBackground", "()V", "onForeground", "invoke", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "LEf/A;", "Ltf/a;", "LHf/c0;", "", "isRunning", "LHf/c0;", "Ljava/util/concurrent/atomic/AtomicLong;", "accumulatedBackgroundMs", "Ljava/util/concurrent/atomic/AtomicLong;", "backgroundStartMs", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInBackground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "LEf/E;", "scope", "LEf/E;", "getSessionDurationInForegroundMs", "sessionDurationInForegroundMs", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppForegroundDurationObserver implements ForegroundDurationReader {

    @NotNull
    private final AtomicLong accumulatedBackgroundMs;

    @NotNull
    private final AtomicLong backgroundStartMs;

    @NotNull
    private final A defaultDispatcher;

    @NotNull
    private final tf.a elapsedRealtimeProvider;

    @NotNull
    private final tf.a initTimeProvider;

    @NotNull
    private final AtomicBoolean isInBackground;

    @NotNull
    private final InterfaceC0592c0 isRunning;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final E scope;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final Long invoke() {
            return Long.valueOf(SdkProperties.getInitializationTime());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "active", "Lef/C;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2", f = "AppForegroundDurationObserver.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22792 extends AbstractC3471j implements p {
        /* synthetic */ boolean Z$0;
        int label;

        public C22792(InterfaceC3103c<? super C22792> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            C22792 c22792 = AppForegroundDurationObserver.this.new C22792(interfaceC3103c);
            c22792.Z$0 = ((Boolean) obj).booleanValue();
            return c22792;
        }

        @Override // tf.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC3103c<? super C2515C>) obj2);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            if (this.Z$0) {
                AppForegroundDurationObserver.this.onForeground();
            } else {
                AppForegroundDurationObserver.this.onBackground();
            }
            return C2515C.f34653a;
        }

        @Nullable
        public final Object invoke(boolean z2, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((C22792) create(Boolean.valueOf(z2), interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }
    }

    public AppForegroundDurationObserver(@NotNull LifecycleDataSource lifecycleDataSource, @NotNull A defaultDispatcher, @NotNull tf.a elapsedRealtimeProvider, @NotNull tf.a initTimeProvider) {
        AbstractC3340k.e(lifecycleDataSource, "lifecycleDataSource");
        AbstractC3340k.e(defaultDispatcher, "defaultDispatcher");
        AbstractC3340k.e(elapsedRealtimeProvider, "elapsedRealtimeProvider");
        AbstractC3340k.e(initTimeProvider, "initTimeProvider");
        this.lifecycleDataSource = lifecycleDataSource;
        this.defaultDispatcher = defaultDispatcher;
        this.elapsedRealtimeProvider = elapsedRealtimeProvider;
        this.initTimeProvider = initTimeProvider;
        this.isRunning = k0.c(Boolean.FALSE);
        this.accumulatedBackgroundMs = new AtomicLong(0L);
        this.backgroundStartMs = new AtomicLong(0L);
        this.isInBackground = new AtomicBoolean(false);
        this.scope = H.c(defaultDispatcher.plus(new AppForegroundDurationObserver$special$$inlined$CoroutineExceptionHandler$1(B.f3657a)));
    }

    private final long currentAccumulatedBackgroundMs() {
        long j8 = this.accumulatedBackgroundMs.get();
        if (!this.isInBackground.get()) {
            return j8;
        }
        return (((Number) this.elapsedRealtimeProvider.invoke()).longValue() - this.backgroundStartMs.get()) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackground() {
        if (this.isInBackground.compareAndSet(false, true)) {
            this.backgroundStartMs.set(((Number) this.elapsedRealtimeProvider.invoke()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onForeground() {
        if (this.isInBackground.compareAndSet(true, false)) {
            long j8 = this.backgroundStartMs.get();
            this.accumulatedBackgroundMs.addAndGet(((Number) this.elapsedRealtimeProvider.invoke()).longValue() - j8);
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.ForegroundDurationReader
    public long getSessionDurationInForegroundMs() {
        long jLongValue = ((Number) this.initTimeProvider.invoke()).longValue();
        if (jLongValue == 0) {
            return 0L;
        }
        return Math.max(0L, (((Number) this.elapsedRealtimeProvider.invoke()).longValue() - jLongValue) - currentAccumulatedBackgroundMs());
    }

    public final void invoke() {
        x0 x0Var;
        Object value;
        Boolean bool;
        InterfaceC0592c0 interfaceC0592c0 = this.isRunning;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!x0Var.i(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        if (!this.lifecycleDataSource.appIsForeground()) {
            this.isInBackground.set(true);
            this.backgroundStartMs.set(((Number) this.initTimeProvider.invoke()).longValue());
        }
        k0.u(new Z(this.lifecycleDataSource.getAppActive(), new C22792(null), 0), this.scope);
    }

    public /* synthetic */ AppForegroundDurationObserver(LifecycleDataSource lifecycleDataSource, A a5, tf.a aVar, tf.a aVar2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleDataSource, a5, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : aVar, (i5 & 8) != 0 ? AnonymousClass2.INSTANCE : aVar2);
    }
}
