package defpackage;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class kxl extends Handler {
    public final ExecutorService a;
    public volatile ParcelFileDescriptor.AutoCloseOutputStream b;
    public final AudioRecord c;
    public final byte[] d;
    private final yph e;
    private long f;
    private final lah g;
    private final Semaphore h;
    private final Context i;

    public kxl(Context context, AudioRecord audioRecord, Looper looper) {
        super(looper);
        this.e = yph.c("GH.PhoneMicRecorder");
        this.f = 0L;
        this.g = lah.a();
        this.h = new Semaphore(1);
        this.a = Executors.newCachedThreadPool();
        this.d = new byte[8192];
        this.i = context;
        this.c = audioRecord;
    }

    private final void c() {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b;
        yph yphVar = this.e;
        if (autoCloseOutputStream == null) {
            ((ype) yphVar.l().ai(3492)).u("No clean up needed. Output stream was already closed.");
            this.g.h(410, null);
            return;
        }
        ((ype) ((ype) yphVar.f()).ai(3491)).L("Clean up recording to output stream: %s, total bytes sent: %d", this.b, this.f);
        lah lahVar = this.g;
        lahVar.h(307, null);
        lahVar.b(this.f);
        this.f = 0L;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = this.b;
                autoCloseOutputStream2.getClass();
                autoCloseOutputStream2.close();
                lahVar.h(309, null);
                this.c.stop();
                this.b = null;
                this.h.release();
                this.g.h(312, null);
            } catch (IOException e) {
                e(e, 308);
            } catch (RuntimeException e2) {
                e(e2, 311);
            }
        } finally {
            this.b = null;
            this.h.release();
        }
    }

    private final void d(Message message) {
        if (super.sendMessage(message)) {
            return;
        }
        e(new IllegalStateException(a.cc(message, "Failed to send message to the looper: ")), 315);
    }

    private final void e(Exception exc, int i) {
        ((ype) ((ype) ((ype) this.e.g()).p(exc)).ai((char) 3501)).y("%s", new zjd(zjc.a, zeb.y(i)));
        byte[] bArr = null;
        this.g.h(i, null);
        yyi yyiVarB = yyi.b((int) acvz.b());
        if (yyiVarB == null || !kxk.a.contains(yyiVarB)) {
            return;
        }
        wer.e(new kot(String.format(Locale.US, "PhoneMicrophoneRecorderImpl Crash (event=%s, gearheadChannel=%s)", zeb.y(i), yyiVarB.name()), exc, 6, bArr));
    }

    public final synchronized ParcelFileDescriptor a() throws IOException {
        yph yphVar = this.e;
        ((ype) yphVar.l().ai((char) 3502)).u("Start new recording");
        if (!this.h.tryAcquire()) {
            ((ype) ((ype) yphVar.h()).ai((char) 3503)).u("Another recording is currently active.");
            this.g.h(403, null);
            return null;
        }
        ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
        d(obtainMessage(0, parcelFileDescriptorArrCreateReliablePipe[1]));
        return parcelFileDescriptorArrCreateReliablePipe[0];
    }

    public final synchronized void b() {
        ((ype) this.e.l().ai(3504)).u("Stop recording");
        getLooper().getThread().interrupt();
        d(obtainMessage(2));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws IllegalStateException {
        int i = message.what;
        if (i == 0) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) message.obj;
            if (this.b != null) {
                e(new IllegalStateException("Previous output stream not closed"), 316);
                return;
            }
            this.f = 0L;
            this.b = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            ((ype) ((ype) this.e.f()).ai(3493)).y("Start new recording to output stream: %s", this.b);
            kxd.b(this.i);
            try {
                this.c.startRecording();
                Thread.interrupted();
                d(obtainMessage(1));
                this.g.h(404, null);
                return;
            } catch (SecurityException e) {
                e(e, 408);
                c();
                return;
            } catch (Exception e2) {
                e(e2, 306);
                c();
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("Unreachable state");
            }
            c();
            return;
        }
        if (this.b == null) {
            ((ype) ((ype) this.e.h()).ai((char) 3495)).u("Invalid recording action: output stream was already closed.");
            this.g.h(317, null);
            return;
        }
        try {
            int iIntValue = ((Integer) this.a.submit(new flt(this, 6)).get()).intValue();
            if (iIntValue <= 0) {
                if (iIntValue != 0) {
                    e(new IllegalStateException(a.bp(iIntValue, "Unexpected bytes read: ")), 318);
                    c();
                    return;
                } else {
                    ((ype) ((ype) this.e.f()).ai((char) 3496)).u("Recording finished: no more data available");
                    this.g.h(303, null);
                    c();
                    return;
                }
            }
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b;
                autoCloseOutputStream.getClass();
                autoCloseOutputStream.write(this.d, 0, iIntValue);
                this.f += iIntValue;
                d(obtainMessage(1));
            } catch (IOException e3) {
                ((ype) ((ype) ((ype) this.e.h()).p(e3)).ai((char) 3498)).u("Recording finished: failed to write to output stream");
                this.g.h(305, null);
                c();
            }
        } catch (InterruptedException unused) {
            ((ype) ((ype) this.e.h()).ai((char) 3499)).u("Recording interrupted");
            this.g.h(304, null);
            c();
        } catch (ExecutionException e4) {
            ((ype) ((ype) this.e.g()).ai((char) 3500)).u("Recording failed");
            e(e4, 306);
            c();
        }
    }
}
