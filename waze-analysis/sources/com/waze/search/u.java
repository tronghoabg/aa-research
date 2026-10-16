package com.waze.search;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class u implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f36114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f36115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f36117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f36118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f36120g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f36121h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f36122i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ int f36123j;

    public /* synthetic */ u(Modifier modifier, Modifier modifier2, LazyListState lazyListState, List list, boolean z, boolean z2, int i2, h.g.a.l lVar, int i3, int i4) {
        this.f36123j = i4;
        this.f36119f = modifier;
        this.f36120g = modifier2;
        this.f36121h = lazyListState;
        this.f36122i = list;
        this.f36114a = z;
        this.f36115b = z2;
        this.f36116c = i2;
        this.f36117d = lVar;
        this.f36118e = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f36123j != 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f36116c | 1);
            int i2 = this.f36118e;
            Object obj3 = this.f36119f;
            Object obj4 = this.f36120g;
            boolean z = this.f36115b;
            ?? r4 = this.f36121h;
            h.g.a.l lVar = this.f36117d;
            com.waze.z.a.a.h.j((String) this.f36122i, this.f36114a, lVar, r4, z, (com.waze.location.q) obj4, (com.waze.z.a.a.a) obj3, composer, iUpdateChangedFlags, i2);
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f36118e;
        h.g.a.l lVar2 = this.f36117d;
        int i4 = this.f36116c;
        boolean z2 = this.f36115b;
        boolean z3 = this.f36114a;
        ?? r3 = this.f36122i;
        Object obj5 = this.f36121h;
        ai.j(this.f36119f, this.f36120g, (LazyListState) obj5, r3, z3, z2, i4, lVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ u(String str, boolean z, h.g.a.l lVar, Modifier modifier, boolean z2, com.waze.location.q qVar, com.waze.z.a.a.a aVar, int i2, int i3, int i4) {
        this.f36123j = i4;
        this.f36122i = str;
        this.f36114a = z;
        this.f36117d = lVar;
        this.f36121h = modifier;
        this.f36115b = z2;
        this.f36120g = qVar;
        this.f36119f = aVar;
        this.f36116c = i2;
        this.f36118e = i3;
    }
}
