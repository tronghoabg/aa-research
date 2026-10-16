package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dzs implements defpackage.dzr {
    private final java.lang.Object[] a;
    private int b;

    public dzs(int i) {
        this.a = new java.lang.Object[i];
    }

    @Override // defpackage.dzr
    public java.lang.Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b = i2;
        return obj;
    }

    @Override // defpackage.dzr
    public boolean b(java.lang.Object obj) {
        obj.getClass();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == obj) {
                throw new java.lang.IllegalStateException("Already in the pool!");
            }
        }
        int i3 = this.b;
        java.lang.Object[] objArr = this.a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }
}
