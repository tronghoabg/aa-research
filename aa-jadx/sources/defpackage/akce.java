package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akce implements defpackage.akcc {
    private final defpackage.ajqi[] a;
    private final defpackage.ajql[] b;

    public akce(defpackage.ajqi[] ajqiVarArr, defpackage.ajql[] ajqlVarArr) {
        int length = ajqiVarArr.length;
        defpackage.ajqi[] ajqiVarArr2 = new defpackage.ajqi[length];
        this.a = ajqiVarArr2;
        java.lang.System.arraycopy(ajqiVarArr, 0, ajqiVarArr2, 0, length);
        int length2 = ajqlVarArr.length;
        defpackage.ajql[] ajqlVarArr2 = new defpackage.ajql[length2];
        this.b = ajqlVarArr2;
        java.lang.System.arraycopy(ajqlVarArr, 0, ajqlVarArr2, 0, length2);
    }

    @Override // defpackage.ajqi
    public final void a(defpackage.ajqh ajqhVar, defpackage.akca akcaVar) throws defpackage.ajqd, java.io.IOException {
        int i = 0;
        while (true) {
            defpackage.ajqi[] ajqiVarArr = this.a;
            if (i >= ajqiVarArr.length) {
                return;
            }
            ajqiVarArr[i].a(ajqhVar, akcaVar);
            i++;
        }
    }

    @Override // defpackage.ajql
    public final void b(defpackage.ajqj ajqjVar, defpackage.akca akcaVar) throws defpackage.ajqd, java.io.IOException {
        int i = 0;
        while (true) {
            defpackage.ajql[] ajqlVarArr = this.b;
            if (i >= ajqlVarArr.length) {
                return;
            }
            ajqlVarArr[i].b(ajqjVar, akcaVar);
            i++;
        }
    }
}
