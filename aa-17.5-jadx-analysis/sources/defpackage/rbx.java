package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public final class rbx {
    public final int a;
    public final long b;
    private final int c;
    private final int d;

    private rbx(int i) {
        this.c = i;
        this.a = -1;
        this.b = -1L;
        this.d = -1;
    }

    public static rbx a(View view) {
        RecyclerView recyclerView;
        if (view != null && !view.isInTouchMode()) {
            View viewFindFocus = view.findFocus();
            if (viewFindFocus != null) {
                int iC = c(viewFindFocus, view);
                if (iC != -1) {
                    return new rbx(iC);
                }
                ViewParent viewParent = viewFindFocus;
                for (ViewParent parent = viewFindFocus.getParent(); parent != null && viewParent != view; parent = parent.getParent()) {
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        break;
                    }
                    viewParent = parent;
                }
                recyclerView = null;
                int iC2 = c(recyclerView, view);
                if (iC2 != -1) {
                    View view2 = (View) viewParent;
                    recyclerView.getClass();
                    int iC3 = recyclerView.c(view2);
                    lt ltVar = recyclerView.m;
                    long jE = -1;
                    if (ltVar != null && ltVar.c) {
                        jE = ltVar.e(iC3);
                    }
                    return new rbx(iC2, iC3, jE, viewParent != viewFindFocus ? c(viewFindFocus, view2) : -1);
                }
            }
            rrd.a("GH.ViewFocusInfo", null, "Saving view focus state was desired, but couldn't identify the View.");
        }
        return null;
    }

    private static int c(View view, View view2) {
        int id;
        if (view == null || (id = view.getId()) == -1 || view2.findViewById(id) != view) {
            return -1;
        }
        return id;
    }

    private final mo d(RecyclerView recyclerView, pr prVar) {
        mo moVar = (mo) prVar.a(recyclerView);
        if (moVar != null && moVar.a.isAttachedToWindow()) {
            return moVar;
        }
        recyclerView.X(this.a);
        return (mo) prVar.a(recyclerView);
    }

    public final void b(View view) {
        View viewFindViewById;
        int i = this.c;
        if (i == -1) {
            rrd.a("GH.ViewFocusInfo", null, "Attempted to restore View focus state, but no id was saved.");
            return;
        }
        View viewFindViewById2 = view.findViewById(i);
        if (viewFindViewById2 == null) {
            rrd.a("GH.ViewFocusInfo", null, "Attempted to restore View focus state, but the View was not found by id. Maybe view hierarchy is being added asynchronously?");
            return;
        }
        if ((viewFindViewById2 instanceof RecyclerView) && (this.a >= 0 || this.b != -1)) {
            RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
            mo moVarD = this.b != -1 ? d(recyclerView, new aw(this, 2)) : d(recyclerView, new aw(this, 3));
            if (moVarD == null) {
                viewFindViewById2 = null;
            } else {
                int i2 = this.d;
                viewFindViewById2 = moVarD.a;
                if (i2 != -1 && (viewFindViewById = viewFindViewById2.findViewById(i2)) != null) {
                    viewFindViewById2 = viewFindViewById;
                }
            }
        }
        if (viewFindViewById2 == null) {
            rrd.a("GH.ViewFocusInfo", null, "Restoring focus was desired, but couldn't find the View.");
        } else if (viewFindViewById2.requestFocus()) {
            rrd.f("GH.ViewFocusInfo", "Restored focus synchronously");
        } else {
            rrd.a("GH.ViewFocusInfo", null, "Attempted to request focus on the desired View synchronously, but failed. This is normal. Will try asynchronously.");
            viewFindViewById2.getViewTreeObserver().addOnTouchModeChangeListener(new rbw(viewFindViewById2, 0));
        }
    }

    private rbx(int i, int i2, long j, int i3) {
        this.c = i;
        this.a = i2;
        this.b = j;
        this.d = i3;
    }
}
