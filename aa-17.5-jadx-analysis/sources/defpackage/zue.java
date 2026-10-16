package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public final class zue extends vdx {
    private static final zts a = new zty(1);
    private static final zts b = new zty(0);

    @Override // defpackage.vdy
    public final sqj a(CameraPosition cameraPosition) {
        try {
            return new sqi(new zuc(cameraPosition, 1));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj b(LatLng latLng) {
        try {
            return new sqi(new zuc(latLng, 0));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj c(LatLngBounds latLngBounds, int i) {
        try {
            return new sqi(new ztw(latLngBounds, i));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj d(LatLngBounds latLngBounds, int i, int i2, int i3) {
        try {
            return new sqi(new ztx(latLngBounds, i, i2, i3));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj f(LatLng latLng, float f) {
        try {
            return new sqi(new zud(latLng, f));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj g(float f, float f2) {
        try {
            return new sqi(new zub(f, f2));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj h(float f) {
        try {
            return new sqi(new ztz(f, 0));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj i(float f, int i, int i2) {
        try {
            return new sqi(new zua(f, i, i2));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj j() {
        try {
            return new sqi(a);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj k() {
        try {
            return new sqi(b);
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.vdy
    public final sqj l(float f) {
        try {
            return new sqi(new ztz(f, 1));
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }
}
