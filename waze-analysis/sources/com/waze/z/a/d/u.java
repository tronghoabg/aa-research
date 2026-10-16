package com.waze.z.a.d;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.uid.VehicleType;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f45986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45990e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f45991f;

    public /* synthetic */ u(com.waze.ui.u.aj ajVar, h.g.a.l lVar, Modifier modifier, MutableTransitionState mutableTransitionState, int i2, int i3) {
        this.f45991f = i3;
        this.f45990e = ajVar;
        this.f45986a = lVar;
        this.f45989d = modifier;
        this.f45988c = mutableTransitionState;
        this.f45987b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.z.a.d.an, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f45991f;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f45987b;
            ?? r3 = this.f45990e;
            ?? r2 = this.f45989d;
            h.g.a.l lVar = this.f45986a;
            return ai.n(this.f45988c, lVar, r2, r3, i3, (Composer) obj);
        }
        if (i2 != 1) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f45987b;
            ?? r5 = this.f45990e;
            ?? r4 = this.f45989d;
            com.waze.uid.activities.a.f((VehicleType) this.f45988c, this.f45986a, r4, r5, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i5 = this.f45987b;
        Object obj3 = this.f45988c;
        ?? r22 = this.f45989d;
        com.waze.ui.u.g.b((com.waze.ui.u.aj) this.f45990e, this.f45986a, r22, (MutableTransitionState) obj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ u(Object obj, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f45991f = i3;
        this.f45988c = obj;
        this.f45986a = lVar;
        this.f45989d = aVar;
        this.f45990e = aVar2;
        this.f45987b = i2;
    }
}
