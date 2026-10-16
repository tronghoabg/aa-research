package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class ito implements itf {
    private static final yph a = yph.c("CAR.AUDIO.RecordRemote");
    private final qum b;
    private volatile int c = 0;
    private volatile ParcelFileDescriptor.AutoCloseInputStream d;

    public ito(qum qumVar) {
        this.b = qumVar;
    }

    @Override // defpackage.itf
    public final int a() throws RemoteException {
        return this.b.e();
    }

    @Override // defpackage.itf
    public final synchronized int b(byte[] bArr, int i, int i2) throws IOException {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        woy.ab(z, "read must be called after startRecording and before stopAndRelease. State: %s", this.c);
        autoCloseInputStream = this.d;
        autoCloseInputStream.getClass();
        return autoCloseInputStream.read(bArr, i, i2);
    }

    @Override // defpackage.itf
    public final synchronized void c() throws RemoteException, IOException {
        if (this.c != 1) {
            ((ype) ((ype) a.f()).ai(1338)).w("Stop recording (ignored - previous state was %d).", this.c);
            return;
        }
        this.c = 2;
        this.b.g();
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = this.d;
        autoCloseInputStream.getClass();
        autoCloseInputStream.close();
        this.d = null;
    }

    @Override // defpackage.itf
    public final synchronized void d() throws RemoteException {
        woy.aa(this.c == 0, "startRecording can only be called once, before stopAndRelease is called.");
        this.c = 1;
        this.d = new ParcelFileDescriptor.AutoCloseInputStream(this.b.f(2048));
    }
}
