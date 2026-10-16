package defpackage;

import java.io.IOException;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class aeal implements ajoa {
    public final aeam c;
    public ajoa f;
    public Socket g;
    public int h;
    public int i;
    private final adyq j;
    private boolean l;
    public final Object a = new Object();
    public final ajmy b = new ajmy();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public aeal(adyq adyqVar, aeam aeamVar) {
        adyqVar.getClass();
        this.j = adyqVar;
        this.c = aeamVar;
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = aeeb.a;
        synchronized (this.a) {
            ajmy ajmyVar2 = this.b;
            ajmyVar2.a(ajmyVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && ajmyVar2.h() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new aeai(this));
                return;
            }
            try {
                this.g.close();
            } catch (IOException e) {
                this.c.d(e);
            }
        }
    }

    @Override // defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new adyj(this, 3));
    }

    @Override // defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = aeeb.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new aeaj(this));
        }
    }

    @Override // defpackage.ajoa
    public final ajoe hV() {
        return ajoe.k;
    }
}
