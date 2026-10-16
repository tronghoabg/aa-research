package com.unity3d.ads.core.domain;

import Ef.H;
import Fe.e;
import Gf.t;
import Hf.InterfaceC0602l;
import Hf.k0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p7.AbstractC3772b;
import tf.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "LHf/l;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "invoke", "()LHf/l;", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidGetLifecycleFlow {

    @NotNull
    private final Context applicationContext;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGf/t;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "Lef/C;", "<anonymous>", "(LGf/t;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements tf.a {
            final /* synthetic */ AndroidGetLifecycleFlow$invoke$2$listener$1 $listener;
            final /* synthetic */ AndroidGetLifecycleFlow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
                super(0);
                this.this$0 = androidGetLifecycleFlow;
                this.$listener = androidGetLifecycleFlow$invoke$2$listener$1;
            }

            @Override // tf.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m265invoke();
                return C2515C.f34653a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m265invoke() {
                ((Application) this.this$0.applicationContext).unregisterActivityLifecycleCallbacks(this.$listener);
            }
        }

        public AnonymousClass2(InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            AnonymousClass2 anonymousClass2 = AndroidGetLifecycleFlow.this.new AnonymousClass2(interfaceC3103c);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull t tVar, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(tVar, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kf.a aVar = kf.a.f39711a;
            int i5 = this.label;
            if (i5 == 0) {
                e.U(obj);
                final t tVar = (t) this.L$0;
                ?? r12 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                        AbstractC3340k.e(activity, "activity");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(tVar2, activity, bundle, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(@NotNull Activity activity) {
                        AbstractC3340k.e(activity, "activity");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(tVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(@NotNull Activity activity) {
                        AbstractC3340k.e(activity, "activity");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(tVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(@NotNull Activity activity) {
                        AbstractC3340k.e(activity, "activity");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(tVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
                        AbstractC3340k.e(activity, "activity");
                        AbstractC3340k.e(bundle, "bundle");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(tVar2, activity, bundle, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(@NotNull Activity activity) {
                        AbstractC3340k.e(activity, "activity");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(tVar2, activity, null), 3);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(@NotNull Activity activity) {
                        AbstractC3340k.e(activity, "activity");
                        t tVar2 = tVar;
                        H.D(tVar2, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(tVar2, activity, null), 3);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r12);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidGetLifecycleFlow.this, r12);
                this.label = 1;
                if (AbstractC3772b.f(tVar, anonymousClass1, this) == aVar) {
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

    public AndroidGetLifecycleFlow(@NotNull Context applicationContext) {
        AbstractC3340k.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @NotNull
    public final InterfaceC0602l invoke() {
        if (this.applicationContext instanceof Application) {
            return k0.j(new AnonymousClass2(null));
        }
        throw new IllegalArgumentException("Application context is required");
    }
}
