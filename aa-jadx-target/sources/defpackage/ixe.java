package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixe extends defpackage.qwc implements android.os.IBinder.DeathRecipient {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.MIC");
    public final java.lang.String b;
    public final defpackage.ixb c;
    qwg g;
    java.io.OutputStream h;
    private final defpackage.ixh i;
    private final defpackage.ixi j;
    private final android.content.Context k;
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.Set e = new java.util.concurrent.CopyOnWriteArraySet();
    final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger(0);
    private boolean l = false;

    public ixe(defpackage.ixb ixbVar, defpackage.ixh ixhVar, defpackage.ixi ixiVar, android.content.Context context, java.lang.String str) {
        this.c = ixbVar;
        this.i = ixhVar;
        this.j = ixiVar;
        this.k = context;
        this.b = str;
    }

    private final void l(qwg qwgVar) {
        defpackage.ysr.aY(qwgVar != null, "callback is null");
        defpackage.ysr.bk(this.g != null, "token has not been set");
        if (this.g.asBinder() != qwgVar.asBinder()) {
            throw new java.lang.SecurityException("invalid client token");
        }
    }

    private final void m(defpackage.ouz ouzVar, boolean z) {
        int iA = defpackage.ill.a(this.k, "android.permission.RECORD_AUDIO");
        if (iA != -2) {
            if (iA != -1) {
                return;
            }
            throw new java.lang.SecurityException("client does not have permission:android.permission.RECORD_AUDIO pid:" + android.os.Binder.getCallingPid() + " uid:" + android.os.Binder.getCallingUid());
        }
        o(ouzVar);
        if (!z) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1499)).u("App Op permission denied");
            return;
        }
        throw new java.lang.SecurityException("client does not have app op permission:android.permission.RECORD_AUDIO pid:" + android.os.Binder.getCallingPid() + " uid:" + android.os.Binder.getCallingUid());
    }

    private final void n() {
        j();
        b();
        q();
        this.e.clear();
        this.i.j(this);
    }

    private final void o(defpackage.ouz ouzVar) {
        defpackage.ixi ixiVar = this.j;
        ixiVar.getClass();
        defpackage.isn isnVar = ixiVar.j;
        isnVar.getClass();
        isnVar.b(this.b, ouzVar);
    }

    private final void p(ouu ouuVar) {
        this.j.j.a(this.b, ouuVar);
    }

    private final void q() {
        qwg qwgVar = this.g;
        if (qwgVar != null) {
            try {
                qwgVar.asBinder().unlinkToDeath(this, 0);
            } catch (java.util.NoSuchElementException unused) {
            }
            this.g = null;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized android.os.ParcelFileDescriptor a(qwg qwgVar) {
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        this.i.i();
        l(qwgVar);
        if (!this.l) {
            m(defpackage.ouz.APP_OP_DENIED_DEFERRED, true);
            this.l = true;
        }
        defpackage.ixi ixiVar = this.j;
        ixiVar.j.e(this.b);
        try {
            parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
            this.h = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
            this.f.set(0);
            o(defpackage.ouz.OUTPUT_STREAM_CREATED);
        } catch (java.io.IOException unused) {
            ((defpackage.yqj) a.l().ai((char) 1502)).u("Error creating pipe");
            o(defpackage.ouz.IO_ERROR_CREATING_OUTPUT_STREAM);
            defpackage.ixi ixiVar2 = this.j;
            ixiVar2.j.f(this.b);
            return null;
        }
        return parcelFileDescriptorArrCreatePipe[0];
    }

    public final void b() {
        boolean zIsEmpty;
        java.io.OutputStream outputStream;
        int andSet = this.d.getAndSet(0);
        j$.lang.Iterable.-EL.forEach(this.e, new defpackage.ixc(0));
        if (andSet != 0) {
            try {
                java.io.OutputStream outputStream2 = this.h;
                if (outputStream2 != null) {
                    outputStream2.close();
                    o(defpackage.ouz.OUTPUT_STREAM_CLOSED);
                } else {
                    o(defpackage.ouz.OUTPUT_STREAM_ALREADY_CLOSED);
                }
                this.h = null;
            } catch (java.io.IOException unused) {
                o(defpackage.ouz.IO_ERROR_CLOSING_OUTPUT_STREAM);
            }
            defpackage.ixi ixiVar = this.j;
            ixiVar.j.f(this.b);
            ixiVar.a();
            java.util.List list = ixiVar.e;
            synchronized (list) {
                list.remove(this);
                zIsEmpty = list.isEmpty();
            }
            if (zIsEmpty) {
                ixiVar.g = false;
                ixiVar.f();
                defpackage.jbg jbgVar = ixiVar.d;
                if (jbgVar.b) {
                    defpackage.abor aborVarN = xlt.a.n();
                    aborVarN.t();
                    xlt xltVar = aborVarN.b;
                    xltVar.b |= 1;
                    xltVar.c = false;
                    jbgVar.k(32773, aborVarN.q());
                    jbgVar.b = false;
                    defpackage.jbg.a.f().ai(1752).w("Sent microphone close request, frames received %d", jbgVar.c);
                } else {
                    defpackage.jbg.a.h().ai(1751).u("Microphone already closed");
                }
                defpackage.isn isnVar = ixiVar.j;
                isnVar.b("MicInputService", defpackage.ouz.MICROPHONE_CLOSED);
                isnVar.f("MicInputService");
                if (ixiVar.i) {
                    iwc iwcVar = ixiVar.k;
                    if (iwcVar != null && (outputStream = iwcVar.b) != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    ixiVar.k = null;
                }
            } else {
                ((defpackage.yqj) defpackage.ixi.a.l().ai((char) 1520)).u("Microphone still being used by another service.");
                ixiVar.j.b("MicInputService", defpackage.ouz.MICROPHONE_CLOSE_REQUESTED_BUT_STILL_IN_USE);
            }
            j();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        n();
    }

    public final synchronized void c(java.nio.ByteBuffer byteBuffer) {
        try {
            if (this.d.get() != 1) {
                p(ouu.b);
                return;
            }
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit() - iPosition;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f;
            if (atomicInteger.get() + iLimit > 16384) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1505)).u("client q limit exceeded. throw away data");
                p(ouu.c);
                return;
            }
            java.io.OutputStream outputStream = this.h;
            if (outputStream != null) {
                ((defpackage.yqj) a.l().ai(1504)).K("write %s len:%d", this.b, iLimit);
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iLimit);
            } else {
                p(ouu.d);
            }
            atomicInteger.addAndGet(iLimit);
            j();
        } catch (java.io.IOException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 1503)).u("Error writing audio to OutputStream");
            p(ouu.e);
        }
    }

    public final void d(qwg qwgVar, int i) {
        l(qwgVar);
        this.f.addAndGet(-i);
    }

    public final void f(qwg qwgVar) {
        this.i.i();
        defpackage.ysr.bk(this.g == null, "callback already registered");
        m(defpackage.ouz.APP_OP_DENIED, false);
        try {
            qwgVar.asBinder().linkToDeath(this, 0);
            this.g = qwgVar;
        } catch (android.os.RemoteException unused) {
            this.i.j(this);
        }
    }

    public final void g(qwg qwgVar) {
        l(qwgVar);
        n();
    }

    public final void h(qwg qwgVar) {
        int size;
        this.i.i();
        l(qwgVar);
        defpackage.ysr.bk(this.h != null, "getInputFileDescriptor not called");
        boolean zCompareAndSet = this.d.compareAndSet(0, 1);
        j$.lang.Iterable.-EL.forEach(this.e, new defpackage.ixc(2));
        defpackage.ysr.bk(zCompareAndSet, "already started");
        defpackage.ixi ixiVar = this.j;
        ixiVar.a();
        java.util.List list = ixiVar.e;
        synchronized (list) {
            list.add(this);
            size = list.size();
        }
        if (size == 1) {
            ixiVar.g = true;
            ixiVar.f.set(0);
            defpackage.jbg jbgVar = ixiVar.d;
            if (jbgVar.b) {
                defpackage.jbg.a.h().ai(1753).u("Microphone already open");
            } else {
                jbgVar.c = 0;
                defpackage.abor aborVarN = xlt.a.n();
                aborVarN.t();
                xlt xltVar = aborVarN.b;
                xltVar.b |= 1;
                xltVar.c = true;
                aborVarN.t();
                xlt xltVar2 = aborVarN.b;
                xltVar2.b |= 2;
                xltVar2.d = false;
                aborVarN.t();
                xlt xltVar3 = aborVarN.b;
                xltVar3.b |= 4;
                xltVar3.e = false;
                aborVarN.t();
                xlt xltVar4 = aborVarN.b;
                xltVar4.b |= 8;
                xltVar4.f = 2;
                jbgVar.k(32773, aborVarN.q());
                jbgVar.b = true;
                defpackage.jbg.a.f().ai(1754).u("Sent microphone open request");
            }
            ixiVar.e();
            defpackage.isn isnVar = ixiVar.j;
            isnVar.e("MicInputService");
            isnVar.b("MicInputService", defpackage.ouz.MICROPHONE_OPENED);
            if (ixiVar.i) {
                ixiVar.k = new iwc(ixiVar.h);
            }
        } else {
            ((defpackage.yqj) defpackage.ixi.a.l().ai((char) 1519)).u("Microphone already open.");
            ixiVar.j.b("MicInputService", defpackage.ouz.MICROPHONE_ALREADY_OPEN);
        }
        o(defpackage.ouz.RECORDING_STARTED);
    }

    public final void i(qwg qwgVar) {
        l(qwgVar);
        b();
    }

    public final synchronized void j() {
        notifyAll();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean k(qwg qwgVar, int i) {
        l(qwgVar);
        synchronized (this) {
            while (this.f.get() < i && this.d.get() == 1) {
                try {
                    wait();
                    this.i.i();
                } catch (java.lang.InterruptedException unused) {
                    o(defpackage.ouz.THREAD_INTERRUPTED_WHILE_WAITING_FOR_DATA);
                    return false;
                }
            }
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f;
        if (atomicInteger.get() < i) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1510)).w("Not enough data to fulfill %d bytes", i);
            return false;
        }
        if (this.d.get() == 1) {
            return true;
        }
        o(defpackage.ouz.MICROPHONE_CLOSED_WHILE_WAITING_FOR_DATA);
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1509)).w("Microphone closed with pending data: %d", atomicInteger.get());
        return false;
    }
}
