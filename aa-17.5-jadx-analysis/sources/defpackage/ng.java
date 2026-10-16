package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ng implements hs {
    hg a;
    public hi b;
    final /* synthetic */ Toolbar c;

    public ng(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.hs
    public final void b(Context context, hg hgVar) {
        hi hiVar;
        hg hgVar2 = this.a;
        if (hgVar2 != null && (hiVar = this.b) != null) {
            hgVar2.t(hiVar);
        }
        this.a = hgVar;
    }

    @Override // defpackage.hs
    public final void d(hr hrVar) {
        throw null;
    }

    @Override // defpackage.hs
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hs
    public final boolean f(ia iaVar) {
        return false;
    }

    @Override // defpackage.hs
    public final boolean g(hi hiVar) {
        Toolbar toolbar = this.c;
        View view = toolbar.h;
        if (view instanceof hk) {
            ((hk) view).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        ArrayList arrayList = toolbar.u;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                hiVar.h(false);
                toolbar.w();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.hs
    public final boolean h(hi hiVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new je(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            nh nhVar = new nh();
            nhVar.a = (toolbar.m & 112) | 8388611;
            nhVar.b = 2;
            toolbar.g.setLayoutParams(nhVar);
            toolbar.g.setOnClickListener(new ie(toolbar, 2));
        }
        ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        toolbar.h = hiVar.getActionView();
        this.b = hiVar;
        ViewParent parent2 = toolbar.h.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.h);
            }
            nh nhVar2 = new nh();
            nhVar2.a = (toolbar.m & 112) | 8388611;
            nhVar2.b = 2;
            toolbar.h.setLayoutParams(nhVar2);
            toolbar.addView(toolbar.h);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((nh) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.u.add(childAt);
            }
        }
        toolbar.requestLayout();
        hiVar.h(true);
        View view = toolbar.h;
        if (view instanceof hk) {
            ((hk) view).a.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.hs
    public final void i() {
        if (this.b != null) {
            hg hgVar = this.a;
            if (hgVar != null) {
                int size = hgVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }

    @Override // defpackage.hs
    public final void c(hg hgVar, boolean z) {
    }
}
