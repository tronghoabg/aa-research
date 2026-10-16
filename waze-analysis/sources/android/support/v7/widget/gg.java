package android.support.v7.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.GravityCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gg implements android.support.v7.view.menu.ad {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.view.menu.q f1552a;

    /* renamed from: b, reason: collision with root package name */
    android.support.v7.view.menu.t f1553b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Toolbar f1554c;

    gg(Toolbar toolbar) {
        this.f1554c = toolbar;
    }

    @Override // android.support.v7.view.menu.ad
    public final void c(Context context, android.support.v7.view.menu.q qVar) {
        android.support.v7.view.menu.t tVar;
        android.support.v7.view.menu.q qVar2 = this.f1552a;
        if (qVar2 != null && (tVar = this.f1553b) != null) {
            qVar2.y(tVar);
        }
        this.f1552a = qVar;
    }

    @Override // android.support.v7.view.menu.ad
    public final void e(android.support.v7.view.menu.ac acVar) {
        throw null;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean f() {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean g(android.support.v7.view.menu.al alVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean h(android.support.v7.view.menu.t tVar) {
        Toolbar toolbar = this.f1554c;
        KeyEvent.Callback callback = toolbar.f973c;
        if (callback instanceof android.support.v7.view.c) {
            ((android.support.v7.view.c) callback).a();
        }
        toolbar.removeView(toolbar.f973c);
        toolbar.removeView(toolbar.f972b);
        toolbar.f973c = null;
        toolbar.j();
        this.f1553b = null;
        toolbar.requestLayout();
        tVar.e(false);
        toolbar.y();
        return true;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean i(android.support.v7.view.menu.t tVar) {
        Toolbar toolbar = this.f1554c;
        toolbar.l();
        ViewParent parent = toolbar.f972b.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f972b);
            }
            toolbar.addView(toolbar.f972b);
        }
        toolbar.f973c = tVar.getActionView();
        this.f1553b = tVar;
        ViewParent parent2 = toolbar.f973c.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f973c);
            }
            gh ghVar = new gh();
            ghVar.f498a = (toolbar.f974d & 112) | GravityCompat.START;
            ghVar.f1555b = 2;
            toolbar.f973c.setLayoutParams(ghVar);
            toolbar.addView(toolbar.f973c);
        }
        toolbar.m();
        toolbar.requestLayout();
        tVar.e(true);
        KeyEvent.Callback callback = toolbar.f973c;
        if (callback instanceof android.support.v7.view.c) {
            ((android.support.v7.view.c) callback).b();
        }
        toolbar.y();
        return true;
    }

    @Override // android.support.v7.view.menu.ad
    public final void j() {
        if (this.f1553b != null) {
            android.support.v7.view.menu.q qVar = this.f1552a;
            if (qVar != null) {
                int size = qVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f1552a.getItem(i2) == this.f1553b) {
                        return;
                    }
                }
            }
            h(this.f1553b);
        }
    }

    @Override // android.support.v7.view.menu.ad
    public final void d(android.support.v7.view.menu.q qVar, boolean z) {
    }
}
