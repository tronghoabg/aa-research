package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jtr {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.fxn r24, defpackage.cfy r25, defpackage.bmr r26, defpackage.bux r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtr.a(fxn, cfy, bmr, bux, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r116, boolean r117, defpackage.hjo r118, defpackage.afeg r119, defpackage.bux r120, int r121, int r122) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtr.b(boolean, boolean, hjo, afeg, bux, int, int):void");
    }

    public static /* synthetic */ List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequenceC = hlb.c((CarText) it.next());
            if (charSequenceC != null) {
                arrayList.add(CarText.create(charSequenceC));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void d(geu geuVar, uq uqVar) {
        ghe gheVarD = jtq.d(geuVar);
        if (gheVarD != null) {
            gheVarD.g(gsn.c);
        }
        gca.e(geuVar, uqVar);
    }

    public static final void e(Rect rect, View view) {
        view.getClass();
        if (view.getVisibility() == 8) {
            return;
        }
        rect.right = Math.min(rect.right, view.getLeft());
    }

    public static final void f(Rect rect, View view) {
        view.getClass();
        if (view.getVisibility() == 8) {
            return;
        }
        rect.left = Math.max(rect.left, view.getRight());
    }
}
