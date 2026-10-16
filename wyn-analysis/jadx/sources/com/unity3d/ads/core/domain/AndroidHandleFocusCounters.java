package com.unity3d.ads.core.domain;

import Cf.g;
import Cf.h;
import Cf.i;
import Ef.A;
import Ef.H;
import Hf.InterfaceC0592c0;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import ef.C2515C;
import j$.util.concurrent.ConcurrentHashMap;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR*\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b$\u0010\u0019\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0012R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "focusRepository", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "isAdActivity", "LEf/A;", "defaultDispatcher", "LCf/i;", "timeSource", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/FocusRepository;Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;LEf/A;LCf/i;)V", "", "activityName", "Lef/C;", "onResume", "(Ljava/lang/String;)V", "onPause", "Lcom/unity3d/ads/core/data/repository/FocusState;", "newState", "onFocusStateChange", "(Lcom/unity3d/ads/core/data/repository/FocusState;)V", "invoke", "()V", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "LEf/A;", "LCf/i;", "latestKnownActivityResumed", "Ljava/lang/String;", "getLatestKnownActivityResumed", "()Ljava/lang/String;", "setLatestKnownActivityResumed", "getLatestKnownActivityResumed$annotations", "j$/util/concurrent/ConcurrentHashMap", "LCf/g;", "focusTimesPerActivity", "Lj$/util/concurrent/ConcurrentHashMap;", "LHf/c0;", "previousFocusState", "LHf/c0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidHandleFocusCounters {

    @NotNull
    private final A defaultDispatcher;

    @NotNull
    private final FocusRepository focusRepository;

    @NotNull
    private final ConcurrentHashMap<String, g> focusTimesPerActivity;

    @NotNull
    private final AndroidGetIsAdActivity isAdActivity;

    @Nullable
    private volatile String latestKnownActivityResumed;

    @NotNull
    private final InterfaceC0592c0 previousFocusState;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final i timeSource;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState;", "event", "Lef/C;", "<anonymous>", "(Lcom/unity3d/ads/core/data/repository/FocusState;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass1 anonymousClass1 = AndroidHandleFocusCounters.this.new AnonymousClass1(interfaceC3103c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull FocusState focusState, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(focusState, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                kf.a r0 = kf.a.f39711a
                int r0 = r3.label
                if (r0 != 0) goto L5c
                Fe.e.U(r4)
                java.lang.Object r4 = r3.L$0
                com.unity3d.ads.core.data.repository.FocusState r4 = (com.unity3d.ads.core.data.repository.FocusState) r4
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters r0 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.this
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters.access$onFocusStateChange(r0, r4)
                java.lang.ref.WeakReference r0 = r4.getActivity()
                java.lang.Object r0 = r0.get()
                android.app.Activity r0 = (android.app.Activity) r0
                if (r0 == 0) goto L2e
                java.lang.Class r0 = r0.getClass()
                kotlin.jvm.internal.I r1 = kotlin.jvm.internal.H.f39741a
                kotlin.reflect.KClass r0 = r1.getOrCreateKotlinClass(r0)
                java.lang.String r0 = r0.getQualifiedName()
                if (r0 != 0) goto L30
            L2e:
                java.lang.String r0 = "unknown_activity_name"
            L30:
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters r1 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.this
                com.unity3d.ads.core.domain.AndroidGetIsAdActivity r1 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.access$isAdActivity$p(r1)
                boolean r1 = r1.invoke(r0)
                ef.C r2 = ef.C2515C.f34653a
                if (r1 != 0) goto L3f
                goto L5b
            L3f:
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters r1 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.this
                com.unity3d.ads.core.data.repository.SessionRepository r1 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.access$getSessionRepository$p(r1)
                r1.incrementGlobalAdsFocusChangeCount()
                boolean r1 = r4 instanceof com.unity3d.ads.core.data.repository.FocusState.Focused
                if (r1 == 0) goto L52
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters r4 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.this
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters.access$onResume(r4, r0)
                return r2
            L52:
                boolean r4 = r4 instanceof com.unity3d.ads.core.data.repository.FocusState.Unfocused
                if (r4 == 0) goto L5b
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters r4 = com.unity3d.ads.core.domain.AndroidHandleFocusCounters.this
                com.unity3d.ads.core.domain.AndroidHandleFocusCounters.access$onPause(r4, r0)
            L5b:
                return r2
            L5c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleFocusCounters.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidHandleFocusCounters(@NotNull SessionRepository sessionRepository, @NotNull FocusRepository focusRepository, @NotNull AndroidGetIsAdActivity isAdActivity, @NotNull A defaultDispatcher, @NotNull i timeSource) {
        AbstractC3340k.e(sessionRepository, "sessionRepository");
        AbstractC3340k.e(focusRepository, "focusRepository");
        AbstractC3340k.e(isAdActivity, "isAdActivity");
        AbstractC3340k.e(defaultDispatcher, "defaultDispatcher");
        AbstractC3340k.e(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = k0.c(null);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState newState) {
        x0 x0Var;
        Object value;
        FocusState focusState;
        InterfaceC0592c0 interfaceC0592c0 = this.previousFocusState;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
            focusState = (FocusState) value;
        } while (!x0Var.i(value, newState));
        if (focusState == null || newState.getClass() == focusState.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String activityName) {
        String str = this.latestKnownActivityResumed;
        if (str == null || str.equals(activityName)) {
            g gVarRemove = this.focusTimesPerActivity.remove(activityName);
            if (gVarRemove == null) {
                gVarRemove = this.timeSource.a();
            }
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) Cf.a.d(g.a(gVarRemove.f2221a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String activityName) {
        this.latestKnownActivityResumed = activityName;
        this.focusTimesPerActivity.put(activityName, this.timeSource.a());
    }

    @Nullable
    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        k0.u(new Z(this.focusRepository.getFocusState(), new AnonymousClass1(null), 0), H.c(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(@Nullable String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, A a5, i iVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, a5, (i5 & 16) != 0 ? h.f2222b : iVar);
    }
}
