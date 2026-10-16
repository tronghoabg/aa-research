package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
final class iix extends iiy {
    float a;
    final float b;
    final RectF c = new RectF();
    final /* synthetic */ ija d;

    public iix(ija ijaVar, float f, float f2) {
        this.d = ijaVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.iiy
    public final void a(String str) {
        ija ijaVar = this.d;
        if (ijaVar.i()) {
            Rect rect = new Rect();
            ijaVar.d.d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.a, this.b);
            this.c.union(rectF);
        }
        this.a += ijaVar.d.d.measureText(str);
    }

    @Override // defpackage.iiy
    public final boolean b(iij iijVar) {
        if (!(iijVar instanceof iik)) {
            return true;
        }
        iik iikVar = (iik) iijVar;
        ihy ihyVarC = iijVar.t.c(iikVar.a);
        if (ihyVarC == null) {
            ija.e("TextPath path reference '%s' not found", iikVar.a);
            return false;
        }
        ihg ihgVar = (ihg) ihyVarC;
        Path path = new iis(ihgVar.a).a;
        Matrix matrix = ihgVar.e;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.c.union(rectF);
        return false;
    }
}
