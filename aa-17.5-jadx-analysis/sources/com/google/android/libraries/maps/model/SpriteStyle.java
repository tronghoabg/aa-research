package com.google.android.libraries.maps.model;

import android.os.IBinder;
import defpackage.vjg;

/* loaded from: classes3.dex */
public class SpriteStyle extends StampStyle {

    public static final class Builder extends vjg<Builder> {
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public SpriteStyle m279build() {
            return new SpriteStyle(this.a);
        }

        @Override // defpackage.vjg
        public /* bridge */ /* synthetic */ vjg stamp(BitmapDescriptor bitmapDescriptor) {
            super.stamp(bitmapDescriptor);
            return this;
        }
    }

    public SpriteStyle(IBinder iBinder) {
        super(iBinder);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder().stamp(bitmapDescriptor);
    }

    @Override // com.google.android.libraries.maps.model.StampStyle
    public boolean asSprite() {
        return true;
    }

    public SpriteStyle(BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }
}
