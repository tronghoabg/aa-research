package com.waze.navigate.location_preview;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.map.b.ed;
import com.waze.ui.m.dc;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31737e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f31738f;

    public /* synthetic */ k(ed edVar, kotlinx.coroutines.b.bq bqVar, com.waze.shared_infra.h.c cVar, int i2, int i3, int i4) {
        this.f31738f = i4;
        this.f31735c = edVar;
        this.f31736d = bqVar;
        this.f31737e = cVar;
        this.f31733a = i2;
        this.f31734b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.map.b.ed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlinx.coroutines.b.bq] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.waze.ui.j.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.foundation.layout.PaddingValues, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f31738f;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f31734b;
            int i4 = this.f31733a;
            Object obj3 = this.f31737e;
            return ba.c(this.f31735c, this.f31736d, (com.waze.shared_infra.h.c) obj3, i4, i3, composer);
        }
        if (i2 == 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f31734b;
            int i6 = this.f31733a;
            ?? r2 = this.f31735c;
            com.waze.main_screen.p.a.b.a.ab.q((com.waze.main_screen.p.a.b.a.t) this.f31737e, this.f31736d, r2, i6, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            Composer composer3 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i7 = this.f31734b;
            ?? r3 = this.f31736d;
            ?? r22 = this.f31735c;
            com.waze.sharedui.profile.c.l((String) this.f31737e, this.f31733a, r22, r3, composer3, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f31733a | 1);
            int i8 = this.f31734b;
            ?? r23 = this.f31735c;
            ?? r1 = this.f31736d;
            com.waze.ui.d.s.f((com.waze.ui.d.t) this.f31737e, r1, r23, (Composer) obj, iUpdateChangedFlags, i8);
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f31733a | 1);
            int i9 = this.f31734b;
            ?? r24 = this.f31736d;
            ?? r12 = this.f31737e;
            com.waze.ui.j.h.b(this.f31735c, r12, r24, (Composer) obj, iUpdateChangedFlags2, i9);
            return h.ab.f48028a;
        }
        if (i2 != 5) {
            Composer composer4 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i10 = this.f31734b;
            int i11 = this.f31733a;
            ?? r5 = this.f31735c;
            com.waze.ui.o.ae.b((com.waze.ui.o.ai) this.f31737e, this.f31736d, r5, i11, composer4, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            return h.ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f31733a | 1);
        int i12 = this.f31734b;
        ?? r25 = this.f31736d;
        ?? r13 = this.f31737e;
        dc.l((MutableTransitionState) this.f31735c, r13, r25, (Composer) obj, iUpdateChangedFlags3, i12);
        return h.ab.f48028a;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i2, int i3, int i4) {
        this.f31738f = i4;
        this.f31737e = obj;
        this.f31736d = obj2;
        this.f31735c = obj3;
        this.f31733a = i2;
        this.f31734b = i3;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i2, int i3, int i4, byte[] bArr) {
        this.f31738f = i4;
        this.f31735c = obj;
        this.f31737e = obj2;
        this.f31736d = obj3;
        this.f31733a = i2;
        this.f31734b = i3;
    }

    public /* synthetic */ k(String str, int i2, Modifier modifier, h.g.a.a aVar, int i3, int i4) {
        this.f31738f = i4;
        this.f31737e = str;
        this.f31733a = i2;
        this.f31735c = modifier;
        this.f31736d = aVar;
        this.f31734b = i3;
    }
}
