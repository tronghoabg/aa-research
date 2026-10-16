package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.ImageView;
import com.google.android.apps.auto.sdk.AlphaJumpKeyItem;
import com.google.android.gearhead.appdecor.DrawerContentLayout;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class qgh extends qgp {
    public static final yph a = yph.c("ADU.MenuController");
    public final StatusBarView b;
    public final DrawerContentLayout c;
    public final lzc d;
    final Stack e = new Stack();
    public ovr f;
    private final Context g;
    private final Context h;
    private final ImageView i;
    private qgq j;
    private boolean k;
    private boolean l;
    private Bundle m;
    private boolean n;
    private whk o;

    public qgh(Context context, Context context2, StatusBarView statusBarView, DrawerContentLayout drawerContentLayout, ImageView imageView, lzc lzcVar) {
        this.g = context;
        this.h = context2;
        this.b = statusBarView;
        this.c = drawerContentLayout;
        this.i = imageView;
        this.d = lzcVar;
    }

    @Override // defpackage.qgp
    public final void A(whk whkVar) {
        this.o = whkVar;
    }

    @Override // defpackage.ovt
    public final void a() {
        ((ype) a.l().ai((char) 7139)).u("hideLoadingIndicator");
        DrawerContentLayout drawerContentLayout = this.c;
        drawerContentLayout.m = false;
        drawerContentLayout.e.setVisibility(8);
        if (drawerContentLayout.o != 0) {
            drawerContentLayout.d.setVisibility(0);
        } else {
            drawerContentLayout.h.setVisibility(0);
        }
    }

    @Override // defpackage.ovt
    public final void b() {
        ((ype) a.l().ai((char) 7140)).u("hideMenuButton");
        this.k = false;
        this.i.setVisibility(8);
    }

    @Override // defpackage.ovt
    public final void c() {
        ((ype) a.l().ai(7141)).y("notifyDataSetChanged %s", this.j);
        qgq qgqVar = this.j;
        if (qgqVar != null) {
            qgqVar.g();
            DrawerContentLayout drawerContentLayout = this.c;
            drawerContentLayout.j(this.j.a());
            if (!this.n || this.j.a() <= 0) {
                return;
            }
            this.n = false;
            drawerContentLayout.d.l(this.j.c());
        }
    }

    @Override // defpackage.ovt
    public final void d(int i) {
        ((ype) a.l().ai(7142)).K("notifyItemChanged %s %d", this.j, i);
        qgq qgqVar = this.j;
        if (qgqVar != null) {
            qgqVar.h(i);
        }
    }

    @Override // defpackage.ovt
    public final void f() {
        ((ype) a.l().ai((char) 7144)).u("onAlphaJumpDisabled");
        this.l = false;
        Object obj = this.o.a;
        ((ype) lat.a.l().ai((char) 3709)).u("disableAlphaJump");
        lat latVar = (lat) obj;
        latVar.c = null;
        if (latVar.d()) {
            latVar.a();
        }
        ((ype) lay.g.l().ai((char) 3716)).u("disableAlphaJump");
        lay layVar = (lay) obj;
        layVar.h.g(null);
        layVar.g(8);
    }

    @Override // defpackage.ovt
    public final void g() {
        ((ype) a.l().ai((char) 7145)).u("onAlphaJumpEnabled");
        this.l = false;
        ((lay) this.o.a).e();
    }

    @Override // defpackage.ovt
    public final void h(List list) {
        ((ype) a.l().ai((char) 7146)).u("onAlphaJumpKeyboardActivated");
        lat latVar = (lat) this.o.a;
        latVar.c = list;
        latVar.b.a().a(list);
        Map map = latVar.d;
        map.clear();
        for (AlphaJumpKeyItem alphaJumpKeyItem : latVar.c) {
            map.put(Character.valueOf(alphaJumpKeyItem.a), alphaJumpKeyItem);
        }
        latVar.b();
    }

    @Override // defpackage.ovt
    public final void i() {
        ((ype) a.l().ai((char) 7157)).u("showLoadingIndicator");
        DrawerContentLayout drawerContentLayout = this.c;
        drawerContentLayout.m = true;
        drawerContentLayout.e.setVisibility(0);
        if (drawerContentLayout.o != 0) {
            drawerContentLayout.d.setVisibility(8);
        } else {
            drawerContentLayout.h.setVisibility(8);
        }
    }

    @Override // defpackage.ovt
    public final void j() {
        ((ype) a.l().ai((char) 7158)).u("showMenuButton");
        this.k = true;
        this.i.setVisibility(0);
    }

    @Override // defpackage.ovt
    public final void k(ovr ovrVar) {
        ((ype) a.l().ai((char) 7154)).y("setRootMenuAdapter %s", ovrVar);
        this.f = ovrVar;
        Bundle bundle = this.m;
        if (bundle != null) {
            try {
                ovrVar.f(bundle);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7155)).u("Exception thrown");
            }
        }
    }

    @Override // defpackage.qgp
    @ResultIgnorabilityUnspecified
    public final Character l(int i) {
        ((ype) a.l().ai((char) 7137)).u("getNormalizedTitleInitial");
        try {
            return Character.valueOf(this.f.e(i).o);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7138)).u("Error getting the initial of normalized title for specific position.");
            return null;
        }
    }

    @Override // defpackage.qgp
    public final void m() {
        try {
            ovr ovrVar = this.f;
            ovrVar.gj(6, ovrVar.gh());
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7143)).u("Error when AlphaJump is activated.");
        }
    }

    @Override // defpackage.qgp
    public final void n() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 7147)).u("onBackClicked");
        qgw qgwVar = this.c.c;
        if (qgwVar.c()) {
            ((ype) ((ype) yphVar.h()).ai((char) 7148)).u("Skip notifying back clicked during animation");
        } else {
            a();
            qgwVar.a(new qfa(this, qgwVar, 3, (char[]) null));
        }
    }

    @Override // defpackage.qgp
    public final void o() throws Resources.NotFoundException {
        this.b.b();
        this.j = null;
    }

    @Override // defpackage.qgp
    public final void p() {
        if (this.f == null) {
            ((ype) ((ype) a.h()).ai((char) 7150)).u("onDrawerOpening when the adapter was null! Was there a day/night change?");
            return;
        }
        Context context = this.g;
        Context context2 = this.h;
        ovr ovrVar = this.f;
        DrawerContentLayout drawerContentLayout = this.c;
        this.j = new qgq(context, context2, ovrVar, drawerContentLayout, this.e, this.o, this.d);
        drawerContentLayout.d.c(this.j);
        t();
        c();
        if (this.j.a() <= 0) {
            this.n = true;
        } else {
            this.n = false;
            drawerContentLayout.d.l(this.j.c());
        }
    }

    @Override // defpackage.qgp
    public final void q() {
        try {
            if (this.l) {
                return;
            }
            ovr ovrVar = this.f;
            ovrVar.gj(7, ovrVar.gh());
            this.l = true;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7151)).u("Error when menu is needed to be sorted.");
        }
    }

    @Override // defpackage.qgp
    public final void r() {
        if (this.j.a() > 0) {
            this.n = false;
            this.c.d.l(this.j.c());
        } else {
            this.n = true;
        }
        this.c.j(this.j.a());
        if (this.j.a() == 0) {
            ImageView imageView = this.i;
            if (imageView.isFocusable()) {
                imageView.requestFocus();
            }
        }
    }

    @Override // defpackage.qgp
    public final void s(Bundle bundle) {
        ((ype) a.l().ai((char) 7152)).y("setConfigBundle %s", bundle);
        this.m = bundle;
        ovr ovrVar = this.f;
        if (ovrVar != null) {
            try {
                ovrVar.f(bundle);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7153)).u("Exception thrown");
            }
        }
    }

    public final void t() {
        String string;
        try {
            ovr ovrVar = this.f;
            Parcel parcelGi = ovrVar.gi(8, ovrVar.gh());
            string = parcelGi.readString();
            parcelGi.recycle();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7156)).u("Error getting root header");
            string = null;
        }
        StatusBarView statusBarView = this.b;
        if (string != null) {
            statusBarView.d(string);
        } else {
            statusBarView.b();
        }
    }

    @Override // defpackage.qgp
    public final boolean u() {
        ((ype) a.l().ai((char) 7135)).u("currentMenuAdapterHasParent");
        try {
            ovr ovrVar = this.f;
            Parcel parcelGi = ovrVar.gi(4, ovrVar.gh());
            boolean zJ = ijp.j(parcelGi);
            parcelGi.recycle();
            return zJ;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7136)).u("Error checking if menu adapter has a parent");
            return false;
        }
    }

    @Override // defpackage.qgp
    public final boolean v() {
        return this.k;
    }

    @Override // defpackage.qgp
    public final boolean w() {
        return this.l;
    }

    @Override // defpackage.qgp
    public final boolean x() {
        return this.i.hasFocus();
    }

    @Override // defpackage.qgp
    public final boolean y() {
        return this.i.requestFocus();
    }

    @Override // defpackage.qgp
    public final void z() {
        qgq qgqVar = this.j;
        owu owuVarI = this.c.d.i();
        qgqVar.e = true;
        qgqVar.g();
        szp.u(new qfa(qgqVar, owuVarI, 8, (short[]) null));
    }
}
