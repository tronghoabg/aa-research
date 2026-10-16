package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vix extends ijn implements viz {
    public vix(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IUiSettingsDelegate");
    }

    @Override // defpackage.viz
    public final void gT(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(8, parcelGh);
    }

    @Override // defpackage.viz
    public final void gU(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(2, parcelGh);
    }

    @Override // defpackage.viz
    public final void gV(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(16, parcelGh);
    }

    @Override // defpackage.viz
    public final void gW(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(18, parcelGh);
    }

    @Override // defpackage.viz
    public final void gX(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(3, parcelGh);
    }

    @Override // defpackage.viz
    public final void gY(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(7, parcelGh);
    }

    @Override // defpackage.viz
    public final void gZ(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(4, parcelGh);
    }

    @Override // defpackage.viz
    public final void ha(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(20, parcelGh);
    }

    @Override // defpackage.viz
    public final void hb(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(6, parcelGh);
    }

    @Override // defpackage.viz
    public final void hc(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(1, parcelGh);
    }

    @Override // defpackage.viz
    public final void hd(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(5, parcelGh);
    }

    @Override // defpackage.viz
    public final boolean he() throws RemoteException {
        Parcel parcelGi = gi(10, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hf() throws RemoteException {
        Parcel parcelGi = gi(17, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hg() throws RemoteException {
        Parcel parcelGi = gi(19, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hh() throws RemoteException {
        Parcel parcelGi = gi(11, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hi() throws RemoteException {
        Parcel parcelGi = gi(15, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hj() throws RemoteException {
        Parcel parcelGi = gi(12, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hk() throws RemoteException {
        Parcel parcelGi = gi(14, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hl() throws RemoteException {
        Parcel parcelGi = gi(9, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.viz
    public final boolean hm() throws RemoteException {
        Parcel parcelGi = gi(13, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
