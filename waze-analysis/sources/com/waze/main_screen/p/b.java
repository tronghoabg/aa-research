package com.waze.main_screen.p;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.navigate.fo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f27084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27088g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f27089h;

    public /* synthetic */ b(fo foVar, boolean z, boolean z2, h.g.a.a aVar, h.g.a.a aVar2, Modifier modifier, int i2, int i3) {
        this.f27089h = i3;
        this.f27086e = foVar;
        this.f27082a = z;
        this.f27083b = z2;
        this.f27087f = aVar;
        this.f27088g = aVar2;
        this.f27084c = modifier;
        this.f27085d = i2;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.waze.navigate.fo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f27089h;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f27085d;
            Modifier modifier = this.f27084c;
            ?? r4 = this.f27088g;
            ?? r3 = this.f27087f;
            boolean z = this.f27083b;
            bi.C(this.f27086e, this.f27082a, z, r3, r4, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f27085d;
            Object obj3 = this.f27086e;
            boolean z2 = this.f27083b;
            Modifier modifier2 = this.f27084c;
            ?? r2 = this.f27088g;
            com.waze.z.a.a.h.c((String) this.f27087f, this.f27082a, r2, modifier2, z2, (com.waze.z.a.a.a) obj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            Composer composer3 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f27085d;
            ?? r8 = this.f27088g;
            boolean z3 = this.f27083b;
            boolean z4 = this.f27082a;
            Object obj4 = this.f27086e;
            com.waze.sharedui.views.ap.e((String) this.f27087f, this.f27084c, (com.waze.sharedui.web.m) obj4, z4, z3, r8, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            return h.ab.f48028a;
        }
        Composer composer4 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i6 = this.f27085d;
        ?? r5 = this.f27088g;
        boolean z5 = this.f27083b;
        boolean z6 = this.f27082a;
        Object obj5 = this.f27086e;
        com.waze.sharedui.views.ap.e((String) this.f27087f, this.f27084c, (com.waze.sharedui.web.m) obj5, z6, z5, r5, composer4, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ b(String str, Modifier modifier, com.waze.sharedui.web.m mVar, boolean z, boolean z2, h.g.a.l lVar, int i2, int i3) {
        this.f27089h = i3;
        this.f27087f = str;
        this.f27084c = modifier;
        this.f27086e = mVar;
        this.f27082a = z;
        this.f27083b = z2;
        this.f27088g = lVar;
        this.f27085d = i2;
    }

    public /* synthetic */ b(String str, boolean z, h.g.a.a aVar, Modifier modifier, boolean z2, com.waze.z.a.a.a aVar2, int i2, int i3) {
        this.f27089h = i3;
        this.f27087f = str;
        this.f27082a = z;
        this.f27088g = aVar;
        this.f27084c = modifier;
        this.f27083b = z2;
        this.f27086e = aVar2;
        this.f27085d = i2;
    }
}
