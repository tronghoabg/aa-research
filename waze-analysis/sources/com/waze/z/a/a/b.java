package com.waze.z.a.a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.main_screen.c.an;
import com.waze.main_screen.c.as;
import com.waze.main_screen.p.bf;
import com.waze.main_screen.p.bi;
import com.waze.main_screen.t.al;
import com.waze.main_screen.t.am;
import com.waze.n.aq;
import com.waze.reports_v2.presentation.a.at;
import com.waze.sound.bp;
import com.waze.ui.ac.n;
import com.waze.uid.c.cb;
import com.waze.z.a.d.ai;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45573f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f45574g;

    public /* synthetic */ b(an anVar, Modifier modifier, l lVar, l lVar2, l lVar3, int i2, int i3) {
        this.f45574g = i3;
        this.f45572e = anVar;
        this.f45571d = modifier;
        this.f45569b = lVar;
        this.f45570c = lVar2;
        this.f45573f = lVar3;
        this.f45568a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.waze.z.a.d.an, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.waze.main_screen.c.an, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45574g) {
            case 0:
                Composer composer = (Composer) obj;
                ((Integer) obj2).intValue();
                int i2 = this.f45568a;
                ?? r4 = this.f45573f;
                Object obj3 = this.f45572e;
                h.b((String) this.f45569b, (String) this.f45570c, this.f45571d, (a) obj3, r4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i3 = this.f45568a;
                ?? r42 = this.f45573f;
                ?? r3 = this.f45570c;
                Object obj4 = this.f45569b;
                aq.e(this.f45571d, (com.waze.closure.c.i) this.f45572e, (at) obj4, r3, r42, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i4 = this.f45568a;
                ?? r43 = this.f45573f;
                Object obj5 = this.f45572e;
                h.d((String) this.f45569b, (String) this.f45570c, this.f45571d, (a) obj5, r43, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i5 = this.f45568a;
                ?? r44 = this.f45573f;
                Object obj6 = this.f45569b;
                ?? r2 = this.f45571d;
                ai.h(this.f45572e, this.f45570c, r2, (String) obj6, r44, composer4, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i6 = this.f45568a;
                ?? r45 = this.f45573f;
                ?? r32 = this.f45570c;
                ?? r22 = this.f45569b;
                as.b(this.f45572e, this.f45571d, r22, r32, r45, composer5, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i7 = this.f45568a;
                ?? r46 = this.f45572e;
                ?? r33 = this.f45573f;
                ?? r23 = this.f45570c;
                bi.l((bf) this.f45571d, this.f45569b, r23, r33, r46, composer6, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i8 = this.f45568a;
                ?? r47 = this.f45573f;
                ?? r34 = this.f45572e;
                ?? r24 = this.f45570c;
                al.h((am) this.f45571d, this.f45569b, r24, r34, r47, composer7, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i9 = this.f45568a;
                ?? r48 = this.f45573f;
                ?? r35 = this.f45570c;
                ?? r25 = this.f45569b;
                com.waze.ab.a.l.n((String) this.f45571d, this.f45572e, r25, r35, r48, composer8, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
                break;
            case 8:
                Composer composer9 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i10 = this.f45568a;
                ?? r49 = this.f45573f;
                ?? r36 = this.f45570c;
                ?? r26 = this.f45571d;
                com.waze.search.a.j.a((n) this.f45572e, this.f45569b, r26, r36, r49, composer9, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                break;
            case 9:
                Composer composer10 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i11 = this.f45568a;
                ?? r410 = this.f45570c;
                ?? r37 = this.f45573f;
                Object obj7 = this.f45572e;
                com.waze.sound.e.h.c(this.f45569b, (bp) this.f45571d, (String) obj7, r37, r410, composer10, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                break;
            case 10:
                Composer composer11 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i12 = this.f45568a;
                ?? r411 = this.f45573f;
                ?? r38 = this.f45570c;
                ?? r27 = this.f45569b;
                com.waze.ui.v.f.a((com.waze.ui.v.l) this.f45571d, this.f45572e, r27, r38, r411, composer11, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                break;
            case 11:
                Composer composer12 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i13 = this.f45568a;
                Object obj8 = this.f45572e;
                Object obj9 = this.f45571d;
                ?? r28 = this.f45573f;
                com.waze.ui.ae.d.c(this.f45569b, this.f45570c, r28, (String) obj9, (String) obj8, composer12, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                break;
            case 12:
                Composer composer13 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i14 = this.f45568a;
                ?? r5 = this.f45570c;
                ?? r412 = this.f45569b;
                com.waze.ui.u.g.h((String) this.f45571d, (String) this.f45572e, this.f45573f, r412, r5, composer13, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
                break;
            default:
                Composer composer14 = (Composer) obj;
                ((Integer) obj2).intValue();
                int i15 = this.f45568a;
                ?? r413 = this.f45570c;
                ?? r39 = this.f45569b;
                Object obj10 = this.f45571d;
                cb.g((String) this.f45572e, this.f45573f, (Integer) obj10, r39, r413, composer14, RecomposeScopeImplKt.updateChangedFlags(i15 | 1));
                break;
        }
        return ab.f48028a;
    }

    public /* synthetic */ b(bf bfVar, l lVar, l lVar2, l lVar3, h.g.a.a aVar, int i2, int i3) {
        this.f45574g = i3;
        this.f45571d = bfVar;
        this.f45569b = lVar;
        this.f45570c = lVar2;
        this.f45573f = lVar3;
        this.f45572e = aVar;
        this.f45568a = i2;
    }

    public /* synthetic */ b(am amVar, l lVar, l lVar2, h.g.a.a aVar, l lVar3, int i2, int i3) {
        this.f45574g = i3;
        this.f45571d = amVar;
        this.f45569b = lVar;
        this.f45570c = lVar2;
        this.f45572e = aVar;
        this.f45573f = lVar3;
        this.f45568a = i2;
    }

    public /* synthetic */ b(n nVar, List list, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f45574g = i3;
        this.f45572e = nVar;
        this.f45569b = list;
        this.f45571d = modifier;
        this.f45570c = aVar;
        this.f45573f = aVar2;
        this.f45568a = i2;
    }

    public /* synthetic */ b(com.waze.z.a.d.an anVar, l lVar, Modifier modifier, String str, p pVar, int i2, int i3) {
        this.f45574g = i3;
        this.f45572e = anVar;
        this.f45570c = lVar;
        this.f45571d = modifier;
        this.f45569b = str;
        this.f45573f = pVar;
        this.f45568a = i2;
    }

    public /* synthetic */ b(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, String str, String str2, int i2, int i3) {
        this.f45574g = i3;
        this.f45569b = aVar;
        this.f45570c = aVar2;
        this.f45573f = aVar3;
        this.f45571d = str;
        this.f45572e = str2;
        this.f45568a = i2;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, int i3) {
        this.f45574g = i3;
        this.f45571d = obj;
        this.f45572e = obj2;
        this.f45569b = obj3;
        this.f45570c = obj4;
        this.f45573f = obj5;
        this.f45568a = i2;
    }

    public /* synthetic */ b(String str, l lVar, Integer num, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f45574g = i3;
        this.f45572e = str;
        this.f45573f = lVar;
        this.f45571d = num;
        this.f45569b = aVar;
        this.f45570c = aVar2;
        this.f45568a = i2;
    }

    public /* synthetic */ b(String str, String str2, Modifier modifier, a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f45574g = i3;
        this.f45569b = str;
        this.f45570c = str2;
        this.f45571d = modifier;
        this.f45572e = aVar;
        this.f45573f = aVar2;
        this.f45568a = i2;
    }

    public /* synthetic */ b(String str, String str2, p pVar, h.g.a.a aVar, h.g.a.a aVar2, int i2, int i3) {
        this.f45574g = i3;
        this.f45571d = str;
        this.f45572e = str2;
        this.f45573f = pVar;
        this.f45569b = aVar;
        this.f45570c = aVar2;
        this.f45568a = i2;
    }

    public /* synthetic */ b(List list, bp bpVar, String str, l lVar, h.g.a.a aVar, int i2, int i3) {
        this.f45574g = i3;
        this.f45569b = list;
        this.f45571d = bpVar;
        this.f45572e = str;
        this.f45573f = lVar;
        this.f45570c = aVar;
        this.f45568a = i2;
    }
}
