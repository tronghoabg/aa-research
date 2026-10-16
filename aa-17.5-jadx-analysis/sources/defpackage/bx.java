package defpackage;

import android.support.v4.app.Fragment;
import android.view.ViewGroup;

@Deprecated
/* loaded from: classes2.dex */
public abstract class bx extends fhy {
    public final bt a;
    public cc b = null;
    public Fragment c = null;
    private boolean e;

    public bx(bt btVar) {
        this.a = btVar;
    }

    public static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.fhy
    public final void b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.bm(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.fhy
    public final void c(Object obj) {
        if (this.b == null) {
            this.b = new w(this.a);
        }
        Fragment fragment = (Fragment) obj;
        this.b.j(fragment);
        if (fragment.equals(this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.fhy
    public final void d() {
        cc ccVar = this.b;
        if (ccVar != null) {
            if (!this.e) {
                try {
                    this.e = true;
                    ccVar.d();
                } finally {
                    this.e = false;
                }
            }
            this.b = null;
        }
    }
}
