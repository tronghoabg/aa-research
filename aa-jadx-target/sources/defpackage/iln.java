package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iln extends defpackage.qzl implements defpackage.jcj {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VENDOR");
    public final java.lang.String b;
    public final java.lang.String[] c;
    public final int d;
    private final byte[] j;
    private final defpackage.jez k;
    private defpackage.jck l;
    private android.os.ParcelFileDescriptor[] o;
    private java.io.InputStream p;
    private byte[] q;
    private int r;
    private android.os.ParcelFileDescriptor[] s;
    private java.io.OutputStream t;
    private defpackage.iko v;
    public volatile boolean e = false;
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(true);
    public final java.util.concurrent.CountDownLatch g = new java.util.concurrent.CountDownLatch(1);
    private final java.lang.Object m = new java.lang.Object();
    private final java.lang.Object n = new java.lang.Object();
    public final java.lang.Object h = new java.lang.Object();
    public final java.util.Queue i = new java.util.LinkedList();
    private int u = 0;

    public iln(java.lang.String str, byte[] bArr, java.lang.String[] strArr, defpackage.jez jezVar, int i) {
        this.k = jezVar;
        this.b = str;
        this.j = bArr;
        this.c = strArr;
        this.d = i;
    }

    @Override // defpackage.qzm
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.os.ParcelFileDescriptor a(qzp qzpVar) {
        android.os.ParcelFileDescriptor parcelFileDescriptor;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 244)).u("getInputFileDescriptor");
        h(qzpVar);
        synchronized (this.h) {
            if (this.s == null) {
                ((defpackage.yqj) yqmVar.l().ai(246)).u("Creating new fds for output to client");
                try {
                    this.s = android.os.ParcelFileDescriptor.createPipe();
                    this.t = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(this.s[1]);
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("cannot create pipe for output to client", e);
                }
            } else {
                ((defpackage.yqj) yqmVar.l().ai(245)).u("Using the existing fds for output to client");
            }
            parcelFileDescriptor = this.s[0];
        }
        return parcelFileDescriptor;
    }

    @Override // defpackage.izd
    public final /* synthetic */ defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jck(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.qzm
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.os.ParcelFileDescriptor f(qzp qzpVar) {
        android.os.ParcelFileDescriptor parcelFileDescriptor;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 247)).u("getOutputFileDescriptor");
        h(qzpVar);
        synchronized (this.n) {
            if (this.o == null) {
                ((defpackage.yqj) yqmVar.l().ai(249)).u("Creating new fds for input from client");
                try {
                    this.o = android.os.ParcelFileDescriptor.createPipe();
                    this.p = new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.o[0]);
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("cannot create pipe for input from client", e);
                }
            } else {
                ((defpackage.yqj) yqmVar.l().ai(248)).u("Using the existing fds for input from client");
            }
            parcelFileDescriptor = this.o[1];
        }
        return parcelFileDescriptor;
    }

    @Override // defpackage.qzm
    public final java.lang.String g(qzp qzpVar) {
        h(qzpVar);
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qzp] */
    final void h(qzp qzpVar) throws java.lang.IllegalStateException {
        this.k.b();
        if (!this.e) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
        if (this.l == null) {
            throw new java.lang.RuntimeException("VendorExtensionEndpoint not set.");
        }
        synchronized (this.m) {
            defpackage.iko ikoVar = this.v;
            if (ikoVar == null) {
                throw new java.lang.IllegalStateException("No client has been registered");
            }
            if (ikoVar.a.asBinder() != qzpVar.asBinder()) {
                throw new java.lang.IllegalStateException("This vendor extension service is already in use.");
            }
        }
    }

    public final void i() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 239)).u("cleanupStreamsAndFds");
        synchronized (this.n) {
            if (this.p != null) {
                ((defpackage.yqj) yqmVar.l().ai(242)).u("Closing and resetting the stream for input from client");
                try {
                    this.p.close();
                } catch (java.io.IOException unused) {
                    yqmVar = a;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(243)).u("Failed to close input stream");
                }
                this.p = null;
                this.o = null;
            } else {
                this.o = null;
            }
            throw th;
        }
        synchronized (this.h) {
            if (this.t != null) {
                ((defpackage.yqj) yqmVar.l().ai(240)).u("Closing and resetting the stream for output to client");
                try {
                    this.t.close();
                } catch (java.io.IOException unused2) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(241)).u("Failed to close output stream");
                }
                this.t = null;
                this.s = null;
            } else {
                this.s = null;
            }
            throw th;
        }
    }

    @Override // defpackage.qzm
    public final void j(qzp qzpVar, int i) {
        ((defpackage.yqj) a.l().ai((char) 250)).w("notifyDataChunkWritten. chunkLength=%d", i);
        h(qzpVar);
        synchronized (this.n) {
            if (this.p == null) {
                throw new java.lang.IllegalStateException("No input stream has been created");
            }
            if (this.o == null) {
                throw new java.lang.IllegalStateException("No fds for input have been created");
            }
        }
        synchronized (this.n) {
            if (this.r + i > this.q.length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            int i2 = i;
            while (i2 > 0) {
                try {
                    int i3 = this.p.read(this.q, this.r, i2);
                    ((defpackage.yqj) a.l().ai(253)).w("notifyDataChunkWritten read %d bytes", i3);
                    if (i3 == -1) {
                        throw new java.lang.IllegalStateException("Unexpected EOF");
                    }
                    i2 -= i3;
                    this.r += i3;
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            }
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai(251)).w("notifyDataChunkWritten finished reading the chunk of %d bytes", i);
            if (this.r == this.q.length) {
                ((defpackage.yqj) yqmVar.l().ai(252)).w("notifyDataChunkWritten read all the data of %d bytes", this.r);
                defpackage.jck jckVar = this.l;
                byte[] bArr = this.q;
                int length = bArr.length;
                defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(length), null, false);
                jcuVar.t(bArr, 0, length);
                jckVar.w.d(jcuVar, new defpackage.izu(true, false, 0));
                this.q = null;
            }
        }
    }

    @Override // defpackage.qzm
    public final void k(qzp qzpVar, int i) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 256)).w("notifyReadyToReadNextDataChunk. chunkLength=%d", i);
        h(qzpVar);
        synchronized (this.h) {
            if (this.t == null) {
                throw new java.lang.IllegalStateException("No output stream has been created");
            }
            if (this.s == null) {
                throw new java.lang.IllegalStateException("No fds for output have been created");
            }
        }
        synchronized (this.h) {
            byte[] bArr = (byte[]) this.i.peek();
            if (bArr == null) {
                throw new java.lang.IllegalStateException("No data");
            }
            int i2 = this.u + i;
            int length = bArr.length;
            if (i2 > length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            try {
                ((defpackage.yqj) yqmVar.l().ai(257)).B("notifyReadyToReadNextDataChunk writing. offset=%d size=%d", this.u, i);
                this.t.write(bArr, this.u, i);
                int i3 = this.u + i;
                this.u = i3;
                if (i3 == length) {
                    ((defpackage.yqj) yqmVar.l().ai(258)).w("notifyReadyToReadNextDataChunk finished writing the data of %d bytes", this.u);
                    java.util.Queue queue = this.i;
                    queue.poll();
                    this.u = 0;
                    byte[] bArr2 = (byte[]) queue.peek();
                    if (bArr2 != null) {
                        ((defpackage.yqj) yqmVar.l().ai(260)).u("notifyReadyToReadNextDataChunk: There are pending data. Notifying the client");
                        if (!p(bArr2.length)) {
                            queue.clear();
                        }
                    } else {
                        ((defpackage.yqj) yqmVar.l().ai(259)).u("notifyReadyToReadNextDataChunk: No pending data");
                    }
                }
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.qzm
    public final void l(qzp qzpVar, int i) {
        ((defpackage.yqj) a.l().ai((char) 264)).w("prepareSending. totalLength=%d", i);
        h(qzpVar);
        synchronized (this.n) {
            this.q = new byte[i];
            this.r = 0;
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qzp] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qzp] */
    public final void n() {
        synchronized (this.m) {
            if (this.v == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(267)).u("removeClient: No registered client");
                return;
            }
            ((defpackage.yqj) a.l().ai(266)).y("removeClient: Removing %s", this.v.a.asBinder());
            this.v.a.asBinder().unlinkToDeath(this.v, 0);
            this.v = null;
        }
    }

    @Override // defpackage.qzm
    public final void o(qzp qzpVar) {
        ((defpackage.yqj) a.l().ai((char) 268)).y("unregisterClient. client=%s", qzpVar.asBinder());
        h(qzpVar);
        n();
        i();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qzp] */
    public final boolean p(int i) {
        synchronized (this.m) {
            defpackage.iko ikoVar = this.v;
            if (ikoVar == null) {
                ((defpackage.yqj) a.l().ai(255)).u("Data available but no client");
                return false;
            }
            try {
                ikoVar.a.e(i);
                return true;
            } catch (android.os.RemoteException unused) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(254)).y("Error in notifyDataToClient for vendor extension %s", this.b);
                return false;
            }
        }
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.e = true;
        this.l = (defpackage.jck) jbqVar;
    }

    @Override // defpackage.qzm
    public final boolean s(qzp qzpVar) {
        ((defpackage.yqj) a.l().ai((char) 265)).y("registerClient. client=%s", qzpVar.asBinder());
        synchronized (this.m) {
            if (this.v != null) {
                return false;
            }
            try {
                this.v = new defpackage.iko(this, qzpVar, 3);
                return true;
            } catch (android.os.RemoteException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.qzm
    public final byte[] t(qzp qzpVar) {
        h(qzpVar);
        return this.j;
    }
}
