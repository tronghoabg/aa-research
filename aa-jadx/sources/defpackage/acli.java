package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class acli {
    java.lang.String a;
    java.lang.String b;
    boolean c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    java.util.ArrayList k = new java.util.ArrayList();
    java.util.ArrayList l = new java.util.ArrayList();
    android.graphics.Matrix m = null;

    public final defpackage.acli a(defpackage.acli acliVar) {
        defpackage.acli acliVar2 = new defpackage.acli();
        acliVar2.a = acliVar.a;
        acliVar2.b = this.a;
        acliVar2.c = acliVar.c;
        acliVar2.d = acliVar.d;
        acliVar2.f = acliVar.f;
        acliVar2.e = acliVar.e;
        acliVar2.g = acliVar.g;
        acliVar2.h = acliVar.h;
        acliVar2.i = acliVar.i;
        acliVar2.j = acliVar.j;
        acliVar2.k = this.k;
        acliVar2.l = this.l;
        acliVar2.m = this.m;
        android.graphics.Matrix matrix = acliVar.m;
        if (matrix != null) {
            android.graphics.Matrix matrix2 = this.m;
            if (matrix2 == null) {
                acliVar2.m = matrix;
                return acliVar2;
            }
            android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix2);
            matrix3.preConcat(acliVar.m);
            acliVar2.m = matrix3;
        }
        return acliVar2;
    }
}
