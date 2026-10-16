package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.ar;
import android.support.v4.app.az;
import android.support.v4.app.bm;
import android.support.v4.app.bq;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.preference.PreferenceFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class PreferenceHeaderFragmentCompat extends ar implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private OnBackPressedCallback onBackPressedCallback;

    /* compiled from: WazeSource */
    final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {
        private final PreferenceHeaderFragmentCompat caller;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
            super(true);
            x.f(preferenceHeaderFragmentCompat, "caller");
            this.caller = preferenceHeaderFragmentCompat;
            preferenceHeaderFragmentCompat.getSlidingPaneLayout().addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.caller.getSlidingPaneLayout().closePane();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(View view) {
            x.f(view, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(View view) {
            x.f(view, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(View view, float f2) {
            x.f(view, "panel");
        }
    }

    private final SlidingPaneLayout buildContentView(LayoutInflater layoutInflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(com.waze.R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(com.waze.R.id.preferences_header);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(com.waze.R.dimen.preferences_header_width), -1);
        layoutParams.weight = getResources().getInteger(com.waze.R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(com.waze.R.id.preferences_detail);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(com.waze.R.dimen.preferences_detail_width), -1);
        layoutParams2.weight = getResources().getInteger(com.waze.R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        return slidingPaneLayout;
    }

    static final void onViewCreated$lambda$1(PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
        OnBackPressedCallback onBackPressedCallback = preferenceHeaderFragmentCompat.onBackPressedCallback;
        x.c(onBackPressedCallback);
        onBackPressedCallback.setEnabled(preferenceHeaderFragmentCompat.getChildFragmentManager().b() == 0);
    }

    private final void openPreferenceHeader(Preference preference) {
        if (preference.getFragment() == null) {
            openPreferenceHeader(preference.getIntent());
            return;
        }
        String fragment = preference.getFragment();
        ar arVarA = fragment != null ? getChildFragmentManager().o().a(requireContext().getClassLoader(), fragment) : null;
        if (arVarA != null) {
            arVarA.setArguments(preference.getExtras());
        }
        if (getChildFragmentManager().b() > 0) {
            bm bmVarAX = getChildFragmentManager().aX();
            x.e(bmVarAX, "getBackStackEntryAt(...)");
            getChildFragmentManager().aZ(bmVarAX.c());
        }
        bv childFragmentManager = getChildFragmentManager();
        x.e(childFragmentManager, "getChildFragmentManager(...)");
        ch chVarU = childFragmentManager.u();
        x.e(chVarU, "beginTransaction()");
        chVarU.A();
        x.c(arVarA);
        chVarU.F(com.waze.R.id.preferences_detail, arVarA);
        if (getSlidingPaneLayout().isOpen()) {
            chVarU.B();
        }
        getSlidingPaneLayout().openPane();
        chVarU.a();
    }

    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // android.support.v4.app.ar
    public void onAttach(Context context) {
        x.f(context, "context");
        super.onAttach(context);
        bv parentFragmentManager = getParentFragmentManager();
        x.e(parentFragmentManager, "getParentFragmentManager(...)");
        ch chVarU = parentFragmentManager.u();
        x.e(chVarU, "beginTransaction()");
        chVarU.o(this);
        chVarU.a();
    }

    public ar onCreateInitialDetailFragment() {
        ar arVarG = getChildFragmentManager().g(com.waze.R.id.preferences_header);
        x.d(arVarG, "null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) arVarG;
        if (preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount() <= 0) {
            return null;
        }
        int preferenceCount = preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount();
        int i2 = 0;
        while (true) {
            if (i2 >= preferenceCount) {
                break;
            }
            Preference preference = preferenceFragmentCompat.getPreferenceScreen().getPreference(i2);
            x.e(preference, "getPreference(...)");
            if (preference.getFragment() == null) {
                i2++;
            } else {
                String fragment = preference.getFragment();
                arVarA = fragment != null ? getChildFragmentManager().o().a(requireContext().getClassLoader(), fragment) : null;
                if (arVarA != null) {
                    arVarA.setArguments(preference.getExtras());
                }
            }
        }
        return arVarA;
    }

    public abstract PreferenceFragmentCompat onCreatePreferenceHeader();

    @Override // android.support.v4.app.ar
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x.f(layoutInflater, "inflater");
        SlidingPaneLayout slidingPaneLayoutBuildContentView = buildContentView(layoutInflater);
        if (getChildFragmentManager().g(com.waze.R.id.preferences_header) == null) {
            PreferenceFragmentCompat preferenceFragmentCompatOnCreatePreferenceHeader = onCreatePreferenceHeader();
            bv childFragmentManager = getChildFragmentManager();
            x.e(childFragmentManager, "getChildFragmentManager(...)");
            ch chVarU = childFragmentManager.u();
            x.e(chVarU, "beginTransaction()");
            chVarU.A();
            chVarU.q(com.waze.R.id.preferences_header, preferenceFragmentCompatOnCreatePreferenceHeader);
            chVarU.a();
        }
        slidingPaneLayoutBuildContentView.setLockMode(3);
        return slidingPaneLayoutBuildContentView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    public boolean onPreferenceStartFragment(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference) {
        x.f(preferenceFragmentCompat, "caller");
        x.f(preference, "pref");
        if (preferenceFragmentCompat.getId() == com.waze.R.id.preferences_header) {
            openPreferenceHeader(preference);
            return true;
        }
        if (preferenceFragmentCompat.getId() != com.waze.R.id.preferences_detail) {
            return false;
        }
        az azVarO = getChildFragmentManager().o();
        ClassLoader classLoader = requireContext().getClassLoader();
        String fragment = preference.getFragment();
        x.c(fragment);
        ar arVarA = azVarO.a(classLoader, fragment);
        x.e(arVarA, "instantiate(...)");
        arVarA.setArguments(preference.getExtras());
        bv childFragmentManager = getChildFragmentManager();
        x.e(childFragmentManager, "getChildFragmentManager(...)");
        ch chVarU = childFragmentManager.u();
        x.e(chVarU, "beginTransaction()");
        chVarU.A();
        chVarU.F(com.waze.R.id.preferences_detail, arVarA);
        chVarU.B();
        chVarU.u(null);
        chVarU.a();
        return true;
    }

    @Override // android.support.v4.app.ar
    public void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        x.f(view, "view");
        this.onBackPressedCallback = new InnerOnBackPressedCallback(this);
        SlidingPaneLayout slidingPaneLayout = getSlidingPaneLayout();
        if (!ViewCompat.isLaidOut(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    x.f(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback = this.this$0.onBackPressedCallback;
                    x.c(onBackPressedCallback);
                    boolean z = false;
                    if (this.this$0.getSlidingPaneLayout().isSlideable() && this.this$0.getSlidingPaneLayout().isOpen()) {
                        z = true;
                    }
                    onBackPressedCallback.setEnabled(z);
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            x.c(onBackPressedCallback);
            boolean z = false;
            if (getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen()) {
                z = true;
            }
            onBackPressedCallback.setEnabled(z);
        }
        getChildFragmentManager().D(new bq() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$$ExternalSyntheticLambda0
            @Override // android.support.v4.app.bq
            public /* synthetic */ void onBackStackChangeCancelled() {
            }

            @Override // android.support.v4.app.bq
            public /* synthetic */ void onBackStackChangeCommitted(ar arVar, boolean z2) {
            }

            @Override // android.support.v4.app.bq
            public /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
            }

            @Override // android.support.v4.app.bq
            public /* synthetic */ void onBackStackChangeStarted(ar arVar, boolean z2) {
            }

            @Override // android.support.v4.app.bq
            public final void onBackStackChanged() {
                PreferenceHeaderFragmentCompat.onViewCreated$lambda$1(this.f$0);
            }
        });
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get(view);
        if (onBackPressedDispatcherOwner == null || (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
        x.c(onBackPressedCallback2);
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback2);
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onViewStateRestored */
    public void m53lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        ar arVarOnCreateInitialDetailFragment;
        super.m53lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        if (bundle != null || (arVarOnCreateInitialDetailFragment = onCreateInitialDetailFragment()) == null) {
            return;
        }
        bv childFragmentManager = getChildFragmentManager();
        x.e(childFragmentManager, "getChildFragmentManager(...)");
        ch chVarU = childFragmentManager.u();
        x.e(chVarU, "beginTransaction()");
        chVarU.A();
        chVarU.F(com.waze.R.id.preferences_detail, arVarOnCreateInitialDetailFragment);
        chVarU.a();
    }

    private final void openPreferenceHeader(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }
}
