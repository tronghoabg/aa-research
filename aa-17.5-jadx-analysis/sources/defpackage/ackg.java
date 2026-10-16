package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class ackg {
    String a;
    String b;
    boolean c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    ArrayList k = new ArrayList();
    ArrayList l = new ArrayList();
    Matrix m = null;

    public final ackg a(ackg ackgVar) {
        ackg ackgVar2 = new ackg();
        ackgVar2.a = ackgVar.a;
        ackgVar2.b = this.a;
        ackgVar2.c = ackgVar.c;
        ackgVar2.d = ackgVar.d;
        ackgVar2.f = ackgVar.f;
        ackgVar2.e = ackgVar.e;
        ackgVar2.g = ackgVar.g;
        ackgVar2.h = ackgVar.h;
        ackgVar2.i = ackgVar.i;
        ackgVar2.j = ackgVar.j;
        ackgVar2.k = this.k;
        ackgVar2.l = this.l;
        ackgVar2.m = this.m;
        Matrix matrix = ackgVar.m;
        if (matrix != null) {
            Matrix matrix2 = this.m;
            if (matrix2 == null) {
                ackgVar2.m = matrix;
                return ackgVar2;
            }
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.preConcat(ackgVar.m);
            ackgVar2.m = matrix3;
        }
        return ackgVar2;
    }
}
