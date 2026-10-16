package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.car.senderprotocol.Channel;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class rtt implements rtm {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public static final vqk j = new vqk("debug.car.framer_send_latency");
    final rvi b;
    public final AtomicBoolean c;
    public final Semaphore d;
    public rvg e;
    public rsl f;
    final boolean g;
    final int h;
    final boolean i;
    public final uxc k;
    public final wyd l;
    private final rtr m;
    private final rts n;
    private final Context o;
    private final rue p;

    public rtt(rtl rtlVar) {
        rts rtsVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.c = atomicBoolean;
        this.d = new Semaphore(0);
        wyd wydVar = rtlVar.f;
        this.l = wydVar;
        this.e = null;
        this.f = null;
        this.o = rtlVar.d;
        rto rtoVar = rtlVar.c;
        boolean z = rtoVar.d;
        this.g = z;
        int i = rtoVar.a;
        this.h = i;
        boolean z2 = rtoVar.c;
        this.i = z2;
        this.k = z ? new uxc(i) : null;
        rtq rtqVar = new rtq(rtlVar.d, rtlVar.a, rtlVar.c);
        rtqVar.start();
        this.p = new rue(rtqVar);
        int i2 = rtlVar.c.b;
        if (i2 > 0) {
            rtsVar = new rts(this, rtlVar.b, i2);
            this.n = rtsVar;
        } else {
            rtsVar = new rts(this, rtlVar.b);
            this.n = rtsVar;
        }
        Bundle bundle = new Bundle();
        a.f().ai(8306).y("Creating thread writer. QosEnabled=%b", Boolean.valueOf(z));
        this.b = z ? new rup(rtsVar, wydVar, z2, bundle) : new rtj(rtsVar, wydVar, bundle);
        this.m = new rtr(this, rtlVar.e);
        atomicBoolean.set(false);
    }

    @Override // defpackage.rtm
    public final void a(Bundle bundle) {
        if (this.e == null) {
            throw new IllegalStateException("Can't bundle framer");
        }
        bundle.putBinder("reader", this.p);
        bundle.putBoolean("qos_enabled", this.g);
        bundle.putBoolean("concurrent_channel_map_enabled", this.i);
        bundle.putInt("reader_version", 1);
        bundle.putInt("max_fragment_size", this.h);
        rtr rtrVar = this.m;
        ByteBuffer[][] byteBufferArr = {rtrVar.a, new ByteBuffer[]{rtrVar.b}, new ByteBuffer[]{rtrVar.c}};
        ypf ypfVar = ruw.a;
        bundle.putBinder("receiver_buffers", new ruc(byteBufferArr));
        bundle.putIntArray("receiver_state", new int[]{rtrVar.d, rtrVar.e, rtrVar.f, rtrVar.g, rtrVar.h, rtrVar.i});
        rts rtsVar = this.n;
        bundle.putBinder("output_stream", new ruc(rtsVar.b));
        bundle.putBoolean("use_buffered_output_stream", rtsVar.a);
        this.b.a(bundle);
    }

    @Override // defpackage.rtm
    public final void b() throws IOException {
        rvi rviVar = this.b;
        rviVar.quitSafely();
        yrm.aD(rviVar);
    }

    @Override // defpackage.rtm
    public final void c(Channel channel) {
        this.b.c(channel);
    }

    @Override // defpackage.rtm
    public final void d() throws InterruptedException, IOException {
        Context context = this.o;
        if (context != null && (this.c.get() || this.b.f())) {
            ols.M(context, yxi.FRAMER_STOPPED);
        }
        Thread thread = null;
        if (this.c.compareAndSet(true, false)) {
            try {
                thread = (Thread) ruc.a(this.p.a());
            } catch (RemoteException e) {
                a.g().p(e).ai(8311).u("Impossible");
            }
        }
        if (thread != null) {
            try {
                thread.join(400L);
            } catch (InterruptedException unused) {
            }
            if (thread.isAlive()) {
                a.h().ai(8310).u("reader thread stuck? Trying SIGQUIT.");
                Process.sendSignal(Process.myPid(), 3);
                Process.sendSignal(Process.myPid(), 3);
                try {
                    thread.join(400L);
                } catch (InterruptedException unused2) {
                }
                if (thread.isAlive()) {
                    ((rta) this.l.a).r.c();
                }
            }
        }
        this.b.e();
    }

    @Override // defpackage.rtm
    public final void e(rsl rslVar) {
        this.f = rslVar;
        try {
            this.p.b(rslVar != null ? new rtz(rslVar) : null);
        } catch (RemoteException e) {
            a.g().p(e).ai(8307).u("Impossible");
        }
    }

    @Override // defpackage.rtm
    public final void f(rvg rvgVar) {
        this.e = rvgVar;
        rvgVar.j[0] = ByteBuffer.allocateDirect(rvgVar.m + 8);
        this.d.release();
        a.l().ai(8308).u("Ssl negotiation complete, turning on encryption!");
    }

    @Override // defpackage.rtm
    public final void g() {
        rvi rviVar = this.b;
        synchronized (rviVar.e) {
            if (!rviVar.d) {
                rviVar.d = true;
                rviVar.start();
            }
        }
        if (this.c.compareAndSet(false, true)) {
            try {
                rue rueVar = this.p;
                rtr rtrVar = this.m;
                ypf ypfVar = ruw.a;
                if (!rueVar.d(new ruc(rtrVar))) {
                    this.l.d(yzf.READER_INIT_FAIL);
                }
            } catch (RemoteException e) {
                a.g().p(e).ai(8309).u("Impossible");
            }
        }
        Context context = this.o;
        if (context != null) {
            ols.M(context, yxi.FRAMER_STARTED);
        }
    }

    @Override // defpackage.rtm
    public final void h() {
        if (this.c.get()) {
            try {
                this.p.c();
            } catch (RemoteException e) {
                a.g().p(e).ai(8314).u("Impossible");
            }
        } else {
            a.h().ai(8312).u("Reader already stopped, so not stopping it again.");
        }
        rvi rviVar = this.b;
        if (!rviVar.f()) {
            a.h().ai(8313).u("Writer already stopped, so it probably won't be stopped again.");
        }
        rviVar.e();
        yrm.aD(rviVar);
    }

    @Override // defpackage.rtm
    public final void i(int i, ByteBuffer byteBuffer, boolean z, rtb rtbVar) {
        yfq yfqVarG;
        int i2;
        int i3;
        vqk vqkVar = rsm.a;
        rlc.a(vqkVar);
        boolean z2 = !z;
        rts rtsVar = this.n;
        if (z && byteBuffer.position() > rtsVar.c.h - 4) {
            throw new IllegalArgumentException("Message is too long to send as one fragment");
        }
        ChannelMessage channelMessage = new ChannelMessage(i, byteBuffer, byteBuffer.position(), z2, z, rtbVar.b, rtbVar.a, rtbVar.c, 0);
        rtt rttVar = rtsVar.c;
        uxc uxcVar = rttVar.k;
        if (uxcVar == null || !uxcVar.b(channelMessage)) {
            rttVar.b.b(channelMessage);
        } else {
            rvi rviVar = rttVar.b;
            if (uxcVar.b(channelMessage)) {
                int i4 = yfq.d;
                int i5 = 4;
                yfl yflVar = new yfl(4);
                int i6 = 0;
                while (true) {
                    int i7 = channelMessage.d;
                    if (i6 >= i7) {
                        break;
                    }
                    if (i6 == 0) {
                        i3 = 8;
                        i2 = 0;
                    } else {
                        i2 = i6;
                        i3 = i5;
                    }
                    int i8 = uxcVar.a;
                    int i9 = channelMessage.b;
                    ByteBuffer byteBuffer2 = channelMessage.c;
                    boolean z3 = channelMessage.e;
                    boolean z4 = channelMessage.f;
                    boolean z5 = channelMessage.g;
                    boolean z6 = channelMessage.h;
                    int i10 = channelMessage.i;
                    int iMin = Math.min(i7 - i2, i8 - i3);
                    yflVar.i(new ChannelMessage(i9, byteBuffer2, i7, z3, z4, z5, z6, i10, i2));
                    i6 = i2 + iMin;
                    i5 = 4;
                }
                yfqVarG = yflVar.g();
            } else {
                yfqVarG = yfq.q(channelMessage);
            }
            rviVar.d(yfqVarG);
        }
        Thread.yield();
        rlc.a(vqkVar);
    }
}
