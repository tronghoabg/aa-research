package com.waze.ui.e;

import android.content.res.Configuration;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f42189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f42190b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Transition transition, v vVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42191c = i2;
        this.f42189a = transition;
        this.f42190b = vVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.hapticfeedback.HapticFeedback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f42191c;
        if (i2 == 0) {
            return new c((v) this.f42189a, (y) this.f42190b, eVar, 0);
        }
        if (i2 == 1) {
            return new c((HapticFeedback) this.f42190b, (MutableState) this.f42189a, eVar, 1);
        }
        if (i2 != 2) {
            return new c((v) this.f42190b, (Configuration) this.f42189a, eVar, 3);
        }
        return new c((Transition) this.f42189a, (v) this.f42190b, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f42191c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.hapticfeedback.HapticFeedback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        CompletableDeferred completableDeferredG;
        int i2 = this.f42191c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((v) this.f42189a).m((y) this.f42190b);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (w.t(this.f42189a) != null) {
                this.f42190b.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9042getConfirm5zf0vsI());
            }
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((v) this.f42190b).k(((Configuration) this.f42189a).orientation);
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Transition transition = (Transition) this.f42189a;
        if (!transition.isRunning() && (((xVar = (x) transition.getTargetState()) == x.f42252a || xVar == x.f42255d) && (completableDeferredG = ((v) this.f42190b).g()) != null)) {
            completableDeferredG.a(h.ab.f48028a);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(HapticFeedback hapticFeedback, MutableState mutableState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42191c = i2;
        this.f42190b = hapticFeedback;
        this.f42189a = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(v vVar, Configuration configuration, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42191c = i2;
        this.f42190b = vVar;
        this.f42189a = configuration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(v vVar, y yVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42191c = i2;
        this.f42189a = vVar;
        this.f42190b = yVar;
    }
}
