package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmi {
    public static final /* synthetic */ int x = 0;
    private float A;
    private ckm B;
    private RectF C;
    public final cml a;
    public boolean h;
    public cmb i;
    public int j;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public long s;
    public boolean t;
    public cjk u;
    public cjm v;
    public cjm w;
    private Outline z;
    public dlg b = cmc.a;
    public dlr c = dlr.a;
    public afec d = new bwr(8);
    private final afec y = new cep(this, 7);
    public boolean e = true;
    public long f = 0;
    public long g = 9205357640488583168L;
    public final cmh k = new cmh();

    static {
        affa.f(Build.FINGERPRINT, "robolectric");
    }

    public cmi(cml cmlVar) {
        this.a = cmlVar;
        cmlVar.x(false);
        this.m = 0L;
        this.n = 0L;
        this.s = 9205357640488583168L;
    }

    private final Outline m() {
        Outline outline = this.z;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.z = outline2;
        return outline2;
    }

    private final void n() {
        this.j--;
        e();
    }

    private final void o() {
        this.B = null;
        this.v = null;
        this.g = 9205357640488583168L;
        this.f = 0L;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.e = true;
        this.h = false;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.h();
    }

    public final ckm c() {
        ckm ckkVar;
        ckm ckmVar = this.B;
        cjm cjmVar = this.v;
        if (ckmVar != null) {
            return ckmVar;
        }
        if (cjmVar != null) {
            ckj ckjVar = new ckj(cjmVar);
            this.B = ckjVar;
            return ckjVar;
        }
        long jK = dln.k(this.n);
        long j = this.f;
        long j2 = this.g;
        if (j2 != 9205357640488583168L) {
            jK = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = fIntBitsToFloat + Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jK & 4294967295L));
        if (this.A > BitmapDescriptorFactory.HUE_RED) {
            ckkVar = new ckl(byx.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L)));
        } else {
            ckkVar = new ckk(new cjb(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.B = ckkVar;
        return ckkVar;
    }

    public final void d() {
        Outline outlineM;
        if (this.e) {
            boolean z = this.t;
            Outline outline = null;
            if (z || b() > BitmapDescriptorFactory.HUE_RED) {
                cjm cjmVar = this.v;
                if (cjmVar != null) {
                    RectF rectF = this.C;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.C = rectF;
                    }
                    Path path = cjmVar.a;
                    path.computeBounds(rectF, false);
                    if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
                        outlineM = m();
                        if (Build.VERSION.SDK_INT >= 30) {
                            outlineM.setPath(path);
                        } else {
                            outlineM.setConvexPath(path);
                        }
                        outlineM.offset(this.o, this.p);
                        this.h = !outlineM.canClip();
                    } else {
                        Outline outline2 = this.z;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.h = true;
                        outlineM = null;
                    }
                    this.v = cjmVar;
                    if (outlineM != null) {
                        outlineM.setAlpha(a());
                        outline = outlineM;
                    }
                    cml cmlVar = this.a;
                    cmlVar.z(outline, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.h && this.t) {
                        cmlVar.x(false);
                        cmlVar.q();
                    } else {
                        cmlVar.x(this.t);
                    }
                } else {
                    cml cmlVar2 = this.a;
                    cmlVar2.x(z);
                    Outline outlineM2 = m();
                    long jK = dln.k(this.n);
                    long j = this.f;
                    long j2 = this.g;
                    if (j2 != 9205357640488583168L) {
                        jK = j2;
                    }
                    long j3 = jK & 4294967295L;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineM2.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (jK >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) j3)), this.A);
                    outlineM2.setAlpha(a());
                    cmlVar2.z(outlineM2, (Math.round(Float.intBitsToFloat(r14)) & 4294967295L) | (Math.round(Float.intBitsToFloat(r9)) << 32));
                }
            } else {
                cml cmlVar3 = this.a;
                cmlVar3.x(false);
                cmlVar3.z(null, 0L);
            }
        }
        this.e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.l
            if (r1 == 0) goto L67
            int r1 = r0.j
            if (r1 != 0) goto L67
            cmh r1 = r0.k
            cmi r2 = r1.a
            if (r2 == 0) goto L16
            r2.n()
            r2 = 0
            r1.a = r2
        L16:
            aap r1 = r1.d
            if (r1 == 0) goto L62
            java.lang.Object[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5f
            r5 = 0
            r6 = r5
        L25:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r4
            r10 = r5
        L38:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            cmi r11 = (defpackage.cmi) r11
            r11.n()
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L38
        L58:
            if (r11 != r12) goto L5f
        L5a:
            if (r6 == r4) goto L5f
            int r6 = r6 + 1
            goto L25
        L5f:
            r1.d()
        L62:
            cml r0 = r0.a
            r0.q()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmi.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.cmd r15) {
        /*
            r14 = this;
            cmh r0 = r14.k
            cmi r1 = r0.a
            r0.b = r1
            aap r1 = r0.d
            if (r1 == 0) goto L24
            boolean r2 = r1.c()
            if (r2 == 0) goto L24
            aap r2 = r0.e
            if (r2 != 0) goto L1e
            aap r2 = defpackage.aaq.a
            aap r2 = new aap
            r3 = 6
            r2.<init>(r3)
            r0.e = r2
        L1e:
            r2.f(r1)
            r1.d()
        L24:
            r1 = 1
            r0.c = r1
            afec r14 = r14.d
            r14.invoke(r15)
            r14 = 0
            r0.c = r14
            cmi r15 = r0.b
            if (r15 == 0) goto L36
            r15.n()
        L36:
            aap r15 = r0.e
            if (r15 == 0) goto L87
            boolean r0 = r15.c()
            if (r0 == 0) goto L87
            java.lang.Object[] r0 = r15.b
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L84
            r3 = r14
        L4a:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7f
            int r6 = r3 - r2
            r7 = r14
        L5d:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L7d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L79
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r0[r8]
            cmi r8 = (defpackage.cmi) r8
            r8.n()
        L79:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L5d
        L7d:
            if (r8 != r9) goto L84
        L7f:
            if (r3 == r2) goto L84
            int r3 = r3 + 1
            goto L4a
        L84:
            r15.d()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmi.f(cmd):void");
    }

    public final void g() {
        this.a.s(this.b, this.c, this, this.y);
    }

    public final void h(float f) {
        cml cmlVar = this.a;
        if (cmlVar.a() == f) {
            return;
        }
        cmlVar.t(f);
    }

    public final void i(long j) {
        if (this.s == j) {
            return;
        }
        this.s = j;
        this.a.B(j);
    }

    public final void j(long j, long j2) {
        this.a.C((int) (j >> 32), (int) (4294967295L & j), j2);
    }

    public final void k(long j, long j2, float f) {
        float f2 = this.o;
        float f3 = this.p;
        long jAi = a.ai(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (this.f == jAi && this.g == j2 && this.A == f && this.v == null) {
            return;
        }
        o();
        this.f = jAi;
        this.g = j2;
        this.A = f;
        d();
    }

    public final void l(cjm cjmVar) {
        o();
        this.v = cjmVar;
        d();
    }
}
