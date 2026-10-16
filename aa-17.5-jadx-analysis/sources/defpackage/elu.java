package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final class elu extends eem {
    public final int a;
    public een b;
    final /* synthetic */ DrawerLayout c;
    private final Runnable d = new elt(this, 0);

    public elu(DrawerLayout drawerLayout, int i) {
        this.c = drawerLayout;
        this.a = i;
    }

    @Override // defpackage.eem
    public final int a(View view) {
        if (DrawerLayout.t(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.eem
    public final void b(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.c;
        View viewC = i3 == 1 ? drawerLayout.c(3) : drawerLayout.c(5);
        if (viewC == null || this.c.a(viewC) != 0) {
            return;
        }
        this.b.d(viewC, i2);
    }

    @Override // defpackage.eem
    public final void c(View view, int i) {
        ((els) view.getLayoutParams()).c = false;
        m();
    }

    @Override // defpackage.eem
    public final void d(int i) {
        int i2;
        View rootView;
        View view = this.b.k;
        DrawerLayout drawerLayout = this.c;
        een eenVar = drawerLayout.c;
        int i3 = drawerLayout.b.a;
        int i4 = eenVar.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((els) view.getLayoutParams()).b;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                els elsVar = (els) view.getLayoutParams();
                if ((elsVar.d & 1) == 1) {
                    elsVar.d = 0;
                    List list = drawerLayout.f;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            } else {
                                ((elr) drawerLayout.f.get(size)).c();
                            }
                        }
                    }
                    drawerLayout.n(view, false);
                    drawerLayout.m(view);
                    drawerLayout.l();
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                els elsVar2 = (els) view.getLayoutParams();
                if ((elsVar2.d & 1) == 0) {
                    elsVar2.d = 1;
                    List list2 = drawerLayout.f;
                    if (list2 != null) {
                        int size2 = list2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            } else {
                                ((elr) drawerLayout.f.get(size2)).a(view);
                            }
                        }
                    }
                    drawerLayout.n(view, true);
                    drawerLayout.m(view);
                    drawerLayout.l();
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 == drawerLayout.d) {
            return;
        }
        drawerLayout.d = i2;
        List list3 = drawerLayout.f;
        if (list3 == null) {
            return;
        }
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                ((elr) drawerLayout.f.get(size3)).b(i2);
            }
        }
    }

    @Override // defpackage.eem
    public final void e(View view, float f, float f2) {
        int width;
        float f3 = ((els) view.getLayoutParams()).b;
        DrawerLayout drawerLayout = this.c;
        int width2 = view.getWidth();
        if (drawerLayout.o(view, 3)) {
            width = 0;
            if (f <= BitmapDescriptorFactory.HUE_RED && (f != BitmapDescriptorFactory.HUE_RED || f3 <= 0.5f)) {
                width = -width2;
            }
        } else {
            width = drawerLayout.getWidth();
            if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && f3 > 0.5f)) {
                width -= width2;
            }
        }
        this.b.h(width, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.eem
    public final boolean f(View view, int i) {
        if (!DrawerLayout.t(view)) {
            return false;
        }
        DrawerLayout drawerLayout = this.c;
        return drawerLayout.o(view, this.a) && drawerLayout.a(view) == 0;
    }

    @Override // defpackage.eem
    public final int g(View view, int i) {
        DrawerLayout drawerLayout = this.c;
        if (drawerLayout.o(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.eem
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.eem
    public final void k() {
        this.c.postDelayed(this.d, 160L);
    }

    @Override // defpackage.eem
    public final void l(View view, int i, int i2) {
        float width = view.getWidth();
        DrawerLayout drawerLayout = this.c;
        float width2 = (drawerLayout.o(view, 3) ? r5 + i : drawerLayout.getWidth() - i) / width;
        drawerLayout.j(view, width2);
        view.setVisibility(width2 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
        drawerLayout.invalidate();
    }

    public final void m() {
        int i = this.a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.c;
        View viewC = drawerLayout.c(i);
        if (viewC != null) {
            drawerLayout.q(viewC);
        }
    }

    public final void n() {
        this.c.removeCallbacks(this.d);
    }

    @Override // defpackage.eem
    public final void j() {
    }
}
