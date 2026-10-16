package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ild extends qyp implements jcc {
    public static final yph a = yph.c("CAR.VENDOR");
    public final String b;
    public final String[] c;
    public final int d;
    private final byte[] j;
    private final jer k;
    private jcd l;
    private ParcelFileDescriptor[] o;
    private InputStream p;
    private byte[] q;
    private int r;
    private ParcelFileDescriptor[] s;
    private OutputStream t;
    private ikf v;
    public volatile boolean e = false;
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final CountDownLatch g = new CountDownLatch(1);
    private final Object m = new Object();
    private final Object n = new Object();
    public final Object h = new Object();
    public final Queue i = new LinkedList();
    private int u = 0;

    public ild(String str, byte[] bArr, String[] strArr, jer jerVar, int i) {
        this.k = jerVar;
        this.b = str;
        this.j = bArr;
        this.c = strArr;
        this.d = i;
    }

    @Override // defpackage.qyq
    @ResultIgnorabilityUnspecified
    public final ParcelFileDescriptor a(qyt qytVar) throws IllegalStateException {
        ParcelFileDescriptor parcelFileDescriptor;
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 244)).u("getInputFileDescriptor");
        h(qytVar);
        synchronized (this.h) {
            if (this.s == null) {
                ((ype) yphVar.l().ai(246)).u("Creating new fds for output to client");
                try {
                    this.s = ParcelFileDescriptor.createPipe();
                    this.t = new ParcelFileDescriptor.AutoCloseOutputStream(this.s[1]);
                } catch (IOException e) {
                    throw new IllegalStateException("cannot create pipe for output to client", e);
                }
            } else {
                ((ype) yphVar.l().ai(245)).u("Using the existing fds for output to client");
            }
            parcelFileDescriptor = this.s[0];
        }
        return parcelFileDescriptor;
    }

    @Override // defpackage.iyw
    public final /* synthetic */ jbj b(jbn jbnVar) {
        return new jcd(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.qyq
    @ResultIgnorabilityUnspecified
    public final ParcelFileDescriptor f(qyt qytVar) throws IllegalStateException {
        ParcelFileDescriptor parcelFileDescriptor;
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 247)).u("getOutputFileDescriptor");
        h(qytVar);
        synchronized (this.n) {
            if (this.o == null) {
                ((ype) yphVar.l().ai(249)).u("Creating new fds for input from client");
                try {
                    this.o = ParcelFileDescriptor.createPipe();
                    this.p = new ParcelFileDescriptor.AutoCloseInputStream(this.o[0]);
                } catch (IOException e) {
                    throw new IllegalStateException("cannot create pipe for input from client", e);
                }
            } else {
                ((ype) yphVar.l().ai(248)).u("Using the existing fds for input from client");
            }
            parcelFileDescriptor = this.o[1];
        }
        return parcelFileDescriptor;
    }

    @Override // defpackage.qyq
    public final String g(qyt qytVar) throws IllegalStateException {
        h(qytVar);
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qyt] */
    final void h(qyt qytVar) throws IllegalStateException {
        this.k.b();
        if (!this.e) {
            throw new IllegalStateException("CarNotConnected");
        }
        if (this.l == null) {
            throw new RuntimeException("VendorExtensionEndpoint not set.");
        }
        synchronized (this.m) {
            ikf ikfVar = this.v;
            if (ikfVar == null) {
                throw new IllegalStateException("No client has been registered");
            }
            if (ikfVar.a.asBinder() != qytVar.asBinder()) {
                throw new IllegalStateException("This vendor extension service is already in use.");
            }
        }
    }

    public final void i() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 239)).u("cleanupStreamsAndFds");
        synchronized (this.n) {
            if (this.p != null) {
                ((ype) yphVar.l().ai(242)).u("Closing and resetting the stream for input from client");
                try {
                    this.p.close();
                } catch (IOException unused) {
                    yphVar = a;
                    ((ype) ((ype) yphVar.h()).ai(243)).u("Failed to close input stream");
                }
                this.p = null;
                this.o = null;
            } else {
                this.o = null;
            }
        }
        synchronized (this.h) {
            if (this.t != null) {
                ((ype) yphVar.l().ai(240)).u("Closing and resetting the stream for output to client");
                try {
                    this.t.close();
                } catch (IOException unused2) {
                    ((ype) ((ype) a.h()).ai(241)).u("Failed to close output stream");
                }
                this.t = null;
                this.s = null;
            } else {
                this.s = null;
            }
        }
    }

    @Override // defpackage.qyq
    public final void j(qyt qytVar, int i) throws IllegalStateException {
        ((ype) a.l().ai((char) 250)).w("notifyDataChunkWritten. chunkLength=%d", i);
        h(qytVar);
        synchronized (this.n) {
            if (this.p == null) {
                throw new IllegalStateException("No input stream has been created");
            }
            if (this.o == null) {
                throw new IllegalStateException("No fds for input have been created");
            }
        }
        synchronized (this.n) {
            if (this.r + i > this.q.length) {
                throw new IndexOutOfBoundsException();
            }
            int i2 = i;
            while (i2 > 0) {
                try {
                    int i3 = this.p.read(this.q, this.r, i2);
                    ((ype) a.l().ai(253)).w("notifyDataChunkWritten read %d bytes", i3);
                    if (i3 == -1) {
                        throw new IllegalStateException("Unexpected EOF");
                    }
                    i2 -= i3;
                    this.r += i3;
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            yph yphVar = a;
            ((ype) yphVar.l().ai(251)).w("notifyDataChunkWritten finished reading the chunk of %d bytes", i);
            if (this.r == this.q.length) {
                ((ype) yphVar.l().ai(252)).w("notifyDataChunkWritten read all the data of %d bytes", this.r);
                jcd jcdVar = this.l;
                byte[] bArr = this.q;
                int length = bArr.length;
                jcn jcnVar = new jcn(ByteBuffer.allocate(length), null, false);
                jcnVar.t(bArr, 0, length);
                jcdVar.w.d(jcnVar, new izn(true, false, 0));
                this.q = null;
            }
        }
    }

    @Override // defpackage.qyq
    public final void k(qyt qytVar, int i) throws IllegalStateException {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 256)).w("notifyReadyToReadNextDataChunk. chunkLength=%d", i);
        h(qytVar);
        synchronized (this.h) {
            if (this.t == null) {
                throw new IllegalStateException("No output stream has been created");
            }
            if (this.s == null) {
                throw new IllegalStateException("No fds for output have been created");
            }
        }
        synchronized (this.h) {
            byte[] bArr = (byte[]) this.i.peek();
            if (bArr == null) {
                throw new IllegalStateException("No data");
            }
            int i2 = this.u + i;
            int length = bArr.length;
            if (i2 > length) {
                throw new IndexOutOfBoundsException();
            }
            try {
                ((ype) yphVar.l().ai(257)).B("notifyReadyToReadNextDataChunk writing. offset=%d size=%d", this.u, i);
                this.t.write(bArr, this.u, i);
                int i3 = this.u + i;
                this.u = i3;
                if (i3 == length) {
                    ((ype) yphVar.l().ai(258)).w("notifyReadyToReadNextDataChunk finished writing the data of %d bytes", this.u);
                    Queue queue = this.i;
                    queue.poll();
                    this.u = 0;
                    byte[] bArr2 = (byte[]) queue.peek();
                    if (bArr2 != null) {
                        ((ype) yphVar.l().ai(260)).u("notifyReadyToReadNextDataChunk: There are pending data. Notifying the client");
                        if (!p(bArr2.length)) {
                            queue.clear();
                        }
                    } else {
                        ((ype) yphVar.l().ai(259)).u("notifyReadyToReadNextDataChunk: No pending data");
                    }
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.qyq
    public final void l(qyt qytVar, int i) throws IllegalStateException {
        ((ype) a.l().ai((char) 264)).w("prepareSending. totalLength=%d", i);
        h(qytVar);
        synchronized (this.n) {
            this.q = new byte[i];
            this.r = 0;
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qyt] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qyt] */
    public final void n() {
        synchronized (this.m) {
            if (this.v == null) {
                ((ype) ((ype) a.h()).ai(267)).u("removeClient: No registered client");
                return;
            }
            ((ype) a.l().ai(266)).y("removeClient: Removing %s", this.v.a.asBinder());
            this.v.a.asBinder().unlinkToDeath(this.v, 0);
            this.v = null;
        }
    }

    @Override // defpackage.qyq
    public final void o(qyt qytVar) throws IllegalStateException {
        ((ype) a.l().ai((char) 268)).y("unregisterClient. client=%s", qytVar.asBinder());
        h(qytVar);
        n();
        i();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qyt] */
    public final boolean p(int i) {
        synchronized (this.m) {
            ikf ikfVar = this.v;
            if (ikfVar == null) {
                ((ype) a.l().ai(255)).u("Data available but no client");
                return false;
            }
            try {
                ikfVar.a.e(i);
                return true;
            } catch (RemoteException unused) {
                ((ype) ((ype) a.h()).ai(254)).y("Error in notifyDataToClient for vendor extension %s", this.b);
                return false;
            }
        }
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.e = true;
        this.l = (jcd) jbjVar;
    }

    @Override // defpackage.qyq
    public final boolean s(qyt qytVar) {
        ((ype) a.l().ai((char) 265)).y("registerClient. client=%s", qytVar.asBinder());
        synchronized (this.m) {
            if (this.v != null) {
                return false;
            }
            try {
                this.v = new ikf(this, qytVar, 3);
                return true;
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.qyq
    public final byte[] t(qyt qytVar) throws IllegalStateException {
        h(qytVar);
        return this.j;
    }
}
