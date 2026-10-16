package com.waze.main_screen.a.a;

import androidx.compose.animation.core.TransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.main_screen.p.a.b.a.t;
import com.waze.ui.a.aa;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f25537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f25538h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f25539i;

    public /* synthetic */ b(t tVar, com.waze.sound.e.j jVar, com.waze.main_screen.p.b.a.b.t tVar2, com.waze.main_screen.l.b.j jVar2, com.waze.main_screen.ab.a.m mVar, com.waze.main_screen.r.a.c cVar, com.waze.main_screen.w.a.a aVar, int i2, int i3) {
        this.f25539i = i3;
        this.f25532b = tVar;
        this.f25533c = jVar;
        this.f25538h = tVar2;
        this.f25534d = jVar2;
        this.f25535e = mVar;
        this.f25536f = cVar;
        this.f25537g = aVar;
        this.f25531a = i2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.waze.main_screen.l.b.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.waze.main_screen.ab.a.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.waze.main_screen.r.a.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.waze.ui.ac.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.waze.main_screen.w.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.waze.ui.ac.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f25539i;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f25531a;
            ?? r6 = this.f25537g;
            ?? r5 = this.f25536f;
            ?? r4 = this.f25535e;
            ?? r3 = this.f25534d;
            Object obj3 = this.f25538h;
            return f.b((t) this.f25532b, (com.waze.sound.e.j) this.f25533c, (com.waze.main_screen.p.b.a.b.t) obj3, r3, r4, r5, r6, i3, composer);
        }
        if (i2 != 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f25531a;
            ?? r8 = this.f25533c;
            ?? r7 = this.f25536f;
            Object obj4 = this.f25535e;
            ?? r52 = this.f25532b;
            Object obj5 = this.f25534d;
            com.waze.ui.q.g.c((com.waze.ui.q.h) this.f25538h, (String) this.f25537g, (TransitionState) obj5, r52, (String) obj4, r7, r8, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return ab.f48028a;
        }
        Composer composer3 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i5 = this.f25531a;
        ?? r62 = this.f25533c;
        ?? r53 = this.f25532b;
        Object obj6 = this.f25535e;
        Object obj7 = this.f25537g;
        aa.b((String) this.f25538h, (String) this.f25536f, this.f25534d, (String) obj7, (String) obj6, r53, r62, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
        return ab.f48028a;
    }

    public /* synthetic */ b(com.waze.ui.q.h hVar, String str, TransitionState transitionState, Modifier modifier, String str2, com.waze.ui.ac.i iVar, h.g.a.l lVar, int i2, int i3) {
        this.f25539i = i3;
        this.f25538h = hVar;
        this.f25537g = str;
        this.f25534d = transitionState;
        this.f25532b = modifier;
        this.f25535e = str2;
        this.f25536f = iVar;
        this.f25533c = lVar;
        this.f25531a = i2;
    }

    public /* synthetic */ b(String str, String str2, Modifier modifier, String str3, String str4, com.waze.ui.ac.i iVar, h.g.a.l lVar, int i2, int i3) {
        this.f25539i = i3;
        this.f25538h = str;
        this.f25536f = str2;
        this.f25534d = modifier;
        this.f25537g = str3;
        this.f25535e = str4;
        this.f25532b = iVar;
        this.f25533c = lVar;
        this.f25531a = i2;
    }
}
