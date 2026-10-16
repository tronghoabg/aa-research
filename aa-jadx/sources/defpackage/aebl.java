package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aebl implements defpackage.ajpa {
    public final defpackage.aebm c;
    public defpackage.ajpa f;
    public java.net.Socket g;
    public int h;
    public int i;
    private final defpackage.adzr j;
    private boolean l;
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.ajny b = new defpackage.ajny();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public aebl(defpackage.adzr adzrVar, defpackage.aebm aebmVar) {
        adzrVar.getClass();
        this.j = adzrVar;
        this.c = aebmVar;
    }

    @Override // defpackage.ajpa
    public final void a(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        if (this.k) {
            throw new java.io.IOException("closed");
        }
        int i = defpackage.aefb.a;
        synchronized (this.a) {
            defpackage.ajny ajnyVar2 = this.b;
            ajnyVar2.a(ajnyVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && ajnyVar2.h() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new defpackage.aebi(this));
                return;
            }
            try {
                this.g.close();
            } catch (java.io.IOException e) {
                this.c.d(e);
            }
        }
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new defpackage.adxw(this, 12));
    }

    @Override // defpackage.ajpa, java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.k) {
            throw new java.io.IOException("closed");
        }
        int i = defpackage.aefb.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new defpackage.aebj(this));
        }
    }

    @Override // defpackage.ajpa
    public final defpackage.ajpe hh() {
        return defpackage.ajpe.k;
    }
}
