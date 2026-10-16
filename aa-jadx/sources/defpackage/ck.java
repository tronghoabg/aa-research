package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ck {
    private static boolean g(java.util.List list, android.view.View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    protected static void v(java.util.List list, android.view.View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        int[] iArr = defpackage.ebt.a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            android.view.View view2 = (android.view.View) list.get(i);
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    android.view.View childAt = viewGroup.getChildAt(i2);
                    if (!g(list, childAt, size) && childAt.getTransitionName() != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    protected static boolean x(java.util.List list) {
        return list == null || list.isEmpty();
    }

    protected static final void y(android.view.View view, android.graphics.Rect rect) {
        if (view.isAttachedToWindow()) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            java.lang.Object parent = view.getParent();
            while (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    public abstract java.lang.Object b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract java.lang.Object c(java.lang.Object obj);

    public abstract void d(java.lang.Object obj, android.view.View view);

    public abstract void e(java.lang.Object obj, java.util.ArrayList arrayList);

    public abstract void f(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract void h(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void i(java.lang.Object obj, android.graphics.Rect rect);

    public abstract void j(java.lang.Object obj, android.view.View view);

    public abstract void k(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void l(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract boolean m(java.lang.Object obj);

    public boolean n() {
        throw null;
    }

    public boolean o(java.lang.Object obj) {
        throw null;
    }

    public abstract java.lang.Object p(java.lang.Object obj, java.lang.Object obj2);

    public abstract void q(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2);

    public void r(java.lang.Object obj, defpackage.dwd dwdVar, java.lang.Runnable runnable) {
        throw null;
    }

    public java.lang.Object s(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        return null;
    }

    public void z(java.lang.Object obj, defpackage.dwd dwdVar, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        runnable2.run();
    }

    public void t(java.lang.Object obj) {
    }

    public void u(java.lang.Object obj, java.lang.Runnable runnable) {
    }

    public void w(java.lang.Object obj, float f) {
    }
}
