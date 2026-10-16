package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.hf;
import defpackage.hg;
import defpackage.hi;
import defpackage.hu;
import defpackage.lah;

/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, hf, hu {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private hg b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        lah lahVarC = lah.C(context, attributeSet, a, i, 0);
        if (lahVarC.y(0)) {
            setBackgroundDrawable(lahVarC.s(0));
        }
        if (lahVarC.y(1)) {
            setDivider(lahVarC.s(1));
        }
        lahVarC.w();
    }

    @Override // defpackage.hu
    public final void a(hg hgVar) {
        this.b = hgVar;
    }

    @Override // defpackage.hf
    public final boolean b(hi hiVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((hi) getAdapter().getItem(i), null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
