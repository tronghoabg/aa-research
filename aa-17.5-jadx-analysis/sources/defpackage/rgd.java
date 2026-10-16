package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class rgd extends qul {
    public static final ypf a = ols.R("CAR.AUDIO.RecordBndr");
    public final rge b;
    public final rwz c;
    public byte[] d;
    public ParcelFileDescriptor.AutoCloseOutputStream e;
    private final qud f;
    private final AtomicInteger g;
    private int h;
    private volatile Handler i;
    private final rga j;
    private final erb k;

    public rgd(rge rgeVar, qud qudVar, rwz rwzVar) {
        erb erbVar = new erb((int[]) null);
        this.g = new AtomicInteger(0);
        this.j = new rga(this, 2);
        this.h = 0;
        this.b = rgeVar;
        this.f = qudVar;
        this.c = rwzVar;
        this.k = erbVar;
    }

    public final void a() {
        if (this.g.get() != 1) {
            return;
        }
        byte[] bArr = this.d;
        bArr.getClass();
        rge rgeVar = this.b;
        int i = this.h;
        int length = bArr.length;
        int iB = rgeVar.b(bArr, i, length - i);
        if (iB < 0) {
            a.g().ai(7993).w("Audio record api returned %d, quitting.", iB);
            this.c.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yv);
            g();
        }
        int i2 = this.h + iB;
        this.h = i2;
        if (i2 == length) {
            this.h = 0;
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.e;
                autoCloseOutputStream.getClass();
                autoCloseOutputStream.write(this.d);
            } catch (IOException e) {
                a.g().p(e).ai(7992).u("Failure while writing to output stream, quitting.");
                this.c.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yw);
                g();
            }
        }
        synchronized (this) {
            if (this.g.get() == 1) {
                this.i.getClass();
                this.i.post(new ral(this, 12));
            }
        }
    }

    @Override // defpackage.qum
    public final int e() {
        return this.b.a();
    }

    @Override // defpackage.qum
    @ResultIgnorabilityUnspecified
    public final ParcelFileDescriptor f(int i) throws RemoteException, IOException {
        woy.aa(this.g.compareAndSet(0, 1), "startRecording can only be called once, before stopAndRelease is called.");
        woy.O(i > 0, "readBufferSize must be positive");
        a.f().ai(7995).u("Start recording.");
        try {
            this.f.asBinder().linkToDeath(this.j, 0);
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                synchronized (this) {
                    Object obj = this.k.a;
                    ((HandlerThread) obj).start();
                    this.i = new sss(((HandlerThread) obj).getLooper());
                    this.i.post(new oa(this, parcelFileDescriptor2, i, 16));
                }
                return parcelFileDescriptor;
            } catch (IOException e) {
                a.g().p(e).ai(7996).u("Failed to create pfd for recording data.");
                throw new IllegalStateException("Failed to create pfd for recording data: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            throw new IllegalStateException("Unable to link to client death", e2);
        }
    }

    @Override // defpackage.qum
    public final void g() {
        int andSet = this.g.getAndSet(2);
        if (andSet != 1) {
            a.f().ai(7999).w("Stop recording (ignored - previous state was %d).", andSet);
            return;
        }
        a.f().ai(7997).u("Stop recording.");
        try {
            this.f.asBinder().unlinkToDeath(this.j, 0);
        } catch (NoSuchElementException e) {
            a.h().p(e).ai(7998).u("Failed to unlink to client death; tearing down anyway.");
        }
        synchronized (this) {
            this.i.getClass();
            this.i.post(new ral(this, 11));
            ((HandlerThread) this.k.a).quitSafely();
        }
    }
}
