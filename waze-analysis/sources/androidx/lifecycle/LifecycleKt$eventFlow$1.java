package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.a.ad;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class LifecycleKt$eventFlow$1 extends g implements p<ad<? super Lifecycle.Event>, e<? super ab>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleKt$eventFlow$1(Lifecycle lifecycle, e<? super LifecycleKt$eventFlow$1> eVar) {
        super(2, eVar);
        this.$this_eventFlow = lifecycle;
    }

    static final ab invokeSuspend$lambda$1(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, eVar);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ad<? super Lifecycle.Event> adVar, e<? super ab> eVar) {
        return ((LifecycleKt$eventFlow$1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final ad adVar = (ad) this.L$0;
            Lifecycle lifecycle = this.$this_eventFlow;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleKt$eventFlow$1$invokeSuspend$$inlined$addObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    x.f(lifecycleOwner, "source");
                    x.f(event, NotificationCompat.CATEGORY_EVENT);
                    adVar.i(event);
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        adVar.v(null);
                    }
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            final Lifecycle lifecycle2 = this.$this_eventFlow;
            this.label = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.lifecycle.LifecycleKt$eventFlow$1$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(lifecycle2, lifecycleEventObserver);
                }
            }, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
