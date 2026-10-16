package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dco {
    public static final aan a;

    static {
        long[] jArr = aao.a;
        a = new aan(6);
    }

    public static final View a(View view) {
        Object objH = ebe.h(view);
        while (objH instanceof View) {
            View view2 = (View) objH;
            if (view2.getId() == 16908290) {
                break;
            }
            objH = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final bvb b(View view) {
        bvb bvbVarC = c(view);
        if (bvbVarC != null) {
            return bvbVarC;
        }
        Object parent = view.getParent();
        while (bvbVarC == null && (parent instanceof View)) {
            View view2 = (View) parent;
            bvbVarC = c(view2);
            parent = ebe.h(view2);
        }
        return bvbVarC;
    }

    public static final bvb c(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof bvb) {
            return (bvb) tag;
        }
        return null;
    }

    public static final bxn d(View view) {
        if (!view.isAttachedToWindow()) {
            crt.c(a.bm(view, "Cannot locate windowRecomposer; View ", " is not attached to a window"));
        }
        View viewA = a(view);
        bvb bvbVarC = c(viewA);
        if (bvbVarC != null) {
            if (bvbVarC instanceof bxn) {
                return (bxn) bvbVarC;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        AtomicReference atomicReference = dci.a;
        bxn bxnVarC = dao.c(viewA);
        viewA.setTag(R.id.androidx_compose_ui_view_composition_context, bxnVarC);
        aivb aivbVar = aivb.a;
        Handler handler = viewA.getHandler();
        int i = aiwx.a;
        viewA.addOnAttachStateChangeListener(new cjh(ahnc.d(aivbVar, new aiwv(handler, "windowRecomposer cleanup", false).b, 0, new beh(bxnVarC, viewA, (afck) null, 7), 2), 3));
        return bxnVarC;
    }
}
