package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ln implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f25166a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25167b;

    public ln(Object obj, int i2) {
        this.f25167b = i2;
        this.f25166a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f25167b;
        if (i2 == 0) {
            ?? r3 = this.f25166a;
            if (r3 instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL = ((org.a.d.a.b) r3).l();
                int i3 = h.g.b.ar.f48106a;
                return bVarL.a(new h.g.b.m(lo.class), null, null);
            }
            org.a.d.k.b bVarC = r3.getKoin().a().c();
            int i4 = h.g.b.ar.f48106a;
            return bVarC.a(new h.g.b.m(lo.class), null, null);
        }
        if (i2 == 1) {
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f25166a);
            int i5 = h.g.b.ar.f48106a;
            return bVarD.a(new h.g.b.m(ct.class), null, null);
        }
        if (i2 == 2) {
            ?? r32 = this.f25166a;
            if (r32 instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL2 = ((org.a.d.a.b) r32).l();
                int i6 = h.g.b.ar.f48106a;
                return bVarL2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
            }
            org.a.d.k.b bVarC2 = r32.getKoin().a().c();
            int i7 = h.g.b.ar.f48106a;
            return bVarC2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        }
        ?? r33 = this.f25166a;
        if (i2 != 3) {
            if (r33 instanceof org.a.d.a.b) {
                org.a.d.k.b bVarL3 = ((org.a.d.a.b) r33).l();
                int i8 = h.g.b.ar.f48106a;
                return bVarL3.a(new h.g.b.m(ResumePendingIntentBuilder.class), null, null);
            }
            org.a.d.k.b bVarC3 = r33.getKoin().a().c();
            int i9 = h.g.b.ar.f48106a;
            return bVarC3.a(new h.g.b.m(ResumePendingIntentBuilder.class), null, null);
        }
        if (r33 instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL4 = ((org.a.d.a.b) r33).l();
            int i10 = h.g.b.ar.f48106a;
            return bVarL4.a(new h.g.b.m(kk.class), null, null);
        }
        org.a.d.k.b bVarC4 = r33.getKoin().a().c();
        int i11 = h.g.b.ar.f48106a;
        return bVarC4.a(new h.g.b.m(kk.class), null, null);
    }
}
