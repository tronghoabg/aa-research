package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes4.dex */
public abstract class zbnz extends zbb implements zboa {
    public zbnz() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb
    public final boolean zba(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            zbc();
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 2) {
            zbd();
            parcel2.writeNoException();
            return true;
        }
        if (i5 == 3) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            zbnx zbnxVar = (zbnx) zbc.zba(parcel, zbnx.CREATOR);
            zbc.zbb(parcel);
            zbok zbokVarZbb = zbb(interfaceC3876aR, zbnxVar);
            parcel2.writeNoException();
            parcel2.writeInt(1);
            zbokVarZbb.writeToParcel(parcel2, 1);
            return true;
        }
        if (i5 != 4) {
            return false;
        }
        InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
        zbnx zbnxVar2 = (zbnx) zbc.zba(parcel, zbnx.CREATOR);
        zbc.zbb(parcel);
        zbf[] zbfVarArrZbe = zbe(interfaceC3876aR2, zbnxVar2);
        parcel2.writeNoException();
        parcel2.writeTypedArray(zbfVarArrZbe, 1);
        return true;
    }
}
