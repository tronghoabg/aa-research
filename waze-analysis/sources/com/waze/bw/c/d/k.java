package com.waze.bw.c.d;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f18126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18131f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f18132g;

    public /* synthetic */ k(Modifier modifier, com.waze.sharedui.web.aq aqVar, h.g.a.l lVar, com.waze.sharedui.web.m mVar, int i2, int i3, int i4) {
        this.f18132g = i4;
        this.f18126a = modifier;
        this.f18130e = aqVar;
        this.f18131f = lVar;
        this.f18129d = mVar;
        this.f18127b = i2;
        this.f18128c = i3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f18132g;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f18127b | 1);
            int i3 = this.f18128c;
            ?? r3 = this.f18131f;
            ?? r2 = this.f18130e;
            Modifier modifier = this.f18126a;
            v.x((cv) this.f18129d, modifier, r2, r3, (Composer) obj, iUpdateChangedFlags, i3);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f18127b | 1);
            int i4 = this.f18128c;
            Object obj3 = this.f18129d;
            ?? r4 = this.f18131f;
            com.waze.ui.e.w.c((com.waze.ui.f.ak) this.f18130e, this.f18126a, r4, (com.waze.ui.f.aa) obj3, composer, iUpdateChangedFlags2, i4);
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f18127b | 1);
        int i5 = this.f18128c;
        Object obj4 = this.f18129d;
        com.waze.sharedui.views.ap.f(this.f18126a, (com.waze.sharedui.web.aq) this.f18130e, this.f18131f, (com.waze.sharedui.web.m) obj4, composer2, iUpdateChangedFlags3, i5);
        return h.ab.f48028a;
    }

    public /* synthetic */ k(cv cvVar, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3, int i4) {
        this.f18132g = i4;
        this.f18129d = cvVar;
        this.f18126a = modifier;
        this.f18130e = aVar;
        this.f18131f = aVar2;
        this.f18127b = i2;
        this.f18128c = i3;
    }

    public /* synthetic */ k(com.waze.ui.f.ak akVar, Modifier modifier, h.g.a.a aVar, com.waze.ui.f.aa aaVar, int i2, int i3, int i4) {
        this.f18132g = i4;
        this.f18130e = akVar;
        this.f18126a = modifier;
        this.f18131f = aVar;
        this.f18129d = aaVar;
        this.f18127b = i2;
        this.f18128c = i3;
    }
}
