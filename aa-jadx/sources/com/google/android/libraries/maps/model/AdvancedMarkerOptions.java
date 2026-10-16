package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class AdvancedMarkerOptions extends com.google.android.libraries.maps.model.MarkerOptions {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public int getCollisionBehavior() {
        return super.getCollisionBehaviorInternal();
    }

    public android.view.View getIconView() {
        return super.getIconViewInternal();
    }

    public com.google.android.libraries.maps.model.AdvancedMarkerOptions iconView(android.view.View view) {
        setIconViewInternal(view);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions alpha(float f) {
        super.alpha(f);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions anchor(float f, float f2) {
        super.anchor(f, f2);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions collisionBehavior(@com.google.android.libraries.maps.model.AdvancedMarkerOptions.CollisionBehavior int i) {
        super.collisionBehaviorInternal(i);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions contentDescription(java.lang.String str) {
        super.contentDescription(str);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions draggable(boolean z) {
        super.draggable(z);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions flat(boolean z) {
        super.flat(z);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions icon(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        super.icon(bitmapDescriptor);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions infoWindowAnchor(float f, float f2) {
        super.infoWindowAnchor(f, f2);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions position(com.google.android.libraries.maps.model.LatLng latLng) {
        super.position(latLng);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions rotation(float f) {
        super.rotation(f);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions snippet(java.lang.String str) {
        super.snippet(str);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions title(java.lang.String str) {
        super.title(str);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions visible(boolean z) {
        super.visible(z);
        return this;
    }

    @Override // com.google.android.libraries.maps.model.MarkerOptions
    public com.google.android.libraries.maps.model.AdvancedMarkerOptions zIndex(float f) {
        super.zIndex(f);
        return this;
    }
}
