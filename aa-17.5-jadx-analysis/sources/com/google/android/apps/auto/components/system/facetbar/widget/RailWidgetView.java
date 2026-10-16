package com.google.android.apps.auto.components.system.facetbar.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.projection.gearhead.R;
import defpackage.czd;
import defpackage.jda;
import defpackage.krr;
import defpackage.ksa;
import defpackage.kwi;
import defpackage.leh;
import defpackage.mgw;
import defpackage.mhr;
import defpackage.nmp;
import defpackage.nmu;
import defpackage.nnk;
import defpackage.nnl;
import defpackage.nqw;
import defpackage.nsr;
import defpackage.ohe;
import defpackage.olo;
import defpackage.spu;
import defpackage.wtw;
import defpackage.wtz;
import defpackage.wue;
import defpackage.wug;
import defpackage.wuh;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.ype;
import defpackage.yph;
import j$.time.Duration;

/* loaded from: classes2.dex */
public class RailWidgetView extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final Drawable C;
    private final Drawable D;
    private final Transition E;
    private boolean F;
    private Drawable G;
    private View H;
    private final ohe I;
    private final ohe J;
    private final ohe K;
    public final View e;
    public boolean f;
    public boolean g;
    public boolean h;
    public nnl i;
    private final ViewGroup m;
    private final ViewGroup n;
    private final ImageView o;
    private final ImageView p;
    private final View q;
    private final TextView r;
    private final TextView s;
    private final ColorStateList t;
    private final int u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private final Drawable z;
    private static final yph j = yph.c("GH.RailWidgetView");
    public static final Duration a = Duration.ofMillis(83);
    public static final Duration b = Duration.ofMillis(300);
    public static final Duration c = Duration.ofMillis(100);
    public static final Duration d = Duration.ofMillis(450);
    private static final olo k = new olo(0.48f, BitmapDescriptorFactory.HUE_RED, 0.48f, 0.99f);
    private static final olo l = new olo(0.18f, 0.89f, 0.32f, 1.28f);

    public RailWidgetView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.F = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nmu.a, i, 0);
        this.f = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        boolean zJ = nsr.c().b().J();
        Object systemService = getContext().getSystemService("layout_inflater");
        systemService.getClass();
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) systemService).inflate(zJ ? R.layout.sys_ui_coolwalk_rail_widget_right : R.layout.sys_ui_coolwalk_rail_widget, this);
        if (zJ) {
            this.m = (ViewGroup) viewGroup.findViewById(R.id.widget_action_container);
        } else {
            this.m = viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.rail_widget_root);
        this.n = viewGroup2;
        this.o = (ImageView) viewGroup2.findViewById(R.id.large_icon);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.badge);
        this.p = imageView;
        this.q = viewGroup2.findViewById(R.id.icon_ripple_container);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.first_line_text);
        this.r = textView;
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.second_line_text);
        this.s = textView2;
        View viewFindViewById = viewGroup2.findViewById(R.id.content_text_container);
        ohe oheVar = new ohe((CoolwalkButton) viewGroup2.findViewById(R.id.left_action), viewGroup2.findViewById(R.id.left_action_container));
        this.I = oheVar;
        ohe oheVar2 = new ohe((CoolwalkButton) viewGroup2.findViewById(R.id.center_action), viewGroup2.findViewById(R.id.center_action_container));
        this.J = oheVar2;
        ohe oheVar3 = new ohe((CoolwalkButton) viewGroup2.findViewById(R.id.right_action), viewGroup2.findViewById(R.id.right_action_container));
        this.K = oheVar3;
        MaterialButton materialButton = (MaterialButton) oheVar.a;
        this.t = materialButton.g;
        ColorStateList colorStateListE = materialButton.e();
        colorStateListE.getClass();
        this.u = colorStateListE.getDefaultColor();
        View viewFindViewById2 = viewGroup2.findViewById(R.id.actions_start_margin);
        this.w = viewFindViewById2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.actions_start_center_margin);
        this.y = viewFindViewById3;
        View viewFindViewById4 = viewGroup2.findViewById(R.id.actions_end_center_margin);
        this.x = viewFindViewById4;
        View viewFindViewById5 = viewGroup2.findViewById(R.id.actions_end_margin);
        this.v = viewFindViewById5;
        View viewFindViewById6 = viewGroup2.findViewById(R.id.background_pill);
        this.e = viewFindViewById6;
        Drawable drawableG = g(false, false);
        this.z = drawableG;
        this.B = g(false, true);
        this.A = g(true, false);
        Context context2 = getContext();
        wue wueVarI = i(drawableG);
        wueVarI.getClass();
        context2.getClass();
        wuk wukVarFD = wueVarI.fD();
        wukVarFD.getClass();
        viewFindViewById6.setForeground(new kwi(context2, wukVarFD, null, null, null, null));
        Transition transitionInflateTransition = TransitionInflater.from(viewGroup2.getContext()).inflateTransition(R.transition.coolwalk_rail_widget);
        this.E = transitionInflateTransition;
        transitionInflateTransition.excludeTarget(czd.class, true);
        Drawable drawable = getContext().getDrawable(R.drawable.gearhead_rail_icon_focus_background);
        drawable.getClass();
        this.C = drawable;
        Drawable drawable2 = getContext().getDrawable(R.drawable.rail_widget_icon_rounded_square_ripple);
        drawable2.getClass();
        this.D = drawable2;
        if (this.f) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            viewFindViewById.setVisibility(8);
            viewFindViewById5.setVisibility(8);
            viewFindViewById4.setVisibility(8);
            viewFindViewById3.setVisibility(8);
            viewFindViewById2.setVisibility(8);
            oheVar.e(8);
            oheVar2.e(8);
            oheVar3.e(8);
            imageView.setVisibility(8);
        }
    }

    private final Drawable g(boolean z, boolean z2) throws Resources.NotFoundException {
        Drawable rippleDrawable;
        Context context = getContext();
        wue wueVarG = wue.G(context, context.getResources().getDimension(R.dimen.coolwalk_rail_widget_elevation), null);
        ColorStateList colorStateListAM = spu.aM(context, R.attr.colorSurface);
        if (colorStateListAM != null) {
            wueVarG.O(colorStateListAM);
        }
        wtz wugVar = z ? new wug(0.5f) : new wtw(context.getResources().getDimension(R.dimen.coolwalk_rail_ongoing_widget_corner_radius));
        wuj wujVar = new wuj();
        wujVar.k(new wuh());
        wujVar.f(wugVar);
        wueVarG.d(new wuk(wujVar));
        if (z2) {
            Context context2 = getContext();
            leh.a();
            rippleDrawable = new RippleDrawable(context2.getColorStateList(R.color.rail_widget_pill_ripple_selector_gm3), wueVarG, wueVarG);
        } else {
            rippleDrawable = wueVarG;
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.coolwalk_rail_widget_background_pill_inset);
        return new InsetDrawable(rippleDrawable, 0, dimensionPixelOffset, 0, dimensionPixelOffset);
    }

    private static Drawable h(Context context, GhIcon ghIcon, int i) {
        if (ghIcon == null) {
            return null;
        }
        return ghIcon.f(context, i);
    }

    private static wue i(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof wue) {
            return (wue) drawable;
        }
        if ((drawable instanceof DrawableWrapper) && (drawable2 = ((DrawableWrapper) drawable).getDrawable()) != null) {
            return i(drawable2);
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            wue wueVarI = i(layerDrawable.getDrawable(i));
            if (wueVarI != null) {
                return wueVarI;
            }
        }
        return null;
    }

    private final void j(GhIcon ghIcon, ImageView imageView, int i) {
        imageView.setImageDrawable(h(getContext(), ghIcon, getContext().getResources().getDimensionPixelSize(i)));
    }

    private final void k(nnl nnlVar) {
        l(false);
        GhIcon ghIcon = nnlVar.d;
        if (ghIcon != null) {
            ImageView imageView = this.p;
            imageView.setVisibility(0);
            j(ghIcon, imageView, R.dimen.coolwalk_rail_widget_badge_size);
            if (nnlVar.f) {
                l(true);
            }
            nnk nnkVar = nnlVar.c;
            if (nnkVar != null) {
                j(nnkVar.a, this.o, R.dimen.rail_widget_large_icon_size);
                return;
            }
            return;
        }
        nnk nnkVar2 = nnlVar.c;
        ImageView imageView2 = this.p;
        if (nnkVar2 == null) {
            imageView2.setVisibility(8);
            return;
        }
        j(nnkVar2.a, imageView2, R.dimen.rail_widget_large_icon_size);
        this.q.setOnClickListener(new nmp(nnlVar, 7));
        if (imageView2.getVisibility() == 8) {
            imageView2.setVisibility(0);
            imageView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            imageView2.animate().alpha(1.0f);
        }
    }

    private final void l(boolean z) {
        ShapeableImageView shapeableImageView = (ShapeableImageView) this.o;
        shapeableImageView.d(shapeableImageView.c.c(z ? getContext().getResources().getDimension(R.dimen.rail_widget_primary_icon_circular_radius) : getContext().getResources().getDimension(R.dimen.coolwalk_rail_widget_primary_icon_card_radius)));
    }

    private final void m(nnl nnlVar) throws Resources.NotFoundException {
        Context context = getContext();
        this.G = h(context, this.f ? GhIcon.j(nnlVar.r) : nnlVar.b.a, context.getResources().getDimensionPixelSize(R.dimen.rail_widget_primary_icon_width));
        this.q.setOnClickListener(new nmp(nnlVar, 6));
        if (this.g) {
            return;
        }
        if (!nnlVar.e || this.h) {
            f(nnlVar.g && !this.f);
        } else {
            this.g = true;
            a(0.85f, 0.75f, a, new AccelerateInterpolator(), new mgw(this, nnlVar, 12));
        }
    }

    private static final ColorStateList n(krr krrVar, Context context) {
        return ColorStateList.valueOf(krrVar.b(context, ksa.d().c()));
    }

    private final void o(ohe oheVar, nnk nnkVar, boolean z, boolean z2) {
        Object obj = oheVar.a;
        if (!z || nnkVar == null) {
            oheVar.e(8);
            ((CoolwalkButton) obj).setOnClickListener(null);
            return;
        }
        CoolwalkButton coolwalkButton = (CoolwalkButton) obj;
        coolwalkButton.setOnClickListener(new nmp(nnkVar, 4));
        if (coolwalkButton.getVisibility() == 0 && z2) {
            coolwalkButton.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(67L).withEndAction(new jda((Object) this, obj, (Object) nnkVar, 19, (char[]) null));
        } else {
            d(getContext(), (MaterialButton) obj, nnkVar);
            oheVar.e(0);
        }
    }

    public final void a(float f, float f2, Duration duration, TimeInterpolator timeInterpolator, Runnable runnable) {
        this.o.animate().scaleX(f).scaleY(f).alpha(f2).setDuration(duration.toMillis()).setInterpolator(timeInterpolator).withEndAction(runnable).start();
    }

    public final void b(nnl nnlVar) {
        if (this.h) {
            ((ype) j.l().ai((char) 5297)).y("Setting %s as pending due to current animation", nnlVar);
            this.i = nnlVar;
            return;
        }
        if (nnlVar == nnl.a) {
            yph yphVar = j;
            ((ype) yphVar.l().ai((char) 5296)).u("hiding");
            if (this.f) {
                this.g = true;
                this.F = true;
                a(0.5f, BitmapDescriptorFactory.HUE_RED, b, k, new nqw(this, 1));
                return;
            }
            ((ype) yphVar.l().ai((char) 5299)).u("Running rail widget exit animation");
            this.h = true;
            TransitionManager.beginDelayedTransition(this.m, this.E);
            c();
            this.r.setVisibility(8);
            this.s.setVisibility(8);
            this.q.animate().alpha(BitmapDescriptorFactory.HUE_RED).scaleY(0.5f).scaleX(0.5f).setInterpolator(k).setDuration(b.toMillis()).setStartDelay(c.toMillis()).withStartAction(new mhr(this, 19)).withEndAction(new mhr(this, 20)).start();
            return;
        }
        if (this.f && this.F) {
            this.F = false;
            this.g = true;
            this.o.setAlpha(BitmapDescriptorFactory.HUE_RED);
            setVisibility(0);
            a(1.0f, 1.0f, d, l, new mgw(this, nnlVar, 13));
            return;
        }
        if (getVisibility() != 4) {
            e(nnlVar);
            return;
        }
        ((ype) j.l().ai((char) 5298)).u("Running rail widget enter animation");
        this.h = true;
        ViewGroup viewGroup = this.n;
        viewGroup.setAlpha(BitmapDescriptorFactory.HUE_RED);
        c();
        k(nnlVar);
        m(nnlVar);
        View view = this.e;
        view.setVisibility(0);
        setVisibility(0);
        this.q.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(l).setDuration(d.toMillis()).withEndAction(new mhr(this, 18)).start();
        viewGroup.animate().alpha(1.0f).setDuration(150L).start();
        view.setAlpha(1.0f);
        e(nnlVar);
    }

    public final void c() {
        this.v.setVisibility(8);
        this.x.setVisibility(8);
        this.y.setVisibility(8);
        this.w.setVisibility(8);
        this.I.e(8);
        this.J.e(8);
        this.K.e(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r4, com.google.android.material.button.MaterialButton r5, defpackage.nnk r6) {
        /*
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131168221(0x7f070bdd, float:1.7950738E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.Context r1 = r5.getContext()
            com.google.android.apps.auto.components.graphics.icon.GhIcon r2 = r6.a
            android.graphics.drawable.Drawable r0 = h(r1, r2, r0)
            if (r2 == 0) goto L29
            boolean r1 = r2.t()
            if (r1 == 0) goto L29
            android.content.Context r3 = r5.getContext()
            android.content.res.ColorStateList r3 = r2.d(r3)
            r5.k(r3)
            goto L83
        L29:
            int r6 = r6.c
            int r6 = r6 + (-1)
            if (r6 == 0) goto L79
            r1 = 1
            if (r6 == r1) goto L6a
            r1 = 2
            if (r6 == r1) goto L5b
            r1 = 3
            if (r6 == r1) goto L46
            r4 = 5
            if (r6 == r4) goto L79
            android.content.res.ColorStateList r4 = r3.t
            r5.k(r4)
            int r3 = r3.u
            r5.setBackgroundColor(r3)
            goto L83
        L46:
            r3 = 2130969016(0x7f0401b8, float:1.7546702E38)
            android.content.res.ColorStateList r3 = defpackage.spu.aM(r4, r3)
            r5.k(r3)
            r3 = 2130968975(0x7f04018f, float:1.7546619E38)
            int r3 = defpackage.spu.aL(r4, r3)
            r5.setBackgroundColor(r3)
            goto L83
        L5b:
            krr r6 = defpackage.krr.E
            android.content.res.ColorStateList r4 = n(r6, r4)
            r5.k(r4)
            int r3 = r3.u
            r5.setBackgroundColor(r3)
            goto L83
        L6a:
            krr r6 = defpackage.krr.I
            android.content.res.ColorStateList r4 = n(r6, r4)
            r5.k(r4)
            int r3 = r3.u
            r5.setBackgroundColor(r3)
            goto L83
        L79:
            android.content.res.ColorStateList r4 = r3.t
            r5.k(r4)
            int r3 = r3.u
            r5.setBackgroundColor(r3)
        L83:
            r5.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView.d(android.content.Context, com.google.android.material.button.MaterialButton, nnk):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.nnl r18) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView.e(nnl):void");
    }

    public final void f(boolean z) {
        ImageView imageView = this.o;
        imageView.setImageDrawable(this.G);
        imageView.setColorFilter(z ? spu.aL(getContext(), android.R.attr.textColorPrimary) : 0);
    }

    public RailWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RailWidgetView(Context context) {
        this(context, null);
    }
}
