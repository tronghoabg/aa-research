package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.gearhead.appdecor.DrawerContentLayout;

/* loaded from: classes2.dex */
public final class qfz extends osq {
    final /* synthetic */ DrawerContentLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfz(DrawerContentLayout drawerContentLayout) {
        super(null);
        this.a = drawerContentLayout;
    }

    @Override // defpackage.osq
    public final void b(RecyclerView recyclerView, int i, int i2) {
        DrawerContentLayout drawerContentLayout = this.a;
        float fMin = Math.min(1.0f, drawerContentLayout.d.i().computeVerticalScrollOffset() / drawerContentLayout.r);
        ((ype) ((ype) DrawerContentLayout.a.f()).ai(7097)).z("updateDrawerHeaderShadow %g %g", drawerContentLayout.q, fMin);
        drawerContentLayout.p.setElevation(drawerContentLayout.q * fMin);
        Runnable runnable = drawerContentLayout.t;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.osq
    public final void e(int i) {
        this.a.k.k(gsn.f, yzz.DRAWER);
    }

    @Override // defpackage.osq
    public final void f(int i) {
        this.a.k.k(gsn.e, yzz.DRAWER);
    }
}
