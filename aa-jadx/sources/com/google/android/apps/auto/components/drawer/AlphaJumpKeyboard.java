package com.google.android.apps.auto.components.drawer;

/* JADX INFO: loaded from: classes2.dex */
public class AlphaJumpKeyboard extends android.widget.FrameLayout {
    private static final java.lang.Character g = '0';
    public androidx.gridlayout.widget.GridLayout a;
    public android.widget.ScrollView b;
    public final boolean c;
    final boolean d;
    public java.lang.Character e;
    public defpackage.ajnd f;
    private final java.util.List h;
    private final java.util.Set i;
    private final boolean j;
    private java.util.List k;
    private final android.view.View.OnClickListener l;

    public AlphaJumpKeyboard(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new java.util.ArrayList();
        this.i = new java.util.HashSet();
        this.l = new defpackage.ker(this, 8, null);
        boolean z = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.lbh.a, i, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.d = z2;
        this.j = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        if (integer != 1) {
            this.c = true;
            z = true;
        } else {
            this.c = false;
        }
        ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(true == z ? true != z2 ? com.google.android.projection.gearhead.R.layout.alpha_jump_fixed_keyboard : com.google.android.projection.gearhead.R.layout.alpha_jump_fixed_keyboard_deprecated : true != z2 ? com.google.android.projection.gearhead.R.layout.alpha_jump_scrollable_keyboard : com.google.android.projection.gearhead.R.layout.alpha_jump_scrollable_keyboard_deprecated, (android.view.ViewGroup) this, true);
    }

    public final void a(java.util.List list) {
        this.k = list;
        java.lang.Character ch = g;
        this.e = ch;
        for (int i = 0; i < this.a.getChildCount(); i++) {
            android.widget.Button button = (android.widget.Button) this.a.getChildAt(i);
            button.setVisibility(0);
            com.google.android.apps.auto.sdk.AlphaJumpKeyItem alphaJumpKeyItem = (com.google.android.apps.auto.sdk.AlphaJumpKeyItem) list.get(i);
            char c = alphaJumpKeyItem.a;
            ch.charValue();
            button.setText(c == '0' ? "123" : java.lang.String.valueOf(alphaJumpKeyItem.a));
            button.setEnabled(alphaJumpKeyItem.b);
            button.setFocusable(alphaJumpKeyItem.b);
            button.setOnClickListener(this.l);
        }
    }

    public final void b(boolean z) {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            java.util.List list = this.h;
            if (i >= list.size()) {
                return;
            }
            this.a.getChildAt(i).setEnabled(z && this.i.contains(list.get(i)));
        }
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.util.Log.v("GH.AlphaJumpKeyboard", "onConfigurationChanged");
        if (this.j) {
            setBackgroundColor(getContext().getColor(com.google.android.projection.gearhead.R.color.drawer_background));
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        boolean z = this.d;
        boolean z2 = this.c;
        int i = z ? true != z2 ? com.google.android.projection.gearhead.R.layout.alpha_jump_scrollable_keyboard_key_deprecated : com.google.android.projection.gearhead.R.layout.alpha_jump_fixed_keyboard_key_deprecated : true != z2 ? com.google.android.projection.gearhead.R.layout.alpha_jump_scrollable_keyboard_key : com.google.android.projection.gearhead.R.layout.alpha_jump_fixed_keyboard_key;
        int childCount = this.a.getChildCount();
        this.a.removeAllViews();
        for (int i2 = 0; i2 < childCount; i2++) {
            layoutInflaterFrom.inflate(i, (android.view.ViewGroup) this.a, true);
        }
        java.util.List list = this.k;
        if (list != null) {
            a(list);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list2 = this.h;
        arrayList.addAll(list2);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set set = this.i;
        hashSet.addAll(set);
        this.k = null;
        list2.clear();
        list2.addAll(arrayList);
        set.clear();
        set.addAll(hashSet);
        for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
            android.widget.Button button = (android.widget.Button) this.a.getChildAt(i3);
            if (i3 >= list2.size()) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                java.lang.Character ch = (java.lang.Character) list2.get(i3);
                if (g.equals(ch)) {
                    button.setText("123");
                } else {
                    button.setText(ch.toString());
                }
                button.setEnabled(set.contains(ch));
                button.setFocusable(set.contains(ch));
                button.setOnClickListener(this.l);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        android.util.Log.v("GH.AlphaJumpKeyboard", "onFinishInflate");
        if (!this.c) {
            this.b = (android.widget.ScrollView) findViewById(com.google.android.projection.gearhead.R.id.alpha_jump_keyboard_scroll_view);
        }
        this.a = (androidx.gridlayout.widget.GridLayout) findViewById(com.google.android.projection.gearhead.R.id.alpha_jump_keyboard_grid_layout);
    }

    public AlphaJumpKeyboard(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlphaJumpKeyboard(android.content.Context context) {
        this(context, null);
    }
}
