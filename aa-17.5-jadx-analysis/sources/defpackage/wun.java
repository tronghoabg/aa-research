package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class wun extends wut {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public wun(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.wut
    public final void a(Matrix matrix, wtv wtvVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wut) it.next()).a(this.b, wtvVar, i, canvas);
        }
    }
}
