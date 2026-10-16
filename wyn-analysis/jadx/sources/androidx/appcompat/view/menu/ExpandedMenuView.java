package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import md.J;
import p.j;
import p.k;
import p.m;
import p.z;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements j, z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17767b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public k f17768a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        J jS = J.s(context, attributeSet, f17767b, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(jS.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(jS.n(1));
        }
        jS.v();
    }

    @Override // p.j
    public final boolean a(m mVar) {
        return this.f17768a.q(mVar, null, 0);
    }

    @Override // p.z
    public final void d(k kVar) {
        this.f17768a = kVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j8) {
        a((m) getAdapter().getItem(i5));
    }
}
