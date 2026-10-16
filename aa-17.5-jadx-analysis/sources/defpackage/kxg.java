package defpackage;

import android.content.Context;
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

/* loaded from: classes.dex */
public final class kxg extends Handler {
    public final ExecutorService a;
    public volatile ParcelFileDescriptor.AutoCloseOutputStream b;
    public final byte[] c;
    public final rny d;
    private final yph e;
    private long f;
    private final lah g;
    private final Semaphore h;
    private final Context i;

    public kxg(Context context, rny rnyVar, Looper looper) {
        super(looper);
        this.e = yph.c("GH.CarMicRecorder");
        this.f = 0L;
        this.g = lah.a();
        this.h = new Semaphore(1);
        this.a = Executors.newCachedThreadPool();
        this.c = new byte[sk.AUDIO_CONTENT_BUFFER_SIZE];
        this.i = context;
        this.d = rnyVar;
    }

    private final void c() {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b;
        yph yphVar = this.e;
        if (autoCloseOutputStream == null) {
            ((ype) yphVar.l().ai(3473)).u("No clean up needed. Output stream was already closed.");
            this.g.h(410, null);
            return;
        }
        ((ype) ((ype) yphVar.f()).ai(3472)).L("Clean up recording to output stream: %s, total bytes sent: %d", this.b, this.f);
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
                this.d.c();
                this.h.release();
                this.b = null;
                this.g.h(312, null);
            } catch (IOException e) {
                e(e, 308);
            } catch (RuntimeException e2) {
                e(e2, 311);
            }
        } finally {
            this.h.release();
            this.b = null;
        }
    }

    private final void d(Message message) {
        if (super.sendMessage(message)) {
            return;
        }
        e(new IllegalStateException(a.cc(message, "Failed to send message to the looper: ")), 315);
    }

    private final void e(Exception exc, int i) {
        ((ype) ((ype) ((ype) this.e.g()).p(exc)).ai((char) 3483)).y("%s", new zjd(zjc.a, zeb.y(i)));
        byte[] bArr = null;
        this.g.h(i, null);
        yyi yyiVarB = yyi.b((int) acvz.b());
        if (yyiVarB == null || !kxf.a.contains(yyiVarB)) {
            return;
        }
        wer.e(new kot(String.format(Locale.US, "MicrophoneRecorderImpl Crash (event=%s, gearheadChannel=%s)", zeb.y(i), yyiVarB.name()), exc, 5, bArr));
    }

    public final synchronized ParcelFileDescriptor a() throws IOException {
        yph yphVar = this.e;
        ((ype) ((ype) yphVar.f()).ai((char) 3484)).u("Start new recording.");
        if (!this.h.tryAcquire()) {
            ((ype) ((ype) yphVar.h()).ai((char) 3485)).u("Another recording is currently active.");
            this.g.h(403, null);
            return null;
        }
        ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
        d(obtainMessage(0, parcelFileDescriptorArrCreateReliablePipe[1]));
        return parcelFileDescriptorArrCreateReliablePipe[0];
    }

    public final synchronized void b() {
        ((ype) ((ype) this.e.f()).ai((char) 3486)).u("Stop recording.");
        d(obtainMessage(2));
        getLooper().getThread().interrupt();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) message.obj;
            if (this.b != null) {
                e(new IllegalStateException("Previous output stream not closed"), 316);
                return;
            }
            this.f = 0L;
            this.b = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            ((ype) ((ype) this.e.f()).ai(3474)).y("Start new recording to output stream: %s", this.b);
            kxd.b(this.i);
            try {
                this.d.b();
                Thread.interrupted();
                d(obtainMessage(1));
                this.g.h(404, null);
                return;
            } catch (SecurityException e) {
                e(e, 408);
                c();
                return;
            } catch (qrz e2) {
                e(e2, 314);
                c();
                return;
            } catch (Exception e3) {
                e(e3, 306);
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
            ((ype) ((ype) this.e.h()).ai((char) 3476)).u("Invalid recording action: output stream was already closed.");
            this.g.h(317, null);
            return;
        }
        try {
            int iIntValue = ((Integer) this.a.submit(new flt(this, 5)).get()).intValue();
            if (iIntValue == -1) {
                ((ype) ((ype) this.e.f()).ai((char) 3479)).u("Recording finished: no more data available");
                this.g.h(303, null);
                c();
                return;
            }
            String strBp = a.bp(iIntValue, "Unexpected bytes read: ");
            if (iIntValue < 0) {
                e(new IllegalStateException(strBp), 318);
            }
            if (iIntValue < 0) {
                c();
                return;
            }
            if (iIntValue > 0) {
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.b;
                    autoCloseOutputStream.getClass();
                    autoCloseOutputStream.write(this.c, 0, iIntValue);
                    this.f += iIntValue;
                } catch (IOException unused) {
                    ((ype) ((ype) this.e.f()).ai((char) 3478)).u("Recording finished: failed to write to output stream");
                    this.g.h(305, null);
                    c();
                    return;
                }
            }
            d(obtainMessage(1));
        } catch (InterruptedException unused2) {
            ((ype) ((ype) this.e.h()).ai((char) 3480)).u("Read interrupted");
            this.g.h(304, null);
            c();
        } catch (ExecutionException e4) {
            boolean z = e4.getCause() instanceof rku;
            yph yphVar = this.e;
            if (z) {
                ((ype) ((ype) yphVar.h()).ai((char) 3482)).u("Car disconnected during carAudioRecord.read");
                this.g.h(319, null);
            } else {
                ((ype) ((ype) yphVar.g()).ai((char) 3481)).u("Read failed");
                e(e4, 306);
            }
            c();
        }
    }
}
