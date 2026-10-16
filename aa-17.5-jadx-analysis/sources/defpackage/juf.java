package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.TemplateWrapper;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;
import com.google.android.apps.auto.components.apphost.telecom.dialpad.MaterialStandardDialpadView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialTitleHeaderView;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.apps.auto.components.ui.appbar.AppBarImpl;
import com.google.android.apps.auto.components.ui.listview.UnListView;
import com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class juf extends Fragment implements oho {
    public static final /* synthetic */ int m = 0;
    private static final yph n = yph.c("CarApp.H.Comms");
    public onc b;
    public boolean c;
    jug d;
    olw e;
    ViewGroup f;
    MaterialTitleHeaderView g;
    public FrameLayout h;
    public LinearLayout i;
    ViewGroup j;
    public final juk k;
    public geu l;
    private jzq o;
    private String p;
    private final boolean q;
    private hlo r;
    public final ohp a = new ohp();
    private final ajmd s = new ajmd(this);

    public juf() {
        leh.a();
        this.q = true;
        this.k = new juk();
    }

    private static final krz i() {
        return (krz) ksa.d().e.e();
    }

    public final List a() {
        String str = this.p;
        return str != null ? ebf.A().j(new ymp(str)) : ebf.A().i();
    }

    public final void b() {
        jug jugVar = this.d;
        int i = jugVar.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            f();
            return;
        }
        if (i2 == 2) {
            e();
            return;
        }
        if (i2 != 3) {
            g(true);
            return;
        }
        ofe ofeVar = jugVar.b;
        if (ofeVar == null) {
            this.h.removeAllViews();
        } else {
            h(ofeVar);
        }
    }

    public final void c() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        List listA = a();
        if (listA.isEmpty()) {
            return;
        }
        PhoneCall phoneCall = (PhoneCall) listA.get(0);
        String string = getString(R.string.phone_app_name);
        olv olvVar = new olv(null, mkn.b);
        if (!phoneCall.b()) {
            ComponentName componentName = phoneCall.f;
            olvVar = new olv(null, componentName);
            string = (String) Objects.requireNonNullElse(mcd.A().i(context.getPackageManager(), componentName.getPackageName()), "");
        }
        if (!this.q) {
            olw olwVar = this.e;
            uie uieVar = new uie();
            uieVar.b = string;
            uieVar.c = olvVar;
            olwVar.a(uieVar.i());
            return;
        }
        MaterialTitleHeaderView materialTitleHeaderView = this.g;
        geu geuVar = this.l;
        CarText carTextCreate = CarText.create(string);
        sw swVar = new sw();
        Resources resources = context.getResources();
        lfs lfsVarE = lfs.e(context);
        ComponentName componentName2 = olvVar.b;
        componentName2.getClass();
        swVar.c(new CarIcon(new tj(IconCompat.k(new BitmapDrawable(resources, lfsVarE.c(context, componentName2, -1)).getBitmap()))));
        materialTitleHeaderView.a(geuVar, carTextCreate, swVar.a(), null);
    }

    public final void d(String str) {
        this.p = str;
        this.a.W(new ymp(str));
    }

    @Override // defpackage.oho
    public final void e() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        ((ype) ((ype) n.f()).ai((char) 2766)).u("showAudioRouteSelection");
        int i = 8;
        if (this.q) {
            MaterialTitleHeaderView materialTitleHeaderView = this.g;
            geu geuVar = this.l;
            CarText carTextCreate = CarText.create(context.getString(R.string.audio_route_title));
            sw swVar = new sw();
            tj tjVar = new tj(IconCompat.m(context, R.drawable.gs_arrow_back_vd_theme_24));
            tjVar.a(CarColor.createCustom(spu.aL(context, R.attr.colorOnSurfaceVariant), spu.aL(context, R.attr.colorOnSurfaceVariant)));
            swVar.c(new CarIcon(tjVar));
            swVar.d(new gec(this, i));
            materialTitleHeaderView.b(geuVar, carTextCreate, swVar.a(), null, false, i());
        } else {
            se seVarA = olu.a();
            seVarA.a = olv.a();
            seVarA.b = new ie(this, 9, null);
            olu oluVarA = seVarA.a();
            olw olwVar = this.e;
            uie uieVar = new uie();
            uieVar.b = context.getString(R.string.audio_route_title);
            uieVar.a = oluVarA;
            olwVar.a(uieVar.i());
        }
        this.i.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setDescendantFocusability(131072);
        this.i.requestFocus();
        this.h.setDescendantFocusability(393216);
        if (leh.a().b()) {
            this.d.c = 3;
        }
    }

    @Override // defpackage.oho
    public final void f() {
        String str;
        Context context = getContext();
        if (context == null) {
            return;
        }
        DialpadTemplate dialpadTemplateA = new gjr().a();
        this.j.removeAllViews();
        hlo hloVarA = hlq.a.a(this.l, TemplateWrapper.wrap(dialpadTemplateA));
        hloVarA.getClass();
        this.r = hloVarA;
        hloVarA.F();
        boolean z = this.q;
        byte[] bArr = null;
        if (!z) {
            affa.d("headerContainer");
            throw null;
        }
        kab kabVar = (kab) hloVarA;
        kabVar.f();
        MaterialStandardDialpadView materialStandardDialpadView = kabVar.a;
        this.o = materialStandardDialpadView;
        materialStandardDialpadView.c(a());
        hloVarA.c();
        hloVarA.B();
        this.j.addView(hloVarA.e());
        int i = 8;
        if (z) {
            MaterialTitleHeaderView materialTitleHeaderView = this.g;
            geu geuVar = this.l;
            sw swVar = new sw();
            tj tjVar = new tj(IconCompat.m(context, R.drawable.gs_arrow_back_vd_theme_24));
            tjVar.a(CarColor.createCustom(spu.aL(context, R.attr.colorOnSurfaceVariant), spu.aL(context, R.attr.colorOnSurfaceVariant)));
            swVar.c(new CarIcon(tjVar));
            swVar.b(CarColor.createCustom(0, 0));
            swVar.d(new gec(this, 7));
            materialTitleHeaderView.b(geuVar, null, swVar.a(), null, false, i());
        } else {
            olv olvVarA = olv.a();
            se seVarA = olu.a();
            seVarA.a = olvVarA;
            seVarA.b = new ie(this, i, bArr);
            olu oluVarA = seVarA.a();
            olw olwVar = this.e;
            uie uieVar = new uie();
            uieVar.a = oluVarA;
            olwVar.a(uieVar.i());
        }
        if (leh.a().b() && (str = this.d.a) != null) {
            this.o.d(str);
        }
        this.j.setVisibility(0);
        this.h.setVisibility(8);
        this.j.setDescendantFocusability(131072);
        this.j.requestFocus();
        this.h.setDescendantFocusability(393216);
        this.c = false;
        if (leh.a().b()) {
            this.d.c = 2;
        }
    }

    public final void g(boolean z) {
        ((ype) ((ype) n.f()).ai((char) 2767)).u("showInCallView");
        hlo hloVar = this.r;
        byte[] bArr = null;
        if (hloVar != null) {
            hloVar.A();
            this.r.n();
            this.r.b();
            this.r = null;
            ebf.j().F(odn.a().k(yzz.PHONE_DIALPAD, yzy.Z).l());
        }
        c();
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.i.setDescendantFocusability(393216);
        this.j.setDescendantFocusability(393216);
        this.h.setDescendantFocusability(131072);
        if (z) {
            this.h.setFocusable(true);
            this.h.post(new joo(this, 10, bArr));
        }
        this.c = true;
        if (leh.a().b()) {
            this.d.c = 1;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final Context getContext() {
        Context context = super.getContext();
        if (context == null) {
            return context;
        }
        if (this.q) {
            int i = jux.a;
            return jux.b(context, true);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_Gearhead_Coolwalk_Legacy);
        contextThemeWrapper.getTheme().applyStyle(R.style.Theme_Gearhead_Projected, false);
        return contextThemeWrapper;
    }

    public final void h(ofe ofeVar) {
        if (this.q) {
            ksa.d().e.fE(this, new jue(this, ofeVar, 2, null));
        } else {
            this.k.c(ofeVar);
        }
        if (leh.a().b()) {
            jug jugVar = this.d;
            jugVar.c = 4;
            jugVar.b = ofeVar;
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            String string = bundle.getString("extra_calling_package_name");
            this.p = string;
            if (string != null) {
                this.a.W(new ymp(string));
            } else {
                ((ype) ((ype) n.g()).ai((char) 2764)).u("There should always be an allowed package name for InCallViewFragment");
            }
        }
        if (leh.a().b()) {
            this.d = (jug) new ers(getViewModelStore(), ecw.f(this), ecw.g(this)).a(jug.class);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.cloneInContext(requireContext()).inflate(true != this.q ? R.layout.in_call_view_fragment : R.layout.material_in_call_view_fragment, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        if (leh.a().b()) {
            return;
        }
        c();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.putString("extra_calling_package_name", this.p);
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        ((ype) ((ype) ohp.a.f()).ai((char) 5918)).u("Enabling controller");
        ohp ohpVar = this.a;
        if (!ohpVar.c) {
            ohpVar.c = true;
            if (lgv.c().k()) {
                ebf.A().D(ohpVar.k);
            }
            ohpVar.f.d(ohpVar);
            ohpVar.X();
        }
        if (leh.a().b()) {
            b();
        } else {
            g(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        jzq jzqVar;
        super.onStop();
        ((ype) ohp.a.l().ai((char) 5916)).u("Disabling controller");
        ohp ohpVar = this.a;
        if (ohpVar.c) {
            ohpVar.c = false;
            if (lgv.c().k()) {
                ebf.A().E(ohpVar.k);
            }
            ond ondVar = new ond(ohpVar.g);
            ondVar.f(false);
            ohpVar.g = ondVar.a();
            ohpVar.V();
        }
        if (!leh.a().b() || this.d.c != 4) {
            juk jukVar = this.k;
            if (jukVar.e != null) {
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzy.aC).l());
            }
            jukVar.b();
        }
        if (!leh.a().b() || (jzqVar = this.o) == null) {
            return;
        }
        this.d.a = jzqVar.b();
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Context contextRequireContext = requireContext();
        this.h = (FrameLayout) view.findViewById(R.id.call_view_wrapper);
        LayoutInflater layoutInflaterCloneInContext = getLayoutInflater().cloneInContext(contextRequireContext);
        boolean z2 = this.q;
        int i = 1;
        layoutInflaterCloneInContext.inflate(true != z2 ? R.layout.un_call_view : R.layout.material_un_call_view, (ViewGroup) this.h, true);
        if (z2) {
            this.f = (ViewGroup) view.findViewById(R.id.header_container);
            this.g = (MaterialTitleHeaderView) view.findViewById(R.id.header_view);
            this.f.bringToFront();
        } else {
            olw olwVar = (olw) view.findViewById(R.id.app_bar);
            this.e = olwVar;
            ((AppBarImpl) olwVar).bringToFront();
        }
        onf onfVar = (onf) view.findViewById(R.id.call_view);
        ohp ohpVar = this.a;
        FrameLayout frameLayout = this.h;
        ohpVar.j = new ncp(contextRequireContext);
        ohpVar.b = contextRequireContext;
        ohpVar.f = onfVar;
        ohpVar.i = frameLayout;
        ohpVar.d = true;
        olm.a();
        new oll(contextRequireContext, new jzv(ohpVar, 7));
        ohpVar.V();
        int i2 = 0;
        this.h.setFocusable(false);
        this.j = (ViewGroup) view.findViewById(R.id.dialpad_view_wrapper);
        LayoutInflater.from(contextRequireContext).inflate(R.layout.cal_audio_route_view, (ViewGroup) view.findViewById(R.id.audio_route_selector_view_wrapper), true);
        this.i = (LinearLayout) view.findViewById(R.id.audio_route_selector_container);
        UnListView unListView = (UnListView) view.findViewById(R.id.audio_route_options_list);
        this.b = new onc(contextRequireContext, this.s);
        if (z2) {
            ksa.d().e.fE(getViewLifecycleOwner(), new jue(this, contextRequireContext, i2));
            z = true;
        } else {
            z = false;
        }
        unListView.a.f(this.b);
        this.c = false;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.phone_account_selector_view_wrapper);
        viewGroup.setVisibility(0);
        this.k.c = viewGroup;
        viewGroup.bringToFront();
        ((ype) ohp.a.l().ai((char) 5937)).y("setListener: %s", this);
        ohpVar.e = this;
        if (z) {
            MaterialUnCallView materialUnCallView = (MaterialUnCallView) onfVar;
            materialUnCallView.b.k = this.l;
            ksa.d().e.fE(getViewLifecycleOwner(), new lrb(this, materialUnCallView, contextRequireContext, i));
        }
    }
}
