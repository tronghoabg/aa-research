package com.google.android.libraries.maps;

/* JADX INFO: loaded from: classes3.dex */
public class StreetViewPanorama {
    private final defpackage.vjp a;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(com.google.android.libraries.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public StreetViewPanorama(defpackage.vjp vjpVar) {
        defpackage.sqs.aB(vjpVar, "delegate");
        this.a = vjpVar;
    }

    public void animateTo(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        try {
            this.a.i(streetViewPanoramaCamera, j);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public defpackage.vjp getDelegate() {
        return this.a;
    }

    public com.google.android.libraries.maps.model.StreetViewPanoramaLocation getLocation() {
        try {
            return this.a.g();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.libraries.maps.model.StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.a.f();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.a.w();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.a.x();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.a.y();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.a.z();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public android.graphics.Point orientationToPoint(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            defpackage.srh srhVarE = this.a.e(streetViewPanoramaOrientation);
            if (srhVarE == null) {
                return null;
            }
            return (android.graphics.Point) defpackage.srg.a(srhVarE);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.libraries.maps.model.StreetViewPanoramaOrientation pointToOrientation(android.graphics.Point point) {
        try {
            return this.a.h(new defpackage.srg(point));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        defpackage.vjp vjpVar = this.a;
        if (onStreetViewPanoramaCameraChangeListener == null) {
            try {
                vjpVar.n(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                vjpVar.n(new defpackage.vit(onStreetViewPanoramaCameraChangeListener));
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        defpackage.vjp vjpVar = this.a;
        if (onStreetViewPanoramaChangeListener == null) {
            try {
                vjpVar.o(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                vjpVar.o(new defpackage.viw(onStreetViewPanoramaChangeListener));
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnStreetViewPanoramaClickListener(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        defpackage.vjp vjpVar = this.a;
        if (onStreetViewPanoramaClickListener == null) {
            try {
                vjpVar.p(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                vjpVar.p(new defpackage.viz(onStreetViewPanoramaClickListener));
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
            }
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        defpackage.vjp vjpVar = this.a;
        if (onStreetViewPanoramaLongClickListener == null) {
            try {
                vjpVar.q(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                vjpVar.q(new defpackage.vjc(onStreetViewPanoramaLongClickListener));
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
            }
        }
    }

    public void setPanningGesturesEnabled(boolean z) {
        try {
            this.a.j(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.libraries.maps.model.LatLng latLng) {
        try {
            this.a.r(latLng);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setStreetNamesEnabled(boolean z) {
        try {
            this.a.k(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setUserNavigationEnabled(boolean z) {
        try {
            this.a.l(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setZoomGesturesEnabled(boolean z) {
        try {
            this.a.m(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.libraries.maps.model.LatLng latLng, int i) {
        try {
            this.a.t(latLng, i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.libraries.maps.model.LatLng latLng, int i, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) {
        try {
            this.a.u(latLng, i, streetViewSource);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(com.google.android.libraries.maps.model.LatLng latLng, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) {
        try {
            this.a.v(latLng, streetViewSource);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setPosition(java.lang.String str) {
        try {
            this.a.s(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
