package defpackage;

/* loaded from: classes.dex */
public final class ahne {
    private ahne() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r3 = defpackage.aitz.a;
        r3 = r0.d;
        r1 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((r1 instanceof defpackage.aitn) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1 = ((defpackage.aitn) r1).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r0.c.b = 536870911;
        r3.c(defpackage.aita.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        return new defpackage.aitg(r3, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.aitg a(defpackage.afck r3) {
        /*
            boolean r0 = r3 instanceof defpackage.ajca
            if (r0 != 0) goto Lb
            aitg r0 = new aitg
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        Lb:
            r0 = r3
            ajca r0 = (defpackage.ajca) r0
            aisx r0 = r0.f
        L10:
            java.lang.Object r1 = r0.a
            if (r1 != 0) goto L1b
            ajcz r1 = defpackage.ajcb.b
            r0.c(r1)
            r0 = 0
            goto L2a
        L1b:
            boolean r2 = r1 instanceof defpackage.aitg
            if (r2 == 0) goto L4e
            ajcz r2 = defpackage.ajcb.b
            boolean r2 = r0.d(r1, r2)
            if (r2 == 0) goto L10
            r0 = r1
            aitg r0 = (defpackage.aitg) r0
        L2a:
            if (r0 == 0) goto L47
            boolean r3 = defpackage.aitz.a
            aisx r3 = r0.d
            java.lang.Object r1 = r3.a
            boolean r2 = r1 instanceof defpackage.aitn
            if (r2 == 0) goto L3a
            aitn r1 = (defpackage.aitn) r1
            java.lang.Object r1 = r1.d
        L3a:
            aisv r1 = r0.c
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.b = r2
            aita r1 = defpackage.aita.a
            r3.c(r1)
            return r0
        L47:
            aitg r0 = new aitg
            r1 = 2
            r0.<init>(r3, r1)
            return r0
        L4e:
            ajcz r2 = defpackage.ajcb.b
            if (r1 == r2) goto L10
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L57
            goto L10
        L57:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.util.Objects.toString(r1)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = r1.concat(r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahne.a(afck):aitg");
    }

    public static final void b(aitf aitfVar, aiuo aiuoVar) {
        ((aitg) aitfVar).A(new aiup(aiuoVar, 0));
    }

    public final ahnf topLevel(ahnj ahnjVar) {
        ahnjVar.getClass();
        return new ahnf(ahnh.Companion.topLevel(ahnjVar));
    }

    public /* synthetic */ ahne(afeu afeuVar) {
        this();
    }
}
