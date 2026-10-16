package com.waze.z.a.d;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.ui.l.bh;
import com.waze.ui.l.cg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class z implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f46009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f46010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46013e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f46014f;

    public /* synthetic */ z(cg cgVar, boolean z, boolean z2, Modifier modifier, int i2, int i3) {
        this.f46014f = i3;
        this.f46013e = cgVar;
        this.f46009a = z;
        this.f46010b = z2;
        this.f46012d = modifier;
        this.f46011c = i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f46014f == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f46011c;
            ?? r3 = this.f46013e;
            boolean z = this.f46010b;
            boolean z2 = this.f46009a;
            return ai.m((al) this.f46012d, z2, z, r3, i2, (Composer) obj);
        }
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        int i3 = this.f46011c;
        ?? r4 = this.f46012d;
        boolean z3 = this.f46010b;
        bh.c((cg) this.f46013e, this.f46009a, z3, r4, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    public /* synthetic */ z(al alVar, boolean z, boolean z2, h.g.a.a aVar, int i2, int i3) {
        this.f46014f = i3;
        this.f46012d = alVar;
        this.f46009a = z;
        this.f46010b = z2;
        this.f46013e = aVar;
        this.f46011c = i2;
    }
}
