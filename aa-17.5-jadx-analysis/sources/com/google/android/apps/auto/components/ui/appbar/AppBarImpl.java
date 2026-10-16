package com.google.android.apps.auto.components.ui.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.ui.touch.TouchStealingFrameLayout;
import com.google.android.apps.auto.components.ui.widget.Button;
import com.google.android.projection.gearhead.R;
import defpackage.a$$ExternalSyntheticApiModelOutline3;
import defpackage.lpw;
import defpackage.mrw;
import defpackage.olt;
import defpackage.olu;
import defpackage.olv;
import defpackage.olw;
import defpackage.oly;
import defpackage.olz;
import defpackage.oma;
import defpackage.omb;
import defpackage.woy;
import defpackage.ycm;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yfu;
import defpackage.yfy;
import defpackage.ygp;
import defpackage.ygr;
import defpackage.yls;
import defpackage.yph;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.function.BiPredicate;

/* loaded from: classes2.dex */
public class AppBarImpl extends FrameLayout implements olw {
    public static final /* synthetic */ int r = 0;
    public final yfy a;
    final TouchStealingFrameLayout b;
    final View c;
    final ViewGroup d;
    public final ViewGroup e;
    final View f;
    final ImageView g;
    final TextView h;
    final View i;
    final View j;
    final ImageView k;
    final ViewGroup l;
    final yfq m;
    final ViewGroup n;
    final yfq o;
    public final ImageView p;
    final ValueAnimator q;
    private final yfq s;
    private final yfy t;
    private final yfy u;

    static {
        yph.c("GH.AppBar");
    }

    public AppBarImpl(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        super(context, attributeSet, i, i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i4 = 1;
        layoutInflaterFrom.inflate(R.layout.app_bar, (ViewGroup) this, true);
        TouchStealingFrameLayout touchStealingFrameLayout = (TouchStealingFrameLayout) findViewById(R.id.app_bar_container);
        this.b = touchStealingFrameLayout;
        int i5 = 0;
        touchStealingFrameLayout.a = false;
        this.c = findViewById(R.id.background_app_bar);
        this.d = (ViewGroup) findViewById(R.id.app_bar_inset);
        this.e = (ViewGroup) findViewById(R.id.widget_container);
        this.h = (TextView) findViewById(R.id.app_bar_title);
        View viewFindViewById = findViewById(R.id.header_icon_container);
        this.f = viewFindViewById;
        this.g = (ImageView) viewFindViewById.findViewById(R.id.header_icon_image);
        this.i = findViewById(R.id.header_button_frame);
        this.j = findViewById(R.id.header_button_tap_target);
        this.k = (ImageView) findViewById(R.id.header_button_image);
        this.p = (ImageView) findViewById(R.id.transition_view);
        this.l = (ViewGroup) findViewById(R.id.tab_strip);
        int i6 = yfq.d;
        yfl yflVar = new yfl(4);
        int i7 = 0;
        while (true) {
            i3 = 3;
            if (i7 >= 4) {
                break;
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.app_bar_tab, this.l, false);
            this.l.addView(viewInflate);
            yflVar.i(viewInflate);
            if (i7 < 3) {
                layoutInflaterFrom.inflate(R.layout.app_bar_tab_gap, this.l, true);
            }
            i7++;
        }
        this.m = yflVar.g();
        this.n = (ViewGroup) findViewById(R.id.auxiliary_buttons_strip);
        yfl yflVar2 = new yfl(4);
        int i8 = 0;
        while (true) {
            int i9 = 2;
            if (i8 >= 2) {
                this.o = yflVar2.g();
                this.q = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.app_bar_crossfade_animator);
                this.s = yfq.u(this.i, this.f, this.h, this.l, this.n);
                yfu yfuVar = new yfu(4);
                View view = this.i;
                omb ombVar = omb.a;
                yfuVar.e(view, ombVar);
                yfuVar.e(this.f, ombVar);
                yfuVar.e(this.l, ombVar);
                yfuVar.e(this.h, ombVar);
                yfuVar.e(this.n, omb.b);
                this.t = yfuVar.d(true);
                yfu yfuVar2 = new yfu(4);
                yfuVar2.e(this.i, new mrw(20));
                yfuVar2.e(this.f, new oly(i4));
                yfuVar2.e(this.l, new oly(i5));
                yfuVar2.e(this.h, new oly(i9));
                yfuVar2.e(this.n, new oly(i3));
                this.a = yfuVar2.d(true);
                yfu yfuVar3 = new yfu(4);
                yfuVar3.e(this.h, new olz());
                this.u = yfuVar3.d(true);
                return;
            }
            Button button = (Button) layoutInflaterFrom.inflate(R.layout.aux_button, this.n, false);
            this.n.addView(button);
            yflVar2.i(button);
            i8++;
        }
    }

    private final void f(olv olvVar, ImageView imageView, int i) {
        Integer num = olvVar.a;
        if (num != null) {
            num.intValue();
            imageView.setImageResource(R.drawable.ic_keyboard_arrow_down);
        } else {
            ComponentName componentName = olvVar.b;
            if (componentName == null) {
                throw new IllegalStateException("No image data present in IconModel.");
            }
            imageView.setImageDrawable(GhIcon.j(componentName).f(getContext(), i));
        }
    }

    @Override // defpackage.olw
    public final void a(olt oltVar) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator.isRunning()) {
            e(oltVar);
            return;
        }
        yfq yfqVarC = c();
        yfq yfqVarB = b(oltVar);
        ygr ygrVarD = d(yfqVarC, yfqVarB, oltVar);
        final ygr ygrVarD2 = d(yfqVarB, yfqVarC, oltVar);
        boolean zIsEmpty = ygrVarD.isEmpty();
        final boolean z = !zIsEmpty;
        boolean zIsEmpty2 = ygrVarD2.isEmpty();
        final boolean z2 = !zIsEmpty2;
        if (zIsEmpty2 && zIsEmpty) {
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            e(oltVar);
        } else {
            valueAnimator.removeAllListeners();
            valueAnimator.addListener(new oma(this, z, ygrVarD, oltVar));
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: olx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f = 1.0f - fFloatValue;
                    if (z) {
                        this.a.p.setAlpha(f);
                    }
                    if (z2) {
                        yno it = ygrVarD2.iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).setAlpha(fFloatValue);
                        }
                    }
                }
            });
            valueAnimator.start();
        }
    }

    final yfq b(olt oltVar) {
        Stream streamFilter = Collection.EL.stream(this.s).filter(new lpw(this, oltVar, 2));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    public final yfq c() {
        Stream streamFilter = Collection.EL.stream(this.s).filter(new mrw(18));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    final ygr d(yfq yfqVar, yfq yfqVar2, olt oltVar) {
        ygp ygpVar = new ygp();
        for (int i = 0; i < yfqVar.size(); i++) {
            View view = (View) yfqVar.get(i);
            int size = this.t.get(view) == omb.a ? i : yfqVar2.size() - (yfqVar.size() - i);
            if (size < 0 || size >= yfqVar2.size() || yfqVar2.get(size) != view) {
                ygpVar.c(view);
            } else {
                yfy yfyVar = this.u;
                if (yfyVar.containsKey(view)) {
                    BiPredicate biPredicateM38m = a$$ExternalSyntheticApiModelOutline3.m38m(yfyVar.get(view));
                    biPredicateM38m.getClass();
                    if (biPredicateM38m.test(view, oltVar)) {
                        ygpVar.c(view);
                    }
                }
            }
        }
        return ygpVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(olt oltVar) {
        int i;
        ygr ygrVarN = ygr.n(b(oltVar));
        yfq yfqVar = this.s;
        int i2 = ((yls) yfqVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            View view = (View) yfqVar.get(i3);
            if (ygrVarN.contains(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
        this.h.setText(woy.al(oltVar.b));
        olu oluVar = oltVar.c;
        if (oluVar != null) {
            this.j.setOnClickListener(oluVar.b);
            f(oluVar.a, this.k, getResources().getDimensionPixelSize(R.dimen.app_bar_header_button_size));
        }
        yfq yfqVar2 = oltVar.d;
        int i4 = 0;
        while (true) {
            i = ((yls) yfqVar2).c;
            if (i4 >= i) {
                break;
            }
            yfq yfqVar3 = this.o;
            if (i4 >= ((yls) yfqVar3).c) {
                break;
            }
            Button button = (Button) yfqVar3.get(i4);
            olu oluVar2 = (olu) yfqVar2.get(i4);
            Integer num = oluVar2.a.a;
            num.getClass();
            num.intValue();
            button.c(oluVar2.c);
            button.a(R.drawable.ic_keyboard_arrow_down);
            button.b(null);
            button.setOnClickListener(oluVar2.b);
            button.setVisibility(0);
            i4++;
        }
        while (true) {
            yfq yfqVar4 = this.o;
            if (i >= ((yls) yfqVar4).c) {
                break;
            }
            ((Button) yfqVar4.get(i)).setVisibility(8);
            i++;
        }
        olv olvVar = oltVar.a;
        if (olvVar != null) {
            f(olvVar, this.g, getResources().getDimensionPixelSize(R.dimen.app_bar_header_icon_size));
        }
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.c.getAlpha();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.b.isEnabled();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.d.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (!isEnabled()) {
            return false;
        }
        if (this.l.getVisibility() != 0) {
            ViewGroup viewGroup = this.n;
            return viewGroup.getVisibility() == 0 ? viewGroup.requestFocus(i, rect) : this.i.getVisibility() == 0 ? this.j.requestFocus(i, rect) : super.onRequestFocusInDescendants(i, rect);
        }
        Optional optionalFindFirst = Collection.EL.stream(this.m).filter(new mrw(19)).findFirst();
        woy.aa(optionalFindFirst.isPresent(), "getActiveTabSlot called when tabs were not set");
        return ((View) optionalFindFirst.get()).requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        this.c.setAlpha(f);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.c.setBackgroundColor(i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        TouchStealingFrameLayout touchStealingFrameLayout = this.b;
        touchStealingFrameLayout.setEnabled(z);
        touchStealingFrameLayout.setDescendantFocusability(true != z ? 393216 : 131072);
        touchStealingFrameLayout.a = !z;
    }

    public AppBarImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppBarImpl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AppBarImpl(Context context) {
        this(context, null);
    }
}
