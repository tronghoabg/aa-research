package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kgb {
    public static final defpackage.kgb a = new defpackage.kgb();
    public final java.util.ArrayList b = new java.util.ArrayList(8);

    private kgb() {
    }

    final void a(byte[] bArr) {
        if (bArr == null || bArr.length != 16384) {
            return;
        }
        java.util.ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (arrayList.size() < 8) {
                arrayList.add(bArr);
            }
        }
    }

    final byte[] b() {
        java.util.ArrayList arrayList = this.b;
        synchronized (arrayList) {
            int size = arrayList.size();
            if (size > 0) {
                return (byte[]) arrayList.remove(size - 1);
            }
            return new byte[16384];
        }
    }
}
