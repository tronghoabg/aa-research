package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;
import com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate;

/* loaded from: classes3.dex */
public abstract class vec extends ijo implements ved {
    public vec() {
        super("com.google.android.libraries.maps.internal.ICreator");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar = null;
        vew veuVar = null;
        sqj sqhVar2 = null;
        sqj sqhVar3 = null;
        sqj sqhVar4 = null;
        sqj sqhVar5 = null;
        sqj sqhVar6 = null;
        sqj sqhVar7 = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                ijp.d(parcel);
                h(sqhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar7 = iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(strongBinder2);
                }
                ijp.d(parcel);
                veo veoVarB = b(sqhVar7);
                parcel2.writeNoException();
                ijp.i(parcel2, veoVarB);
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar6 = iInterfaceQueryLocalInterface3 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface3 : new sqh(strongBinder3);
                }
                GoogleMapOptions googleMapOptions = (GoogleMapOptions) ijp.a(parcel, GoogleMapOptions.CREATOR);
                ijp.d(parcel);
                veq veqVarC = c(sqhVar6, googleMapOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, veqVarC);
                return true;
            case 4:
                vdy vdyVarA = a();
                parcel2.writeNoException();
                ijp.i(parcel2, vdyVarA);
                return true;
            case 5:
                IBitmapDescriptorFactoryDelegate iBitmapDescriptorFactoryDelegateG = g();
                parcel2.writeNoException();
                ijp.i(parcel2, iBitmapDescriptorFactoryDelegateG);
                return true;
            case 6:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar5 = iInterfaceQueryLocalInterface4 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface4 : new sqh(strongBinder4);
                }
                int i2 = parcel.readInt();
                ijp.d(parcel);
                i(sqhVar5, i2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar4 = iInterfaceQueryLocalInterface5 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface5 : new sqh(strongBinder5);
                }
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) ijp.a(parcel, StreetViewPanoramaOptions.CREATOR);
                ijp.d(parcel);
                viw viwVarF = f(sqhVar4, streetViewPanoramaOptions);
                parcel2.writeNoException();
                ijp.i(parcel2, viwVarF);
                return true;
            case 8:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar3 = iInterfaceQueryLocalInterface6 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface6 : new sqh(strongBinder6);
                }
                ijp.d(parcel);
                viu viuVarD = d(sqhVar3);
                parcel2.writeNoException();
                ijp.i(parcel2, viuVarD);
                return true;
            case 9:
                parcel2.writeNoException();
                parcel2.writeInt(2);
                return true;
            case 10:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar2 = iInterfaceQueryLocalInterface7 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface7 : new sqh(strongBinder7);
                }
                int i3 = parcel.readInt();
                ijp.d(parcel);
                j(sqhVar2, i3);
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface8 instanceof sqj) {
                    }
                }
                ijp.d(parcel);
                l();
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface9 instanceof sqj) {
                    }
                }
                String string = parcel.readString();
                ijp.d(parcel);
                k(string);
                parcel2.writeNoException();
                return true;
            case 13:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface10 instanceof sqj) {
                    }
                }
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.libraries.maps.internal.IMapsAppCheckTokenProvider");
                    veuVar = iInterfaceQueryLocalInterface11 instanceof vew ? (vew) iInterfaceQueryLocalInterface11 : new veu(strongBinder11);
                }
                ijp.d(parcel);
                m(veuVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
