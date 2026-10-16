package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.HwrView;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;

/* loaded from: classes3.dex */
public final class xdv extends xdc {
    private static final yph l = yph.c("GH.RotaryInputFragment");
    public HwrView e;
    public RotaryKeyboardLayout f;
    public View g;
    public xqb h;
    public xdb i;
    public boolean j;
    xcs k;
    private boolean m;
    public final boolean d = ldz.a().b();
    private final ajmd n = new ajmd(this, null);

    public static final boolean l(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsetTop() == 0 && windowInsets.getSystemWindowInsetBottom() == 0 && windowInsets.getSystemWindowInsetLeft() == 0 && windowInsets.getSystemWindowInsetRight() == 0;
    }

    private final void m(View view, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.i.c);
        gradientDrawable.setCornerRadius(f);
        view.setBackground(gradientDrawable);
    }

    @Override // defpackage.xdc
    public final CarWindowLayoutParams a(CarRegionId carRegionId) {
        qsw qswVarO = nsr.c().b().o(carRegionId);
        qswVarO.getClass();
        qswVarO.d();
        qswVarO.l = true;
        qswVarO.b(R.anim.ime_slide_in);
        qswVarO.c(R.anim.ime_slide_out);
        return qswVarO.a();
    }

    @Override // defpackage.xdc
    protected final void c(boolean z) {
        xdw xdwVarB;
        xcs xcsVar = this.k;
        if (xcsVar == null || (xdwVarB = xcsVar.b()) == null || !xdwVarB.f(z)) {
            return;
        }
        this.k.d.invalidate();
    }

    @Override // defpackage.xdc
    public final void d() {
        ((ype) l.l().ai((char) 10147)).u("updateLockedState");
        boolean z = k() || !this.c;
        this.g.setVisibility(true == z ? 8 : 0);
        this.k.d.p = z;
        xda xdaVar = (xda) tec.a(this, xda.class);
        xdaVar.getClass();
        xdaVar.d(!z);
    }

    public final yzz f() {
        return k() ? yzz.KEYBOARD_ROTARY_PHONE : yzz.KEYBOARD_ROTARY;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g(boolean r14) {
        /*
            r13 = this;
            android.os.Bundle r0 = r13.getArguments()
            android.util.Size r1 = new android.util.Size
            r2 = 0
            r1.<init>(r2, r2)
            if (r0 == 0) goto L1d
            android.util.Size r1 = new android.util.Size
            java.lang.String r2 = "touchpad_width"
            int r2 = r0.getInt(r2)
            java.lang.String r3 = "touchpad_height"
            int r0 = r0.getInt(r3)
            r1.<init>(r2, r0)
        L1d:
            r8 = r1
            xcs r0 = r13.k
            wpq r1 = defpackage.wpq.c
            if (r1 != 0) goto L2b
            wpq r1 = new wpq
            r1.<init>()
            defpackage.wpq.c = r1
        L2b:
            android.content.Context r4 = r13.getContext()
            android.view.inputmethod.InputConnection r5 = r13.a
            com.google.android.projection.gearhead.input.RotaryKeyboardLayout r6 = r13.f
            com.google.android.projection.gearhead.input.HwrView r7 = r13.e
            android.view.inputmethod.EditorInfo r9 = r13.b
            ajmd r10 = r13.n
            boolean r11 = r13.m
            int r1 = r9.inputType
            r1 = r1 & 15
            r2 = 3
            if (r1 != r2) goto L49
            xcx r3 = new xcx
            r12 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L99
        L49:
            r12 = r14
            lgp r14 = defpackage.lgp.a()
            java.lang.String r14 = r14.c()
            ohs r1 = defpackage.ebf.j()
            r1.k(r14)
            int r1 = r14.hashCode()
            r2 = 3383(0xd37, float:4.74E-42)
            if (r1 == r2) goto L86
            r2 = 3428(0xd64, float:4.804E-42)
            if (r1 == r2) goto L78
            r2 = 3886(0xf2e, float:5.445E-42)
            if (r1 == r2) goto L6a
            goto L94
        L6a:
            java.lang.String r1 = "zh"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L94
            xdi r3 = new xdi
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L99
        L78:
            java.lang.String r1 = "ko"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L94
            xdg r3 = new xdg
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L99
        L86:
            java.lang.String r1 = "ja"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L94
            xde r3 = new xde
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L99
        L94:
            xdh r3 = new xdh
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L99:
            r13.k = r3
            if (r0 == 0) goto Lb5
            xdw r14 = r0.b()
            if (r14 == 0) goto Lab
            boolean r14 = r14.c()
            r13.c(r14)
            return
        Lab:
            boolean r14 = r0.i()
            if (r14 == 0) goto Lb5
            r14 = 1
            r13.c(r14)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdv.g(boolean):void");
    }

    public final void h(boolean z) {
        c(z);
        ((xda) tec.a(this, xda.class)).c(z);
    }

    public final void i(WindowInsets windowInsets, View view) {
        drn drnVar = (drn) view.getLayoutParams();
        if (this.d) {
            drnVar.topMargin = Math.max(0, windowInsets.getSystemWindowInsetTop() - 1);
            drnVar.bottomMargin = Math.max(0, windowInsets.getSystemWindowInsetBottom() - 1);
            drnVar.leftMargin = Math.max(0, windowInsets.getSystemWindowInsetLeft() - 1);
            drnVar.rightMargin = Math.max(0, windowInsets.getSystemWindowInsetRight() - 1);
        } else {
            drnVar.leftMargin = windowInsets.getSystemWindowInsetLeft();
            drnVar.rightMargin = windowInsets.getSystemWindowInsetRight();
        }
        view.setLayoutParams(drnVar);
    }

    public final void j(View view) throws Resources.NotFoundException {
        if (this.i == null) {
            return;
        }
        float dimension = view.getContext().getResources().getDimension(true != this.j ? R.dimen.coolwalk_ime_background_inset_radius_gm3 : R.dimen.coolwalk_ime_background_edge_to_edge_radius_gm3);
        m(this.g, dimension);
        View viewFindViewById = view.findViewById(R.id.use_phone_keyboard_label);
        if (viewFindViewById != null) {
            m(viewFindViewById, dimension);
        }
    }

    public final boolean k() {
        return this.k instanceof xcx;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.m = nrd.a().f();
        this.h = lau.a().h(getContext(), Looper.myLooper(), new wpq(null));
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        boolean z = this.d;
        final View viewInflate = layoutInflater.inflate(true != z ? R.layout.coolwalk_rotary_ime : R.layout.cielo_rotary_ime, viewGroup, false);
        this.f = (RotaryKeyboardLayout) viewInflate.findViewById(R.id.keyboard);
        this.e = (HwrView) viewInflate.findViewById(R.id.hwr_ime);
        this.g = viewInflate.findViewById(R.id.lockout);
        final View viewFindViewById = viewInflate.findViewById(R.id.close_keyboard_image);
        final Context context = viewInflate.getContext();
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(R.id.keyboard_layout);
            drn drnVar = (drn) constraintLayout.getLayoutParams();
            drnVar.G = true != nsr.c().b().J() ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            constraintLayout.setLayoutParams(drnVar);
        }
        final View viewFindViewById2 = viewInflate.findViewById(R.id.use_phone_keyboard_label);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.use_phone_keyboard_label_text);
        final TextView textView2 = (TextView) viewInflate.findViewById(R.id.lockout_label);
        if (!kfl.l()) {
            Typeface font = context.getResources().getFont(R.font.google_sans);
            if (!textView2.getTypeface().equals(font)) {
                textView2.setTypeface(context.getResources().getFont(R.font.google_sans));
            }
            if (!textView.getTypeface().equals(font)) {
                textView.setTypeface(context.getResources().getFont(R.font.google_sans));
            }
        }
        ksa.d().e.fE(this, new eqn() { // from class: xdt
            @Override // defpackage.eqn
            public final void eS(Object obj) throws Resources.NotFoundException {
                krz krzVar = (krz) obj;
                krr krrVar = krr.a;
                Context context2 = context;
                xdb xdbVar = new xdb(krrVar.b(context2, krzVar), krr.b.b(context2, krzVar), krr.q.b(context2, krzVar), krr.v.b(context2, krzVar), krr.w.b(context2, krzVar), krr.D.b(context2, krzVar), krr.m.b(context2, krzVar));
                xdv xdvVar = this.a;
                xdvVar.i = xdbVar;
                View view = viewInflate;
                if (xdvVar.d) {
                    xdvVar.j(view);
                } else {
                    View view2 = viewFindViewById2;
                    view.setBackgroundColor(xdvVar.i.c);
                    xdvVar.f.setBackgroundColor(xdvVar.i.c);
                    xdvVar.g.setBackgroundColor(xdvVar.i.c);
                    view2.setBackgroundColor(xdvVar.i.c);
                }
                View view3 = viewFindViewById;
                TextView textView3 = textView;
                textView2.setTextColor(xdvVar.i.e);
                textView3.setTextColor(xdvVar.i.e);
                ((ImageView) view3).setColorFilter(xdvVar.i.e);
                RotaryKeyboardLayout rotaryKeyboardLayout = xdvVar.f;
                rotaryKeyboardLayout.v = xdvVar.i;
                if (rotaryKeyboardLayout.v == null) {
                    ((ype) ((ype) RotaryKeyboardLayout.a.f()).ai((char) 10153)).u("Keyboard color tokens not set.");
                    return;
                }
                Resources resources = rotaryKeyboardLayout.getContext().getResources();
                Paint paint = rotaryKeyboardLayout.b;
                paint.setColor(rotaryKeyboardLayout.v.a);
                Paint paint2 = rotaryKeyboardLayout.c;
                paint2.setColor(rotaryKeyboardLayout.v.e);
                if (!kfl.l()) {
                    paint.setTypeface(resources.getFont(R.font.google_sans));
                    paint2.setTypeface(resources.getFont(R.font.google_sans));
                }
                Paint paint3 = rotaryKeyboardLayout.d;
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(rotaryKeyboardLayout.v.c);
                Paint paint4 = rotaryKeyboardLayout.e;
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.keyGroupCircleOutlineWidth));
                paint4.setColor(rotaryKeyboardLayout.v.g);
                int i = rotaryKeyboardLayout.v.a;
                Drawable background = rotaryKeyboardLayout.m.getBackground();
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setStroke(rotaryKeyboardLayout.getContext().getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_focused), i);
                }
                rotaryKeyboardLayout.c();
            }
        });
        viewInflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xdu
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws Resources.NotFoundException {
                xdv xdvVar = this.a;
                View view2 = viewInflate;
                boolean z2 = xdvVar.d;
                if (!z2) {
                    fgh.b((ViewGroup) view2, null);
                }
                Context context2 = context;
                xdvVar.j = xdv.l(windowInsets);
                if (z2) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.keyboard_layout);
                    xdvVar.i(windowInsets, constraintLayout2);
                    Drawable drawable = xdvVar.j ? context2.getDrawable(R.drawable.cielo_keyboard_shadow_edge_to_edge) : context2.getDrawable(R.drawable.cielo_keyboard_shadow_inset);
                    if (xdvVar.i != null) {
                        ((GradientDrawable) ((LayerDrawable) drawable).findDrawableByLayerId(R.id.background_layer)).setColor(xdvVar.i.c);
                    }
                    constraintLayout2.setBackground(drawable);
                    xdvVar.j(view2);
                } else {
                    View view3 = viewFindViewById;
                    xdvVar.i(windowInsets, xdvVar.e);
                    xdvVar.i(windowInsets, xdvVar.g);
                    xdvVar.i(windowInsets, view3);
                    xdvVar.i(windowInsets, xdvVar.f);
                    Drawable drawable2 = context2.getDrawable(true != xdv.l(windowInsets) ? R.drawable.coolwalk_projection_keyboard_background_inset_gm3 : R.drawable.coolwalk_projection_keyboard_background_edge_to_edge_gm3);
                    xdb xdbVar = xdvVar.i;
                    if (xdbVar != null) {
                        drawable2.setColorFilter(xdbVar.c, PorterDuff.Mode.SRC_IN);
                    }
                    xdvVar.f.setBackground(drawable2);
                }
                return windowInsets.consumeSystemWindowInsets();
            }
        });
        g(false);
        if (e() && this.k.k()) {
            h(true);
        }
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        HwrView hwrView = this.k.h;
        Handler handler = hwrView.d;
        handler.removeCallbacks(hwrView.l);
        handler.removeCallbacks(hwrView.k);
        hwrView.h = false;
    }

    @Override // defpackage.xdc, android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        this.h.c();
        ebf.j().o(f(), yzy.eA);
    }

    @Override // defpackage.xdc, android.support.v4.app.Fragment
    public final void onStop() {
        this.h.a();
        ebf.j().o(f(), yzy.eC);
        super.onStop();
    }
}
