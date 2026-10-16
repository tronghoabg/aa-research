package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ebp {
    static java.lang.CharSequence a(android.view.View view) {
        return hh$.ExternalSyntheticApiModelOutline0.m(view);
    }

    static void b(android.view.View view, boolean z) {
        hh$.ExternalSyntheticApiModelOutline0.m(view, z);
    }

    static void c(android.view.View view, java.lang.CharSequence charSequence) {
        hh$.ExternalSyntheticApiModelOutline0.m(view, charSequence);
    }

    static void d(android.view.View view, boolean z) {
        hh$.ExternalSyntheticApiModelOutline0.m$1(view, z);
    }

    static boolean e(android.view.View view) {
        return hh$.ExternalSyntheticApiModelOutline0.m(view);
    }

    static boolean f(android.view.View view) {
        return hh$.ExternalSyntheticApiModelOutline0.m$1(view);
    }

    public static void g(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof defpackage.ean) {
            ((defpackage.ean) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void h(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof defpackage.eao) {
            ((defpackage.eao) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof defpackage.ean) {
            ((defpackage.ean) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void i(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i, int i2) {
        if (viewParent instanceof defpackage.ean) {
            ((defpackage.ean) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void j(android.view.ViewParent viewParent, android.view.View view, int i) {
        if (viewParent instanceof defpackage.ean) {
            ((defpackage.ean) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean k(android.view.ViewParent viewParent, android.view.View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean l(android.view.ViewParent viewParent, android.view.View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean m(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i, int i2) {
        if (viewParent instanceof defpackage.ean) {
            return ((defpackage.ean) viewParent).t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", defpackage.a.bl(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            return false;
        }
    }

    public static boolean n(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }
}
