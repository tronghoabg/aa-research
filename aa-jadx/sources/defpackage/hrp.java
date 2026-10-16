package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrp {
    protected static final java.util.Comparator a = new defpackage.cjd(8);
    private final java.util.List b = new java.util.ArrayList();
    private final java.util.List c = new java.util.ArrayList(64);
    private int d = 0;

    private final synchronized void c() {
        while (this.d > 4096) {
            byte[] bArr = (byte[]) this.b.remove(0);
            this.c.remove(bArr);
            this.d -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.b.add(bArr);
                java.util.List list = this.c;
                int iBinarySearch = java.util.Collections.binarySearch(list, bArr, a);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                list.add(iBinarySearch, bArr);
                this.d += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i) {
        int i2 = 0;
        while (true) {
            java.util.List list = this.c;
            if (i2 >= list.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.d -= length;
                list.remove(i2);
                this.b.remove(bArr);
                return bArr;
            }
            i2++;
        }
    }
}
