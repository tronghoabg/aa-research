package com.google.android.libraries.maps.model;

import defpackage.vjg;

/* loaded from: classes3.dex */
public class TextureStyle extends StampStyle {

    public static final class Builder extends vjg<Builder> {
        public TextureStyle build() {
            return new TextureStyle(this.a);
        }

        @Override // defpackage.vjg
        public /* bridge */ /* synthetic */ vjg stamp(BitmapDescriptor bitmapDescriptor) {
            super.stamp(bitmapDescriptor);
            return this;
        }
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder().stamp(bitmapDescriptor);
    }

    @Override // com.google.android.libraries.maps.model.StampStyle
    public boolean asSprite() {
        return false;
    }
}
