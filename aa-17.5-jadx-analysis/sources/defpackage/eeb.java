package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class eeb {
    public final View a;
    public final ArrayList b = new ArrayList();
    public dve c;
    public dve d;
    public int e;

    public eeb(ViewGroup viewGroup) {
        View childAt;
        dve dveVar = dve.a;
        this.c = dveVar;
        this.d = dveVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        edy edyVar = new edy(this, viewGroup.getContext(), viewGroup);
        this.a = edyVar;
        edyVar.setVisibility(8);
        edyVar.setWillNotDraw(true);
        wkt wktVar = new wkt(this, 1);
        int[] iArr = ebm.a;
        ebe.e(edyVar, wktVar);
        lds.V(edyVar, new edz(this));
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            } else {
                childAt = viewGroup.getChildAt(childCount);
                if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                    break;
                }
            }
        }
        if (childAt == null) {
            viewGroup.addView(edyVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new eea(viewGroup, (View) edyVar, 0));
        }
    }

    public static final dve a(ecy ecyVar) {
        return dve.c(ecyVar.f(519), ecyVar.f(64));
    }
}
