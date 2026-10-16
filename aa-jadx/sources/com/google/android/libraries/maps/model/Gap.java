package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class Gap extends com.google.android.libraries.maps.model.PatternItem {
    public final float length;

    public Gap(float f) {
        super(2, java.lang.Float.valueOf(java.lang.Math.max(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)));
        this.length = java.lang.Math.max(f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.google.android.libraries.maps.model.PatternItem
    public java.lang.String toString() {
        return "[Gap: length=" + this.length + "]";
    }
}
