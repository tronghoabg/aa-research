package defpackage;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class udd {
    private static final Comparator f = new civ(11);
    private final qsb A;
    public volatile boolean a;
    public volatile boolean b;
    public volatile boolean c;
    public final vaa d;
    public final vaa e;
    private final ucy g;
    private final udc m;
    private boolean n;
    private final uct v;
    private final uba w;
    private final uvg x;
    private final usy y;
    private final qsb z;
    private final List h = new ArrayList();
    private final Set i = new HashSet();
    private final Set j = new HashSet();
    private final Set k = new HashSet();
    private float l = -1.0f;
    private final Set o = new HashSet();
    private final Set p = new HashSet();
    private final Set q = new HashSet();
    private final Map r = new HashMap();
    private final ArrayList s = new ArrayList();
    private Set t = new HashSet();
    private Set u = new HashSet();

    public udd(usy usyVar, uvg uvgVar, qsb qsbVar, qsb qsbVar2, ucy ucyVar, vaa vaaVar, vaa vaaVar2, uct uctVar, uba ubaVar) {
        new ArrayList();
        this.y = usyVar;
        this.x = uvgVar;
        this.m = new udc();
        this.z = qsbVar;
        this.A = qsbVar2;
        this.g = ucyVar;
        this.d = vaaVar;
        this.e = vaaVar2;
        this.v = uctVar;
        this.w = ubaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ubf] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ubf] */
    private final synchronized void l() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        List list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aagd aagdVar = (aagd) list.get(i);
            ?? r6 = aagdVar.c;
            ?? r7 = aagdVar.b;
            int i2 = aagdVar.a;
            if (i2 == 1) {
                Set set = this.o;
                if (!set.contains(r7)) {
                    r7.w(8);
                    set.add(r7);
                    if (r7 instanceof ubr) {
                        throw null;
                    }
                    m(r7);
                }
                r7.A(jCurrentAnimationTimeMillis, ube.b);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (r6 != 0) {
                        Set set2 = this.o;
                        if (set2.contains(r6)) {
                            set2.remove(r6);
                            if (r6 instanceof ubr) {
                                throw null;
                            }
                            n(r6);
                            r6.x(8);
                        }
                    }
                    Set set3 = this.o;
                    if (!set3.contains(r7)) {
                        r7.w(8);
                        set3.add(r7);
                        if (r7 instanceof ubr) {
                            throw null;
                        }
                        m(r7);
                    }
                    r7.A(jCurrentAnimationTimeMillis, r7.m() ? ube.b : ube.d);
                } else if (i2 == 4) {
                    Set set4 = this.p;
                    if (!set4.contains(r7)) {
                        r7.w(8);
                        set4.add(r7);
                    }
                } else if (i2 != 5) {
                    if (r6 != 0) {
                        Set set5 = this.p;
                        if (set5.contains(r6)) {
                            set5.remove(r6);
                            r6.x(8);
                        }
                    }
                    Set set6 = this.p;
                    if (!set6.contains(r7)) {
                        r7.w(8);
                        set6.add(r7);
                    }
                } else {
                    Set set7 = this.p;
                    if (set7.contains(r7)) {
                        set7.remove(r7);
                        r7.x(8);
                    }
                }
            } else if (this.o.contains(r7)) {
                r7.A(jCurrentAnimationTimeMillis, ube.c);
            }
        }
        Set set8 = this.j;
        Iterator it = set8.iterator();
        while (it.hasNext()) {
            ((ubf) it.next()).x(16);
        }
        Set set9 = this.k;
        Iterator it2 = set9.iterator();
        while (it2.hasNext()) {
            ((ubf) it2.next()).x(16);
        }
        Set set10 = this.i;
        if (!set10.isEmpty()) {
            this.v.H(ygr.n(set10));
            set10.clear();
        }
        set8.clear();
        set9.clear();
        list.clear();
    }

    private final void m(ubf ubfVar) {
        if (ubfVar instanceof ubt) {
            ubt ubtVar = (ubt) ubfVar;
            if (!ubtVar.O() || ubtVar.L() == null) {
                return;
            }
            Map map = this.r;
            Long L = ubtVar.L();
            L.getClass();
            map.put(ubtVar, L);
        }
    }

    private final void n(ubf ubfVar) {
        if (ubfVar instanceof ubt) {
            ubt ubtVar = (ubt) ubfVar;
            if (!ubtVar.O() || ubtVar.L() == null) {
                return;
            }
            this.r.remove(ubtVar);
        }
    }

    public final synchronized void a(ubf ubfVar) {
        Set set = this.k;
        if (!set.contains(ubfVar)) {
            ubfVar.w(16);
            set.add(ubfVar);
        }
        this.h.add(new aagd(4, ubfVar));
    }

    public final synchronized void b(ubf ubfVar, ygr ygrVar) {
        this.d.c(false);
        this.e.c(false);
        Set set = this.j;
        if (!set.contains(ubfVar)) {
            ubfVar.w(16);
            set.add(ubfVar);
        }
        this.h.add(new aagd(1, ubfVar));
        this.i.addAll(ygrVar);
    }

    public final synchronized void c(ygr ygrVar) {
        this.i.addAll(ygrVar);
    }

    public final synchronized void d() {
        Set set = this.j;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ubf) it.next()).x(16);
        }
        Set set2 = this.k;
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            ((ubf) it2.next()).x(16);
        }
        Set set3 = this.o;
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            ((ubf) it3.next()).x(8);
        }
        this.h.clear();
        set.clear();
        set2.clear();
        set3.clear();
        this.g.d();
        this.n = true;
        this.d.c(true);
        this.e.c(true);
    }

    public final synchronized void e(ubf ubfVar) {
        Set set = this.k;
        if (!set.contains(ubfVar)) {
            ubfVar.w(16);
            set.add(ubfVar);
        }
        this.h.add(new aagd(5, ubfVar));
    }

    public final synchronized void f(ubf ubfVar, ygr ygrVar) {
        this.d.c(false);
        this.e.c(false);
        Set set = this.j;
        if (!set.contains(ubfVar)) {
            ubfVar.w(16);
            set.add(ubfVar);
        }
        this.h.add(new aagd(2, ubfVar));
        this.i.addAll(ygrVar);
    }

    public final synchronized void g(ubf ubfVar, ubf ubfVar2) {
        Set set = this.k;
        if (!set.contains(ubfVar)) {
            ubfVar.w(16);
            set.add(ubfVar);
        }
        if (!set.contains(ubfVar2)) {
            ubfVar2.w(16);
            set.add(ubfVar2);
        }
        this.h.add(new aagd(6, ubfVar2, ubfVar));
    }

    public final synchronized void h(ubf ubfVar, ubf ubfVar2, ygr ygrVar) {
        this.d.c(false);
        this.e.c(false);
        if (ubfVar.u().U() == ubfVar2.u().U()) {
            ubfVar2.l(ubfVar, this.l);
            if (ubfVar2.m()) {
                ubfVar2.i();
            }
        }
        Set set = this.j;
        if (!set.contains(ubfVar)) {
            ubfVar.w(16);
            set.add(ubfVar);
        }
        if (!set.contains(ubfVar2)) {
            ubfVar2.w(16);
            set.add(ubfVar2);
        }
        this.h.add(new aagd(3, ubfVar2, ubfVar));
        this.i.addAll(ygrVar);
    }

    public final void i() {
        this.x.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, ymf] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, ymf] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object, ylc] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.google.android.libraries.geo.mapcore.renderer.LabelRenderer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 2402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udd.j(com.google.android.libraries.geo.mapcore.renderer.LabelRenderer, int, int):void");
    }

    public final synchronized boolean k() {
        if (this.n) {
            if (this.h.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
