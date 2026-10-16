package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qwv extends defpackage.ijw implements defpackage.qww {
    public qwv() {
        super("com.google.android.gms.car.ICarCallListener");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
                defpackage.ijx.d(parcel);
                e(keyEvent);
                return true;
            case 2:
                boolean zJ = defpackage.ijx.j(parcel);
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                f(zJ, i2, i3);
                return true;
            case 3:
                com.google.android.gms.car.CarCall carCall = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                g(carCall);
                return true;
            case 4:
                com.google.android.gms.car.CarCall carCall2 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                i(carCall2);
                return true;
            case 5:
                com.google.android.gms.car.CarCall carCall3 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                q(carCall3, i4);
                return true;
            case 6:
                com.google.android.gms.car.CarCall carCall4 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                com.google.android.gms.car.CarCall carCall5 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                o(carCall4, carCall5);
                return true;
            case 7:
                com.google.android.gms.car.CarCall carCall6 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                k(carCall6, arrayListCreateTypedArrayList);
                return true;
            case 8:
                com.google.android.gms.car.CarCall carCall7 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                com.google.android.gms.car.CarCall.Details details = (com.google.android.gms.car.CarCall.Details) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.Details.CREATOR);
                defpackage.ijx.d(parcel);
                n(carCall7, details);
                return true;
            case 9:
                com.google.android.gms.car.CarCall carCall8 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                defpackage.ijx.d(parcel);
                j(carCall8, arrayListCreateStringArrayList);
                return true;
            case 10:
                com.google.android.gms.car.CarCall carCall9 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                p(carCall9, string);
                return true;
            case 11:
                com.google.android.gms.car.CarCall carCall10 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                h(carCall10);
                return true;
            case 12:
                com.google.android.gms.car.CarCall carCall11 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(com.google.android.gms.car.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                l(carCall11, arrayListCreateTypedArrayList2);
                return true;
            case 13:
                com.google.android.gms.car.CarCall carCall12 = (com.google.android.gms.car.CarCall) defpackage.ijx.a(parcel, com.google.android.gms.car.CarCall.CREATOR);
                java.lang.String string2 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                m(carCall12, string2, bundle);
                return true;
            default:
                return false;
        }
    }
}
