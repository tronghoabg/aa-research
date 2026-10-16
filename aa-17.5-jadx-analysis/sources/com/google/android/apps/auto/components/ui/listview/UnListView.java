package com.google.android.apps.auto.components.ui.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.leh;
import defpackage.oww;

/* loaded from: classes2.dex */
public class UnListView extends FrameLayout {
    public GhListView a;
    private FrameLayout b;
    private AutoTunedRecyclerView c;

    public UnListView(Context context, AttributeSet attributeSet, int i, int i2) throws IllegalStateException {
        super(context, attributeSet, i, i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        setPadding(0, 0, 0, 0);
        leh.a();
        layoutInflaterFrom.inflate(R.layout.material_gh_list_view_tuned, this);
        GhListView ghListView = (GhListView) findViewById(R.id.gh_list_view);
        ghListView.k();
        ghListView.n(2);
        this.a = ghListView;
        this.b = (FrameLayout) findViewById(R.id.action_button_parent);
        this.c = (AutoTunedRecyclerView) findViewById(R.id.tuned_recycler_view);
        new oww(this.c).e(this.c);
    }

    @Override // android.view.View
    @ResultIgnorabilityUnspecified
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return this.a.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        int i2;
        if (!hasFocus()) {
            return false;
        }
        if (this.b.hasFocus()) {
            i2 = 22;
            if (i == 22) {
                View viewFocusSearch = this.b.findFocus().focusSearch(66);
                if (viewFocusSearch != null && viewFocusSearch.requestFocus(66)) {
                    return true;
                }
                i = i2;
            }
        } else if (this.b.getChildCount() > 0) {
            i2 = 21;
            if (i == 21) {
                if (this.b.requestFocus()) {
                    return true;
                }
                i = i2;
            }
        }
        return this.a.onKeyUp(i, keyEvent);
    }

    public UnListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public UnListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public UnListView(Context context) {
        this(context, null);
    }
}
