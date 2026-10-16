package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.apps.auto.sdk.SearchItem;
import com.google.android.gearhead.appdecor.CarUiEntry;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qgm extends qgx {
    public static final yph a = yph.c("ADU.SearchController");
    public final Context b;
    public final Context c;
    public final qgc d;
    public final StatusBarView e;
    public final CarRestrictedEditText f;
    public qgy g;
    qgj h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public ovu m;
    public whk n;
    private final ViewGroup o;
    private final Runnable p;
    private final View q;
    private final ImageView r;
    private boolean s;
    private boolean t;
    private boolean u;
    private TextWatcher v;

    public qgm(Context context, Context context2, qgc qgcVar, ViewGroup viewGroup, StatusBarView statusBarView) {
        this.b = context;
        this.c = context2;
        this.d = qgcVar;
        this.o = viewGroup;
        viewGroup.getClass();
        this.p = new qct(viewGroup, 10);
        this.e = statusBarView;
        ImageView imageView = statusBarView.h;
        this.r = imageView;
        imageView.setOnClickListener(new onh(this, 8));
        View viewFindViewById = statusBarView.findViewById(R.id.car_search_box);
        this.q = viewFindViewById;
        viewFindViewById.setOnClickListener(new onh(this, 9));
        this.f = (CarRestrictedEditText) statusBarView.findViewById(R.id.car_search_box_edit_text);
        try {
            ((ImageView) statusBarView.findViewById(R.id.car_search_box_icon)).setImageDrawable(context.getPackageManager().getApplicationIcon(context.getPackageName()));
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Can't get app icon for package: ".concat(String.valueOf(this.b.getPackageName())), e);
        }
    }

    private final void A() {
        ((ype) a.l().ai((char) 7167)).u("notifySearchStart");
        whk whkVar = this.n;
        ((ImageView) whkVar.b).setVisibility(8);
        ((CarUiEntry) whkVar.c).setOverrideStatusBarForSearch(true, (ViewGroup) whkVar.a);
        try {
            ovu ovuVar = this.m;
            ovuVar.gj(1, ovuVar.gh());
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7168)).u("Error notifying onSearchStart");
        }
    }

    private final void B() throws Resources.NotFoundException {
        ((ype) a.l().ai(7188)).R("showSearchBoxInternal %b %b %b", Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u));
        if (this.s && this.t && !this.u) {
            this.e.c(1);
        }
    }

    private final void C(boolean z) throws Resources.NotFoundException {
        onh onhVar = new onh(this, 7);
        CarRestrictedEditText carRestrictedEditText = this.f;
        carRestrictedEditText.setOnClickListener(onhVar);
        carRestrictedEditText.setOnEditorActionListener(new lbf(this, 3, null));
        lbe lbeVar = new lbe(this, 2);
        this.v = lbeVar;
        carRestrictedEditText.addTextChangedListener(lbeVar);
        carRestrictedEditText.requestFocus();
        StatusBarView statusBarView = this.e;
        statusBarView.a();
        statusBarView.c(2);
        qgc qgcVar = this.d;
        if (z) {
            qgcVar.a();
        } else {
            qgcVar.b();
        }
    }

    private final void z() {
        wer.f(this.p);
        ViewGroup viewGroup = this.o;
        viewGroup.removeAllViews();
        this.h = new qgj(this);
        qgy qgyVar = new qgy(this.c, this.h, this.d);
        this.g = qgyVar;
        viewGroup.addView(qgyVar);
        this.g.c.d();
    }

    @Override // defpackage.ovw
    public final void a() {
        ((ype) a.l().ai((char) 7161)).u("disableSearchBox");
        this.s = false;
        if (this.i) {
            return;
        }
        this.f.setText("");
        i();
    }

    @Override // defpackage.ovw
    public final void b(CharSequence charSequence) {
        ((ype) a.l().ai((char) 7184)).y("setSearchHint %s", charSequence);
        this.f.setHint(charSequence == null ? null : charSequence.toString());
    }

    @Override // defpackage.ovw
    public final void c(List list) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 7185)).y("setSearchItems %s", list);
        if (!this.i) {
            ((ype) ((ype) yphVar.h()).ai((char) 7186)).u("setSearchItems called when search is inactive!");
            return;
        }
        if (this.k) {
            this.k = false;
            qgy qgyVar = this.g;
            qgyVar.a.setVisibility(0);
            qgyVar.b.setVisibility(8);
            this.g.c.d();
        }
        if (this.j) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SearchItem searchItem = (SearchItem) it.next();
                if (searchItem.a == 0) {
                    arrayList.add(searchItem);
                }
            }
            list = arrayList;
        }
        this.h.c(list);
    }

    @Override // defpackage.ovw
    public final void d() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7187)).u("enableSearchBox");
        this.s = true;
        if (this.i) {
            return;
        }
        B();
    }

    @Override // defpackage.ovw
    public final void f(String str) {
        CarRestrictedEditText carRestrictedEditText = this.f;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        carRestrictedEditText.setText(str);
        carRestrictedEditText.setSelection(carRestrictedEditText.getText().length());
        r(zIsEmpty);
        k(carRestrictedEditText.getText().toString());
    }

    @Override // defpackage.qgx, defpackage.ovw
    public final void g() {
        if (this.i) {
            this.i = false;
            this.j = false;
            StatusBarView statusBarView = this.e;
            statusBarView.b();
            statusBarView.e();
            if (this.s && this.t) {
                B();
            } else {
                i();
            }
            CarRestrictedEditText carRestrictedEditText = this.f;
            carRestrictedEditText.removeTextChangedListener(this.v);
            this.v = null;
            carRestrictedEditText.setText("");
            wer.e(this.p);
            this.g = null;
            this.r.setVisibility(8);
            this.o.requestApplyInsets();
            this.d.b();
            ((ype) a.l().ai((char) 7169)).u("notifySearchStop");
            whk whkVar = this.n;
            CarUiEntry carUiEntry = (CarUiEntry) whkVar.c;
            carUiEntry.setOverrideStatusBarForSearch(false, (ViewGroup) whkVar.a);
            if (carUiEntry.menuController.v()) {
                ((ImageView) whkVar.b).setVisibility(0);
            } else {
                ((ImageView) whkVar.b).setVisibility(8);
            }
            try {
                ovu ovuVar = this.m;
                ovuVar.gj(2, ovuVar.gh());
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7170)).u("Error notifying onSearchStop");
            }
        }
    }

    @Override // defpackage.ovw
    public final void h(ovu ovuVar) {
        ((ype) a.l().ai((char) 7183)).y("setSearchCallback %s", ovuVar);
        this.m = ovuVar;
    }

    public final void i() {
        ((ype) a.l().ai(7162)).R("hideSearchBoxInternal %b %b %b", Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u));
        this.e.c(0);
    }

    public final void j(String str) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 7171)).y("notifySearchSubmitted %s", str);
        if (this.i) {
            this.g.c.a(new qfa((Object) this, (Object) str, 4, (byte[]) null));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 7172)).u("notifySearchSubmitted called when search is inactive!");
        }
    }

    public final void k(String str) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 7173)).y("notifySearchTextChanged %s", str);
        if (!this.i) {
            ((ype) ((ype) yphVar.h()).ai((char) 7175)).u("notifySearchTextChanged called when search is inactive!");
            return;
        }
        try {
            ovu ovuVar = this.m;
            Parcel parcelGh = ovuVar.gh();
            parcelGh.writeString(str);
            ovuVar.gj(3, parcelGh);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7174)).u("Error notifying onSearchTextChanged");
        }
    }

    @Override // defpackage.qgx
    public final void l() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7177)).u("onDrawerClosing");
        this.u = false;
        B();
    }

    @Override // defpackage.qgx
    public final void m() {
        ((ype) a.l().ai((char) 7178)).u("onDrawerOpening");
        this.u = true;
        i();
    }

    @Override // defpackage.qgx
    public final void n(Bundle bundle) throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7180)).y("onRestoreInstanceState %s", bundle);
        this.i = bundle.getBoolean("com.google.android.gearhead.appdecor.SearchController.IS_SEARCH_ACTIVATED", false);
        this.j = bundle.getBoolean("com.google.android.gearhead.appdecor.SearchController.IS_SEARCH_SUBMITTED", false);
        if (this.i) {
            if (this.m == null) {
                throw new IllegalStateException("No SearchCallback was set");
            }
            this.r.setVisibility(0);
            z();
            if (this.j) {
                this.l = bundle.getString("com.google.android.gearhead.appdecor.SearchController.SEARCH_TERM");
                A();
                j(this.l);
            } else {
                CarRestrictedEditText carRestrictedEditText = this.f;
                carRestrictedEditText.setSelection(carRestrictedEditText.getText().length());
                C(true);
                A();
                k(carRestrictedEditText.getText().toString());
            }
        }
    }

    @Override // defpackage.qgx
    public final void o(Bundle bundle) {
        bundle.putBoolean("com.google.android.gearhead.appdecor.SearchController.IS_SEARCH_ACTIVATED", this.i);
        bundle.putBoolean("com.google.android.gearhead.appdecor.SearchController.IS_SEARCH_SUBMITTED", this.j);
        if (this.j) {
            bundle.putString("com.google.android.gearhead.appdecor.SearchController.SEARCH_TERM", this.l);
        }
        ((ype) a.l().ai((char) 7181)).y("onSaveInstanceState %s", bundle);
    }

    @Override // defpackage.qgx
    public final void p(boolean z) throws Resources.NotFoundException {
        ((ype) ((ype) a.f()).ai((char) 7182)).y("setInputAllowed %b", Boolean.valueOf(z));
        this.t = z;
        if (this.i) {
            return;
        }
        if (z) {
            B();
        } else {
            i();
        }
    }

    @Override // defpackage.qgx
    public final void q() {
        r(true);
    }

    public final void r(boolean z) {
        if (this.i) {
            ((ype) ((ype) a.h()).ai((char) 7189)).u("startSearch called when search is already active!");
            return;
        }
        this.i = true;
        this.j = false;
        this.r.setVisibility(0);
        z();
        C(z);
        A();
    }

    @Override // defpackage.qgx
    public final boolean s() {
        return this.r.hasFocus();
    }

    @Override // defpackage.qgx
    public final boolean t() {
        return this.i;
    }

    @Override // defpackage.qgx
    public final boolean u() {
        return this.s;
    }

    @Override // defpackage.qgx
    public final boolean v() {
        return this.r.requestFocus();
    }

    @Override // defpackage.qgx
    public final boolean w() {
        return this.q.requestFocus();
    }

    @Override // defpackage.qgx
    public final boolean x(int i) {
        ((ype) a.l().ai((char) 7179)).w("onKeyUp %d", i);
        if (i != 19) {
            return false;
        }
        CarRestrictedEditText carRestrictedEditText = this.f;
        if (carRestrictedEditText.isFocused()) {
            return false;
        }
        carRestrictedEditText.requestFocus();
        this.d.a();
        return true;
    }

    @Override // defpackage.qgx
    public final void y() {
        qgj qgjVar = this.h;
        owu owuVarI = this.g.a.i();
        ((ype) a.l().ai((char) 7160)).y("recreateViewHolders %s", owuVarI);
        qgjVar.a = true;
        qgjVar.g();
        szp.u(new qfa(qgjVar, owuVarI, 6));
    }
}
