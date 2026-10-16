package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class rmj extends ijn implements rml {
    public rmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.IProxyInputConnection");
    }

    @Override // defpackage.rml
    public final int e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(4, parcelGh);
        int i2 = parcelGi.readInt();
        parcelGi.recycle();
        return i2;
    }

    @Override // defpackage.rml
    public final CharSequence f(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(3, parcelGh);
        CharSequence charSequenceB = ijp.b(parcelGi);
        parcelGi.recycle();
        return charSequenceB;
    }

    @Override // defpackage.rml
    public final CharSequence g(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        Parcel parcelGi = gi(2, parcelGh);
        CharSequence charSequenceB = ijp.b(parcelGi);
        parcelGi.recycle();
        return charSequenceB;
    }

    @Override // defpackage.rml
    public final CharSequence h(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        Parcel parcelGi = gi(1, parcelGh);
        CharSequence charSequenceB = ijp.b(parcelGi);
        parcelGi.recycle();
        return charSequenceB;
    }

    @Override // defpackage.rml
    public final void i(rmc rmcVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rmcVar);
        gj(19, parcelGh);
    }

    @Override // defpackage.rml
    public final boolean j() throws RemoteException {
        Parcel parcelGi = gi(13, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean k(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(16, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean l(CharSequence charSequence, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.e(parcelGh, charSequence);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(9, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean m(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        Parcel parcelGi = gi(5, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean n() throws RemoteException {
        Parcel parcelGi = gi(14, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean o() throws RemoteException {
        Parcel parcelGi = gi(8, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean p(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(12, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean q(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(11, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean r(String str, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        ijp.g(parcelGh, bundle);
        Parcel parcelGi = gi(18, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean s(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        Parcel parcelGi = gi(17, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean t(KeyEvent keyEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, keyEvent);
        Parcel parcelGi = gi(15, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean u(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        Parcel parcelGi = gi(7, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean v(CharSequence charSequence, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.e(parcelGh, charSequence);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(6, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rml
    public final boolean w(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        Parcel parcelGi = gi(10, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
