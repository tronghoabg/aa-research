package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wgs implements defpackage.wft {
    private final /* synthetic */ int a;

    public wgs(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wgu] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final java.io.InputStream b(defpackage.ret retVar) throws java.io.IOException {
        java.io.InputStream inputStreamD = retVar.d.d((android.net.Uri) retVar.a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(inputStreamD);
        ?? r2 = retVar.c;
        if (!r2.isEmpty()) {
            int i = wfq.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = r2.iterator();
            while (it.hasNext()) {
                wgw wgwVarA = ((wgy) it.next()).a();
                if (wgwVarA != null) {
                    arrayList2.add(wgwVarA);
                }
            }
            wfq wfqVar = !arrayList2.isEmpty() ? new wfq(inputStreamD, arrayList2) : null;
            if (wfqVar != null) {
                arrayList.add(wfqVar);
            }
        }
        for (wgz wgzVar : retVar.e) {
            arrayList.add(wgzVar.c());
        }
        java.util.Collections.reverse(arrayList);
        return (java.io.InputStream) arrayList.get(0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    @Override // defpackage.wft
    public final /* synthetic */ java.lang.Object a(defpackage.ret retVar) throws wgi, java.io.IOException {
        if (this.a == 0) {
            return b(retVar);
        }
        defpackage.wgr wgrVar = new defpackage.wgr();
        wgrVar.b();
        java.io.File fileA = wgrVar.a(retVar);
        defpackage.ysr.h(fileA);
        return new java.io.RandomAccessFile(fileA, "rw");
    }
}
