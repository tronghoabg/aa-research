package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import j$.util.Objects;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class txn implements txl {
    private static final yob A = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/OverlayManagerImpl");
    public static final ygr a = new ymp(abgl.GMM_VECTOR_BASE);
    public static final ygr b = new ymp(abgl.GMM_INDOOR);
    private final ucf B;
    private String D;
    private uly F;
    private final uaj G;
    public final boolean i;
    public final xyc j;
    public final xyc l;
    public boolean p;
    public uly r;
    public Integer s;
    public final uvs t;
    public final uod u;
    public final tpa v;
    public final uvg x;
    public final usy y;
    public final vaa f = new vaa(false);
    public final vaa g = new vaa(false);
    public final vaa h = new vaa(false);
    public ukr k = ukr.a;
    public final Set m = new aeul(16);
    public final Set n = new aeul(16);
    public final int[] o = new int[1];
    private final Map C = new EnumMap(abgl.class);
    public boolean q = false;
    private volatile boolean E = false;
    final ykd z = new ykd(this, null);
    public boolean w = true;
    public final List c = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList d = new ArrayList();

    public txn(Resources resources, usy usyVar, uvs uvsVar, uvg uvgVar, ucf ucfVar, xyc xycVar, uod uodVar, tpa tpaVar, boolean z, boolean z2, xyc xycVar2, Integer num, uaj uajVar) {
        this.y = usyVar;
        this.x = uvgVar;
        this.t = uvsVar;
        this.s = num;
        int iIntValue = num != null ? num.intValue() : ulx.b.a(z).b.K;
        uvsVar.h(Color.red(iIntValue) / 255.0f, Color.green(iIntValue) / 255.0f, Color.blue(iIntValue) / 255.0f, Color.alpha(iIntValue) / 255.0f);
        this.B = ucfVar;
        this.r = ulx.b.a(z);
        ucfVar.l();
        ucfVar.y(this.r.b);
        this.u = uodVar;
        this.v = tpaVar;
        this.l = wub.L(new plm(resources, xycVar, 8));
        this.i = z2;
        this.j = xycVar2;
        this.G = uajVar;
    }

    @Override // defpackage.txl
    public final ufs a(ufs ufsVar) {
        if (!(ufsVar.H instanceof unb)) {
            return ufsVar;
        }
        synchronized (this.c) {
            ukr ukrVar = ufsVar.d;
            ukr ukrVarB = ukrVar.a(this.k).b((String) this.C.get(ufsVar.b), this.D, ufsVar.s().e);
            if (ukrVarB.equals(ukrVar)) {
                return ufsVar;
            }
            ufs ufsVarG = ufsVar.g(ukrVarB, this.u.a(ufsVar.c, ukrVarB, true));
            o(ufsVar, ufsVarG);
            return ufsVarG;
        }
    }

    @Override // defpackage.txl
    public final ukr d() {
        ukr ukrVar;
        synchronized (this.c) {
            ukrVar = this.k;
        }
        return ukrVar;
    }

    @Override // defpackage.txl
    public final void e(ufj ufjVar) {
        synchronized (this.c) {
            if (((umn) this.t).k) {
                this.d.add(new txm(this, null, ufjVar));
                this.x.k();
            } else {
                n(null, ufjVar, false);
            }
        }
    }

    @Override // defpackage.txl
    public final void f(ufj ufjVar) {
        synchronized (this.c) {
            if (((umn) this.t).k) {
                this.d.add(new txm(this, ufjVar, null));
                this.x.k();
            } else {
                n(ufjVar, null, false);
            }
        }
    }

    @Override // defpackage.txl
    public final synchronized void g(uly ulyVar) {
        this.F = ulyVar;
    }

    @Override // defpackage.uml
    public final void gp() {
        int i = pyz.a;
        ucf ucfVar = this.B;
        ucfVar.l();
        List list = this.c;
        synchronized (list) {
            j();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ufj ufjVar = (ufj) list.get(i2);
                ufjVar.j();
                ufjVar.k();
                ucfVar.h(ufjVar);
            }
        }
        ((ynz) ((ynz) A.d()).ai((char) 9180)).u("Surface created");
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.txl
    public final boolean h(Map map, String str) {
        boolean z;
        boolean z2;
        synchronized (this.c) {
            z = true;
            if ((!map.isEmpty() || this.C.isEmpty()) && map.keySet().equals(this.C.keySet())) {
                z2 = false;
            } else {
                this.C.clear();
                z2 = true;
            }
            for (Map.Entry entry : map.entrySet()) {
                Map map2 = this.C;
                if (!Objects.equals((String) map2.get(entry.getKey()), entry.getValue())) {
                    map2.put((abgl) entry.getKey(), (String) entry.getValue());
                    z2 = true;
                }
            }
            if (Objects.equals(str, this.D)) {
                z = z2;
            } else {
                this.D = str;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(boolean z) {
        yfq yfqVarO;
        int i;
        synchronized (this) {
            uly ulyVar = this.F;
            yfqVarO = null;
            if (ulyVar == null || ulyVar.c(this.r)) {
                this.F = null;
            }
            uly ulyVar2 = this.F;
            if (ulyVar2 != null) {
                this.r = ulyVar2;
                this.F = null;
            }
            if (m()) {
                this.p = true;
            }
        }
        List list = this.c;
        synchronized (list) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (((ufj) list.get(i2)).n(this.r)) {
                    yfqVarO = yfq.o(list);
                    break;
                }
                i2++;
            }
        }
        if (yfqVarO != null) {
            int size2 = yfqVarO.size();
            for (i = 0; i < size2; i++) {
                ((ufj) yfqVarO.get(i)).m(this.r, z);
            }
        }
        this.B.y(this.r.b);
        Integer num = this.s;
        k(num != null ? num.intValue() : this.r.b.K);
    }

    public final void j() {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ufj) list.get(i)).l();
        }
    }

    public final void k(int i) {
        this.t.h(Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
    }

    public final boolean l() {
        uaj uajVar = this.G;
        return uajVar != null && uajVar.d();
    }

    public final boolean m() {
        return ((xxh) this.l.gu()).f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void n(defpackage.ufj r10, defpackage.ufj r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txn.n(ufj, ufj, boolean):void");
    }

    public final void o(ufj ufjVar, ufj ufjVar2) {
        vaq.d();
        synchronized (this.c) {
            if (((umn) this.t).k) {
                this.d.add(new txm(this, ufjVar, ufjVar2));
                this.x.k();
            } else {
                n(ufjVar, ufjVar2, false);
            }
        }
    }
}
