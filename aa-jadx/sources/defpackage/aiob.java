package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiob {
    private aiob() {
    }

    public static final int a(int i) {
        int[] iArrB = defpackage.aiof.b();
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = iArrB[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 0;
    }

    public /* synthetic */ aiob(defpackage.affu affuVar) {
        this();
    }
}
