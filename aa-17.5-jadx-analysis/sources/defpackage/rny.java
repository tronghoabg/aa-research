package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class rny {
    public final qvh a;
    public InputStream b;
    public volatile int c = 0;
    public final qvj d;
    private final rnx e;

    public rny(rnx rnxVar, qvh qvhVar) throws qrz, qsa {
        qvj qvjVar = new qvj();
        this.d = qvjVar;
        this.e = rnxVar;
        this.a = qvhVar;
        try {
            qvhVar.f(qvjVar);
        } catch (RemoteException e) {
            a(e);
        } catch (IllegalStateException e2) {
            olm.g(e2);
        }
    }

    private final void e(RemoteException remoteException) throws IOException {
        InputStream inputStream;
        if (rrd.e("CAR.AUDIO.RECORD", 4)) {
            rrd.d(4, "CAR.AUDIO.RECORD", remoteException, "CarAudioRecord RemoteException from car service: %s", remoteException.getMessage());
        }
        if (this.c == 1 && (inputStream = this.b) != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (this.c != 2) {
            rnx rnxVar = this.e;
            synchronized (rnxVar.b) {
                rnxVar.c.remove(this);
            }
            this.c = 2;
        }
    }

    public final void a(RemoteException remoteException) throws rks {
        e(remoteException);
        olm.h(remoteException);
    }

    public final synchronized void b() throws IllegalStateException, qrz {
        if (this.c == 1) {
            throw new IllegalStateException("already started");
        }
        if (this.c == 2) {
            throw new IllegalStateException("already released");
        }
        try {
            qvh qvhVar = this.a;
            qvj qvjVar = this.d;
            this.b = new ParcelFileDescriptor.AutoCloseInputStream(qvhVar.a(qvjVar));
            qvhVar.h(qvjVar);
        } catch (RemoteException e) {
            a(e);
        } catch (IllegalStateException e2) {
            olm.f(e2);
        }
        this.c = 1;
        if (omc.c("CAR.AUDIO.RECORD", 3)) {
            rrd.a("CAR.AUDIO.RECORD", null, "CarAudioRecord startRecording ok");
        }
    }

    public final synchronized void c() {
        if (this.c == 1) {
            this.c = 0;
            try {
                this.a.i(this.d);
                this.b.close();
            } catch (RemoteException e) {
                e(e);
            } catch (IOException unused) {
            }
            if (omc.c("CAR.AUDIO.RECORD", 3)) {
                rrd.a("CAR.AUDIO.RECORD", null, "CarAudioRecord stopped");
            }
        } else if (omc.c("CAR.AUDIO.RECORD", 3)) {
            rrd.a("CAR.AUDIO.RECORD", null, "CarAudioRecord stop while not started");
        }
    }

    public final synchronized void d() {
        if (this.c != 2) {
            c();
            try {
                this.a.g(this.d);
            } catch (RemoteException unused) {
            }
            this.c = 2;
            if (omc.c("CAR.AUDIO.RECORD", 3)) {
                rrd.a("CAR.AUDIO.RECORD", null, "CarAudioRecord released");
            }
        }
    }
}
