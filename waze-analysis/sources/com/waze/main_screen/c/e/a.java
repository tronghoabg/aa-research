package com.waze.main_screen.c.e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.l.v;
import com.waze.ui.z.aq;
import com.waze.ui.z.as;
import com.waze.uid.c.cb;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26196f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f26197g;

    public /* synthetic */ a(v vVar, boolean z, h.g.a.a aVar, h.g.a.l lVar, int i2, int i3, int i4) {
        this.f26197g = i4;
        this.f26195e = vVar;
        this.f26191a = z;
        this.f26194d = aVar;
        this.f26196f = lVar;
        this.f26192b = i2;
        this.f26193c = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.main_screen.c.e.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.waze.ui.z.aq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f26197g;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f26192b | 1);
            int i3 = this.f26193c;
            ?? r3 = this.f26196f;
            ?? r2 = this.f26195e;
            boolean z = this.f26191a;
            com.waze.main_screen.c.f.d.b(this.f26194d, z, r2, r3, (Composer) obj, iUpdateChangedFlags, i3);
            return ab.f48028a;
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f26192b | 1);
            int i4 = this.f26193c;
            ?? r32 = this.f26196f;
            ?? r22 = this.f26194d;
            boolean z2 = this.f26191a;
            com.waze.l.m.d((v) this.f26195e, z2, r22, r32, (Composer) obj, iUpdateChangedFlags2, i4);
            return ab.f48028a;
        }
        if (i2 != 2) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f26193c;
            ?? r7 = this.f26195e;
            boolean z3 = this.f26191a;
            int i6 = this.f26192b;
            cb.m((String) this.f26194d, this.f26196f, i6, z3, r7, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            return ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f26192b | 1);
        int i7 = this.f26193c;
        ?? r33 = this.f26196f;
        boolean z4 = this.f26191a;
        ?? r1 = this.f26195e;
        as.x(this.f26194d, r1, z4, r33, (Composer) obj, iUpdateChangedFlags3, i7);
        return ab.f48028a;
    }

    public /* synthetic */ a(i iVar, boolean z, Modifier modifier, h.g.a.a aVar, int i2, int i3, int i4) {
        this.f26197g = i4;
        this.f26194d = iVar;
        this.f26191a = z;
        this.f26195e = modifier;
        this.f26196f = aVar;
        this.f26192b = i2;
        this.f26193c = i3;
    }

    public /* synthetic */ a(aq aqVar, Modifier modifier, boolean z, h.g.a.l lVar, int i2, int i3, int i4) {
        this.f26197g = i4;
        this.f26194d = aqVar;
        this.f26195e = modifier;
        this.f26191a = z;
        this.f26196f = lVar;
        this.f26192b = i2;
        this.f26193c = i3;
    }

    public /* synthetic */ a(String str, h.g.a.l lVar, int i2, boolean z, Modifier modifier, int i3, int i4) {
        this.f26197g = i4;
        this.f26194d = str;
        this.f26196f = lVar;
        this.f26192b = i2;
        this.f26191a = z;
        this.f26195e = modifier;
        this.f26193c = i3;
    }
}
