package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class dbj implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dbj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v79, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cyu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v55, types: [bwx, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v55 java.lang.Object, still in use, count: 2, list:
          (r7v55 java.lang.Object) from 0x00f1: PHI (r7 I:??) = (r7v52 java.lang.Object), (r7v55 java.lang.Object) binds: [B:32:0x00f0, B:140:0x00f1] A[DONT_GENERATE, DONT_INLINE]
          (r7v55 java.lang.Object) from 0x00df: CHECK_CAST (kqe) (r7v55 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbj.invoke(java.lang.Object):java.lang.Object");
    }

    public dbj(defpackage.oln olnVar, int i) {
        this.b = i;
        this.a = olnVar;
    }
}
