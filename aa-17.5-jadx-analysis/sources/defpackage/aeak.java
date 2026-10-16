package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class aeak implements Runnable {
    final /* synthetic */ aeal b;

    public aeak(aeal aealVar) {
        this.b = aealVar;
    }

    public abstract void a() throws IOException;

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            if (this.b.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.b.c.d(e);
        }
    }
}
