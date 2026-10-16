package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vqj {
    public static final defpackage.vqj a = new defpackage.vqj(new defpackage.vqk[0]);
    public final defpackage.vqk[] b;
    public final int[] c;

    public vqj(defpackage.vqk[] vqkVarArr) {
        this.b = vqkVarArr;
        this.c = new int[vqkVarArr.length];
        for (int i = 0; i < vqkVarArr.length; i++) {
            this.c[i] = vqkVarArr[i].b;
        }
    }
}
