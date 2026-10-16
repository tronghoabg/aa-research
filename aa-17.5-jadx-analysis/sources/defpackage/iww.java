package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.lang.Iterable$EL;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class iww extends qvg implements IBinder.DeathRecipient {
    public static final yph a = yph.c("CAR.MIC");
    public final String b;
    public final iwt c;
    qvk g;
    OutputStream h;
    private final iwz i;
    private final ixa j;
    private final Context k;
    public final AtomicInteger d = new AtomicInteger(0);
    public final Set e = new CopyOnWriteArraySet();
    final AtomicInteger f = new AtomicInteger(0);
    private boolean l = false;

    public iww(iwt iwtVar, iwz iwzVar, ixa ixaVar, Context context, String str) {
        this.c = iwtVar;
        this.i = iwzVar;
        this.j = ixaVar;
        this.k = context;
        this.b = str;
    }

    private final void l(qvk qvkVar) {
        woy.O(qvkVar != null, "callback is null");
        woy.aa(this.g != null, "token has not been set");
        if (this.g.asBinder() != qvkVar.asBinder()) {
            throw new SecurityException("invalid client token");
        }
    }

    private final void m(ouc oucVar, boolean z) {
        int iA = ilb.a(this.k, "android.permission.RECORD_AUDIO");
        if (iA != -2) {
            if (iA != -1) {
                return;
            }
            throw new SecurityException("client does not have permission:android.permission.RECORD_AUDIO pid:" + Binder.getCallingPid() + " uid:" + Binder.getCallingUid());
        }
        o(oucVar);
        if (!z) {
            ((ype) ((ype) a.h()).ai((char) 1499)).u("App Op permission denied");
            return;
        }
        throw new SecurityException("client does not have app op permission:android.permission.RECORD_AUDIO pid:" + Binder.getCallingPid() + " uid:" + Binder.getCallingUid());
    }

    private final void n() throws IOException {
        j();
        b();
        q();
        this.e.clear();
        this.i.j(this);
    }

    private final void o(ouc oucVar) {
        ixa ixaVar = this.j;
        ixaVar.getClass();
        isf isfVar = ixaVar.j;
        isfVar.getClass();
        isfVar.b(this.b, oucVar);
    }

    private final void p(otx otxVar) {
        this.j.j.a(this.b, otxVar);
    }

    private final void q() {
        qvk qvkVar = this.g;
        if (qvkVar != null) {
            try {
                qvkVar.asBinder().unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            this.g = null;
        }
    }

    @Override // defpackage.qvh
    @ResultIgnorabilityUnspecified
    public final synchronized ParcelFileDescriptor a(qvk qvkVar) {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        this.i.i();
        l(qvkVar);
        if (!this.l) {
            m(ouc.APP_OP_DENIED_DEFERRED, true);
            this.l = true;
        }
        ixa ixaVar = this.j;
        ixaVar.j.e(this.b);
        try {
            parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            this.h = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
            this.f.set(0);
            o(ouc.OUTPUT_STREAM_CREATED);
        } catch (IOException unused) {
            ((ype) a.l().ai((char) 1502)).u("Error creating pipe");
            o(ouc.IO_ERROR_CREATING_OUTPUT_STREAM);
            ixa ixaVar2 = this.j;
            ixaVar2.j.f(this.b);
            return null;
        }
        return parcelFileDescriptorArrCreatePipe[0];
    }

    public final void b() throws IOException {
        boolean zIsEmpty;
        OutputStream outputStream;
        int andSet = this.d.getAndSet(0);
        Iterable$EL.forEach(this.e, new iwu(0));
        if (andSet != 0) {
            try {
                OutputStream outputStream2 = this.h;
                if (outputStream2 != null) {
                    outputStream2.close();
                    o(ouc.OUTPUT_STREAM_CLOSED);
                } else {
                    o(ouc.OUTPUT_STREAM_ALREADY_CLOSED);
                }
                this.h = null;
            } catch (IOException unused) {
                o(ouc.IO_ERROR_CLOSING_OUTPUT_STREAM);
            }
            ixa ixaVar = this.j;
            ixaVar.j.f(this.b);
            ixaVar.a();
            List list = ixaVar.e;
            synchronized (list) {
                list.remove(this);
                zIsEmpty = list.isEmpty();
            }
            if (zIsEmpty) {
                ixaVar.g = false;
                ixaVar.f();
                jaz jazVar = ixaVar.d;
                if (jazVar.b) {
                    abnp abnpVarN = xks.a.n();
                    abnpVarN.t();
                    xks xksVar = (xks) abnpVarN.b;
                    xksVar.b |= 1;
                    xksVar.c = false;
                    jazVar.k(32773, (xks) abnpVarN.q());
                    jazVar.b = false;
                    jaz.a.f().ai(1752).w("Sent microphone close request, frames received %d", jazVar.c);
                } else {
                    jaz.a.h().ai(1751).u("Microphone already closed");
                }
                isf isfVar = ixaVar.j;
                isfVar.b("MicInputService", ouc.MICROPHONE_CLOSED);
                isfVar.f("MicInputService");
                if (ixaVar.i) {
                    ivu ivuVar = ixaVar.k;
                    if (ivuVar != null && (outputStream = ivuVar.b) != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    ixaVar.k = null;
                }
            } else {
                ((ype) ixa.a.l().ai((char) 1520)).u("Microphone still being used by another service.");
                ixaVar.j.b("MicInputService", ouc.MICROPHONE_CLOSE_REQUESTED_BUT_STILL_IN_USE);
            }
            j();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() throws IOException {
        n();
    }

    public final synchronized void c(ByteBuffer byteBuffer) {
        try {
            if (this.d.get() != 1) {
                p(otx.MICROPHONE_NOT_OPEN);
                return;
            }
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit() - iPosition;
            AtomicInteger atomicInteger = this.f;
            if (atomicInteger.get() + iLimit > 16384) {
                ((ype) ((ype) a.h()).ai(1505)).u("client q limit exceeded. throw away data");
                p(otx.CLIENT_QUEUE_LIMIT_EXCEEDED);
                return;
            }
            OutputStream outputStream = this.h;
            if (outputStream != null) {
                ((ype) a.l().ai(1504)).K("write %s len:%d", this.b, iLimit);
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iLimit);
            } else {
                p(otx.MISSING_OUTPUT_STREAM);
            }
            atomicInteger.addAndGet(iLimit);
            j();
        } catch (IOException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 1503)).u("Error writing audio to OutputStream");
            p(otx.IO_ERROR_WRITING_TO_OUTPUT_STREAM);
        }
    }

    @Override // defpackage.qvh
    public final void d(qvk qvkVar, int i) {
        l(qvkVar);
        this.f.addAndGet(-i);
    }

    @Override // defpackage.qvh
    public final void f(qvk qvkVar) throws RemoteException {
        this.i.i();
        woy.aa(this.g == null, "callback already registered");
        m(ouc.APP_OP_DENIED, false);
        try {
            qvkVar.asBinder().linkToDeath(this, 0);
            this.g = qvkVar;
        } catch (RemoteException unused) {
            this.i.j(this);
        }
    }

    @Override // defpackage.qvh
    public final void g(qvk qvkVar) throws IOException {
        l(qvkVar);
        n();
    }

    @Override // defpackage.qvh
    public final void h(qvk qvkVar) {
        int size;
        this.i.i();
        l(qvkVar);
        woy.aa(this.h != null, "getInputFileDescriptor not called");
        boolean zCompareAndSet = this.d.compareAndSet(0, 1);
        Iterable$EL.forEach(this.e, new iwu(2));
        woy.aa(zCompareAndSet, "already started");
        ixa ixaVar = this.j;
        ixaVar.a();
        List list = ixaVar.e;
        synchronized (list) {
            list.add(this);
            size = list.size();
        }
        if (size == 1) {
            ixaVar.g = true;
            ixaVar.f.set(0);
            jaz jazVar = ixaVar.d;
            if (jazVar.b) {
                jaz.a.h().ai(1753).u("Microphone already open");
            } else {
                jazVar.c = 0;
                abnp abnpVarN = xks.a.n();
                abnpVarN.t();
                xks xksVar = (xks) abnpVarN.b;
                xksVar.b |= 1;
                xksVar.c = true;
                abnpVarN.t();
                xks xksVar2 = (xks) abnpVarN.b;
                xksVar2.b |= 2;
                xksVar2.d = false;
                abnpVarN.t();
                xks xksVar3 = (xks) abnpVarN.b;
                xksVar3.b |= 4;
                xksVar3.e = false;
                abnpVarN.t();
                xks xksVar4 = (xks) abnpVarN.b;
                xksVar4.b |= 8;
                xksVar4.f = 2;
                jazVar.k(32773, (xks) abnpVarN.q());
                jazVar.b = true;
                jaz.a.f().ai(1754).u("Sent microphone open request");
            }
            ixaVar.e();
            isf isfVar = ixaVar.j;
            isfVar.e("MicInputService");
            isfVar.b("MicInputService", ouc.MICROPHONE_OPENED);
            if (ixaVar.i) {
                ixaVar.k = new ivu(ixaVar.h);
            }
        } else {
            ((ype) ixa.a.l().ai((char) 1519)).u("Microphone already open.");
            ixaVar.j.b("MicInputService", ouc.MICROPHONE_ALREADY_OPEN);
        }
        o(ouc.RECORDING_STARTED);
    }

    @Override // defpackage.qvh
    public final void i(qvk qvkVar) throws IOException {
        l(qvkVar);
        b();
    }

    public final synchronized void j() {
        notifyAll();
    }

    @Override // defpackage.qvh
    @ResultIgnorabilityUnspecified
    public final boolean k(qvk qvkVar, int i) {
        l(qvkVar);
        synchronized (this) {
            while (this.f.get() < i && this.d.get() == 1) {
                try {
                    wait();
                    this.i.i();
                } catch (InterruptedException unused) {
                    o(ouc.THREAD_INTERRUPTED_WHILE_WAITING_FOR_DATA);
                    return false;
                }
            }
        }
        AtomicInteger atomicInteger = this.f;
        if (atomicInteger.get() < i) {
            ((ype) ((ype) a.f()).ai((char) 1510)).w("Not enough data to fulfill %d bytes", i);
            return false;
        }
        if (this.d.get() == 1) {
            return true;
        }
        o(ouc.MICROPHONE_CLOSED_WHILE_WAITING_FOR_DATA);
        ((ype) ((ype) a.h()).ai((char) 1509)).w("Microphone closed with pending data: %d", atomicInteger.get());
        return false;
    }
}
