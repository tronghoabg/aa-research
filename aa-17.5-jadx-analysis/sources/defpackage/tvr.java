package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.geo.mapcore.renderer.TextureShaderState$TextureShaderProgram;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class tvr extends tvl implements tyw, tpr {
    private static final yob m = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/ClientAreaImpl");
    private static int n = 0;
    private int A;
    private boolean B;
    private final List C;
    private final tvm D;
    final typ c;
    protected final ume d;
    protected final tvq e;
    protected final twf f;
    protected final too g;
    public boolean h;
    public tqo i;
    final uvg j;
    final usy k;
    final gjv l;
    private final int o;
    private final umi p;
    private final uhz q;
    private final uwl r;
    private final uhv s;
    private final abax t;
    private final ukf u;
    private float v;
    private boolean w;
    private final xyc x;
    private final xyc y;
    private boolean z;

    public tvr(abax abaxVar, tod todVar, tza tzaVar, ukq ukqVar, tqo tqoVar, typ typVar, zyq zyqVar, uvg uvgVar, usy usyVar, gjv gjvVar, tvm tvmVar, boolean z) {
        float f;
        int i;
        too tooVar;
        boolean z2;
        int i2;
        int[] iArr;
        int i3;
        float[] fArr;
        float fA;
        float f2;
        int i4;
        int length;
        int iMin;
        int iMax;
        super(gjvVar);
        too tooVar2 = new too(0, 0);
        this.g = tooVar2;
        this.v = 1.0f;
        this.w = true;
        this.h = true;
        xyc xycVarL = wub.L(new tnp(4));
        this.x = xycVarL;
        this.z = false;
        this.A = -1;
        this.B = false;
        this.C = new ArrayList();
        this.q = new uhz(z);
        this.D = tvmVar;
        this.t = abaxVar;
        this.j = uvgVar;
        this.l = gjvVar;
        this.k = usyVar;
        this.c = typVar;
        this.i = tqoVar;
        this.r = new uwl(TextureShaderState$TextureShaderProgram.class);
        this.y = wub.L(new lwc(xycVarL, 4));
        int i5 = n;
        this.o = i5;
        n = i5 + 2;
        try {
            uip uipVarD = uip.d(abaxVar, todVar, tzaVar, ukqVar, true);
            tvq tvqVarB = zyq.b(this, uipVarD);
            this.e = tvqVarB;
            tvqVarB.a = uipVarD.n;
            uks uksVar = uipVarD.g;
            woy.Z(uksVar.d.length > 0 || uksVar.c.length > 0);
            ukf ukfVar = uipVarD.j;
            this.u = ukfVar;
            ukf ukfVarC = c(tqoVar, typVar, ukfVar);
            boolean z3 = uipVarD.g.e != null;
            boolean zE = E(ukfVarC);
            if (!z3 || zE) {
                f = 1.0f;
                i = 1;
            } else {
                f = 1.0f;
                i = 1;
                ((ynz) ((ynz) m.h()).ai((char) 9153)).u("ClientArea created with texture coordinates, but has a non-textured style.");
            }
            if (!z3 && zE) {
                ((ynz) ((ynz) m.h()).ai((char) 9152)).u("ClientArea created without texture coordinates, but has a textured style.");
            }
            if (ukfVarC == null || ukfVarC.b() == 0) {
                ((ynz) ((ynz) m.g()).ai((char) 9151)).u("Cannot instantiate a ClientArea with a style that has no key zooms.");
            }
            if (!abaxVar.e || ukfVarC == null) {
                this.f = null;
            } else {
                this.f = C(this, zyqVar, tzaVar, todVar, uipVarD, abaxVar, tqoVar);
            }
            int[] iArr2 = uipVarD.g.c;
            int length2 = iArr2.length;
            if (length2 == 0) {
                tooVar = new too(0, 0);
            } else if (length2 == 2) {
                tooVar = new too(iArr2[0], iArr2[i]);
            } else {
                int i6 = length2 >> 1;
                int i7 = (length2 >> 2) + 2;
                aejj aejjVar = aejo.b;
                aejp aejpVar = new aejp(i7, aejjVar);
                aejp aejpVar2 = new aejp(i7, null);
                aejp aejpVar3 = new aejp(i7, aejjVar);
                aejp aejpVar4 = new aejp(i7, null);
                for (int i8 = 0; i8 < i6; i8++) {
                    int i9 = i8 + i8;
                    int i10 = iArr2[i9];
                    int i11 = iArr2[i9 + 1];
                    if (adqs.o(aejpVar) || i10 < aejpVar.b()) {
                        aejpVar.c(i10);
                    } else {
                        aejpVar2.c(i10);
                    }
                    if (adqs.o(aejpVar3) || i11 < aejpVar3.b()) {
                        aejpVar3.c(i11);
                    } else {
                        aejpVar4.c(i11);
                    }
                    int i12 = aejpVar.b;
                    int i13 = aejpVar2.b;
                    if (i12 > i13 + 1) {
                        aejpVar2.c(aejpVar.a());
                    } else if (i13 > i12 + 1) {
                        aejpVar.c(aejpVar2.a());
                    }
                    int i14 = aejpVar3.b;
                    int i15 = aejpVar4.b;
                    if (i14 > i15 + 1) {
                        aejpVar4.c(aejpVar3.a());
                    } else if (i15 > i14 + 1) {
                        aejpVar3.c(aejpVar4.a());
                    }
                }
                int iB = aejpVar2.b();
                int iB2 = aejpVar4.b();
                iB = aejpVar.b > aejpVar2.b ? aejpVar.b() : iB;
                iB2 = aejpVar3.b > aejpVar4.b ? aejpVar3.b() : iB2;
                tooVar = new too(aejpVar.b == aejpVar2.b ? (iB + aejpVar.b()) / 2 : iB, aejpVar3.b == aejpVar4.b ? (iB2 + aejpVar3.b()) / 2 : iB2);
            }
            tooVar2.A(tooVar);
            too tooVar3 = this.g;
            tvq tvqVar = this.e;
            boolean z4 = uipVarD.n;
            int i16 = uha.a;
            uks uksVar2 = uipVarD.g;
            int iD = uksVar2.d();
            int[] iArr3 = uksVar2.f;
            if (iD != 0 && (iArr3 == null || iArr3.length >= 2)) {
                int[] iArr4 = uksVar2.c;
                int length3 = iArr4.length;
                if (length3 > 0) {
                    fArr = uksVar2.e;
                    if (fArr != null && fArr.length >= length3) {
                        z2 = z4;
                        i2 = iD;
                        iArr = iArr3;
                        i3 = 1073741824;
                    } else if ((length3 & 1) != 0) {
                        fArr = new float[0];
                        z2 = z4;
                        i2 = iD;
                        iArr = iArr3;
                        i3 = 1073741824;
                    } else {
                        int iMin2 = iArr4[i];
                        int iMax2 = iMin2;
                        i3 = 1073741824;
                        for (int i17 = i; i17 < iArr4.length; i17 += 2) {
                            iMin2 = Math.min(iArr4[i17], iMin2);
                            iMax2 = Math.max(iArr4[i17], iMax2);
                        }
                        int i18 = iArr4[0];
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = i18;
                        while (i20 < iArr4.length) {
                            int iAbs = Math.abs(iArr4[0] - iArr4[i20]);
                            boolean z5 = z4;
                            iAbs = iAbs > 536870912 ? 1073741824 - iAbs : iAbs;
                            if (iAbs > i19) {
                                i21 = iArr4[i20];
                                i19 = iAbs;
                            }
                            i20 += 2;
                            z4 = z5;
                        }
                        z2 = z4;
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            length = iArr4.length;
                            if (i22 >= length) {
                                break;
                            }
                            int iAbs2 = Math.abs(iArr4[i22] - i21);
                            int i24 = i22;
                            if (iAbs2 > 536870912) {
                                iAbs2 = 1073741824 - iAbs2;
                                i23 = i;
                            }
                            if (iAbs2 > i19) {
                                i18 = iArr4[i24];
                                i19 = iAbs2;
                            }
                            i22 = i24 + 2;
                        }
                        if (i23 != 0) {
                            iMin = Math.max(i21, i18);
                            iMax = Math.min(i21, i18);
                        } else {
                            iMin = Math.min(i21, i18);
                            iMax = Math.max(i21, i18);
                        }
                        too tooVar4 = new too(iMin, iMin2, 0);
                        too tooVar5 = new too(iMax, iMax2, 0);
                        double dH = 1.0d / tss.h(tooVar5.b(), tooVar4.b());
                        double dA = tooVar5.a() - tooVar4.a();
                        fArr = new float[length];
                        too tooVar6 = new too();
                        int i25 = 0;
                        while (i25 < (iArr4.length >> 1)) {
                            int i26 = i25 + i25;
                            int i27 = i26 + 1;
                            tooVar6.r(iArr4[i26], iArr4[i27]);
                            double d = dH;
                            fArr[i26] = (float) (tss.h(tooVar6.b(), tooVar4.b()) * d);
                            fArr[i27] = (float) (1.0d - ((tooVar6.a() - tooVar4.a()) * (1.0d / dA)));
                            i25++;
                            iD = iD;
                            iArr3 = iArr3;
                            iArr4 = iArr4;
                            dH = d;
                        }
                        i2 = iD;
                        iArr = iArr3;
                    }
                } else {
                    z2 = z4;
                    i2 = iD;
                    iArr = iArr3;
                    i3 = 1073741824;
                    fArr = uksVar2.e;
                    if (fArr == null) {
                        float[] fArr2 = uksVar2.d;
                        int length4 = fArr2.length;
                        if (length4 == 0 || (length4 & 1) != 0) {
                            fArr = new float[0];
                        } else {
                            fArr = new float[length4];
                            int i28 = length4 >> 1;
                            float[] fArr3 = new float[i28];
                            float[] fArr4 = new float[i28];
                            int i29 = 0;
                            int i30 = 0;
                            while (i29 < fArr2.length) {
                                fArr3[i30] = fArr2[i29];
                                fArr4[i30] = fArr2[i29 + 1];
                                i29 += 2;
                                i30++;
                            }
                            float fAA = wub.aA(fArr3);
                            float fAz = wub.az(fArr3);
                            float fAA2 = wub.aA(fArr4);
                            float f3 = f / (fAz - fAA);
                            float fAz2 = f / (wub.az(fArr4) - fAA2);
                            for (int i31 = 0; i31 < (fArr2.length >> 1); i31++) {
                                int i32 = i31 + i31;
                                fArr[i32] = (fArr3[i31] - fAA) * f3;
                                fArr[i32 + 1] = f - ((fArr4[i31] - fAA2) * fAz2);
                            }
                        }
                    }
                }
                int[] iArr5 = uksVar2.c;
                float[] fArr5 = uksVar2.d;
                int i33 = i2 * 3;
                int length5 = iArr5.length;
                int i34 = tooVar3.a;
                int i35 = tooVar3.b;
                int[] iArr6 = new int[i2 * 12];
                for (int i36 = 0; i36 < i33; i36++) {
                    int i37 = iArr == null ? i36 : iArr[i36];
                    int i38 = i37 + i37;
                    int i39 = i38 + 1;
                    if (length5 > 0) {
                        if (z2) {
                            i4 = iArr5[i38] - i34;
                        } else {
                            i4 = iArr5[i38] - i34;
                            int i40 = use.a;
                            while (i4 > 536870912) {
                                i4 -= 1073741824;
                            }
                            while (i4 < -536870912) {
                                i4 += i3;
                            }
                        }
                        fA = i4;
                        f2 = iArr5[i39] - i35;
                    } else {
                        fA = use.a(fArr5[i38]);
                        f2 = fArr5[i39];
                    }
                    float f4 = fArr[i38];
                    float f5 = fArr[i39];
                    int i41 = i36 * 4;
                    iArr6[i41] = Float.floatToIntBits(fA);
                    iArr6[i41 + 1] = Float.floatToIntBits(f2);
                    iArr6[i41 + 2] = Float.floatToIntBits(f4);
                    iArr6[i41 + 3] = Float.floatToIntBits(f5);
                }
                uws uwsVar = new uws("client_area", iArr6, i33, 81, 4, 16, (utz) null);
                uwsVar.c(false);
                tvqVar.w(uwsVar);
            }
            int i42 = uipVarD.w;
            uju ujuVar = uipVarD.v;
            ujt ujtVar = new ujt();
            ujtVar.a = ujuVar.c;
            ujtVar.b = ujuVar.d;
            ujtVar.c = ujuVar.e;
            if (tqoVar != null) {
                ujtVar.b = tqoVar.a();
                abcy abcyVarB = tqoVar.b();
                if (abcyVarB != null) {
                    ujtVar.c = abcyVarB.c;
                }
            }
            uhv uhvVar = new uhv(ujtVar.a(), i42, null);
            this.s = uhvVar;
            this.q.c(uhvVar);
            ArrayList arrayList = new ArrayList(i);
            arrayList.add(uipVarD);
            ume umeVar = new ume(arrayList);
            this.d = umeVar;
            this.p = new umi(umeVar);
            this.e.A(false);
            this.e.x = umi.a;
            float f6 = f;
            this.r.f(f6, f6, f6, f6);
            tvq tvqVar2 = this.e;
            tvqVar2.s = 519;
            D((int) tvqVar2.E().b);
            y();
        } catch (IOException unused) {
            this.e = zyq.b(this, null);
            this.f = null;
            this.u = ukf.a;
            this.s = null;
            this.d = null;
            this.p = umi.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List A(abdx abdxVar, tod todVar) {
        int i;
        int i2;
        abms abmsVar = abdxVar.c;
        abod abodVar = abdxVar.d;
        int i3 = yfq.d;
        yfl yflVar = new yfl(4);
        yfl yflVar2 = new yfl(4);
        yflVar2.k(abodVar);
        int iB = todVar.b(abmsVar);
        if (abodVar.isEmpty() || ((Integer) abodVar.get(abodVar.size() - 1)).intValue() != iB) {
            yflVar2.i(Integer.valueOf(iB));
        }
        abod abodVar2 = abdxVar.i;
        yfq yfqVarG = yflVar2.g();
        int i4 = ((yls) yfqVarG).c;
        ArrayList arrayList = new ArrayList(i4);
        int i5 = 0;
        ynp ynpVarListIterator = yfqVarG.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ((Integer) ynpVarListIterator.next()).intValue();
            arrayList.add(new ArrayList());
        }
        if (!abodVar2.isEmpty()) {
            int iIntValue = ((Integer) abodVar2.get(0)).intValue();
            int iIntValue2 = ((Integer) yfqVarG.get(0)).intValue();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (iIntValue < iIntValue2) {
                    ((List) arrayList.get(i6)).add(Integer.valueOf(iIntValue - i7));
                    i8++;
                    if (i8 == abodVar2.size()) {
                        break;
                    }
                    iIntValue = ((Integer) abodVar2.get(i8)).intValue();
                } else {
                    i6++;
                    if (i6 == i4) {
                        break;
                    }
                    i7 = iIntValue2;
                    iIntValue2 = ((Integer) yfqVarG.get(i6)).intValue();
                }
            }
        }
        int iA = todVar.a();
        yfq yfqVarG2 = yflVar2.g();
        int i9 = ((yls) yfqVarG2).c;
        int i10 = 0;
        int iIntValue3 = 0;
        int i11 = 0;
        while (i10 < i9) {
            Integer num = (Integer) yfqVarG2.get(i10);
            int i12 = iIntValue3 * iA;
            abms abmsVarE = abmsVar.e(i12, (iIntValue3 + 1) * iA);
            abms abmsVarE2 = abmsVar.e(i12, num.intValue() * iA);
            if (!abmsVarE2.x(abmsVarE2.d() - iA).equals(abmsVarE)) {
                abmsVarE2 = abmsVarE2.s(abmsVarE);
            }
            List list = (List) arrayList.get(i11);
            ArrayList arrayList2 = new ArrayList(1);
            int iA2 = todVar.a();
            if (list.isEmpty()) {
                arrayList2.add(abmsVarE2);
                i = iA;
            } else {
                Iterator it = list.iterator();
                int i13 = i5;
                while (it.hasNext()) {
                    int iIntValue4 = ((Integer) it.next()).intValue();
                    if (i13 < iIntValue4) {
                        i2 = iA;
                        arrayList2.add(abmsVarE2.e(i13 * iA2, (iIntValue4 + 1) * iA2));
                    } else {
                        i2 = iA;
                    }
                    i13 = iIntValue4 + 1;
                    iA = i2;
                }
                i = iA;
                int iB2 = todVar.b(abmsVarE2);
                if (i13 < iB2 - 1) {
                    arrayList2.add(abmsVarE2.e(i13 * iA2, iB2 * iA2));
                }
            }
            yflVar.k(arrayList2);
            iIntValue3 = num.intValue();
            i10++;
            i11++;
            iA = i;
            i5 = 0;
        }
        return yflVar.g();
    }

    protected static void B(abnr abnrVar, int i, abms abmsVar, tqo tqoVar, int i2, int i3, int i4) {
        abnr abnrVar2 = (abnr) abdd.a.n();
        abnrVar2.t();
        abdd abddVar = (abdd) abnrVar2.b;
        abddVar.g = 0;
        abddVar.b |= 8;
        abnrVar2.t();
        abdd abddVar2 = (abdd) abnrVar2.b;
        abddVar2.h = 0;
        abddVar2.b |= 16;
        abnrVar2.t();
        abdd abddVar3 = (abdd) abnrVar2.b;
        abddVar3.b |= 2;
        abddVar3.d = i;
        abnrVar2.t();
        abdd abddVar4 = (abdd) abnrVar2.b;
        abmsVar.getClass();
        abddVar4.b |= 1;
        abddVar4.c = abmsVar;
        abnrVar2.t();
        abdd abddVar5 = (abdd) abnrVar2.b;
        abddVar5.b |= 2048;
        abddVar5.o = i2;
        abnrVar2.t();
        abdd abddVar6 = (abdd) abnrVar2.b;
        abddVar6.b |= 4096;
        abddVar6.p = i3;
        abnrVar2.t();
        abdd abddVar7 = (abdd) abnrVar2.b;
        abddVar7.i = i4 - 1;
        abddVar7.b |= 32;
        abcy abcyVarB = tqoVar.b();
        if (abcyVarB != null) {
            abnrVar2.bc(abcz.f, abcyVarB);
        } else if (tqoVar.a() != -1) {
            int iA = tqoVar.a();
            abnrVar2.t();
            abdd abddVar8 = (abdd) abnrVar2.b;
            abddVar8.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            abddVar8.m = iA;
        }
        abnrVar.t();
        abde abdeVar = (abde) abnrVar.b;
        abdd abddVar9 = (abdd) abnrVar2.q();
        abde abdeVar2 = abde.a;
        abddVar9.getClass();
        aboh abohVar = abdeVar.b;
        if (!abohVar.c()) {
            abdeVar.b = abnv.I(abohVar);
        }
        abdeVar.b.add(abddVar9);
    }

    private final void D(int i) {
        uvg uvgVar;
        abax abaxVar = this.t;
        long j = abaxVar.k;
        long j2 = abaxVar.l;
        long j3 = i;
        ute uteVar = new ute(j3, j, j2, this.o);
        tvq tvqVar = this.e;
        tvqVar.u(uteVar);
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((umb) it.next()).u(new ute(j3, j, j2, r0 + 1));
        }
        if (!this.z || (uvgVar = this.j) == null) {
            return;
        }
        uvgVar.g(tvqVar);
    }

    private static boolean E(ukf ukfVar) {
        if (ukfVar != null) {
            int i = 0;
            while (true) {
                ujf[] ujfVarArr = ukfVar.c;
                if (i >= ujfVarArr.length) {
                    break;
                }
                if (!ujfVarArr[i].J.a()) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private static ukf c(tqo tqoVar, typ typVar, ukf ukfVar) {
        return tqoVar instanceof txk ? ((txk) tqoVar).d() : tqoVar instanceof twh ? typVar.h.c(((twh) tqoVar).a) : ukfVar;
    }

    private final void d(boolean z) {
        uvg uvgVar;
        synchronized (this) {
            if (this.b) {
                return;
            }
            if (z && !this.z) {
                this.z = true;
                tvq tvqVar = this.e;
                if (tvqVar != null && (uvgVar = this.j) != null) {
                    uvgVar.d(tvqVar, this);
                    uvgVar.g(tvqVar);
                }
            }
            twf twfVar = this.f;
            if (twfVar != null) {
                if (z) {
                    twfVar.x();
                } else {
                    twfVar.d(false);
                }
            }
            synchronized (this) {
                this.B = z;
            }
            this.l.l();
        }
    }

    protected abstract twf C(tvr tvrVar, zyq zyqVar, tza tzaVar, tod todVar, uip uipVar, abax abaxVar, tqo tqoVar);

    @Override // defpackage.tpr
    public final synchronized void a(float f) {
        if (this.v != f) {
            this.v = f;
            this.w = true;
            this.l.l();
        }
    }

    @Override // defpackage.tpr
    public final void b(tqo tqoVar) {
        tqoVar.c(new sbj(this, tqoVar, 15, (byte[]) null));
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void e() {
        super.e();
        this.e.x = umi.a;
        twf twfVar = this.f;
        if (twfVar != null) {
            twfVar.e();
        }
    }

    @Override // defpackage.tpz
    public final void f() {
        this.D.a(this);
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void g(tqq tqqVar) {
        super.g(tqqVar);
        this.e.x = this.p;
        twf twfVar = this.f;
        if (twfVar != null) {
            twfVar.g(new tvo(this, tqqVar));
        }
    }

    @Override // defpackage.tvl, defpackage.tpz
    public final synchronized void h() {
        super.h();
        this.e.x = this.p;
        twf twfVar = this.f;
        if (twfVar != null) {
            twfVar.h();
        }
    }

    @Override // defpackage.tpz
    public final void i() {
        this.D.d(this);
    }

    @Override // defpackage.tqs
    public final /* synthetic */ abow j() {
        return this.t;
    }

    @Override // defpackage.tvl
    public final void o(tqd tqdVar) {
        p(tqdVar, this);
    }

    protected final List t() {
        List list = this.C;
        list.clear();
        twf twfVar = this.f;
        if (twfVar != null) {
            twfVar.c(list);
        }
        return list;
    }

    @Override // defpackage.tyw
    public final void u() {
        twf twfVar = this.f;
        if (twfVar != null) {
            twfVar.u();
        }
    }

    @Override // defpackage.tyw
    public final void v() {
        boolean z;
        synchronized (this) {
            z = this.b;
            this.b = true;
        }
        if (z) {
            return;
        }
        k();
        if (this.z) {
            this.j.i(this.e);
            this.l.l();
        }
        twf twfVar = this.f;
        if (twfVar != null) {
            twfVar.v();
        }
    }

    @Override // defpackage.tyw
    public final void w() {
        d(false);
    }

    @Override // defpackage.tyw
    public final void x() {
        d(true);
    }

    public final synchronized void y() {
        this.a = false;
        shd shdVar = new shd(this, 18);
        twf twfVar = this.f;
        ajju ajjuVar = new ajju((twfVar != null ? 1 : 0) + 1, shdVar);
        this.i.c(new shd(ajjuVar, 19));
        if (twfVar != null) {
            twfVar.n(new shd(ajjuVar, 19));
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public synchronized void z() {
        uwm uwmVarM;
        uvr uvrVar = uvr.a;
        if (this.a) {
            int iMax = (int) Math.max(BitmapDescriptorFactory.HUE_RED, this.k.o().l);
            if (this.w) {
                this.w = false;
                float f = this.v;
                this.r.f(f, f, f, f);
                twf twfVar = this.f;
                if (twfVar != null) {
                    twfVar.p = f;
                    twfVar.y();
                }
            }
            tqo tqoVar = this.i;
            typ typVar = this.c;
            ukf ukfVarC = c(tqoVar, typVar, this.u);
            int iA = ukfVarC.a(0);
            for (int i = 1; i < ukfVarC.b(); i++) {
                if (ukfVarC.a(i) <= iMax) {
                    iA = iMax;
                }
            }
            if (iA > iMax) {
                iA = -1;
            }
            if (this.h || this.A != iA) {
                this.h = false;
                this.A = iA;
                vaq.d();
                ujf ujfVarG = iA == -1 ? ujf.c : ukfVarC.g(iA);
                tvq tvqVar = this.e;
                ute uteVarE = tvqVar.E();
                int i2 = ujfVarG.F;
                if (uteVarE.b != i2) {
                    D(i2);
                }
                uhv uhvVar = this.s;
                if (uhvVar != null) {
                    uhz uhzVar = this.q;
                    acjs acjsVar = uhzVar.k;
                    if (acjsVar.b.containsKey(uhvVar)) {
                        byte bF = acjsVar.f(uhvVar);
                        int i3 = ujfVarG.j;
                        uke[] ukeVarArr = ujfVarG.n;
                        uid uidVar = (uid) uhzVar.d.get(bF);
                        if (i3 <= 0 || ujfVarG.d) {
                            i3 = 0;
                        }
                        uidVar.b(i3, (ukeVarArr.length <= 0 || ujfVarG.e) ? 0 : ukeVarArr[0].b);
                    }
                }
                uvx uvxVar = tvqVar.m;
                uwl uwlVar = this.r;
                if (uvxVar != uwlVar) {
                    tvqVar.v(uwlVar);
                    tvqVar.t(1, 771);
                }
                if (E(ukfVarC)) {
                    uwmVarM = typVar.m(ujfVarG.J);
                    if (uwmVarM == null) {
                        ((ynz) ((ynz) m.g()).ai(9155)).u("ClientArea received null texture from styles.getTexture()");
                    }
                } else {
                    int i4 = ujfVarG.j;
                    boolean z = ujfVarG.d;
                    xyc xycVar = this.x;
                    if (z) {
                        ((Bitmap) xycVar.gu()).eraseColor(0);
                    } else {
                        ((Bitmap) xycVar.gu()).setPixel(0, 0, i4);
                    }
                    uwmVarM = (uwm) this.y.gu();
                    if (uwmVarM == null) {
                        ((ynz) ((ynz) m.g()).ai(9154)).u("ClientArea received null texture from fillTextureState.get()");
                    }
                }
                if (uwmVarM != null) {
                    tvqVar.z(0, uwmVarM);
                }
            }
            this.e.A(this.B);
        }
    }
}
