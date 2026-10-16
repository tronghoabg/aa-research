package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class ape {
    public final afeg c;
    public dlg d;
    public boolean e;
    public final aqk f;
    public final bii g = new bii((int[]) null);

    public ape(aqk aqkVar, afeg afegVar, dlg dlgVar) {
        this.f = aqkVar;
        this.c = afegVar;
        this.d = dlgVar;
    }

    public static final void n(cql cqlVar) {
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cqu) list.get(i)).b();
        }
    }

    protected abstract boolean f(cql cqlVar);

    protected abstract boolean j(cql cqlVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.afeg r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.apd
            if (r0 == 0) goto L13
            r0 = r7
            apd r0 = (defpackage.apd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apd r0 = new apd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r7)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.woy.dF(r7)
            r5.e = r3
            ain r7 = new ain
            r2 = 0
            r4 = 10
            r7.<init>(r5, r6, r2, r4)
            r0.c = r3
            aiwg r6 = new aiwg
            afco r2 = r0.hH()
            r6.<init>(r2, r0)
            java.lang.Object r6 = defpackage.afus.b(r6, r3, r6, r7)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = 0
            r5.e = r6
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.m(afeg, afck):java.lang.Object");
    }

    public final void o(cql cqlVar, cqm cqmVar) {
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((cqu) list.get(i)).c()) {
                return;
            }
        }
        if (f(cqlVar)) {
            if (cqmVar == cqm.a && this.e) {
                j(cqlVar);
                n(cqlVar);
            }
            if (cqmVar == cqm.b && !this.e && j(cqlVar)) {
                n(cqlVar);
            }
        }
    }
}
