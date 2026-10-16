package com.google.android.libraries.maps.model;

import defpackage.spu;

/* loaded from: classes3.dex */
public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(BitmapDescriptor bitmapDescriptor, float f) {
        super(3, bitmapDescriptor, Float.valueOf(f));
        spu.ax(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f;
    }

    @Override // com.google.android.libraries.maps.model.Cap
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.bitmapDescriptor) + " refWidth=" + this.refWidth + "]";
    }

    public CustomCap(BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }
}
