package q;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import o.InterfaceC3621b;
import p.SubMenuC3749D;

/* loaded from: classes.dex */
public final class j1 implements p.x {

    /* renamed from: a, reason: collision with root package name */
    public p.k f43812a;

    /* renamed from: b, reason: collision with root package name */
    public p.m f43813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f43814c;

    public j1(Toolbar toolbar) {
        this.f43814c = toolbar;
    }

    @Override // p.x
    public final void b(Context context, p.k kVar) {
        p.m mVar;
        p.k kVar2 = this.f43812a;
        if (kVar2 != null && (mVar = this.f43813b) != null) {
            kVar2.d(mVar);
        }
        this.f43812a = kVar;
    }

    @Override // p.x
    public final void d() {
        if (this.f43813b != null) {
            p.k kVar = this.f43812a;
            if (kVar != null) {
                int size = kVar.f43044f.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (this.f43812a.getItem(i5) == this.f43813b) {
                        return;
                    }
                }
            }
            f(this.f43813b);
        }
    }

    @Override // p.x
    public final boolean e(p.m mVar) {
        Toolbar toolbar = this.f43814c;
        toolbar.c();
        ViewParent parent = toolbar.f17984h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f17984h);
            }
            toolbar.addView(toolbar.f17984h);
        }
        View actionView = mVar.getActionView();
        toolbar.f17985i = actionView;
        this.f43813b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f17985i);
            }
            k1 k1VarH = Toolbar.h();
            k1VarH.f43821a = (toolbar.f17989n & 112) | 8388611;
            k1VarH.f43822b = 2;
            toolbar.f17985i.setLayoutParams(k1VarH);
            toolbar.addView(toolbar.f17985i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k1) childAt.getLayoutParams()).f43822b != 2 && childAt != toolbar.f17977a) {
                toolbar.removeViewAt(childCount);
                toolbar.f17965E.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.f43067C = true;
        mVar.f43080n.p(false);
        KeyEvent.Callback callback = toolbar.f17985i;
        if (callback instanceof InterfaceC3621b) {
            ((InterfaceC3621b) callback).b();
        }
        toolbar.u();
        return true;
    }

    @Override // p.x
    public final boolean f(p.m mVar) {
        Toolbar toolbar = this.f43814c;
        KeyEvent.Callback callback = toolbar.f17985i;
        if (callback instanceof InterfaceC3621b) {
            ((InterfaceC3621b) callback).e();
        }
        toolbar.removeView(toolbar.f17985i);
        toolbar.removeView(toolbar.f17984h);
        toolbar.f17985i = null;
        ArrayList arrayList = toolbar.f17965E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f43813b = null;
        toolbar.requestLayout();
        mVar.f43067C = false;
        mVar.f43080n.p(false);
        toolbar.u();
        return true;
    }

    @Override // p.x
    public final boolean g() {
        return false;
    }

    @Override // p.x
    public final boolean h(SubMenuC3749D subMenuC3749D) {
        return false;
    }

    @Override // p.x
    public final void l(p.k kVar, boolean z2) {
    }
}
