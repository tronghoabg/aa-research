package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.widget.gc;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, p, af {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f723a = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private q f724b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        gc gcVarN = gc.n(context, attributeSet, f723a, i2, 0);
        if (gcVarN.s(0)) {
            setBackgroundDrawable(gcVarN.j(0));
        }
        if (gcVarN.s(1)) {
            setDivider(gcVarN.j(1));
        }
        gcVarN.q();
    }

    @Override // android.support.v7.view.menu.af
    public final void a(q qVar) {
        this.f724b = qVar;
    }

    @Override // android.support.v7.view.menu.p
    public final boolean b(t tVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f724b.F((t) getAdapter().getItem(i2), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
