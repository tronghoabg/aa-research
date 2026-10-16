package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
final class ubo extends ubi {
    private static final yob o = yob.c("com/google/android/libraries/geo/mapcore/internal/label/GLLineLabel");
    private static final double p = Math.cos(Math.toRadians(60.0d));
    private ujf A;
    private ufd B;
    private toq C;
    private ufw D;
    private uwi E;
    private float[] F;
    private float G;
    private boolean H;
    private float I;
    private boolean J;
    private gms N;
    private float q;
    private boolean t;
    private float w;
    private float x;
    private int y;
    private final uew r = new uew();
    private volatile float s = BitmapDescriptorFactory.HUE_RED;
    private final too u = new too();
    private final too v = new too();
    private int M = 2;
    private String z = "";
    private usz K = null;
    private usz L = null;

    private static float H(usy usyVar, toq toqVar, too tooVar) {
        toqVar.o(toqVar.c() >> 1, tooVar);
        return Math.min(1.0f, tsw.g(usyVar, tooVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean I(defpackage.udc r17, defpackage.usy r18, float r19, float r20, float r21, defpackage.tup r22) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubo.I(udc, usy, float, float, float, tup):boolean");
    }

    final void G(udx udxVar, int i, String str, ujf ujfVar, float f, int i2, float f2, too tooVar, int i3, utf utfVar, ueu ueuVar, ufw ufwVar, ufd ufdVar, boolean z, Optional optional) {
        super.F(udxVar, i, utfVar, ueuVar);
        this.A = ujfVar;
        toq toqVar = udxVar.h().b;
        toqVar.getClass();
        this.C = toqVar;
        this.x = f;
        this.M = i2;
        this.z = woy.al(str);
        this.w = f2;
        this.D = ufwVar;
        this.u.A(tooVar);
        this.y = i3;
        this.B = ufdVar;
        this.t = z;
        optional.isPresent();
        this.q = 15.0f;
    }

    @Override // defpackage.ubf
    public final float b() {
        return this.s;
    }

    @Override // defpackage.ubf
    public final uew e() {
        return this.r;
    }

    @Override // defpackage.ubi
    protected final void h() {
        this.z = "";
        this.A = null;
        this.C = null;
        this.H = false;
        this.I = -5.590387E8f;
        this.D = null;
        this.G = -5.590387E8f;
        uwi uwiVar = this.E;
        if (uwiVar != null) {
            uwiVar.c();
            this.E = null;
        }
        this.N = null;
        this.F = null;
        this.J = false;
        this.L = null;
        this.K = null;
        this.s = BitmapDescriptorFactory.HUE_RED;
        this.t = false;
        super.h();
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final void i() {
        uwk uwkVarA;
        Semaphore semaphore = this.a;
        semaphore.acquireUninterruptibly();
        try {
            if (this.E != null) {
                semaphore.release();
                return;
            }
            if (this.z.isEmpty()) {
                ufd ufdVar = this.B;
                if (ufdVar != null && (uwkVarA = ufdVar.a()) != null) {
                    uwi uwiVarB = uwkVarA.b(0);
                    this.E = uwiVarB;
                    if (uwiVarB != null) {
                        this.F = new float[]{BitmapDescriptorFactory.HUE_RED, uwiVarB.d};
                    }
                }
            } else {
                this.E = this.D.c(this.z, this.A, this.G);
                this.F = this.D.f(this.z, this.A, this.G);
            }
        } finally {
            this.a.release();
        }
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final boolean o() {
        return false;
    }

    @Override // defpackage.ubi, defpackage.ump
    @ResultIgnorabilityUnspecified
    public final int p(umk umkVar, boolean z, too tooVar) {
        if (!this.t) {
            return 1;
        }
        tooVar.A(this.v);
        return umkVar.a(this.r) ? 2 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:10:0x0026, B:13:0x002c, B:15:0x0044, B:40:0x00e8, B:43:0x0103, B:47:0x010e, B:16:0x004e, B:20:0x0069, B:22:0x0082, B:31:0x0093, B:33:0x0099, B:34:0x00b8, B:36:0x00c0, B:38:0x00c4, B:39:0x00d5, B:35:0x00be), top: B:66:0x0026 }] */
    @Override // defpackage.ubf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(defpackage.udc r26, defpackage.usy r27, com.google.android.libraries.geo.mapcore.renderer.LabelRenderer r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubo.r(udc, usy, com.google.android.libraries.geo.mapcore.renderer.LabelRenderer):boolean");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    @Override // defpackage.ubf
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(defpackage.udc r19, defpackage.usy r20) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubo.s(udc, usy):boolean");
    }

    @Override // defpackage.ubf
    public final void q(udc udcVar, usy usyVar) {
    }
}
