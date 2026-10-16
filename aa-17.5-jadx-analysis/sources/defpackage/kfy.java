package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
final class kfy {
    public static final kfy a = new kfy();
    public final ArrayList b = new ArrayList(8);

    private kfy() {
    }

    final void a(byte[] bArr) {
        if (bArr == null || bArr.length != 16384) {
            return;
        }
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (arrayList.size() < 8) {
                arrayList.add(bArr);
            }
        }
    }

    final byte[] b() {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            int size = arrayList.size();
            if (size > 0) {
                return (byte[]) arrayList.remove(size - 1);
            }
            return new byte[16384];
        }
    }
}
