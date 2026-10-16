package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class qys extends ijo implements qyt {
    private final WeakReference a;

    public qys(rol rolVar) {
        super("com.google.android.gms.car.ICarVendorExtensionClient");
        this.a = new WeakReference(rolVar);
    }

    @Override // defpackage.qyt
    public final void e(int i) throws RemoteException, IOException {
        rol rolVar = (rol) this.a.get();
        if (rolVar != null) {
            if (omc.c("CAR.VENDOR", 3)) {
                rrd.d(3, "CAR.VENDOR", null, "onData. length=%d", Integer.valueOf(i));
            }
            if (rolVar.b == null) {
                if (omc.c("CAR.VENDOR", 3)) {
                    rrd.a("CAR.VENDOR", null, "Data arrived but no listener registered");
                    return;
                }
                return;
            }
            if (rolVar.d == null) {
                if (omc.c("CAR.VENDOR", 3)) {
                    rrd.a("CAR.VENDOR", null, "No input stream. Getting an input fd from service");
                }
                try {
                    rolVar.d = new ParcelFileDescriptor.AutoCloseInputStream(rolVar.a.a(rolVar.f));
                } catch (RemoteException unused) {
                    rolVar.b();
                    return;
                }
            } else if (omc.c("CAR.VENDOR", 3)) {
                rrd.a("CAR.VENDOR", null, "Using the existing input stream");
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i > 0) {
                int iMin = Math.min(i, 32768);
                if (omc.c("CAR.VENDOR", 3)) {
                    rrd.d(3, "CAR.VENDOR", null, "onData attempts to read %d bytes", Integer.valueOf(iMin));
                }
                try {
                    rolVar.a.k(rolVar.f, iMin);
                    if (omc.c("CAR.VENDOR", 3)) {
                        rrd.d(3, "CAR.VENDOR", null, "readFully: offset=%d length=%d", Integer.valueOf(i2), Integer.valueOf(iMin));
                    }
                    int i3 = i2;
                    int i4 = iMin;
                    while (i4 > 0) {
                        try {
                            int i5 = rolVar.d.read(bArr, i3, i4);
                            if (omc.c("CAR.VENDOR", 3)) {
                                rrd.d(3, "CAR.VENDOR", null, "readFully read %d bytes", Integer.valueOf(i5));
                            }
                            if (i5 == -1) {
                                throw new IllegalStateException("Unexpected EOF");
                            }
                            i4 -= i5;
                            i3 += i5;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    i -= iMin;
                    i2 += iMin;
                } catch (IllegalStateException e2) {
                    rrd.b("CAR.VENDOR", e2, "ERROR reading data chunk.");
                    return;
                }
            }
            if (omc.c("CAR.VENDOR", 3)) {
                rrd.a("CAR.VENDOR", null, "onData read all the data from pipe");
            }
            Handler handler = rolVar.e;
            handler.sendMessage(handler.obtainMessage(3, bArr));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException, IOException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            e(i2);
        } else if (i != 2) {
            if (i != 3) {
                return false;
            }
            if (omc.c("CAR.VENDOR", 4)) {
                rrd.c("CAR.VENDOR", null, "onDisconnect called");
            }
        } else if (omc.c("CAR.VENDOR", 4)) {
            rrd.c("CAR.VENDOR", null, "onConnected called");
        }
        return true;
    }
}
