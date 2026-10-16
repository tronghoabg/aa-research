package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cgq implements View.OnAttachStateChangeListener, epf {
    public static final /* synthetic */ int h = 0;
    public final czq a;
    public boolean c;
    public final Runnable d;
    public final zh e;
    public bii g;
    private final afdr i;
    private zh l;
    private long m;
    private bii n;
    private final List j = new ArrayList();
    public int f = 1;
    public boolean b = true;
    private final aixl k = afpt.r(1, 0, 6);

    public cgq(czq czqVar, afdr afdrVar) {
        this.a = czqVar;
        this.i = afdrVar;
        new Handler(Looper.getMainLooper());
        zh zhVar = zi.a;
        zhVar.getClass();
        this.l = zhVar;
        this.e = new zh(6);
        ddu dduVarA = czqVar.W.A();
        zhVar.getClass();
        this.g = new bii(dduVarA, zhVar);
        this.d = new Runnable() { // from class: cgo
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                long j;
                long j2;
                long j3;
                long j4;
                zh zhVar2;
                int[] iArr;
                long[] jArr;
                zh zhVar3;
                int[] iArr2;
                long[] jArr2;
                long j5;
                long j6;
                int i;
                int i2;
                long[] jArr3;
                long j7;
                char c2;
                long j8;
                cgq cgqVar = this.a;
                if (cgqVar.n()) {
                    czq czqVar2 = cgqVar.a;
                    if (czqVar2.isAttachedToWindow()) {
                        czqVar2.v(true);
                        zh zhVar4 = cgqVar.e;
                        int[] iArr3 = zhVar4.b;
                        long[] jArr4 = zhVar4.a;
                        int length = jArr4.length - 2;
                        char c3 = 7;
                        long j9 = -9187201950435737472L;
                        int i3 = 8;
                        if (length >= 0) {
                            int i4 = 0;
                            j2 = 128;
                            while (true) {
                                long j10 = jArr4[i4];
                                j3 = 255;
                                if ((((~j10) << c3) & j10 & j9) != j9) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((j10 & 255) < 128) {
                                            c2 = c3;
                                            int i7 = iArr3[(i4 << 3) + i6];
                                            j8 = j9;
                                            if (!cgqVar.h().b(i7)) {
                                                cgqVar.j(i7);
                                                cgqVar.k();
                                            }
                                        } else {
                                            c2 = c3;
                                            j8 = j9;
                                        }
                                        j10 >>= 8;
                                        i6++;
                                        c3 = c2;
                                        j9 = j8;
                                    }
                                    c = c3;
                                    j = j9;
                                    if (i5 != 8) {
                                        break;
                                    }
                                } else {
                                    c = c3;
                                    j = j9;
                                }
                                if (i4 == length) {
                                    break;
                                }
                                i4++;
                                c3 = c;
                                j9 = j;
                            }
                        } else {
                            c = 7;
                            j = -9187201950435737472L;
                            j2 = 128;
                            j3 = 255;
                        }
                        cgqVar.o(czqVar2.W.A(), cgqVar.g);
                        zh zhVarH = cgqVar.h();
                        int[] iArr4 = zhVarH.b;
                        long[] jArr5 = zhVarH.a;
                        int length2 = jArr5.length - 2;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j11 = jArr5[i8];
                                if ((((~j11) << c) & j11 & j) != j) {
                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((j11 & j3) < j2) {
                                            int i11 = iArr4[(i8 << 3) + i10];
                                            bii biiVar = (bii) cgqVar.e.a(i11);
                                            hig higVar = (hig) zhVarH.a(i11);
                                            Object obj = higVar != null ? higVar.b : null;
                                            if (obj == null) {
                                                crt.a("no value for specified key");
                                                throw new aezp();
                                            }
                                            if (biiVar == null) {
                                                ddr ddrVar = ((ddu) obj).b;
                                                aan aanVar = ddrVar.c;
                                                j6 = j2;
                                                Object[] objArr = aanVar.b;
                                                long[] jArr6 = aanVar.a;
                                                int length3 = jArr6.length - 2;
                                                zhVar3 = zhVarH;
                                                iArr2 = iArr4;
                                                if (length3 >= 0) {
                                                    int i12 = i3;
                                                    int i13 = 0;
                                                    while (true) {
                                                        long j12 = jArr6[i13];
                                                        j5 = j11;
                                                        if ((((~j12) << c) & j12 & j) != j) {
                                                            int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                            for (int i15 = 0; i15 < i14; i15++) {
                                                                if ((j12 & j3) < j6) {
                                                                    j7 = j12;
                                                                    deb debVar = (deb) objArr[(i13 << 3) + i15];
                                                                    deb debVar2 = ddx.D;
                                                                    if (affa.f(debVar, debVar2)) {
                                                                        List list = (List) ddrVar.g(debVar2);
                                                                        cgqVar.l(((ddu) obj).c, String.valueOf(list != null ? (deu) woy.bH(list) : null));
                                                                    }
                                                                } else {
                                                                    j7 = j12;
                                                                }
                                                                j12 = j7 >> i12;
                                                            }
                                                            i = i12;
                                                            if (i14 != i) {
                                                                jArr2 = jArr5;
                                                                break;
                                                            }
                                                        }
                                                        if (i13 == length3) {
                                                            break;
                                                        }
                                                        i13++;
                                                        j11 = j5;
                                                        i12 = 8;
                                                    }
                                                    j11 = j5 >> i;
                                                    i10++;
                                                    i3 = i;
                                                    j2 = j6;
                                                    zhVarH = zhVar3;
                                                    iArr4 = iArr2;
                                                    jArr5 = jArr2;
                                                } else {
                                                    j5 = j11;
                                                    jArr2 = jArr5;
                                                }
                                            } else {
                                                zhVar3 = zhVarH;
                                                iArr2 = iArr4;
                                                j5 = j11;
                                                j6 = j2;
                                                ddr ddrVar2 = ((ddu) obj).b;
                                                aan aanVar2 = ddrVar2.c;
                                                Object[] objArr2 = aanVar2.b;
                                                long[] jArr7 = aanVar2.a;
                                                int length4 = jArr7.length - 2;
                                                if (length4 >= 0) {
                                                    int i16 = 0;
                                                    while (true) {
                                                        long j13 = jArr7[i16];
                                                        long[] jArr8 = jArr7;
                                                        Object[] objArr3 = objArr2;
                                                        if ((((~j13) << c) & j13 & j) != j) {
                                                            int i17 = 8 - ((~(i16 - length4)) >>> 31);
                                                            int i18 = 0;
                                                            while (i18 < i17) {
                                                                if ((j13 & j3) < j6) {
                                                                    i2 = i18;
                                                                    deb debVar3 = (deb) objArr3[(i16 << 3) + i18];
                                                                    jArr3 = jArr5;
                                                                    deb debVar4 = ddx.D;
                                                                    if (affa.f(debVar3, debVar4)) {
                                                                        List list2 = (List) ((ddr) biiVar.a).g(debVar4);
                                                                        deu deuVar = list2 != null ? (deu) woy.bH(list2) : null;
                                                                        List list3 = (List) ddrVar2.g(debVar4);
                                                                        deu deuVar2 = list3 != null ? (deu) woy.bH(list3) : null;
                                                                        if (!affa.f(deuVar, deuVar2)) {
                                                                            cgqVar.l(((ddu) obj).c, String.valueOf(deuVar2));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i2 = i18;
                                                                    jArr3 = jArr5;
                                                                }
                                                                j13 >>= 8;
                                                                i18 = i2 + 1;
                                                                jArr5 = jArr3;
                                                            }
                                                            jArr2 = jArr5;
                                                            if (i17 != 8) {
                                                                i = 8;
                                                                break;
                                                            }
                                                        } else {
                                                            jArr2 = jArr5;
                                                        }
                                                        if (i16 == length4) {
                                                            break;
                                                        }
                                                        i16++;
                                                        objArr2 = objArr3;
                                                        jArr7 = jArr8;
                                                        jArr5 = jArr2;
                                                    }
                                                } else {
                                                    jArr2 = jArr5;
                                                }
                                            }
                                            i = 8;
                                            j11 = j5 >> i;
                                            i10++;
                                            i3 = i;
                                            j2 = j6;
                                            zhVarH = zhVar3;
                                            iArr4 = iArr2;
                                            jArr5 = jArr2;
                                        } else {
                                            zhVar3 = zhVarH;
                                            iArr2 = iArr4;
                                            jArr2 = jArr5;
                                            j5 = j11;
                                            j6 = j2;
                                        }
                                        i = i3;
                                        j11 = j5 >> i;
                                        i10++;
                                        i3 = i;
                                        j2 = j6;
                                        zhVarH = zhVar3;
                                        iArr4 = iArr2;
                                        jArr5 = jArr2;
                                    }
                                    zhVar2 = zhVarH;
                                    iArr = iArr4;
                                    jArr = jArr5;
                                    j4 = j2;
                                    if (i9 != i3) {
                                        break;
                                    }
                                } else {
                                    zhVar2 = zhVarH;
                                    iArr = iArr4;
                                    jArr = jArr5;
                                    j4 = j2;
                                }
                                if (i8 == length2) {
                                    break;
                                }
                                i8++;
                                j2 = j4;
                                zhVarH = zhVar2;
                                iArr4 = iArr;
                                jArr5 = jArr;
                                i3 = 8;
                            }
                        } else {
                            j4 = j2;
                        }
                        zh zhVar5 = cgqVar.e;
                        zhVar5.f();
                        zh zhVarH2 = cgqVar.h();
                        int[] iArr5 = zhVarH2.b;
                        Object[] objArr4 = zhVarH2.c;
                        long[] jArr9 = zhVarH2.a;
                        int length5 = jArr9.length - 2;
                        if (length5 >= 0) {
                            int i19 = 0;
                            while (true) {
                                long j14 = jArr9[i19];
                                if ((((~j14) << c) & j14 & j) != j) {
                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                    for (int i21 = 0; i21 < i20; i21++) {
                                        if ((j14 & j3) < j4) {
                                            int i22 = (i19 << 3) + i21;
                                            zhVar5.g(iArr5[i22], new bii((ddu) ((hig) objArr4[i22]).b, cgqVar.h()));
                                        }
                                        j14 >>= 8;
                                    }
                                    if (i20 != 8) {
                                        break;
                                    }
                                }
                                if (i19 == length5) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        cgqVar.g = new bii(cgqVar.a.W.A(), cgqVar.h());
                    }
                    cgqVar.c = false;
                }
            }
        };
    }

    private final void p(ddu dduVar, afeg afegVar) {
        List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listK.get(i2);
            if (h().b(((ddu) obj).c)) {
                afegVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    private final void q() {
        bii biiVar = this.n;
        if (biiVar != null && Build.VERSION.SDK_INT >= 29) {
            List list = this.j;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cgr cgrVar = (cgr) list.get(i);
                if (cgrVar.b - 1 != 0) {
                    AutofillId autofillIdK = biiVar.k(cgrVar.a);
                    if (autofillIdK != null && Build.VERSION.SDK_INT >= 29) {
                        alc$$ExternalSyntheticApiModelOutline0.m(biiVar.a).notifyViewDisappeared(autofillIdK);
                    }
                } else {
                    sm smVar = cgrVar.c;
                    if (smVar != null && Build.VERSION.SDK_INT >= 29) {
                        alc$$ExternalSyntheticApiModelOutline0.m(biiVar.a).notifyViewAppeared((ViewStructure) smVar.a);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                alc$$ExternalSyntheticApiModelOutline0.m(biiVar.a).notifyViewsDisappeared(a$$ExternalSyntheticApiModelOutline0.m7m(new kwp(((View) biiVar.b).getAutofillId()).a), new long[]{Long.MIN_VALUE});
            }
            list.clear();
        }
    }

    private final void r(ddu dduVar) {
        if (n()) {
            j(dduVar.c);
            List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
            int size = listK.size();
            for (int i = 0; i < size; i++) {
                r((ddu) listK.get(i));
            }
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        r(this.a.W.A());
        q();
        this.n = null;
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        this.n = (bii) this.i.invoke();
        m(-1, this.a.W.A());
        q();
    }

    public final Handler g() {
        return this.a.getHandler();
    }

    public final zh h() {
        if (this.b) {
            this.b = false;
            czq czqVar = this.a;
            this.l = ddv.c(czqVar.W, new bmk(18));
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.afck r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cgp
            if (r0 == 0) goto L13
            r0 = r8
            cgp r0 = (defpackage.cgp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgp r0 = new cgp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            aiwz r2 = r0.d
            defpackage.woy.dF(r8)
            goto L43
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            aiwz r2 = r0.d
            defpackage.woy.dF(r8)
            goto L4d
        L3a:
            defpackage.woy.dF(r8)
            aixl r8 = r7.k
            aiwz r2 = r8.A()
        L43:
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L82
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r2.b()
            boolean r8 = r7.n()
            if (r8 == 0) goto L61
            r7.q()
        L61:
            android.os.Handler r8 = r7.g()
            boolean r5 = r7.c
            if (r5 != 0) goto L72
            if (r8 == 0) goto L72
            r7.c = r4
            java.lang.Runnable r5 = r7.d
            r8.post(r5)
        L72:
            r0.d = r2
            r0.c = r3
            r5 = 100
            java.lang.Object r8 = defpackage.aiow.c(r5, r0)
            if (r8 != r1) goto L43
            goto L82
        L7f:
            afak r7 = defpackage.afak.a
            return r7
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgq.i(afck):java.lang.Object");
    }

    public final void j(int i) {
        this.j.add(new cgr(i, this.m, 2, null));
    }

    public final void k() {
        this.k.j(afak.a);
    }

    public final void l(int i, String str) {
        bii biiVar;
        if (Build.VERSION.SDK_INT >= 29 && (biiVar = this.n) != null) {
            AutofillId autofillIdK = biiVar.k(i);
            if (autofillIdK == null) {
                crt.a("Invalid content capture ID");
                throw new aezp();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                alc$$ExternalSyntheticApiModelOutline0.m(biiVar.a).notifyViewTextChanged(autofillIdK, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r17, defpackage.ddu r18) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgq.m(int, ddu):void");
    }

    public final boolean n() {
        return this.n != null;
    }

    public final void o(ddu dduVar, bii biiVar) {
        p(dduVar, new bmc(biiVar, this, 8, null));
        List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            ddu dduVar2 = (ddu) listK.get(i);
            zh zhVarH = h();
            int i2 = dduVar2.c;
            if (zhVarH.b(i2)) {
                zh zhVar = this.e;
                if (zhVar.b(i2)) {
                    Object objA = zhVar.a(i2);
                    if (objA == null) {
                        crt.a("node not present in pruned tree before this change");
                        throw new aezp();
                    }
                    o(dduVar2, (bii) objA);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handlerG = g();
        if (handlerG != null) {
            handlerG.removeCallbacks(this.d);
        }
        this.n = null;
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
