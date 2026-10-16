package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes4.dex */
public abstract class zboc extends zbb implements zbod {
    public zboc() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    public static zbod asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof zbod ? (zbod) iInterfaceQueryLocalInterface : new zbob(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb
    public final boolean zba(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 1) {
            InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
            zbc.zbb(parcel);
            zboa zboaVarNewTextRecognizer = newTextRecognizer(interfaceC3876aR);
            parcel2.writeNoException();
            zbc.zbc(parcel2, zboaVarNewTextRecognizer);
        } else {
            if (i5 != 2) {
                return false;
            }
            InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
            zbom zbomVar = (zbom) zbc.zba(parcel, zbom.CREATOR);
            zbc.zbb(parcel);
            zboa zboaVarNewTextRecognizerWithOptions = newTextRecognizerWithOptions(interfaceC3876aR2, zbomVar);
            parcel2.writeNoException();
            zbc.zbc(parcel2, zboaVarNewTextRecognizerWithOptions);
        }
        return true;
    }
}
