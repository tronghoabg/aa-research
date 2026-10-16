package com.waze.main_screen.a.b;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.ui.ab.m;
import com.waze.ui.ab.o;
import com.waze.ui.af.ap;
import com.waze.ui.r.a.a.t;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25570c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f25571d;

    public /* synthetic */ a(Object obj, Object obj2, int i2, int i3) {
        this.f25571d = i3;
        this.f25569b = obj;
        this.f25570c = obj2;
        this.f25568a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.ui.j.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.waze.ui.af.v, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f25571d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f25568a;
            ?? r0 = this.f25570c;
            return h.c(this.f25569b, r0, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f25568a;
            ?? r02 = this.f25570c;
            t.g((m) this.f25569b, r02, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            return ab.f48028a;
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f25568a;
            ?? r03 = this.f25570c;
            t.f((o) this.f25569b, r03, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            return ab.f48028a;
        }
        if (i2 != 3) {
            ((Integer) obj2).intValue();
            int i6 = this.f25568a;
            ?? r04 = this.f25570c;
            ap.o(this.f25569b, r04, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
            return ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int i7 = this.f25568a;
        ?? r05 = this.f25569b;
        com.waze.ui.ae.d.b((String) this.f25570c, r05, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
        return ab.f48028a;
    }

    public /* synthetic */ a(String str, Modifier modifier, int i2, int i3) {
        this.f25571d = i3;
        this.f25570c = str;
        this.f25569b = modifier;
        this.f25568a = i2;
    }
}
