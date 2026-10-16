package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class bvu extends bvb {
    public final bwq a;
    final /* synthetic */ bvv b;
    public final aap c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private Set g;

    public bvu(bvv bvvVar, long j, boolean z, boolean z2) {
        this.b = bvvVar;
        this.d = j;
        this.e = z;
        this.f = z2;
        aap aapVar = aaq.a;
        this.c = new aap(6);
        this.a = new ParcelableSnapshotMutableState(ccx.d, bxp.a);
    }

    @Override // defpackage.bvb
    public final long a() {
        return this.d;
    }

    @Override // defpackage.bvb
    public final buo b(afdr afdrVar) {
        return this.b.b.b(afdrVar);
    }

    @Override // defpackage.bvb
    public final bva c() {
        return this.b.d;
    }

    @Override // defpackage.bvb
    public final afco d() {
        return this.b.b.d();
    }

    @Override // defpackage.bvb
    public final void e(bwl bwlVar) {
        this.b.b.e(bwlVar);
    }

    @Override // defpackage.bvb
    public final void f() {
        bvv bvvVar = this.b;
        bvvVar.j--;
    }

    @Override // defpackage.bvb
    public final void g(Set set) {
        Set hashSet = this.g;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.g = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.bvb
    public final void h(bux buxVar) {
        this.c.j(buxVar);
    }

    @Override // defpackage.bvb
    public final void i(bxf bxfVar) {
        this.b.b.i(bxfVar);
    }

    @Override // defpackage.bvb
    public final void j() {
        this.b.j++;
    }

    @Override // defpackage.bvb
    public final void k(bux buxVar) {
        Set set = this.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((bvv) buxVar).e());
            }
        }
        this.c.l(buxVar);
    }

    @Override // defpackage.bvb
    public final boolean l() {
        return this.b.b.l();
    }

    @Override // defpackage.bvb
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.bvb
    public final boolean n() {
        return this.f;
    }

    @Override // defpackage.bvb
    public final boolean o() {
        return this.b.b.o();
    }

    @Override // defpackage.bvb
    public final aap p(bvd bvdVar, bxw bxwVar, afeg afegVar) {
        return this.b.b.p(bvdVar, bxwVar, afegVar);
    }

    @Override // defpackage.bvb
    public final aap q(bvd bvdVar, bxw bxwVar, aap aapVar) {
        return this.b.b.q(bvdVar, bxwVar, aapVar);
    }

    @Override // defpackage.bvb
    public final ccx r() {
        return (ccx) this.a.a();
    }

    @Override // defpackage.bvb
    public final void s(bvd bvdVar, afeg afegVar) {
        this.b.b.s(bvdVar, afegVar);
    }

    @Override // defpackage.bvb
    public final void t(bvd bvdVar) {
        bvv bvvVar = this.b;
        bvb bvbVar = bvvVar.b;
        bvbVar.t(bvvVar.d);
        bvbVar.t(bvdVar);
    }

    @Override // defpackage.bvb
    public final void u(bvd bvdVar) {
        this.b.b.u(bvdVar);
    }

    @Override // defpackage.bvb
    public final void v(bvd bvdVar) {
        this.b.b.v(bvdVar);
    }

    @Override // defpackage.bvb
    public final kgx w(bwl bwlVar) {
        return this.b.b.w(bwlVar);
    }

    @Override // defpackage.bvb
    public final void x(bwl bwlVar, kgx kgxVar, buj bujVar) {
        this.b.b.x(bwlVar, kgxVar, bujVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r17 = this;
            r0 = r17
            aap r1 = r0.c
            boolean r2 = r1.c()
            if (r2 == 0) goto L6b
            java.util.Set r0 = r0.g
            if (r0 == 0) goto L68
            java.lang.Object[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L68
            r5 = 0
            r6 = r5
        L19:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L63
            int r9 = r6 - r4
            r10 = r5
        L2c:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L61
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5d
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            bvv r11 = (defpackage.bvv) r11
            java.util.Iterator r13 = r0.iterator()
        L49:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L5d
            java.lang.Object r14 = r13.next()
            java.util.Set r14 = (java.util.Set) r14
            cfd r15 = r11.e()
            r14.remove(r15)
            goto L49
        L5d:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2c
        L61:
            if (r11 != r12) goto L68
        L63:
            if (r6 == r4) goto L68
            int r6 = r6 + 1
            goto L19
        L68:
            r1.d()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvu.y():void");
    }
}
