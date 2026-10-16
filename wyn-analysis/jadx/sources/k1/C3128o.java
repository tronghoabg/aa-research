package k1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: k1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3128o {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f38860a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f38861b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f38862c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38863d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f38864e;

    public C3128o(ViewGroup viewGroup) {
        this.f38862c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z2) {
        ViewParent viewParentE;
        if (this.f38863d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f38862c, f10, f11, z2);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e7);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f38863d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f38862c, f10, f11);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e7);
            }
        }
        return false;
    }

    public final boolean c(int i5, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent viewParentE;
        int i12;
        int i13;
        if (!this.f38863d || (viewParentE = e(i11)) == null) {
            return false;
        }
        if (i5 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f38862c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f38864e == null) {
                this.f38864e = new int[2];
            }
            iArr = this.f38864e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof InterfaceC3129p) {
            ((InterfaceC3129p) viewParentE).c(viewGroup, i5, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i5, i10, iArr3);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e7);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i5, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentE;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f38863d && (viewParentE = e(i13)) != null) {
            if (i5 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f38862c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f38864e == null) {
                        this.f38864e = new int[2];
                    }
                    int[] iArr4 = this.f38864e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof InterfaceC3130q) {
                    ((InterfaceC3130q) viewParentE).d(viewGroup, i5, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (viewParentE instanceof InterfaceC3129p) {
                        ((InterfaceC3129p) viewParentE).e(viewGroup, i5, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i5, i10, i11, i12);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e7);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i5) {
        if (i5 == 0) {
            return this.f38860a;
        }
        if (i5 != 1) {
            return null;
        }
        return this.f38861b;
    }

    public final boolean f(int i5) {
        return e(i5) != null;
    }

    public final boolean g(int i5, int i10) {
        boolean zOnStartNestedScroll;
        if (!f(i10)) {
            if (this.f38863d) {
                View view = this.f38862c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof InterfaceC3129p;
                    if (z2) {
                        zOnStartNestedScroll = ((InterfaceC3129p) parent).f(view2, view, i5, i10);
                    } else if (i10 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i5);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i10 == 0) {
                            this.f38860a = parent;
                        } else if (i10 == 1) {
                            this.f38861b = parent;
                        }
                        if (z2) {
                            ((InterfaceC3129p) parent).b(view2, view, i5, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i5);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i5) {
        ViewParent viewParentE = e(i5);
        if (viewParentE != null) {
            boolean z2 = viewParentE instanceof InterfaceC3129p;
            ViewGroup viewGroup = this.f38862c;
            if (z2) {
                ((InterfaceC3129p) viewParentE).a(i5, viewGroup);
            } else if (i5 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i5 == 0) {
                this.f38860a = null;
            } else {
                if (i5 != 1) {
                    return;
                }
                this.f38861b = null;
            }
        }
    }
}
