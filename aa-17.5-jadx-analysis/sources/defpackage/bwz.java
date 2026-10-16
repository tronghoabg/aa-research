package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bwz implements bwj {
    private final bwj a;
    private final bwf c = new bwf();

    public bwz(bwj bwjVar) {
        this.a = bwjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [bwj] */
    /* JADX WARN: Type inference failed for: r8v0, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [afec] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    @Override // defpackage.bwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afec r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bwy
            if (r0 == 0) goto L13
            r0 = r9
            bwy r0 = (defpackage.bwy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bwy r0 = new bwy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.woy.dF(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r8 = r0.a
            defpackage.woy.dF(r9)
            goto L74
        L39:
            defpackage.woy.dF(r9)
            bwf r9 = r7.c
            r0.a = r8
            r0.d = r5
            boolean r2 = r9.a()
            if (r2 == 0) goto L4b
            afak r9 = defpackage.afak.a
            goto L72
        L4b:
            aitg r2 = new aitg
            afck r6 = defpackage.affa.s(r0)
            r2.<init>(r6, r5)
            r2.z()
            java.lang.Object r5 = r9.a
            monitor-enter(r5)
            java.util.List r6 = r9.b     // Catch: java.lang.Throwable -> L83
            r6.add(r2)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r5)
            beq r5 = new beq
            r5.<init>(r9, r2, r4, r3)
            r2.d(r5)
            java.lang.Object r9 = r2.k()
            afcr r2 = defpackage.afcr.a
            if (r9 == r2) goto L72
            afak r9 = defpackage.afak.a
        L72:
            if (r9 == r1) goto L82
        L74:
            bwj r7 = r7.a
            r0.a = r3
            r0.d = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L81
            goto L82
        L81:
            return r7
        L82:
            return r1
        L83:
            r7 = move-exception
            monitor-exit(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwz.a(afec, afck):java.lang.Object");
    }

    public final void b() {
        bwf bwfVar = this.c;
        synchronized (bwfVar.a) {
            bwfVar.d = false;
        }
    }

    public final void c() {
        bwf bwfVar = this.c;
        synchronized (bwfVar.a) {
            if (!bwfVar.a()) {
                List list = bwfVar.b;
                bwfVar.b = bwfVar.c;
                bwfVar.c = list;
                bwfVar.d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((afck) list.get(i)).w(afak.a);
                }
                list.clear();
            }
        }
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final /* synthetic */ afcn getKey() {
        return bwj.b;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
