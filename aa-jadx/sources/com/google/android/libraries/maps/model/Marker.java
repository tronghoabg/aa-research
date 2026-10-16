package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class Marker {
    protected final com.google.android.libraries.maps.model.internal.IMarkerDelegate a;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface CollisionBehavior {
        public static final int OPTIONAL_AND_HIDES_LOWER_PRIORITY = 2;
        public static final int REQUIRED = 0;
        public static final int REQUIRED_AND_HIDES_OPTIONAL = 1;
    }

    public Marker(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) {
        defpackage.sqs.aA(iMarkerDelegate);
        this.a = iMarkerDelegate;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.maps.model.Marker)) {
            return false;
        }
        try {
            return this.a.equalsRemote(((com.google.android.libraries.maps.model.Marker) obj).a);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public float getAlpha() {
        try {
            return this.a.getAlpha();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getId() {
        try {
            return this.a.getId();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.libraries.maps.model.LatLng getPosition() {
        try {
            return this.a.getPosition();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public float getRotation() {
        try {
            return this.a.getRotation();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getSnippet() {
        try {
            return this.a.getSnippet();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.Object getTag() {
        try {
            return defpackage.srg.a(this.a.getTag());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getTitle() {
        try {
            return this.a.getTitle();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public float getZIndex() {
        try {
            return this.a.getZIndex();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.hashCodeRemote();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void hideInfoWindow() {
        try {
            this.a.hideInfoWindow();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isDraggable() {
        try {
            return this.a.isDraggable();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isFlat() {
        try {
            return this.a.isFlat();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.a.isInfoWindowShown();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isVisible() {
        try {
            return this.a.isVisible();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.a.remove();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setAlpha(float f) {
        try {
            this.a.setAlpha(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setAnchor(float f, float f2) {
        try {
            this.a.setAnchor(f, f2);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setDraggable(boolean z) {
        try {
            this.a.setDraggable(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setFlat(boolean z) {
        try {
            this.a.setFlat(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setIcon(com.google.android.libraries.maps.model.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            try {
                this.a.setIcon(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                this.a.setIcon(bitmapDescriptor.getRemoteObject());
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
            }
        }
    }

    public void setInfoWindowAnchor(float f, float f2) {
        try {
            this.a.setInfoWindowAnchor(f, f2);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.libraries.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.a.setPosition(latLng);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setRotation(float f) {
        try {
            this.a.setRotation(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setSnippet(java.lang.String str) {
        try {
            this.a.setSnippet(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setTag(java.lang.Object obj) {
        try {
            this.a.setTag(new defpackage.srg(obj));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setTitle(java.lang.String str) {
        try {
            this.a.setTitle(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            this.a.setVisible(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setZIndex(float f) {
        try {
            this.a.setZIndex(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void showInfoWindow() {
        try {
            this.a.showInfoWindow();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
