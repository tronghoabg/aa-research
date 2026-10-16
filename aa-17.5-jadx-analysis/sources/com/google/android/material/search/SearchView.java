package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.auto.components.externalkeyboard.phone.PhoneKeyboardActivity;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.ca;
import defpackage.dsf;
import defpackage.dsg;
import defpackage.dth;
import defpackage.eaj;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.fu;
import defpackage.jzt;
import defpackage.lbd;
import defpackage.lbe;
import defpackage.mh;
import defpackage.nw;
import defpackage.oit;
import defpackage.qfv;
import defpackage.rbw;
import defpackage.sdo;
import defpackage.wil;
import defpackage.wkt;
import defpackage.woy;
import defpackage.woz;
import defpackage.wqa;
import defpackage.wqr;
import defpackage.wqs;
import defpackage.wqv;
import defpackage.wra;
import defpackage.wri;
import defpackage.wth;
import defpackage.wti;
import defpackage.wtu;
import defpackage.wub;
import defpackage.wue;
import defpackage.wxp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements dsf, wra {
    private final boolean A;
    private Map B;
    private final ViewTreeObserver.OnTouchModeChangeListener C;
    private int D;
    private final oit E;
    public final View a;
    public final ClippableRoundedCornerLayout b;
    public final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final TextView j;
    public final EditText k;
    public final ImageButton l;
    public final View m;
    public final TouchObserverFrameLayout n;
    public final Set o;
    public SearchBar p;
    public boolean q;
    public boolean r;
    private final boolean s;
    private final wtu t;
    private final boolean u;
    private final woz v;
    private int w;
    private boolean x;
    private final int y;
    private final boolean z;

    public SearchView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(wxp.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.E = new oit(this, this);
        this.o = new LinkedHashSet();
        this.w = 16;
        this.D = 2;
        this.C = new rbw(this, 2);
        Context context2 = getContext();
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wth.b, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.y = typedArrayA.getColor(11, 0);
        int resourceId = typedArrayA.getResourceId(18, -1);
        int resourceId2 = typedArrayA.getResourceId(0, -1);
        String string = typedArrayA.getString(3);
        String string2 = typedArrayA.getString(4);
        String string3 = typedArrayA.getString(26);
        boolean z = typedArrayA.getBoolean(29, false);
        this.q = typedArrayA.getBoolean(8, true);
        this.r = typedArrayA.getBoolean(7, true);
        boolean z2 = typedArrayA.getBoolean(19, false);
        this.x = typedArrayA.getBoolean(9, true);
        this.u = typedArrayA.getBoolean(10, true);
        boolean z3 = typedArrayA.getBoolean(16, true);
        this.z = z3;
        boolean z4 = typedArrayA.getBoolean(14, false);
        this.A = z4;
        typedArrayA.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.s = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.d = viewFindViewById;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.e = frameLayout;
        this.f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = materialToolbar;
        Toolbar toolbar = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.h = toolbar;
        TextView textView = (TextView) findViewById(R.id.open_search_view_dummy_text_view);
        this.j = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.i = textView2;
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.k = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.l = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.m = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.n = touchObserverFrameLayout;
        this.t = new wtu(context2, this, z4);
        this.v = new woz(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new qfv(5));
        m();
        if (resourceId != -1) {
            frameLayout.addView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
        textView2.setText(string3);
        textView2.setVisibility(true != TextUtils.isEmpty(string3) ? 0 : 8);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        editText.setOnFocusChangeListener(new wti(0));
        byte[] bArr = null;
        if (z2) {
            materialToolbar.p(null);
        } else {
            materialToolbar.q(new sdo(this, 18));
            if (z) {
                fu fuVar = new fu(getContext());
                fuVar.a(woy.m(this, R.attr.colorOnSurface));
                materialToolbar.p(fuVar);
            }
        }
        imageButton.setOnClickListener(new sdo(this, 19));
        editText.addTextChangedListener(new lbe(this, 4));
        viewFindViewById2.setVisibility(true != z3 ? 8 : 0);
        touchObserverFrameLayout.a = new jzt(this, 10, bArr);
        woy.I(materialToolbar, new wqv() { // from class: wtk
            @Override // defpackage.wqv
            public final void a(View view, ecy ecyVar, wqw wqwVar) {
                MaterialToolbar materialToolbar2 = this.a.g;
                boolean zJ = woy.J(materialToolbar2);
                int i2 = zJ ? wqwVar.c : wqwVar.a;
                int i3 = zJ ? wqwVar.a : wqwVar.c;
                dve dveVarF = ecyVar.f(647);
                materialToolbar2.setPadding(i2 + dveVarF.b, wqwVar.b, i3 + dveVarF.d, wqwVar.d);
            }
        });
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i2 = marginLayoutParams.leftMargin;
        final int i3 = marginLayoutParams.rightMargin;
        eaj eajVar = new eaj() { // from class: wtj
            @Override // defpackage.eaj
            public final ecy a(View view, ecy ecyVar) {
                dve dveVarF = ecyVar.f(647);
                int i4 = dveVarF.b;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2 + i4;
                marginLayoutParams2.rightMargin = i3 + dveVarF.d;
                return ecyVar;
            }
        };
        int[] iArr = ebm.a;
        ebe.e(viewFindViewById2, eajVar);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        g(identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0);
        ebe.e(viewFindViewById, new wkt(this, 2));
        materialToolbar.setTouchscreenBlocksFocus(false);
        if (z4) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) toolbar.getLayoutParams();
            layoutParams.gravity = 8388611;
            toolbar.setLayoutParams(layoutParams);
            toolbar.setVisibility(4);
            if (resourceId2 != -1) {
                textView.setTextAppearance(resourceId2);
            }
            textView.setText(string);
            textView.setHint(string2);
        }
    }

    private final void m() throws Resources.NotFoundException {
        float dimension;
        SearchBar searchBar = this.p;
        if (searchBar != null) {
            wue wueVar = searchBar.J;
            dimension = wueVar != null ? wueVar.v() : searchBar.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        n(dimension);
    }

    private final void n(float f) {
        View view;
        woz wozVar = this.v;
        if (wozVar == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(wozVar.a(this.y, f));
    }

    private final void o(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    o((ViewGroup) childAt, z);
                } else {
                    Map map = this.B;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.B.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private final void p() {
        ImageButton imageButtonB = wqs.b(this.g);
        if (imageButtonB == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableB = dth.b(imageButtonB.getDrawable());
        if (drawableB instanceof fu) {
            ((fu) drawableB).setProgress(i);
        }
        if (drawableB instanceof wqa) {
            ((wqa) drawableB).a(i);
        }
    }

    private final boolean q() {
        int i = this.D;
        if (i != 0) {
            return i == 2 || i == 1;
        }
        throw null;
    }

    private final void r(int i) {
        if (this.p == null || !this.u) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            this.E.c();
        } else if (i == 2) {
            this.E.b();
        }
    }

    private final void s(int i) {
        if (i == 4) {
            e(true);
        } else if (i == 2) {
            e(false);
        }
    }

    @Override // defpackage.wra
    public final void O() {
        if (q() || this.p == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        wtu wtuVar = this.t;
        wtuVar.o.f(wtuVar.q);
        AnimatorSet animatorSet = wtuVar.p;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        wtuVar.p = null;
    }

    @Override // defpackage.wra
    public final void Q() {
        if (q()) {
            return;
        }
        wtu wtuVar = this.t;
        wri wriVar = wtuVar.o;
        nw nwVarC = wriVar.c();
        if (Build.VERSION.SDK_INT < 34 || this.p == null || nwVarC == null) {
            c();
            return;
        }
        long totalDuration = wtuVar.h().getTotalDuration();
        AnimatorSet animatorSetE = wriVar.e(wtuVar.q);
        animatorSetE.setDuration(totalDuration);
        animatorSetE.start();
        wriVar.g();
        if (wtuVar.p != null) {
            wtuVar.s.f();
            wtuVar.p.resume();
        }
        wtuVar.p = null;
    }

    @Override // defpackage.wra
    public final void W(nw nwVar) {
        SearchBar searchBar;
        if (q() || (searchBar = this.p) == null) {
            return;
        }
        if (!this.A) {
            searchBar.H(this.k.getText().toString());
        }
        wtu wtuVar = this.t;
        SearchBar searchBar2 = wtuVar.q;
        wri wriVar = wtuVar.o;
        wriVar.e = nwVar;
        float f = nwVar.a;
        View view = wriVar.a;
        wriVar.g = woy.K(view);
        if (searchBar2 != null) {
            wriVar.h = woy.F(view, searchBar2);
        }
        wriVar.f = f;
    }

    @Override // defpackage.wra
    public final void Y(nw nwVar) {
        if (q() || this.p == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        wtu wtuVar = this.t;
        float f = nwVar.b;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            wri wriVar = wtuVar.o;
            SearchBar searchBar = wtuVar.q;
            wriVar.h(nwVar, searchBar, searchBar.C());
            AnimatorSet animatorSet = wtuVar.p;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
                return;
            }
            SearchView searchView = wtuVar.a;
            if (searchView.j()) {
                wtuVar.j.clearFocus();
            }
            if (searchView.q) {
                wtuVar.p = wtuVar.e(false);
                wtuVar.p.start();
                wtuVar.p.pause();
            }
        }
    }

    @Override // defpackage.dsf
    public final dsg a() {
        return new Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.s) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public final Editable b() {
        return this.k.getText();
    }

    public final void c() {
        int i = this.D;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 1) {
            return;
        }
        SearchBar searchBar = this.p;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.t.h();
            return;
        }
        if (!this.A) {
            this.p.H(this.k.getText().toString());
        }
        SearchBar searchBar2 = this.p;
        wtu wtuVar = this.t;
        wtuVar.getClass();
        searchBar2.post(new wil(wtuVar, 8));
    }

    public final void d() {
        if (this.x) {
            this.k.postDelayed(new wil(this, 9), 100L);
        } else {
            if (isInTouchMode()) {
                return;
            }
            this.k.postDelayed(new wil(this, 11), 100L);
        }
    }

    public final void e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.B = new HashMap(viewGroup.getChildCount());
        }
        o(viewGroup, z);
        if (z) {
            return;
        }
        this.B = null;
    }

    public final void f(CharSequence charSequence) {
        this.k.setText(charSequence);
        this.j.setText(charSequence);
    }

    public final void g(int i) {
        View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public final void h(SearchBar searchBar) throws Resources.NotFoundException {
        this.p = searchBar;
        this.t.q = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new sdo(this, 20));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new wil(this, 10));
                    this.k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(dth.b(materialToolbar.e()) instanceof fu)) {
            if (this.p == null) {
                materialToolbar.p(ca.e(materialToolbar.getContext(), R.drawable.ic_arrow_back_black_24));
            } else {
                Drawable drawableMutate = ca.e(getContext(), R.drawable.ic_arrow_back_black_24).mutate();
                Integer num = materialToolbar.D;
                if (num != null) {
                    drawableMutate.setTint(num.intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.p(new wqa(this.p.e(), drawableMutate));
                p();
            }
        }
        m();
        r(this.D);
    }

    public final void i() {
        int i = this.D;
        if (i == 0) {
            throw null;
        }
        if (i == 4 || i == 3) {
            return;
        }
        wtu wtuVar = this.t;
        wtuVar.j();
        if (wtuVar.q == null) {
            SearchView searchView = wtuVar.a;
            if (searchView.j()) {
                searchView.postDelayed(new wil(searchView, 14), 150L);
            }
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = wtuVar.c;
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new wil(wtuVar, 15));
            return;
        }
        SearchView searchView2 = wtuVar.a;
        if (searchView2.j()) {
            searchView2.d();
        }
        searchView2.l(3, true);
        wtuVar.s.e();
        EditText editText = wtuVar.j;
        editText.setText(wtuVar.q.F());
        editText.setSelection(editText.getText().length());
        ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = wtuVar.c;
        clippableRoundedCornerLayout2.setVisibility(4);
        clippableRoundedCornerLayout2.post(new wil(wtuVar, 13));
    }

    public final boolean j() {
        return this.w == 48;
    }

    public final boolean k() {
        int i = this.D;
        if (i != 0) {
            return i == 4 || i == 3;
        }
        throw null;
    }

    public final void l(int i, boolean z) {
        PhoneKeyboardActivity phoneKeyboardActivity;
        lbd lbdVar;
        int i2 = this.D;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == i) {
            return;
        }
        if (z) {
            s(i);
        }
        this.D = i;
        Iterator it = new LinkedHashSet(this.o).iterator();
        while (it.hasNext()) {
            Object obj = ((ajmd) it.next()).a;
            if (i == 1) {
                ((PhoneKeyboardActivity) obj).s.I(b());
            } else if (i == 3 && (lbdVar = (phoneKeyboardActivity = (PhoneKeyboardActivity) obj).u) != null && !lbdVar.a().contentEquals(b())) {
                CharSequence charSequenceF = phoneKeyboardActivity.s.F();
                f(charSequenceF);
                phoneKeyboardActivity.r.setSelection(charSequenceF.length());
            }
        }
        r(i);
        SearchBar searchBar = this.p;
        if (searchBar == null || i != 2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wub.d(this);
        int i = this.D;
        s(i);
        r(i);
        getViewTreeObserver().addOnTouchModeChangeListener(this.C);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e(false);
        this.E.b();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.C);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            this.w = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        f(savedState.a);
        int i = savedState.b;
        boolean z = i == 0;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(i == 0 ? 0 : 8);
        p();
        l(z ? 4 : 2, z2 != z);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable editableB = b();
        savedState.a = editableB == null ? null : editableB.toString();
        savedState.b = this.b.getVisibility();
        return savedState;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        n(f);
    }

    public static class Behavior extends dsg<SearchView> {
        public Behavior() {
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            SearchView searchView = (SearchView) view;
            if (searchView.p == null && (view2 instanceof SearchBar)) {
                searchView.h((SearchBar) view2);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(9);
        String a;
        int b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readString();
            this.b = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
