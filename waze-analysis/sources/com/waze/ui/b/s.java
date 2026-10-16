package com.waze.ui.b;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class s implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42093d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f42094e;

    public /* synthetic */ s(Transition transition, o oVar, p pVar, int i2, int i3) {
        this.f42094e = i3;
        this.f42093d = transition;
        this.f42092c = oVar;
        this.f42091b = pVar;
        this.f42090a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42094e == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f42090a;
            ?? r0 = this.f42093d;
            Object obj3 = this.f42092c;
            return z.g((aq) this.f42091b, (ac) obj3, r0, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f42090a;
        Object obj4 = this.f42091b;
        Object obj5 = this.f42092c;
        return n.c((Transition) this.f42093d, (o) obj5, (p) obj4, i3, (Composer) obj);
    }

    public /* synthetic */ s(aq aqVar, ac acVar, Modifier modifier, int i2, int i3) {
        this.f42094e = i3;
        this.f42091b = aqVar;
        this.f42092c = acVar;
        this.f42093d = modifier;
        this.f42090a = i2;
    }
}
