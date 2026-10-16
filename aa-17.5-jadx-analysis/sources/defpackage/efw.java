package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class efw extends afde implements afec {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efw(afeg afegVar, ees eesVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = afegVar;
        this.c = eesVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r8v1, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.d
            r1 = 1
            if (r0 == 0) goto L85
            r2 = 8
            r3 = 0
            if (r0 == r1) goto L2d
            afcr r0 = defpackage.afcr.a
            int r4 = r7.a
            defpackage.woy.dF(r8)
            if (r4 == 0) goto L14
            return r8
        L14:
            java.lang.Object r8 = r7.b
            java.lang.Object r4 = r7.c
            aitu r5 = defpackage.aium.a
            dxa r6 = new dxa
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            gjn r8 = (defpackage.gjn) r8
            r6.<init>(r8, r4, r3, r2)
            r7.a = r1
            java.lang.Object r7 = defpackage.ahnc.a(r5, r6, r7)
            if (r7 != r0) goto L2c
            return r0
        L2c:
            return r7
        L2d:
            afcr r0 = defpackage.afcr.a
            int r4 = r7.a
            if (r4 == 0) goto L3d
            if (r4 == r1) goto L39
            defpackage.woy.dF(r8)
            goto L6b
        L39:
            defpackage.woy.dF(r8)
            goto L78
        L3d:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.c
            btm r4 = new btm
            egd r8 = (defpackage.egd) r8
            r4.<init>(r8, r3, r2)
            java.lang.Object r2 = r7.b
            egz r2 = (defpackage.egz) r2
            java.util.List r5 = r2.b
            if (r5 == 0) goto L6e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L58
            goto L6e
        L58:
            egp r1 = r8.c()
            efe r5 = new efe
            r5.<init>(r8, r4, r2, r3)
            r8 = 2
            r7.a = r8
            java.lang.Object r8 = r1.c(r5, r7)
            if (r8 != r0) goto L6b
            goto L77
        L6b:
            ees r8 = (defpackage.ees) r8
            goto L7a
        L6e:
            r7.a = r1
            r1 = 0
            java.lang.Object r8 = r8.i(r1, r4, r7)
            if (r8 != r0) goto L78
        L77:
            return r0
        L78:
            ees r8 = (defpackage.ees) r8
        L7a:
            java.lang.Object r7 = r7.c
            egd r7 = (defpackage.egd) r7
            kwp r7 = r7.g
            ehi r7 = r7.i(r8)
            return r7
        L85:
            afcr r0 = defpackage.afcr.a
            int r2 = r7.a
            if (r2 == 0) goto L8f
            defpackage.woy.dF(r8)
            return r8
        L8f:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.b
            java.lang.Object r2 = r7.c
            r7.a = r1
            ees r2 = (defpackage.ees) r2
            java.lang.Object r1 = r2.a
            java.lang.Object r7 = r8.invoke(r1, r7)
            if (r7 != r0) goto La3
            return r0
        La3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efw.hT(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afeg, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            return new efw((afeg) this.b, (ees) this.c, (afck) obj, 0).hT(afak.a);
        }
        if (i != 1) {
            Object obj2 = this.b;
            return new efw((gjn) obj2, (Bitmap) this.c, (afck) obj, 2).hT(afak.a);
        }
        Object obj3 = this.b;
        return new efw((egz) obj3, (egd) this.c, (afck) obj, 1).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efw(egz egzVar, egd egdVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = egzVar;
        this.c = egdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efw(gjn gjnVar, Bitmap bitmap, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = gjnVar;
        this.c = bitmap;
    }
}
