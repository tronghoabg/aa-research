package com.google.android.apps.auto.components.drawer;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.apps.auto.sdk.AlphaJumpKeyItem;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.kep;
import defpackage.lbc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class AlphaJumpKeyboard extends FrameLayout {
    private static final Character g = '0';
    public GridLayout a;
    public ScrollView b;
    public final boolean c;
    final boolean d;
    public Character e;
    public ajmd f;
    private final List h;
    private final Set i;
    private final boolean j;
    private List k;
    private final View.OnClickListener l;

    public AlphaJumpKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList();
        this.i = new HashSet();
        this.l = new kep(this, 8, null);
        boolean z = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lbc.a, i, 0);
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
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(true == z ? true != z2 ? R.layout.alpha_jump_fixed_keyboard : R.layout.alpha_jump_fixed_keyboard_deprecated : true != z2 ? R.layout.alpha_jump_scrollable_keyboard : R.layout.alpha_jump_scrollable_keyboard_deprecated, (ViewGroup) this, true);
    }

    public final void a(List list) {
        this.k = list;
        Character ch = g;
        this.e = ch;
        for (int i = 0; i < this.a.getChildCount(); i++) {
            Button button = (Button) this.a.getChildAt(i);
            button.setVisibility(0);
            AlphaJumpKeyItem alphaJumpKeyItem = (AlphaJumpKeyItem) list.get(i);
            char c = alphaJumpKeyItem.a;
            ch.charValue();
            button.setText(c == '0' ? "123" : String.valueOf(alphaJumpKeyItem.a));
            button.setEnabled(alphaJumpKeyItem.b);
            button.setFocusable(alphaJumpKeyItem.b);
            button.setOnClickListener(this.l);
        }
    }

    public final void b(boolean z) {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            List list = this.h;
            if (i >= list.size()) {
                return;
            }
            this.a.getChildAt(i).setEnabled(z && this.i.contains(list.get(i)));
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.v("GH.AlphaJumpKeyboard", "onConfigurationChanged");
        if (this.j) {
            setBackgroundColor(getContext().getColor(R.color.drawer_background));
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        boolean z = this.d;
        boolean z2 = this.c;
        int i = z ? true != z2 ? R.layout.alpha_jump_scrollable_keyboard_key_deprecated : R.layout.alpha_jump_fixed_keyboard_key_deprecated : true != z2 ? R.layout.alpha_jump_scrollable_keyboard_key : R.layout.alpha_jump_fixed_keyboard_key;
        int childCount = this.a.getChildCount();
        this.a.removeAllViews();
        for (int i2 = 0; i2 < childCount; i2++) {
            layoutInflaterFrom.inflate(i, (ViewGroup) this.a, true);
        }
        List list = this.k;
        if (list != null) {
            a(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list2 = this.h;
        arrayList.addAll(list2);
        HashSet hashSet = new HashSet();
        Set set = this.i;
        hashSet.addAll(set);
        this.k = null;
        list2.clear();
        list2.addAll(arrayList);
        set.clear();
        set.addAll(hashSet);
        for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
            Button button = (Button) this.a.getChildAt(i3);
            if (i3 >= list2.size()) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                Character ch = (Character) list2.get(i3);
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
        Log.v("GH.AlphaJumpKeyboard", "onFinishInflate");
        if (!this.c) {
            this.b = (ScrollView) findViewById(R.id.alpha_jump_keyboard_scroll_view);
        }
        this.a = (GridLayout) findViewById(R.id.alpha_jump_keyboard_grid_layout);
    }

    public AlphaJumpKeyboard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlphaJumpKeyboard(Context context) {
        this(context, null);
    }
}
