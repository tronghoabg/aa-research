package com.waze.z.a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class w implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f46208f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f46209g;

    public /* synthetic */ w(com.waze.ui.r.a.a.g gVar, h.g.a.q qVar, h.g.a.p pVar, h.g.a.p pVar2, int i2, int i3, int i4) {
        this.f46209g = i4;
        this.f46206d = gVar;
        this.f46208f = qVar;
        this.f46203a = pVar;
        this.f46207e = pVar2;
        this.f46204b = i2;
        this.f46205c = i3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.waze.main_screen.l.b.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f46209g;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46204b | 1);
            int i3 = this.f46205c;
            ?? r3 = this.f46208f;
            Object obj3 = this.f46207e;
            be.y(this.f46203a, this.f46206d, (String) obj3, r3, composer, iUpdateChangedFlags, i3);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f46204b | 1);
            int i4 = this.f46205c;
            ?? r32 = this.f46208f;
            ?? r2 = this.f46207e;
            ?? r1 = this.f46206d;
            be.F(this.f46203a, r1, r2, r32, (Composer) obj, iUpdateChangedFlags2, i4);
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f46204b | 1);
            int i5 = this.f46205c;
            ?? r6 = this.f46208f;
            ?? r5 = this.f46207e;
            ?? r4 = this.f46206d;
            com.waze.main_screen.l.b.c.c(this.f46203a, r4, r5, r6, (Composer) obj, iUpdateChangedFlags3, i5);
            return h.ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.f46204b | 1);
        int i6 = this.f46205c;
        ?? r33 = this.f46207e;
        ?? r22 = this.f46203a;
        ?? r12 = this.f46208f;
        be.f((com.waze.ui.r.a.a.g) this.f46206d, r12, r22, r33, (Composer) obj, iUpdateChangedFlags4, i6);
        return h.ab.f48028a;
    }

    public /* synthetic */ w(Object obj, Modifier modifier, Object obj2, Object obj3, int i2, int i3, int i4) {
        this.f46209g = i4;
        this.f46203a = obj;
        this.f46206d = modifier;
        this.f46207e = obj2;
        this.f46208f = obj3;
        this.f46204b = i2;
        this.f46205c = i3;
    }
}
