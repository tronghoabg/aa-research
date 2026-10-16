package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class mfi {
    public static final yph a = yph.c("GH.PreflightDriveStatus");
    final qse b = new qse() { // from class: mfh
        @Override // defpackage.qse
        public final void d(int i, long j, float[] fArr, byte[] bArr) {
            if (i != 11) {
                return;
            }
            mfi mfiVar = this.a;
            mfiVar.c = (bArr[0] & 8) == 0;
            mfiVar.d++;
            ((ype) mfi.a.l().ai((char) 4845)).y("Updated isPhoneConfigAllowed to %b", Boolean.valueOf(mfiVar.c));
        }
    };
    public boolean c;
    int d;
    public roj e;

    final void a() {
        ((ype) a.l().ai((char) 4848)).u("tearDown");
        roj rojVar = this.e;
        if (rojVar != null) {
            qse qseVar = this.b;
            SparseArray sparseArray = rojVar.c;
            synchronized (sparseArray) {
                if (rojVar.c(qseVar, 11)) {
                    sparseArray.remove(11);
                }
            }
            this.e = null;
        }
    }
}
