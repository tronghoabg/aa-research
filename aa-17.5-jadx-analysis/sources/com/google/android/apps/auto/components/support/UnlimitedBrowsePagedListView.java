package com.google.android.apps.auto.components.support;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import defpackage.ca;
import defpackage.lt;
import defpackage.mol;
import defpackage.oxi;

/* loaded from: classes2.dex */
public class UnlimitedBrowsePagedListView extends PagedListView {
    private final ca a;

    public UnlimitedBrowsePagedListView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, 0);
        this.o.aa = this.a;
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView
    protected final boolean e() {
        return !this.g.Y();
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView
    public final void ft() {
        lt ltVar = this.q;
        if (ltVar == null) {
            Log.w("GH.UBPagedListView", "The adapter in updateMaxItems is null.");
            return;
        }
        int iA = ltVar.a();
        o();
        ((oxi) this.q).b(g());
        int iA2 = this.q.a();
        if (iA2 == iA) {
            return;
        }
        if (iA2 < iA) {
            this.q.l(iA2, iA - iA2);
        } else {
            this.q.g();
            l(h());
        }
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedListView
    protected final boolean fu() {
        return !this.g.X();
    }

    public UnlimitedBrowsePagedListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public UnlimitedBrowsePagedListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UnlimitedBrowsePagedListView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet, i, i2, i3);
        mol molVar = new mol(this);
        this.a = molVar;
        this.o.aa = molVar;
    }
}
