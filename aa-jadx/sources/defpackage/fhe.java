package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class fhe extends defpackage.fhd {
    private static boolean a = true;

    @Override // defpackage.fhb
    public void e(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            super.e(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (java.lang.NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
