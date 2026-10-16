package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class fhd extends defpackage.fhc {
    private static boolean a = true;

    @Override // defpackage.fhb
    public void c(android.view.View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (java.lang.NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
