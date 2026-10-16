package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fr extends ef implements ig {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    fq f;
    gl g;
    gk h;
    public int i;
    public boolean j;
    public boolean k;
    public gt l;
    boolean m;
    final ebu n;
    final ebu o;
    nk p;
    final ajmd q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public fr(Activity activity, boolean z) throws Resources.NotFoundException {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new fo(this);
        this.o = new fp(this);
        this.q = new ajmd(this, null);
        View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    private final void A() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    static boolean y(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void z(View view) throws Resources.NotFoundException {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.projection.gearhead.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((fr) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = ebm.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        }
        View viewFindViewById = view.findViewById(com.google.android.projection.gearhead.R.id.action_bar);
        if (!(viewFindViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) viewFindViewById).A();
        this.d = (ActionBarContextView) view.findViewById(com.google.android.projection.gearhead.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.projection.gearhead.R.id.action_bar_container);
        this.c = actionBarContainer;
        nk nkVar = this.p;
        if (nkVar == null || this.d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = nkVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        ca.z(context);
        A();
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, fs.a, com.google.android.projection.gearhead.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.c;
            int[] iArr2 = ebm.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.ef
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.ef
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.ef
    public final gl c(gk gkVar) {
        fq fqVar = this.f;
        if (fqVar != null) {
            fqVar.f();
        }
        this.b.k(false);
        this.d.i();
        fq fqVar2 = new fq(this, this.d.getContext(), gkVar);
        hg hgVar = fqVar2.a;
        hgVar.s();
        try {
            if (!fqVar2.b.c(fqVar2, hgVar)) {
                return null;
            }
            this.f = fqVar2;
            fqVar2.g();
            this.d.h(fqVar2);
            v(true);
            return fqVar2;
        } finally {
            fqVar2.a.r();
        }
    }

    @Override // defpackage.ef
    public final void d(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ee) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.ef
    public final void f(boolean z) {
        if (this.u) {
            return;
        }
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.ef
    public final void g(boolean z) {
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.ef
    public final void h(boolean z) {
        gt gtVar;
        this.z = z;
        if (z || (gtVar = this.l) == null) {
            return;
        }
        gtVar.a();
    }

    @Override // defpackage.ef
    public final void i(int i) {
        j(this.a.getString(i));
    }

    @Override // defpackage.ef
    public final void j(CharSequence charSequence) {
        this.p.g(charSequence);
    }

    @Override // defpackage.ef
    public final void k(CharSequence charSequence) {
        this.p.i(charSequence);
    }

    @Override // defpackage.ef
    public final boolean m() {
        nk nkVar = this.p;
        if (nkVar == null || !nkVar.j()) {
            return false;
        }
        nkVar.b();
        return true;
    }

    @Override // defpackage.ef
    public final boolean o(int i, KeyEvent keyEvent) {
        fq fqVar = this.f;
        if (fqVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        hg hgVar = fqVar.a;
        hgVar.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return hgVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ef
    public final void r() throws Resources.NotFoundException {
        ca.z(this.a);
        A();
    }

    @Override // defpackage.ef
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.ef
    public final void t() {
        w(0, 8);
    }

    @Override // defpackage.ef
    public final void u() {
        this.p.e(null);
    }

    public final void v(boolean z) {
        erb erbVarG;
        erb erbVarG2;
        boolean z2 = this.x;
        if (z) {
            if (!z2) {
                this.x = true;
                x(false);
            }
        } else if (z2) {
            this.x = false;
            x(false);
        }
        if (!this.c.isLaidOut()) {
            nk nkVar = this.p;
            if (z) {
                nkVar.h(4);
                this.d.setVisibility(0);
                return;
            } else {
                nkVar.h(0);
                this.d.setVisibility(8);
                return;
            }
        }
        nk nkVar2 = this.p;
        if (z) {
            erbVarG = nkVar2.n(4, 100L);
            erbVarG2 = this.d.g(0, 200L);
        } else {
            erb erbVarN = nkVar2.n(0, 200L);
            erbVarG = this.d.g(8, 100L);
            erbVarG2 = erbVarN;
        }
        gt gtVar = new gt();
        ArrayList arrayList = gtVar.a;
        arrayList.add(erbVarG);
        View view = (View) ((WeakReference) erbVarG.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) erbVarG2.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(erbVarG2);
        gtVar.b();
    }

    public final void w(int i, int i2) {
        nk nkVar = this.p;
        int i3 = nkVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        nkVar.d((i & i2) | ((~i2) & i3));
    }

    public final void x(boolean z) {
        View view;
        View view2;
        View view3;
        boolean zY = y(this.k, this.x);
        boolean z2 = this.y;
        if (!zY) {
            if (z2) {
                this.y = false;
                gt gtVar = this.l;
                if (gtVar != null) {
                    gtVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    gt gtVar2 = new gt();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    erb erbVarV = ebm.v(this.c);
                    erbVarV.x(f);
                    erbVarV.af(this.q);
                    gtVar2.f(erbVarV);
                    if (this.j && (view = this.e) != null) {
                        erb erbVarV2 = ebm.v(view);
                        erbVarV2.x(f);
                        gtVar2.f(erbVarV2);
                    }
                    gtVar2.d(r);
                    gtVar2.c();
                    gtVar2.e(this.n);
                    this.l = gtVar2;
                    gtVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.y = true;
        gt gtVar3 = this.l;
        if (gtVar3 != null) {
            gtVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            this.o.a();
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                }
                this.c.setAlpha(1.0f);
                this.c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                if (this.j) {
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
                this.o.a();
            }
            this.c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f2 = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f2 -= r6[1];
            }
            this.c.setTranslationY(f2);
            gt gtVar4 = new gt();
            erb erbVarV3 = ebm.v(this.c);
            erbVarV3.x(BitmapDescriptorFactory.HUE_RED);
            erbVarV3.af(this.q);
            gtVar4.f(erbVarV3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                erb erbVarV4 = ebm.v(this.e);
                erbVarV4.x(BitmapDescriptorFactory.HUE_RED);
                gtVar4.f(erbVarV4);
            }
            gtVar4.d(s);
            gtVar4.c();
            gtVar4.e(this.o);
            this.l = gtVar4;
            gtVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ebm.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public fr(Dialog dialog) throws Resources.NotFoundException {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new fo(this);
        this.o = new fp(this);
        this.q = new ajmd(this, null);
        z(dialog.getWindow().getDecorView());
    }
}
