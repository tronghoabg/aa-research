package android.support.v4.os;

/* JADX INFO: loaded from: classes2.dex */
public class ResultReceiver implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.os.ResultReceiver> CREATOR = new defpackage.x(13);
    final boolean a;
    public final android.os.Handler b;
    defpackage.dwg c;

    public ResultReceiver(android.os.Parcel parcel) {
        this.a = false;
        defpackage.dwg dweVar = null;
        this.b = null;
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            dweVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.dwg)) ? new defpackage.dwe(strongBinder) : (defpackage.dwg) iInterfaceQueryLocalInterface;
        }
        this.c = dweVar;
    }

    public final void b(int i, android.os.Bundle bundle) {
        if (this.a) {
            android.os.Handler handler = this.b;
            if (handler != null) {
                handler.post(new defpackage.ec(this, i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        defpackage.dwg dwgVar = this.c;
        if (dwgVar != null) {
            try {
                dwgVar.a(i, bundle);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new defpackage.dwf(this);
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }

    public ResultReceiver(android.os.Handler handler) {
        this.a = true;
        this.b = handler;
    }

    public void a(int i, android.os.Bundle bundle) {
    }
}
