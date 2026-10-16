package defpackage;

import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.VisibleRegion;

/* loaded from: classes3.dex */
public final class vil extends ijo implements vim {
    private final zys a;
    private final zxm b;

    public vil(zys zysVar, zxm zxmVar) {
        super("com.google.android.libraries.maps.internal.IProjectionDelegate");
        this.b = zxmVar;
        this.a = zysVar;
    }

    @Override // defpackage.vim
    public final sqj e(LatLng latLng) {
        try {
            this.a.b(aahu.PROJECTION_TO_SCREEN_LOCATION);
            return new sqi(this.b.a(latLng));
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

    @Override // defpackage.vim
    public final LatLng f(sqj sqjVar) {
        try {
            this.a.b(aahu.PROJECTION_FROM_SCREEN_LOCATION);
            return this.b.b((Point) sqi.a(sqjVar));
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

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                sqhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
            }
            ijp.d(parcel);
            LatLng latLngF = f(sqhVar);
            parcel2.writeNoException();
            ijp.h(parcel2, latLngF);
        } else if (i == 2) {
            LatLng latLng = (LatLng) ijp.a(parcel, LatLng.CREATOR);
            ijp.d(parcel);
            sqj sqjVarE = e(latLng);
            parcel2.writeNoException();
            ijp.i(parcel2, sqjVarE);
        } else {
            if (i != 3) {
                return false;
            }
            VisibleRegion visibleRegionG = g();
            parcel2.writeNoException();
            ijp.h(parcel2, visibleRegionG);
        }
        return true;
    }

    @Override // defpackage.vim
    public final VisibleRegion g() {
        try {
            this.a.b(aahu.PROJECTION_GET_FRUSTUM);
            return this.b.c();
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

    public final String toString() {
        try {
            return String.valueOf(this.b);
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
