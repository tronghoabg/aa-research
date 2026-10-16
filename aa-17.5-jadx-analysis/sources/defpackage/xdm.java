package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.ProjectionKeyboardLayout;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class xdm extends xdc {
    public xds d;
    public ProjectionKeyboardLayout e;
    public View f;
    public xdb g;
    public final boolean h = ldz.a().b();
    private final ykd i = new ykd(this, null);

    public static final boolean h(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsetTop() == 0 && windowInsets.getSystemWindowInsetBottom() == 0 && windowInsets.getSystemWindowInsetLeft() == 0 && windowInsets.getSystemWindowInsetRight() == 0;
    }

    public static final void i(WindowInsets windowInsets, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = Math.max(0, windowInsets.getSystemWindowInsetTop() - 1);
        marginLayoutParams.bottomMargin = Math.max(0, windowInsets.getSystemWindowInsetBottom() - 1);
        marginLayoutParams.leftMargin = Math.max(0, windowInsets.getSystemWindowInsetLeft() - 1);
        marginLayoutParams.rightMargin = Math.max(0, windowInsets.getSystemWindowInsetRight() - 1);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.xdc
    public final CarWindowLayoutParams a(CarRegionId carRegionId) {
        qsw qswVarO = nsr.c().b().o(carRegionId);
        qswVarO.getClass();
        qswVarO.b(R.anim.ime_slide_in);
        qswVarO.c(R.anim.ime_slide_out);
        qswVarO.d();
        qswVarO.l = true;
        mpl.a();
        if (nrd.a().f()) {
            qswVarO.m = 32;
        }
        return qswVarO.a();
    }

    @Override // defpackage.xdc
    protected final void c(boolean z) {
        this.e.c(z);
    }

    @Override // defpackage.xdc
    public final void d() {
        boolean z = this.c;
        this.d.d(!z);
        this.f.setVisibility(true != z ? 8 : 0);
        this.e.setVisibility(true != z ? 0 : 8);
        xda xdaVar = (xda) tec.a(this, xda.class);
        xdaVar.getClass();
        xdaVar.d(z);
    }

    public final xds f(Bundle bundle) {
        Bundle bundle2 = bundle;
        ygr ygrVar = xdr.a;
        boolean zF = nrd.a().f();
        boolean zE = nrd.a().e();
        boolean zD = nrd.a().d();
        Context context = getContext();
        InputConnection inputConnection = this.a;
        EditorInfo editorInfo = this.b;
        ProjectionKeyboardLayout projectionKeyboardLayout = this.e;
        String strC = lgp.a().c();
        Locale localeD = lgp.a().d();
        ebf.j().k(strC);
        if (bundle2 != null) {
            String string = bundle2.getString("keyboardLocale");
            if (string == null) {
                tss.q("GH.PrKeyboardFactory", "Locale should always be a part of the bundle if it's not null", new Object[0]);
            } else if (!string.equals(localeD.toLanguageTag())) {
                bundle2 = null;
            }
        }
        Bundle bundle3 = bundle2;
        boolean zContains = xdr.a.contains(strC) | zF;
        ykd ykdVar = this.i;
        String str = true != zContains ? "projection_keyboard_staggered_layout" : "projection_keyboard_layout";
        int iHashCode = strC.hashCode();
        if (iHashCode != 3383) {
            if (iHashCode != 3428) {
                if (iHashCode == 3886 && strC.equals("zh")) {
                    return new xdj(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, localeD, zF, zE, zD, bundle3);
                }
            } else if (strC.equals("ko")) {
                return new xdf(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, localeD, zF, zE, zD, bundle3, str);
            }
        } else if (strC.equals("ja")) {
            return new xdd(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, localeD, zF, zE, zD, bundle3);
        }
        return new xds(context, inputConnection, editorInfo, projectionKeyboardLayout, ykdVar, localeD, zF, zE, zD, false, 1, bundle3, str);
    }

    public final void g(boolean z) {
        c(z);
        ((xda) tec.a(this, xda.class)).c(z);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = this.h;
        final View viewInflate = layoutInflater.inflate(true != z ? R.layout.gm3_projection_input_keyboard : R.layout.cielo_touch_ime, viewGroup, false);
        this.e = (ProjectionKeyboardLayout) viewInflate.findViewById(R.id.keyboard);
        this.f = viewInflate.findViewById(R.id.lockout_label);
        this.d = f(bundle);
        final FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.keyboard_parent);
        final FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(R.id.keyboard_layout);
        final FrameLayout frameLayout3 = (FrameLayout) viewInflate.findViewById(R.id.use_phone_keyboard_overlay);
        final Context context = viewInflate.getContext();
        if (z) {
            drn drnVar = (drn) frameLayout2.getLayoutParams();
            drnVar.G = true != nsr.c().b().J() ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            frameLayout2.setLayoutParams(drnVar);
        }
        viewInflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xdk
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Drawable drawable;
                View view2 = viewInflate;
                xdm xdmVar = this.a;
                boolean z2 = xdmVar.h;
                if (!z2) {
                    fgh.b((ViewGroup) view2, null);
                }
                FrameLayout frameLayout4 = frameLayout;
                FrameLayout frameLayout5 = frameLayout2;
                if (z2) {
                    xdm.i(windowInsets, frameLayout5);
                } else {
                    xdm.i(windowInsets, frameLayout3);
                    xdm.i(windowInsets, frameLayout4);
                }
                Context context2 = context;
                Drawable drawable2 = xdm.h(windowInsets) ? context2.getDrawable(R.drawable.coolwalk_projection_keyboard_background_edge_to_edge_gm3) : context2.getDrawable(R.drawable.coolwalk_projection_keyboard_background_inset_gm3);
                if (xdm.h(windowInsets)) {
                    drawable = context2.getDrawable(z2 ? R.drawable.cielo_keyboard_shadow_edge_to_edge : R.drawable.gm3_keyboard_shadow_edge_to_edge);
                } else {
                    drawable = context2.getDrawable(z2 ? R.drawable.cielo_keyboard_shadow_inset : R.drawable.gm3_keyboard_shadow_inset);
                }
                xdb xdbVar = xdmVar.g;
                if (xdbVar != null) {
                    drawable2.setColorFilter(xdbVar.c, PorterDuff.Mode.SRC_IN);
                    ((GradientDrawable) ((LayerDrawable) drawable).findDrawableByLayerId(R.id.background_layer)).setColor(xdmVar.g.c);
                }
                frameLayout4.setBackground(drawable2);
                if (z2) {
                    frameLayout5.setBackground(drawable);
                    return windowInsets;
                }
                view2.findViewById(R.id.keyboard_layout).setBackground(drawable2);
                view2.findViewById(R.id.keyboard_shadow).setBackground(drawable);
                return windowInsets;
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(R.id.use_phone_keyboard_overlay_label);
        if (!kfl.l()) {
            textView.setTypeface(context.getResources().getFont(R.font.google_sans));
            ((TextView) this.f).setTypeface(context.getResources().getFont(R.font.google_sans));
        }
        ksa.d().e.fE(getViewLifecycleOwner(), new xdl(this, context, viewInflate, frameLayout, textView, 0));
        if (e()) {
            g(true);
        }
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        this.d.b(bundle);
    }

    @Override // defpackage.xdc, android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        ebf.j().o(yzz.KEYBOARD_PROJECTION, yzy.eA);
    }

    @Override // defpackage.xdc, android.support.v4.app.Fragment
    public final void onStop() {
        ebf.j().o(yzz.KEYBOARD_PROJECTION, yzy.eC);
        super.onStop();
    }
}
