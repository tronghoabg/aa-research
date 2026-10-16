package com.waze.main_screen.c.c;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.main_screen.c.d.e;
import com.waze.main_screen.d.a.d;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f26158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26162e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f26163f;

    public /* synthetic */ a(d dVar, Modifier modifier, boolean z, int i2, int i3, int i4) {
        this.f26163f = i4;
        this.f26162e = dVar;
        this.f26158a = modifier;
        this.f26159b = z;
        this.f26160c = i2;
        this.f26161d = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.main_screen.d.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.main_screen.d.a.d, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f26163f;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            ((Integer) obj2).intValue();
            int i3 = this.f26161d;
            int i4 = this.f26160c;
            boolean z = this.f26159b;
            e.f(this.f26162e, this.f26158a, z, i4, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            return ab.f48028a;
        }
        if (i2 != 1) {
            Composer composer2 = (Composer) obj;
            ((Integer) obj2).intValue();
            int i5 = this.f26161d;
            int i6 = this.f26160c;
            boolean z2 = this.f26159b;
            e.f(this.f26162e, this.f26158a, z2, i6, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            return ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f26160c | 1);
        int i7 = this.f26161d;
        Modifier modifier = this.f26158a;
        boolean z3 = this.f26159b;
        com.waze.main_screen.c.b.d.c(this.f26162e, z3, modifier, (Composer) obj, iUpdateChangedFlags, i7);
        return ab.f48028a;
    }

    public /* synthetic */ a(h.g.a.a aVar, boolean z, Modifier modifier, int i2, int i3, int i4) {
        this.f26163f = i4;
        this.f26162e = aVar;
        this.f26159b = z;
        this.f26158a = modifier;
        this.f26160c = i2;
        this.f26161d = i3;
    }
}
