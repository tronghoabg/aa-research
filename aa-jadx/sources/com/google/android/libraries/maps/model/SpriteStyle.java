package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class SpriteStyle extends com.google.android.libraries.maps.model.StampStyle {

    public static final class Builder extends defpackage.vkd<com.google.android.libraries.maps.model.SpriteStyle.Builder> {
        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public com.google.android.libraries.maps.model.SpriteStyle m283build() {
            return new com.google.android.libraries.maps.model.SpriteStyle(this.a);
        }

        @Override // defpackage.vkd
        public /* bridge */ /* synthetic */ defpackage.vkd stamp(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
            super.stamp(bitmapDescriptor);
            return this;
        }
    }

    public SpriteStyle(android.os.IBinder iBinder) {
        super(iBinder);
    }

    public static com.google.android.libraries.maps.model.SpriteStyle.Builder newBuilder(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        return new com.google.android.libraries.maps.model.SpriteStyle.Builder().stamp(bitmapDescriptor);
    }

    @Override // com.google.android.libraries.maps.model.StampStyle
    public boolean asSprite() {
        return true;
    }

    public SpriteStyle(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        super(bitmapDescriptor);
    }
}
