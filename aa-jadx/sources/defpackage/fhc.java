package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class fhc extends defpackage.fhb {
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;

    @Override // defpackage.fhb
    public void b(android.view.View view, android.graphics.Matrix matrix) {
        if (a) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.fhb
    public void f(android.view.View view, android.graphics.Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                b = false;
            }
        }
    }

    @Override // defpackage.fhb
    public void g(android.view.View view, android.graphics.Matrix matrix) {
        if (c) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                c = false;
            }
        }
    }
}
