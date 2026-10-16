package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class toy implements defpackage.tox {
    public static final defpackage.tpr a;
    public final java.util.List b = new java.util.ArrayList();
    public defpackage.tpr c = a;

    static {
        defpackage.tpm tpmVar = new defpackage.tpm(Integer.MIN_VALUE, Integer.MIN_VALUE);
        a = new defpackage.tpr(tpmVar, tpmVar);
    }

    @Override // defpackage.tox
    public final defpackage.tpr a() {
        return this.c;
    }

    @Override // defpackage.tox
    public final boolean b(defpackage.tps tpsVar) {
        if (this.c.b(tpsVar)) {
            int i = 0;
            while (true) {
                java.util.List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                if (((defpackage.tox) list.get(i)).b(tpsVar)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
