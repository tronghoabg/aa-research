package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dot implements dqx {
    private final dqo a;
    private Map b;
    private final Map c;
    private final Map d;
    private final int[] e;
    private final int[] f;
    private final dpz g;

    public dot(dlg dlgVar) {
        dqo dqoVar = new dqo(null);
        dqoVar.af(this);
        this.a = dqoVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.g = new dpz(dlgVar);
        this.e = new int[2];
        this.f = new int[2];
    }

    private final long e(dqn dqnVar, long j) {
        boolean z = dqnVar instanceof dqu;
        Object obj = dqnVar.aq;
        String str = dqnVar.v;
        int i = 0;
        if (!z) {
            if (!(obj instanceof cto)) {
                Log.w("CCL", "Nothing to measure for widget: ".concat(String.valueOf(str)));
                return ze.c(0, 0);
            }
            cuo cuoVarV = ((cto) obj).v(j);
            this.b.put(obj, cuoVarV);
            return ze.c(cuoVarV.a, cuoVarV.b);
        }
        int i2 = dle.j(j) ? 1073741824 : dle.h(j) ? Integer.MIN_VALUE : 0;
        if (dle.i(j)) {
            i = 1073741824;
        } else if (dle.g(j)) {
            i = Integer.MIN_VALUE;
        }
        dqu dquVar = (dqu) dqnVar;
        dquVar.b(i2, dle.b(j), i, dle.a(j));
        return ze.c(dquVar.aU, dquVar.aV);
    }

    private static final void f(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int[] iArr) {
        if (i == 0) {
            throw null;
        }
        int i6 = i - 1;
        if (i6 == 0) {
            iArr[0] = i2;
            iArr[1] = i2;
            return;
        }
        if (i6 == 1) {
            iArr[0] = 0;
            iArr[1] = i5;
        } else {
            if (i6 != 2) {
                iArr[0] = i5;
                iArr[1] = i5;
                return;
            }
            boolean z3 = z2 || (i4 == 1 ? i3 != 1 || z : i4 == 2);
            iArr[0] = true != z3 ? 0 : i2;
            if (true != z3) {
                i2 = i5;
            }
            iArr[1] = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // defpackage.dqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dqn r27, defpackage.dqw r28) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dot.b(dqn, dqw):void");
    }

    public final void c(cun cunVar, List list, Map map) {
        cuo cuoVar;
        cun cunVar2;
        this.b = map;
        Map map2 = this.d;
        int i = 0;
        if (map2.isEmpty()) {
            ArrayList arrayList = this.a.aL;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dqn dqnVar = (dqn) arrayList.get(i2);
                Object obj = dqnVar.aq;
                if (obj instanceof cto) {
                    dqa dqaVar = dqnVar.u;
                    dqn dqnVar2 = dqaVar.a;
                    if (dqnVar2 != null) {
                        dqaVar.b = dqnVar2.k();
                        dqaVar.c = dqaVar.a.l();
                        dqaVar.d = dqaVar.a.i();
                        dqaVar.e = dqaVar.a.g();
                        dqaVar.a(dqaVar.a.u);
                    }
                    map2.put(xb.f((cto) obj), new dqa(dqaVar));
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            cto ctoVar = (cto) list.get(i);
            dqa dqaVar2 = (dqa) map2.get(xb.f(ctoVar));
            if (dqaVar2 == null || (cuoVar = (cuo) this.b.get(ctoVar)) == null || dqaVar2.q == 8) {
                cunVar2 = cunVar;
            } else {
                boolean zIsNaN = Float.isNaN(dqaVar2.h);
                float f = BitmapDescriptorFactory.HUE_RED;
                if (zIsNaN && Float.isNaN(dqaVar2.i) && Float.isNaN(dqaVar2.j) && Float.isNaN(dqaVar2.k) && Float.isNaN(dqaVar2.l) && Float.isNaN(dqaVar2.m) && Float.isNaN(dqaVar2.n) && Float.isNaN(dqaVar2.o) && Float.isNaN(dqaVar2.p)) {
                    cunVar.s(cuoVar, ((dqaVar2.c - dlo.b(0L)) & 4294967295L) | ((dqaVar2.b - dlo.a(0L)) << 32), BitmapDescriptorFactory.HUE_RED);
                    cunVar2 = cunVar;
                } else {
                    ddz ddzVar = new ddz(dqaVar2, 14);
                    int iA = dqaVar2.b - dlo.a(0L);
                    int iB = dqaVar2.c - dlo.b(0L);
                    if (!Float.isNaN(dqaVar2.m)) {
                        f = dqaVar2.m;
                    }
                    float f2 = f;
                    cunVar2 = cunVar;
                    cunVar2.t(cuoVar, iA, iB, f2, ddzVar);
                }
            }
            i++;
            cunVar = cunVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[LOOP:1: B:34:0x00d3->B:36:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r17, defpackage.dlr r19, final defpackage.dor r20, final java.util.List r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dot.d(long, dlr, dor, java.util.List, java.util.Map):long");
    }

    @Override // defpackage.dqx
    public final void a() {
    }
}
