package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecr {
    static {
        java.util.logging.Logger.getLogger(defpackage.aecr.class.getName());
    }

    private aecr() {
    }

    public static byte[][] a(java.util.List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            defpackage.aedg aedgVar = (defpackage.aedg) it.next();
            bArr[i] = aedgVar.f.o();
            bArr[i + 1] = aedgVar.g.o();
            i += 2;
        }
        return defpackage.aebb.b(bArr);
    }
}
