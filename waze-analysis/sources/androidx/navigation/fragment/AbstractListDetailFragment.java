package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.ar;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.NavHostFragment;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class AbstractListDetailFragment extends ar {
    private NavHostFragment _detailPaneNavHostFragment;
    private int graphId;
    private OnBackPressedCallback onBackPressedCallback;

    /* compiled from: WazeSource */
    final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {
        private final SlidingPaneLayout slidingPaneLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(SlidingPaneLayout slidingPaneLayout) {
            super(true);
            x.f(slidingPaneLayout, "slidingPaneLayout");
            this.slidingPaneLayout = slidingPaneLayout;
            slidingPaneLayout.addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.slidingPaneLayout.closePane();
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

    public final NavHostFragment getDetailPaneNavHostFragment() {
        NavHostFragment navHostFragment = this._detailPaneNavHostFragment;
        if (navHostFragment != null) {
            return navHostFragment;
        }
        throw new IllegalStateException("Fragment " + this + " was called before onCreateView().");
    }

    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    public NavHostFragment onCreateDetailPaneNavHostFragment() {
        int i2 = this.graphId;
        return i2 != 0 ? NavHostFragment.Companion.create$default(NavHostFragment.Companion, i2, null, 2, null) : new NavHostFragment();
    }

    public abstract View onCreateListPaneView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NavHostFragment navHostFragmentOnCreateDetailPaneNavHostFragment;
        x.f(layoutInflater, "inflater");
        if (bundle != null) {
            this.graphId = bundle.getInt(NavHostFragment.KEY_GRAPH_ID);
        }
        final SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(com.waze.R.id.sliding_pane_layout);
        View viewOnCreateListPaneView = onCreateListPaneView(layoutInflater, slidingPaneLayout, bundle);
        if (!x.n(viewOnCreateListPaneView, slidingPaneLayout) && !x.n(viewOnCreateListPaneView.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(viewOnCreateListPaneView);
        }
        Context context = layoutInflater.getContext();
        x.e(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(com.waze.R.id.sliding_pane_detail_container);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(layoutInflater.getContext().getResources().getDimensionPixelSize(com.waze.R.dimen.sliding_pane_detail_pane_width), -1);
        layoutParams.weight = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        ar arVarG = getChildFragmentManager().g(com.waze.R.id.sliding_pane_detail_container);
        if (arVarG != null) {
            navHostFragmentOnCreateDetailPaneNavHostFragment = (NavHostFragment) arVarG;
        } else {
            navHostFragmentOnCreateDetailPaneNavHostFragment = onCreateDetailPaneNavHostFragment();
            bv childFragmentManager = getChildFragmentManager();
            x.e(childFragmentManager, "getChildFragmentManager(...)");
            ch chVarU = childFragmentManager.u();
            x.e(chVarU, "beginTransaction()");
            chVarU.A();
            chVarU.q(com.waze.R.id.sliding_pane_detail_container, navHostFragmentOnCreateDetailPaneNavHostFragment);
            chVarU.a();
        }
        this._detailPaneNavHostFragment = navHostFragmentOnCreateDetailPaneNavHostFragment;
        this.onBackPressedCallback = new InnerOnBackPressedCallback(slidingPaneLayout);
        SlidingPaneLayout slidingPaneLayout2 = slidingPaneLayout;
        if (!ViewCompat.isLaidOut(slidingPaneLayout2) || slidingPaneLayout2.isLayoutRequested()) {
            slidingPaneLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.navigation.fragment.AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    x.f(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback = this.this$0.onBackPressedCallback;
                    x.c(onBackPressedCallback);
                    boolean z = false;
                    if (slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen()) {
                        z = true;
                    }
                    onBackPressedCallback.setEnabled(z);
                }
            });
        } else {
            OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            x.c(onBackPressedCallback);
            boolean z = false;
            if (slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen()) {
                z = true;
            }
            onBackPressedCallback.setEnabled(z);
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
        x.c(onBackPressedCallback2);
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback2);
        return slidingPaneLayout2;
    }

    @Override // android.support.v4.app.ar
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        x.f(context, "context");
        x.f(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.navigation.R.styleable.NavHost);
        x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void onListPaneViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public void m47x22bc4f96(Bundle bundle) {
        x.f(bundle, "outState");
        int i2 = this.graphId;
        if (i2 != 0) {
            bundle.putInt(NavHostFragment.KEY_GRAPH_ID, i2);
        }
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        x.f(view, "view");
        View childAt = getSlidingPaneLayout().getChildAt(0);
        x.c(childAt);
        onListPaneViewCreated(childAt, bundle);
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onViewStateRestored */
    public void m53lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        super.m53lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        x.c(onBackPressedCallback);
        boolean z = false;
        if (getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen()) {
            z = true;
        }
        onBackPressedCallback.setEnabled(z);
    }
}
