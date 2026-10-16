package com.waze.menus.a;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.ab.ab;
import com.waze.av.b.n;
import com.waze.ui.ac.i;
import com.waze.ui.z.as;
import com.waze.ui.z.d;
import com.waze.z.a.c.c;
import com.waze.z.a.c.e;
import com.waze.z.a.c.l;
import com.waze.z.a.c.q;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29674g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f29675h;

    public /* synthetic */ b(n nVar, l lVar, com.waze.ui.ac.n nVar2, h.g.a.a aVar, p pVar, h.g.a.l lVar2, int i2, int i3) {
        this.f29675h = i3;
        this.f29671d = nVar;
        this.f29670c = lVar;
        this.f29674g = nVar2;
        this.f29669b = aVar;
        this.f29673f = pVar;
        this.f29672e = lVar2;
        this.f29668a = i2;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.waze.ui.ac.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f29675h;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f29668a;
            ?? r5 = this.f29673f;
            ?? r4 = this.f29672e;
            Object obj3 = this.f29674g;
            Object obj4 = this.f29671d;
            ab.l((com.waze.ui.ac.n) this.f29669b, (n) this.f29670c, (a) obj4, (l) obj3, r4, r5, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i4 = this.f29668a;
            ?? r52 = this.f29673f;
            ?? r42 = this.f29672e;
            Object obj5 = this.f29674g;
            q.k((String) this.f29669b, (c) this.f29670c, this.f29671d, (e) obj5, r42, r52, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            Composer composer3 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f29668a;
            ?? r53 = this.f29672e;
            ?? r43 = this.f29673f;
            ?? r3 = this.f29669b;
            Object obj6 = this.f29674g;
            ab.j((n) this.f29671d, (l) this.f29670c, (com.waze.ui.ac.n) obj6, r3, r43, r53, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            return h.ab.f48028a;
        }
        if (i2 != 3) {
            Composer composer4 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i6 = this.f29668a;
            ?? r8 = this.f29673f;
            ?? r7 = this.f29672e;
            ?? r6 = this.f29669b;
            Object obj7 = this.f29671d;
            as.w((d) this.f29674g, this.f29670c, (LazyListState) obj7, r6, r7, r8, composer4, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
            return h.ab.f48028a;
        }
        Composer composer5 = (Composer) obj;
        ((Integer) obj2).intValue();
        int i7 = this.f29668a;
        ?? r54 = this.f29673f;
        ?? r44 = this.f29672e;
        ?? r32 = this.f29669b;
        Object obj8 = this.f29674g;
        com.waze.trip_overview.views.l.d((String) this.f29670c, this.f29671d, (String) obj8, r32, r44, r54, composer5, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ b(d dVar, Modifier modifier, LazyListState lazyListState, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar, int i2, int i3) {
        this.f29675h = i3;
        this.f29674g = dVar;
        this.f29670c = modifier;
        this.f29671d = lazyListState;
        this.f29669b = aVar;
        this.f29672e = aVar2;
        this.f29673f = lVar;
        this.f29668a = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2, int i3) {
        this.f29675h = i3;
        this.f29669b = obj;
        this.f29670c = obj2;
        this.f29671d = obj3;
        this.f29674g = obj4;
        this.f29672e = obj5;
        this.f29673f = obj6;
        this.f29668a = i2;
    }

    public /* synthetic */ b(String str, i iVar, String str2, List list, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f29675h = i3;
        this.f29670c = str;
        this.f29671d = iVar;
        this.f29674g = str2;
        this.f29669b = list;
        this.f29672e = aVar;
        this.f29673f = aVar2;
        this.f29668a = i2;
    }
}
