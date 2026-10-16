package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.maps.api.android.lib6.streetview.model.StreetViewNavigationArrow;
import java.util.List;

/* loaded from: classes3.dex */
public final class aafx extends eek {
    private final aafz e;

    public aafx(aafz aafzVar, View view) {
        super(view);
        this.e = aafzVar;
    }

    @Override // defpackage.eek
    public final int j(float f, float f2) {
        int iA = this.e.a(f, f2);
        if (iA == -1) {
            return Integer.MIN_VALUE;
        }
        return iA;
    }

    @Override // defpackage.eek
    public final void l(List list) {
        RectF[] rectFArr;
        aafz aafzVar = this.e;
        synchronized (aafzVar) {
            if (aafzVar.f && (rectFArr = aafzVar.j) != null) {
                int length = rectFArr.length;
                for (int i = 0; i < length; i++) {
                    list.add(Integer.valueOf(i));
                }
            }
        }
    }

    @Override // defpackage.eek
    public final void n(int i, AccessibilityEvent accessibilityEvent) {
        Float fValueOf;
        aafz aafzVar = this.e;
        synchronized (aafzVar) {
            List list = aafzVar.h;
            fValueOf = null;
            if (list != null && i < ((yls) list).c) {
                fValueOf = Float.valueOf(((StreetViewNavigationArrow) list.get(i)).bearing);
            }
        }
        accessibilityEvent.setContentDescription(fValueOf == null ? "" : aafzVar.d[aahr.h(fValueOf.floatValue())]);
    }

    @Override // defpackage.eek
    public final void p(int i, edg edgVar) {
        Float fValueOf;
        RectF rectF;
        RectF[] rectFArr;
        aafz aafzVar = this.e;
        synchronized (aafzVar) {
            List list = aafzVar.h;
            fValueOf = null;
            if (list == null || i >= ((yls) list).c || (rectFArr = aafzVar.j) == null || i >= rectFArr.length) {
                rectF = null;
            } else {
                fValueOf = Float.valueOf(((StreetViewNavigationArrow) list.get(i)).bearing);
                rectF = aafzVar.j[i];
            }
        }
        if (fValueOf == null) {
            edgVar.z(false);
            edgVar.v("");
            edgVar.n(aafz.b);
        } else {
            edgVar.z(true);
            edgVar.v(aafzVar.d[aahr.h(fValueOf.floatValue())]);
            zkt.n(rectF, "rectF");
            edgVar.n(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        }
    }

    @Override // defpackage.eek
    public final boolean u(int i, int i2) {
        return true;
    }
}
