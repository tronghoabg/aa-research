package com.airbnb.lottie.b;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    private final MutableState f2020a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f2021b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f2022c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final MutableState f2023d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    private final MutableState f2024e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    private final MutableState f2025f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* renamed from: g, reason: collision with root package name */
    private final MutableState f2026g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: h, reason: collision with root package name */
    private final State f2027h = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: com.airbnb.lottie.b.e
        @Override // h.g.a.a
        public final Object invoke() {
            k kVar = this.f1997a;
            return Float.valueOf((kVar.t() && kVar.f() % 2 == 0) ? -kVar.e() : kVar.e());
        }
    });

    /* renamed from: i, reason: collision with root package name */
    private final MutableState f2028i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: j, reason: collision with root package name */
    private final MutableState f2029j;

    /* renamed from: k, reason: collision with root package name */
    private final MutableState f2030k;

    /* renamed from: l, reason: collision with root package name */
    private final MutableState f2031l;
    private final State m;
    private final MutatorMutex n;

    public k() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f2029j = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.f2030k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.f2031l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.m = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: com.airbnb.lottie.b.f
            @Override // h.g.a.a
            public final Object invoke() {
                k kVar = this.f1998a;
                com.airbnb.lottie.h hVarI = kVar.i();
                float f2 = 0.0f;
                if (hVarI != null) {
                    if (kVar.e() >= 0.0f) {
                        f2 = 1.0f;
                        if (kVar.j() != null) {
                            u.a(hVarI);
                        }
                    } else if (kVar.j() != null) {
                        u.b(hVarI);
                    }
                }
                return Float.valueOf(f2);
            }
        });
        SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: com.airbnb.lottie.b.g
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(k.u(this.f1999a));
            }
        });
        this.n = new MutatorMutex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float A() {
        return ((Number) this.f2029j.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i2) {
        this.f2021b.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(long j2) {
        this.f2031l.setValue(Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void D(float f2) {
        com.airbnb.lottie.h hVarI;
        this.f2029j.setValue(Float.valueOf(f2));
        if (((Boolean) this.f2026g.getValue()).booleanValue() && (hVarI = i()) != null) {
            f2 -= f2 % (1.0f / hVarI.e());
        }
        this.f2030k.setValue(Float.valueOf(f2));
    }

    private final boolean E(int i2, long j2) {
        com.airbnb.lottie.h hVarI = i();
        if (hVarI == null) {
            return true;
        }
        long jH = h() == Long.MIN_VALUE ? 0L : j2 - h();
        C(j2);
        if (j() != null) {
            u.b(hVarI);
        }
        if (j() != null) {
            u.a(hVarI);
        }
        float fA = ((jH / 1000000) / hVarI.a()) * z();
        float fA2 = z() < 0.0f ? -(A() + fA) : (A() + fA) - 1.0f;
        if (fA2 < 0.0f) {
            D(h.k.n.g(A(), 0.0f, 1.0f) + fA);
            return true;
        }
        int i3 = (int) fA2;
        int i4 = i3 + 1;
        if (f() + i4 > i2) {
            D(y());
            B(i2);
            return false;
        }
        B(f() + i4);
        float f2 = fA2 - i3;
        D(z() < 0.0f ? 1.0f - f2 : f2 + 0.0f);
        return true;
    }

    static final boolean s(k kVar, int i2, long j2) {
        return kVar.E(i2, j2);
    }

    static final boolean u(k kVar) {
        return kVar.f() == kVar.g() && kVar.d() == kVar.y();
    }

    static final boolean x(k kVar, long j2) {
        return kVar.E(Integer.MAX_VALUE, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float y() {
        return ((Number) this.m.getValue()).floatValue();
    }

    private final float z() {
        return ((Number) this.f2027h.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.b.b
    public final Object a(com.airbnb.lottie.h hVar, int i2, int i3, boolean z, float f2, u uVar, float f3, t tVar, h.c.e eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.n, null, new i(this, i2, i3, z, f2, uVar, hVar, f3, tVar, null), eVar, 1, null);
        return objMutate$default == h.c.a.a.f48038a ? objMutate$default : h.ab.f48028a;
    }

    @Override // com.airbnb.lottie.b.b
    public final Object b(com.airbnb.lottie.h hVar, float f2, boolean z, h.c.e eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.n, null, new j(this, hVar, f2, z, null), eVar, 1, null);
        return objMutate$default == h.c.a.a.f48038a ? objMutate$default : h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final float d() {
        return ((Number) this.f2030k.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final float e() {
        return ((Number) this.f2025f.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final int f() {
        return ((Number) this.f2021b.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final int g() {
        return ((Number) this.f2022c.getValue()).intValue();
    }

    @Override // androidx.compose.runtime.State
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h() {
        return ((Number) this.f2031l.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final com.airbnb.lottie.h i() {
        return (com.airbnb.lottie.h) this.f2028i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final u j() {
        return (u) this.f2024e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.b.s
    public final boolean t() {
        return ((Boolean) this.f2023d.getValue()).booleanValue();
    }
}
