package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owy extends defpackage.ijw implements defpackage.owz {
    public owy() {
        super("com.google.android.apps.auto.sdk.IToastController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcel);
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            e(charSequenceB, i2);
        } else {
            if (i != 2) {
                return false;
            }
            java.lang.CharSequence charSequenceB2 = defpackage.ijx.b(parcel);
            int i3 = parcel.readInt();
            android.content.ComponentName componentName = (android.content.ComponentName) defpackage.ijx.a(parcel, android.content.ComponentName.CREATOR);
            defpackage.ijx.d(parcel);
            f(charSequenceB2, i3, componentName);
        }
        parcel2.writeNoException();
        return true;
    }
}
