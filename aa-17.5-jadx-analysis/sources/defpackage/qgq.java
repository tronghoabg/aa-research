package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.gearhead.appdecor.DrawerContentLayout;
import com.google.android.projection.gearhead.R;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class qgq extends lt implements oxi {
    private static final yph g = yph.c("ADU.MenuItemAdapter");
    public final Stack a;
    public boolean e;
    public final whk f;
    private final Context h;
    private final Context i;
    private final DrawerContentLayout j;
    private final lzc k;
    private final ovr l;

    public qgq(Context context, Context context2, ovr ovrVar, DrawerContentLayout drawerContentLayout, Stack stack, whk whkVar, lzc lzcVar) {
        this.h = context;
        this.i = context2;
        this.l = ovrVar;
        this.j = drawerContentLayout;
        this.a = stack;
        this.f = whkVar;
        this.k = lzcVar;
    }

    private final MenuItem u(int i) {
        try {
            return this.l.e(i);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) g.g()).p(e)).ai((char) 7216)).u("Error getting menu item");
            return null;
        }
    }

    @Override // defpackage.lt
    public final int a() {
        if (this.e) {
            return 0;
        }
        try {
            ovr ovrVar = this.l;
            Parcel parcelGi = ovrVar.gi(1, ovrVar.gh());
            int i = parcelGi.readInt();
            parcelGi.recycle();
            return i;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) g.g()).p(e)).ai((char) 7215)).u("Error getting menu item count");
            return 0;
        }
    }

    final int c() {
        Bundle bundle;
        if (a() > 0) {
            MenuItem menuItemU = u(0);
            int i = lba.a;
            if (menuItemU != null && (bundle = menuItemU.b) != null) {
                return bundle.getInt("drawer_initial_position", 0);
            }
        }
        return 0;
    }

    @Override // defpackage.lt
    public final int d(int i) {
        return u(i).a;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.i);
        return i != 1 ? i != 2 ? i != 3 ? new qgr(layoutInflaterFrom.inflate(R.layout.adu_menu_item, viewGroup, false)) : new qft(layoutInflaterFrom.inflate(R.layout.adu_menu_item_dialer, viewGroup, false)) : new qgr(layoutInflaterFrom.inflate(R.layout.adu_menu_item_submenu, viewGroup, false)) : new qfq(layoutInflaterFrom.inflate(R.layout.adu_menu_item_checkbox, viewGroup, false));
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        Bundle bundle;
        qgr qgrVar = (qgr) moVar;
        MenuItem menuItemU = u(i);
        qgrVar.E(menuItemU, this.h, this.i);
        if (menuItemU == null || (bundle = menuItemU.b) == null || !bundle.getBoolean("menu_header")) {
            qgrVar.F(menuItemU, this);
            return;
        }
        View view = qgrVar.a;
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    public final void s(MenuItem menuItem) {
        try {
            ovr ovrVar = this.l;
            Parcel parcelGh = ovrVar.gh();
            ijp.g(parcelGh, menuItem);
            ovrVar.gj(3, parcelGh);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) g.g()).p(e)).ai((char) 7217)).u("Error notifying onItemClicked event");
        }
    }

    public final void t(MenuItem menuItem) {
        yph yphVar = g;
        ((ype) yphVar.l().ai((char) 7218)).y("onMenuItemClicked %s", menuItem);
        qgw qgwVar = this.j.c;
        if (qgwVar.c()) {
            ((ype) ((ype) yphVar.h()).ai((char) 7219)).u("Skip notifying menu item clicked during animation");
            return;
        }
        int i = menuItem.a;
        if (i == 1) {
            this.k.k(gsn.c, yzz.DRAWER);
            s(menuItem);
        } else if (i != 2) {
            qgwVar.b(new qfa(this, menuItem, 7, (short[]) null));
        } else {
            this.k.k(gsn.c, yzz.DRAWER);
            qgwVar.b(new prm(this, menuItem, qgwVar, 5));
        }
    }

    @Override // defpackage.oxi
    public final void b(int i) {
    }
}
