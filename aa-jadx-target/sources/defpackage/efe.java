package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class efe extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.util.List g;
    final /* synthetic */ java.util.List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efe(java.util.List list, java.util.List list2, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.g = list;
        this.h = list2;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.efe efeVar = new defpackage.efe(this.g, this.h, afdkVar);
        efeVar.f = obj;
        return efeVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [efa] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            afdr r1 = defpackage.afdr.a
            int r2 = r8.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            if (r2 == r3) goto L14
            java.lang.Object r0 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.afga.cz(r9)
            goto L31
        L14:
            java.lang.Object r0 = r8.d
            java.lang.Object r2 = r8.c
            java.lang.Object r5 = r8.b
            java.lang.Object r6 = r8.a
            defpackage.afga.cz(r9)
            r7 = r6
            r6 = r2
            r2 = r7
            goto L54
        L23:
            defpackage.afga.cz(r9)
            java.util.List r9 = r8.g
            java.util.List r2 = r8.h
            java.util.Iterator r9 = r9.iterator()
            r7 = r0
            r0 = r9
            r9 = r7
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r0.next()
            efa r5 = (efa) r5
            r8.f = r4
            r8.a = r2
            r8.b = r0
            r8.c = r5
            r8.d = r9
            r8.e = r3
            java.lang.Object r6 = r5.c()
            if (r6 == r1) goto L7c
            r7 = r0
            r0 = r9
            r9 = r6
            r6 = r5
            r5 = r7
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L79
            efd r9 = new efd
            r0 = 0
            r9.<init>(r6, r4, r0)
            r2.add(r9)
            r8.f = r4
            r8.a = r2
            r8.b = r5
            r8.c = r4
            r8.d = r4
            r9 = 2
            r8.e = r9
            java.lang.Object r9 = r6.b()
            if (r9 == r1) goto L7c
            goto L7a
        L79:
            r9 = r0
        L7a:
            r0 = r5
            goto L31
        L7c:
            return r1
        L7d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efe.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.efe) b(obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
