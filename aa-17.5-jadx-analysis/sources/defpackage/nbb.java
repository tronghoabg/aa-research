package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView;
import com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.PageIndicator;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class nbb extends Fragment implements mnd, mzi {
    public static final yph a = yph.c("GH.MediaFragment");
    public static final ArgbEvaluator b = new ArgbEvaluator();
    public static final Set c = woy.di(new Integer[]{6, 3});
    public aivh d;
    private final aezr e;
    private final aezr f;
    private final aezr g;

    public nbb() {
        super(R.layout.frag_media_switcher);
        this.e = woy.dG(new hfr(esa.a, this, 12, null));
        this.f = woy.dG(new nav(this, 0));
        this.g = woy.dG(new nav(this, 1));
    }

    @Override // defpackage.mzi
    public final eqj a() {
        return d().d;
    }

    @Override // defpackage.mzi
    public final eqj b() {
        return d().b;
    }

    @Override // defpackage.mzi
    public final void c(int i) {
        d().f.m(Integer.valueOf(i));
    }

    public final nax d() {
        return (nax) this.e.a();
    }

    public final SlidingViewSwitcher e() {
        Object objA = this.f.a();
        objA.getClass();
        return (SlidingViewSwitcher) objA;
    }

    public final void f(naw nawVar, Fragment fragment) throws IllegalAccessException, InstantiationException {
        Class cls = nawVar.e;
        if (cls.isInstance(fragment)) {
            return;
        }
        a.l().y("Replace media player card content with %s", nawVar);
        bt childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        w wVar = new w(childFragmentManager);
        Object objNewInstance = cls.newInstance();
        objNewInstance.getClass();
        Fragment fragment2 = (Fragment) objNewInstance;
        tef tefVar = fragment instanceof tef ? (tef) fragment : null;
        Size size = tefVar != null ? tefVar.d : null;
        if (size != null && (fragment2 instanceof tef)) {
            tef tefVar2 = (tef) fragment2;
            if (tefVar2.getView() != null) {
                throw new IllegalStateException("Can't set specified size after View has been created.");
            }
            tefVar2.d = size;
        }
        wVar.q(R.id.media_player, fragment2, null);
        wVar.c();
    }

    public final zos g() {
        return (zos) this.g.a();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.getClass();
        Object objE = d().a.e();
        Objects.toString(objE);
        printWriter.println("Current Media state: ".concat(String.valueOf(objE)));
        eqa eqaVarE = getChildFragmentManager().e(R.id.media_player);
        mnd mndVar = eqaVarE instanceof mnd ? (mnd) eqaVarE : null;
        if (mndVar != null) {
            mndVar.h(printWriter);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        view.getClass();
        CoolwalkCardView coolwalkCardView = (CoolwalkCardView) view.findViewById(R.id.page_indicator_container);
        coolwalkCardView.setOnClickListener(new mli(this, 16));
        d().e.fE(getViewLifecycleOwner(), new med(new nar(coolwalkCardView, 0), 15));
        eqm eqmVar = d().g;
        Context context = view.getContext();
        int i = kwi.c;
        eqmVar.m(Integer.valueOf(context.getColor(R.color.gearhead_focus_blue)));
        d().i.fE(getViewLifecycleOwner(), new med(new nar(coolwalkCardView, 2), 15));
        Float f = (Float) d().c.e();
        float fFloatValue = f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
        PageIndicator pageIndicator = (PageIndicator) view.findViewById(R.id.page_indicator);
        int childCount = e().getChildCount();
        pageIndicator.setVisibility(childCount <= 1 ? 8 : 0);
        if (childCount != pageIndicator.getChildCount()) {
            if (pageIndicator.f) {
                ((ype) PageIndicator.a.h()).u("setNumPages during animation");
            }
            while (childCount < pageIndicator.getChildCount()) {
                pageIndicator.removeViewAt(pageIndicator.getChildCount() - 1);
            }
            while (childCount > pageIndicator.getChildCount()) {
                ImageView imageView = new ImageView(pageIndicator.getContext());
                imageView.setImageResource(R.drawable.minor_a_b);
                imageView.setImageTintList(pageIndicator.e);
                pageIndicator.addView(imageView, new ViewGroup.LayoutParams(pageIndicator.c, pageIndicator.d));
            }
            pageIndicator.a(pageIndicator.g >> 1);
            pageIndicator.requestLayout();
        }
        pageIndicator.b(fFloatValue);
        g().f(fFloatValue);
        e().h = new nas(pageIndicator, this);
        final FocusInterceptor focusInterceptor = (FocusInterceptor) view.findViewById(R.id.page_indicator_interceptor);
        e().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nat
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                nbb nbbVar = this.a;
                eqm eqmVar2 = nbbVar.d().b;
                boolean z = nbbVar.e().getHeight() < nbbVar.e().getResources().getDimensionPixelSize(R.dimen.dashboard_media_min_player_card_height_to_show_page_indicator);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolValueOf.getClass();
                FocusInterceptor focusInterceptor2 = focusInterceptor;
                if (z) {
                    focusInterceptor2.setNextFocusForwardId(-1);
                } else {
                    focusInterceptor2.setNextFocusForwardId(R.id.text_container_wrapper);
                }
                eqmVar2.m(boolValueOf);
            }
        });
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: nau
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                this.a.d().d.m(Boolean.valueOf(view.hasFocus()));
            }
        });
        eqy.a(d().a).fE(getViewLifecycleOwner(), new med(new nar(this, 3), 15));
        d().j.fE(getViewLifecycleOwner(), new med(new nar(this, 4), 15));
    }
}
