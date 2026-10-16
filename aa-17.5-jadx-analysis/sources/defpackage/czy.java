package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class czy extends dzp implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final zf a;
    public final nfh A;
    public bii B;
    private final czu F;
    private final yy G;
    private final aixl H;
    private zh I;
    private final afec J;
    public final czq b;
    public int d;
    public int e;
    public edg f;
    public edg g;
    public boolean h;
    public final aau i;
    public final aau j;
    public int k;
    public Integer l;
    public boolean m;
    public czv n;
    public final String o;
    public final String p;
    public boolean q;
    public final Runnable r;
    public final List s;
    public final zh t;
    public final zh u;
    public final zj v;
    public final zc w;
    public final zc x;
    public final zh y;
    public final zc z;
    public int c = Integer.MIN_VALUE;
    private final afec D = new cep(this, 17);
    private final long E = 100;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        zf zfVar = zg.a;
        zf zfVar2 = new zf(32);
        int i = zfVar2.b;
        if (i < 0) {
            ca.aa("");
        }
        zfVar2.c(zfVar2.b + 32);
        int[] iArr2 = zfVar2.a;
        int i2 = zfVar2.b;
        if (i != i2) {
            iArr2.getClass();
            iArr2.getClass();
            System.arraycopy(iArr2, i, iArr2, i + 32, i2 - i);
        }
        woy.ds(iArr, iArr2, i, 0, 12);
        zfVar2.b += 32;
        a = zfVar2;
    }

    public czy(czq czqVar) {
        this.b = czqVar;
        new Handler(Looper.getMainLooper());
        this.F = new czu(this);
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.t = new zh(6);
        this.u = new zh(6);
        this.i = new aau(null);
        this.j = new aau(null);
        this.k = -1;
        this.G = new yy(0);
        this.H = afpt.r(1, 0, 6);
        this.m = true;
        zh zhVar = zi.a;
        zhVar.getClass();
        this.I = zhVar;
        this.v = new zj(6);
        this.w = new zc(6);
        this.x = new zc(6);
        this.o = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.p = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A = new nfh((char[]) null);
        this.y = new zh(6);
        ddu dduVarA = czqVar.W.A();
        zhVar.getClass();
        this.B = new bii(dduVarA, zhVar);
        int i = zd.a;
        this.z = new zc(6);
        czqVar.addOnAttachStateChangeListener(this);
        this.r = new Runnable() { // from class: czt
            /* JADX WARN: Code restructure failed: missing block: B:184:0x04fa, code lost:
            
                if (defpackage.affa.f(r8, r5) != false) goto L201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:193:0x0518, code lost:
            
                if (r5.isEmpty() != false) goto L201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:293:0x07d3, code lost:
            
                r27 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:294:0x07dd, code lost:
            
                if (((((~r6) << r25) & r6) & (-9187201950435737472L)) == 0) goto L299;
             */
            /* JADX WARN: Code restructure failed: missing block: B:295:0x07df, code lost:
            
                r23 = -1;
             */
            /* JADX WARN: Removed duplicated region for block: B:234:0x063f  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0128 A[PHI: r40
  0x0128: PHI (r40v18 java.util.ArrayList) = (r40v16 java.util.ArrayList), (r40v19 java.util.ArrayList) binds: [B:45:0x0118, B:47:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2232
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.run():void");
            }
        };
        this.s = new ArrayList();
        this.J = new cep(this, 18);
    }

    public static final boolean E(ddp ddpVar, float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED || ((Number) ddpVar.a.invoke()).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            return f > BitmapDescriptorFactory.HUE_RED && ((Number) ddpVar.a.invoke()).floatValue() < ((Number) ddpVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean F(ddp ddpVar) {
        afdr afdrVar = ddpVar.a;
        if (((Number) afdrVar.invoke()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        ((Number) afdrVar.invoke()).floatValue();
        ((Number) ddpVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean G(ddp ddpVar) {
        afdr afdrVar = ddpVar.a;
        if (((Number) afdrVar.invoke()).floatValue() < ((Number) ddpVar.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) afdrVar.invoke()).floatValue();
        return false;
    }

    public static final CharSequence K(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        charSequenceSubSequence.getClass();
        return charSequenceSubSequence;
    }

    public static final String L(ddu dduVar) {
        deu deuVar;
        if (dduVar == null) {
            return null;
        }
        ddr ddrVar = dduVar.b;
        deb debVar = ddx.a;
        if (ddrVar.f(debVar)) {
            return dlz.c((List) ddrVar.c(debVar), ",", null, null, null, 62);
        }
        deb debVar2 = ddx.H;
        if (ddrVar.f(debVar2)) {
            deuVar = (deu) ddrVar.g(debVar2);
            if (deuVar == null) {
                return null;
            }
        } else {
            List list = (List) ddrVar.g(ddx.D);
            if (list == null || (deuVar = (deu) woy.bH(list)) == null) {
                return null;
            }
        }
        return deuVar.b;
    }

    private final Rect Q(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        czq czqVar = this.b;
        long jL = czqVar.l((Float.floatToRawIntBits(f2) & 4294967295L) | (jFloatToRawIntBits << 32));
        long jL2 = czqVar.l((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jL2 >> 32);
        int i2 = (int) (jL >> 32);
        int i3 = (int) (jL2 & 4294967295L);
        int i4 = (int) (jL & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i))), (int) Math.floor(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[LOOP:0: B:5:0x0016->B:37:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[EDGE_INSN: B:50:0x0078->B:38:0x0078 BREAK  A[LOOP:0: B:5:0x0016->B:37:0x0075], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.cjb R(defpackage.ddu r10, android.graphics.Rect r11, defpackage.ckv r12) {
        /*
            r9 = this;
            czx r0 = new czx
            r0.<init>(r12)
            cxb r10 = r10.a
            cxx r12 = r10.v
            int r1 = r12.a()
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L78
            cfx r12 = r12.f
        L16:
            if (r12 == 0) goto L78
            int r1 = r12.r
            r1 = r1 & 8
            if (r1 == 0) goto L6f
            r1 = r12
            r5 = r4
        L20:
            if (r1 == 0) goto L6f
            boolean r6 = r1 instanceof defpackage.cyu
            if (r6 == 0) goto L33
            r6 = r1
            cyu r6 = (defpackage.cyu) r6
            r6.g(r0)
            boolean r6 = r0.a
            if (r6 != 0) goto L31
            goto L6a
        L31:
            r4 = r1
            goto L78
        L33:
            int r6 = r1.r
            r6 = r6 & 8
            if (r6 == 0) goto L6a
            boolean r6 = r1 instanceof defpackage.cwe
            if (r6 == 0) goto L6a
            r6 = r1
            cwe r6 = (defpackage.cwe) r6
            cfx r6 = r6.C
            r7 = r2
        L43:
            if (r6 == 0) goto L68
            int r8 = r6.r
            r8 = r8 & 8
            if (r8 == 0) goto L65
            int r7 = r7 + 1
            if (r7 != r3) goto L51
            r1 = r6
            goto L65
        L51:
            if (r5 != 0) goto L5c
            byw r5 = new byw
            r8 = 16
            cfx[] r8 = new defpackage.cfx[r8]
            r5.<init>(r8)
        L5c:
            if (r1 == 0) goto L61
            r5.n(r1)
        L61:
            r5.n(r6)
            r1 = r4
        L65:
            cfx r6 = r6.u
            goto L43
        L68:
            if (r7 == r3) goto L20
        L6a:
            cfx r1 = defpackage.bzi.n(r5)
            goto L20
        L6f:
            int r1 = r12.s
            r1 = r1 & 8
            if (r1 == 0) goto L78
            cfx r12 = r12.u
            goto L16
        L78:
            cyu r4 = (defpackage.cyu) r4
            if (r4 == 0) goto Lbc
            cfx r12 = r4.M()
            if (r12 == 0) goto Lbc
            boolean r12 = r12.A
            if (r12 != r3) goto Lbc
            cst r10 = defpackage.bzi.o(r4)
            cst r12 = defpackage.crt.j(r10)
            cjb r10 = r12.o(r10, r2)
            float r12 = r10.b
            float r0 = r10.c
            float r1 = r10.d
            float r10 = r10.e
            android.graphics.Rect r9 = r9.Q(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            cjb r11 = new cjb
            int r0 = r9.width()
            float r0 = (float) r0
            int r9 = r9.height()
            float r9 = (float) r9
            float r10 = (float) r10
            float r12 = (float) r12
            float r0 = r0 + r10
            float r9 = r9 + r12
            r11.<init>(r10, r12, r0, r9)
            return r11
        Lbc:
            cyc r9 = r10.q()
            cjb r9 = defpackage.crt.i(r9, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czy.R(ddu, android.graphics.Rect, ckv):cjb");
    }

    private final ckm S(ckv ckvVar, long j, dlr dlrVar) {
        return ckvVar.a(j, dlrVar, this.b.r());
    }

    private final boolean T() {
        day dayVarP = this.b.P();
        return dayVarP.b && ((AccessibilityManager) dayVarP.t.a).isEnabled();
    }

    private static final Rect U(cjb cjbVar, float f, float f2) {
        float f3 = cjbVar.e + f2;
        float f4 = cjbVar.d + f;
        return new Rect((int) (cjbVar.b + f), (int) (cjbVar.c + f2), (int) f4, (int) f3);
    }

    private static final float[] V(ckm ckmVar) {
        if (!(ckmVar instanceof ckl)) {
            return null;
        }
        cjc cjcVar = ((ckl) ckmVar).a;
        long j = cjcVar.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = cjcVar.f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = cjcVar.g;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = cjcVar.h;
        return new float[]{fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4))};
    }

    private static final Rect W(ckm ckmVar, float f, float f2) {
        if ((ckmVar instanceof ckk) || (ckmVar instanceof ckl)) {
            return U(ckmVar.a(), f, f2);
        }
        return null;
    }

    private static final Region X(ckm ckmVar, float f, float f2) {
        if (!(ckmVar instanceof ckj)) {
            return null;
        }
        ckj ckjVar = (ckj) ckmVar;
        Region region = new Region(U(ckjVar.a().e(f, f2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
        Region region2 = new Region();
        Path path = ckjVar.a.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static final float j(float f, float f2) {
        return Math.signum(f) == Math.signum(f2) ? Math.abs(f) < Math.abs(f2) ? f : f2 : BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean A(int i) {
        return this.d == i;
    }

    public final boolean B() {
        if (!T()) {
            return false;
        }
        day dayVarP = this.b.P();
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = dayVarP.d;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = ((AccessibilityManager) dayVarP.t.a).getEnabledAccessibilityServiceList(-1);
            dayVarP.d = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean C() {
        Object obj = this.b.P().t.a;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((AccessibilityManager) obj).isRequestFromAccessibilityTool();
        }
        return true;
    }

    public final boolean D() {
        return T() && this.b.P().c;
    }

    public final boolean H(ddu dduVar, int i, int i2, boolean z) {
        String strL;
        ddr ddrVar = dduVar.b;
        deb debVar = ddq.j;
        if (ddrVar.f(debVar) && dan.e(dduVar)) {
            return ((Boolean) ((afeh) ((ddf) ddrVar.c(debVar)).b).invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == this.k) || (strL = L(dduVar)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strL.length()) {
            i = -1;
        }
        this.k = i;
        boolean z2 = strL.length() > 0;
        int i3 = dduVar.c;
        J(p(m(i3), z2 ? Integer.valueOf(this.k) : null, z2 ? Integer.valueOf(this.k) : null, z2 ? Integer.valueOf(strL.length()) : null, strL));
        x(i3);
        return true;
    }

    public final void I(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !B()) {
            return;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(dlz.c(list, ",", null, null, null, 62));
        }
        J(accessibilityEventO);
    }

    public final void J(AccessibilityEvent accessibilityEvent) {
        if (B()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.h = true;
            }
            try {
                ((Boolean) this.D.invoke(accessibilityEvent)).booleanValue();
            } finally {
                this.h = false;
            }
        }
    }

    public final Rect M(hig higVar) {
        dlp dlpVar = (dlp) higVar.c;
        int i = dlpVar.e;
        return Q(dlpVar.b, dlpVar.c, dlpVar.d, i);
    }

    public final void N(hig higVar, edg edgVar, boolean z, int i) {
        dme dmeVar;
        Object obj = higVar.b;
        czq czqVar = this.b;
        dal dalVarO = czqVar.O();
        if (dalVarO != null) {
            dmeVar = (dme) dalVarO.b.get(((ddu) obj).a);
        } else {
            dmeVar = null;
        }
        if (dmeVar != null) {
            edgVar.a.addChild(dmeVar);
        } else {
            ddu dduVar = (ddu) obj;
            boolean zF = affa.f(dduVar.g().g(ddx.o), true);
            if (z || !zF) {
                edgVar.i(czqVar, dduVar.c);
            }
        }
        this.z.c(((ddu) obj).c, i);
    }

    public final void O(ddu dduVar, bii biiVar) {
        int[] iArr = zk.a;
        zj zjVar = new zj(6);
        List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            ddu dduVar2 = (ddu) listK.get(i);
            zh zhVarQ = q();
            int i2 = dduVar2.c;
            if (zhVarQ.b(i2)) {
                if (!((zj) biiVar.b).a(i2)) {
                    u(dduVar.a);
                    return;
                }
                zjVar.d(i2);
            }
        }
        zj zjVar2 = (zj) biiVar.b;
        int[] iArr2 = zjVar2.b;
        long[] jArr = zjVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else if ((j & 255) < 128 && !zjVar.a(iArr2[(i3 << 3) + i5])) {
                            u(dduVar.a);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                } else if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List listK2 = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
        int size2 = listK2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ddu dduVar3 = (ddu) listK2.get(i7);
            zh zhVar = this.y;
            int i8 = dduVar3.c;
            bii biiVar2 = (bii) zhVar.a(i8);
            if (biiVar2 != null && q().b(i8)) {
                O(dduVar3, biiVar2);
            }
        }
    }

    @Override // defpackage.dzp
    public final edj a(View view) {
        return this.F;
    }

    public final int k(ddu dduVar) {
        ddr ddrVar = dduVar.b;
        if (!ddrVar.f(ddx.a)) {
            deb debVar = ddx.I;
            if (ddrVar.f(debVar)) {
                return (int) (((dfv) ddrVar.c(debVar)).b & 4294967295L);
            }
        }
        return this.k;
    }

    public final int l(ddu dduVar) {
        ddr ddrVar = dduVar.b;
        if (!ddrVar.f(ddx.a)) {
            deb debVar = ddx.I;
            if (ddrVar.f(debVar)) {
                return (int) (((dfv) ddrVar.c(debVar)).b >> 32);
            }
        }
        return this.k;
    }

    public final int m(int i) {
        if (i == this.b.W.A().c) {
            return -1;
        }
        return i;
    }

    public final Handler n() {
        return this.b.getHandler();
    }

    public final AccessibilityEvent o(int i, int i2) {
        hig higVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        czq czqVar = this.b;
        accessibilityEventObtain.setPackageName(czqVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(czqVar, i);
        if (B() && (higVar = (hig) q().a(i)) != null) {
            ddr ddrVar = ((ddu) higVar.b).b;
            accessibilityEventObtain.setPassword(ddrVar.f(ddx.O));
            boolean zF = affa.f(ddrVar.g(ddx.o), true);
            if (Build.VERSION.SDK_INT >= 34) {
                accessibilityEventObtain.setAccessibilityDataSensitive(zF);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handlerN = n();
        if (handlerN != null) {
            handlerN.removeCallbacks(this.r);
        }
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final zh q() {
        if (this.m) {
            this.m = false;
            czq czqVar = this.b;
            this.I = ddv.c(czqVar.W, new cmj(12));
            if (B()) {
                zh zhVar = this.I;
                zc zcVar = this.w;
                zc zcVar2 = this.x;
                Resources resources = czqVar.getContext().getResources();
                zcVar.b();
                zcVar2.b();
                hig higVar = (hig) zhVar.a(-1);
                byte[] bArr = null;
                Object obj = higVar != null ? higVar.b : null;
                obj.getClass();
                chk chkVar = new chk(zhVar, 17);
                bpi bpiVar = new bpi(resources, zhVar, 4, bArr);
                List listSingletonList = Collections.singletonList(obj);
                listSingletonList.getClass();
                List listA = ded.a((ddu) obj, chkVar, bpiVar, listSingletonList);
                int size = listA.size() - 1;
                if (size > 0) {
                    int i = 1;
                    while (true) {
                        int i2 = ((ddu) listA.get(i - 1)).c;
                        int i3 = ((ddu) listA.get(i)).c;
                        zcVar.c(i2, i3);
                        zcVar2.c(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.I;
    }

    public final edg r() {
        if (T()) {
            return null;
        }
        return edg.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #1 {all -> 0x01ad, blocks: (B:13:0x002a, B:22:0x004d, B:25:0x005b, B:27:0x0063, B:88:0x0172, B:91:0x017c, B:92:0x0183, B:97:0x01a4, B:18:0x003a, B:21:0x0041, B:30:0x006e, B:32:0x0075, B:34:0x0081, B:36:0x0089, B:38:0x008d, B:40:0x0093, B:50:0x00b6, B:53:0x00bd, B:55:0x00c1, B:57:0x00c7, B:59:0x00cd, B:61:0x00d1, B:65:0x00da, B:67:0x00e2, B:43:0x00a0, B:45:0x00a6, B:47:0x00ae, B:68:0x00ef, B:86:0x016b, B:71:0x00f6, B:73:0x00fe, B:75:0x0102, B:77:0x0108, B:80:0x011e, B:82:0x0126, B:84:0x0148, B:85:0x0168, B:87:0x016f), top: B:105:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01a0 -> B:22:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czy.s(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(int r25, defpackage.edg r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czy.t(int, edg, java.lang.String, android.os.Bundle):void");
    }

    public final void u(cxb cxbVar) {
        if (this.G.add(cxbVar)) {
            this.H.j(afak.a);
        }
    }

    public final void v(dby dbyVar) {
        if (dbyVar.w()) {
            czq czqVar = this.b;
            ((ces) czqVar.w.a).b(dbyVar, this.J, new bsh(dbyVar, this, 8));
        }
    }

    public final void w(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(m(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        J(accessibilityEventO);
    }

    public final void x(int i) {
        czv czvVar = this.n;
        if (czvVar != null) {
            ddu dduVar = czvVar.a;
            int i2 = dduVar.c;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - czvVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(m(i2), 131072);
                accessibilityEventO.setFromIndex(czvVar.d);
                accessibilityEventO.setToIndex(czvVar.e);
                accessibilityEventO.setAction(czvVar.b);
                accessibilityEventO.setMovementGranularity(czvVar.c);
                accessibilityEventO.getText().add(L(dduVar));
                J(accessibilityEventO);
            }
        }
        this.n = null;
    }

    public final void y(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        I(i, 128, null, null);
        I(i2, 256, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(boolean r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czy.z(boolean, int, long):boolean");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
