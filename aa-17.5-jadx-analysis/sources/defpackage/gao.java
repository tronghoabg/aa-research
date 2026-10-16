package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gao implements csy {
    public static final /* synthetic */ int a = 0;
    private static final long b = dlf.d(0, 0, 0, 0);
    private long c = b;
    private List d = new ArrayList();

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return czz.ac(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return czz.ab(this, afecVar);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int d(csq csqVar, csp cspVar, int i) {
        return tr.q(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int e(csq csqVar, csp cspVar, int i) {
        return tr.r(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int f(csq csqVar, csp cspVar, int i) {
        return tr.s(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final /* synthetic */ int g(csq csqVar, csp cspVar, int i) {
        return tr.t(this, csqVar, cspVar, i);
    }

    @Override // defpackage.csy
    public final ctq h(cts ctsVar, cto ctoVar, long j) {
        this.c = j;
        if (!dle.k(j)) {
            List list = this.d;
            if (!list.isEmpty()) {
                this.d = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((afck) it.next()).w(afak.a);
                }
            }
        }
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new fzl(cuoVarV, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.afck r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gan
            if (r0 == 0) goto L13
            r0 = r8
            gan r0 = (defpackage.gan) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gan r0 = new gan
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            affv r0 = r0.d
            defpackage.woy.dF(r8)     // Catch: java.lang.Throwable -> L29
            goto L61
        L29:
            r8 = move-exception
            goto L71
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.woy.dF(r8)
            long r4 = r7.c
            boolean r8 = defpackage.dle.k(r4)
            if (r8 == 0) goto L7c
            affv r8 = new affv
            r8.<init>()
            r0.d = r8     // Catch: java.lang.Throwable -> L6d
            r0.c = r3     // Catch: java.lang.Throwable -> L6d
            aitg r2 = new aitg     // Catch: java.lang.Throwable -> L6d
            afck r0 = defpackage.affa.s(r0)     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L6d
            r2.z()     // Catch: java.lang.Throwable -> L6d
            r8.a = r2     // Catch: java.lang.Throwable -> L6d
            java.util.List r0 = r7.d     // Catch: java.lang.Throwable -> L6d
            r0.add(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.k()     // Catch: java.lang.Throwable -> L6d
            if (r0 == r1) goto L6c
            r0 = r8
        L61:
            java.util.List r8 = r7.d
            java.lang.Object r0 = r0.a
            defpackage.affz.h(r8)
            r8.remove(r0)
            goto L7c
        L6c:
            return r1
        L6d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L71:
            java.util.List r7 = r7.d
            java.lang.Object r0 = r0.a
            defpackage.affz.h(r7)
            r7.remove(r0)
            throw r8
        L7c:
            long r7 = r7.c
            dle r0 = new dle
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gao.i(afck):java.lang.Object");
    }
}
