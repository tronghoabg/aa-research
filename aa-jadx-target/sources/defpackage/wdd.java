package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wdd implements java.lang.Comparable {
    public static final /* synthetic */ int b = 0;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.wdd.class, java.lang.Object.class, "d");
    public final java.lang.String a;
    private volatile java.lang.Object d;

    public wdd(java.lang.String str, byte[] bArr) {
        this.a = str;
        this.d = bArr;
    }

    public final void a(java.lang.String str, defpackage.yhv yhvVar) {
        java.lang.Object obj = this.d;
        if (obj instanceof byte[]) {
            yhvVar.c(defpackage.wde.a(str, this.a, (byte[]) obj));
            return;
        }
        for (byte[] bArr : (byte[][]) obj) {
            yhvVar.c(defpackage.wde.a(str, this.a, bArr));
        }
    }

    public final void b(byte[] bArr) {
        java.lang.Object obj;
        byte[][] bArr2;
        int i = 0;
        do {
            obj = this.d;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) java.util.Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (java.util.Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (java.util.Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
        } while (!defpackage.a.h(c, this, obj, bArr2));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo((java.lang.String) obj);
    }
}
