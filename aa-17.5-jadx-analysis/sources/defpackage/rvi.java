package defpackage;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Process;
import com.google.android.gms.car.senderprotocol.Channel;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class rvi extends HandlerThread {
    private static final ypf a = ols.R("CAR.GAL.GAL");
    private final wyd b;
    protected volatile boolean d;
    public final Object e;
    protected final rts f;

    protected rvi(rts rtsVar, wyd wydVar) {
        super("WriterThread");
        this.e = new Object();
        this.f = rtsVar;
        this.b = wydVar;
    }

    public abstract void a(Bundle bundle);

    public abstract void b(ChannelMessage channelMessage);

    /* JADX WARN: Multi-variable type inference failed */
    public void d(Collection collection) {
        ynp ynpVarListIterator = ((yfq) collection).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            b((ChannelMessage) ynpVarListIterator.next());
        }
    }

    public final void e() {
        synchronized (this.e) {
            if (this.d) {
                this.d = false;
                quitSafely();
            }
        }
    }

    public final boolean f() {
        boolean z;
        synchronized (this.e) {
            z = this.d;
        }
        return z;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(-19);
        try {
            super.run();
        } catch (Exception e) {
            a.f().p(e).ai(8407).u("Exception received: ");
            boolean z = this.d;
            synchronized (this.e) {
                this.d = false;
                if (z) {
                    a.g().ai(8409).u("WriterThread: exiting due to IO error");
                    this.b.d(yzf.WRITER_IO_ERROR);
                } else {
                    a.g().p(e).ai(8408).u("WriterThread: crashing with exception");
                    this.b.d(yzf.WRITER_UNKNOWN_EXCEPTION);
                }
            }
        }
    }

    public void c(Channel channel) {
    }
}
