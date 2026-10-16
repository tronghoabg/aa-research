package com.google.android.projection.gearhead.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.projection.gearhead.R;
import defpackage.ntb;
import defpackage.xes;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes3.dex */
public class KeyboardSearchLayout extends FrameLayout {
    public static final yph a = yph.c("GH.KeyboardSearchLayout");
    private xes b;
    private PagedListView c;

    public KeyboardSearchLayout(Context context) {
        super(context);
        inflate(getContext(), R.layout.keyboard_search_layout, this);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((ype) a.l().ai((char) 10172)).u("#onFinishInflate");
        this.c = (PagedListView) findViewById(R.id.list_view);
        xes xesVar = new xes(this);
        this.b = xesVar;
        this.c.c(xesVar);
        ((ImageView) findViewById(R.id.exit_button)).setOnClickListener(new ntb(6));
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            ((ype) a.l().ai((char) 10174)).u("#onSearchStart");
            throw new IllegalStateException("#setSearchController must be called before view is attached");
        }
        if (i != 8) {
            return;
        }
        ((ype) a.l().ai((char) 10173)).u("#onSearchStop");
        throw null;
    }

    public KeyboardSearchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.keyboard_search_layout, this);
    }
}
