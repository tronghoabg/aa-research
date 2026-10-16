package com.google.android.gearhead.appdecor;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import defpackage.woy;

/* loaded from: classes2.dex */
public class AppContentLayout extends FrameLayout {
    public ClassLoader a;

    public AppContentLayout(Context context) {
        this(context, null, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        woy.N(parcelable instanceof Bundle);
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(this.a);
        super.dispatchRestoreInstanceState(bundle.getSparseParcelableArray("com.google.android.gearhead.appdecor.PARCELABLE"));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
        super.dispatchSaveInstanceState(sparseArray2);
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("com.google.android.gearhead.appdecor.PARCELABLE", sparseArray2);
        sparseArray.put(getId(), bundle);
    }

    public AppContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public AppContentLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AppContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
