package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class ajmi implements ajmj {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public ajnb c;
    public ajnb d;
    public IOException e;

    @Override // defpackage.ajmj
    public final ajnb a() {
        ajnb ajnbVar = this.c;
        if (ajnbVar != null) {
            return ajnbVar;
        }
        affa.d("bytes");
        return null;
    }

    public abstract ajoc b();

    public final void c() {
        ajna ajnaVarB;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        try {
                            ajnaVarB = ahfm.b(b());
                            break;
                        } finally {
                            this.b.countDown();
                        }
                    } catch (IOException e) {
                        this.e = e;
                    }
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        try {
            ajnb ajnbVarS = ajnaVarB.s(ajnaVarB.f());
            ajnb ajnbVarS2 = ajnaVarB.s(ajnaVarB.f());
            affa.n(ajnaVarB, null);
            synchronized (this) {
                this.c = ajnbVarS;
                this.d = ajnbVarS2;
            }
        } finally {
        }
    }
}
