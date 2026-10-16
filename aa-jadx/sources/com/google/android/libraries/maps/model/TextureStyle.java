package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class TextureStyle extends com.google.android.libraries.maps.model.StampStyle {

    public static final class Builder extends defpackage.vkd<com.google.android.libraries.maps.model.TextureStyle.Builder> {
        public com.google.android.libraries.maps.model.TextureStyle build() {
            return new com.google.android.libraries.maps.model.TextureStyle(this.a);
        }

        @Override // defpackage.vkd
        public /* bridge */ /* synthetic */ defpackage.vkd stamp(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
            super.stamp(bitmapDescriptor);
            return this;
        }
    }

    public static com.google.android.libraries.maps.model.TextureStyle.Builder newBuilder(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        return new com.google.android.libraries.maps.model.TextureStyle.Builder().stamp(bitmapDescriptor);
    }

    @Override // com.google.android.libraries.maps.model.StampStyle
    public boolean asSprite() {
        return false;
    }
}
