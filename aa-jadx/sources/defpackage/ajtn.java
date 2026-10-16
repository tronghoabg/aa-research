package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajtn extends defpackage.ajwa implements defpackage.ajtu {
    protected defpackage.ajty a;
    protected final boolean b;

    public ajtn(defpackage.ajqb ajqbVar, defpackage.ajty ajtyVar, boolean z) {
        super(ajqbVar);
        defpackage.aguw.e(ajtyVar, "Connection");
        this.a = ajtyVar;
        this.b = z;
    }

    private final void n() throws java.io.IOException {
        defpackage.ajty ajtyVar = this.a;
        if (ajtyVar == null) {
            return;
        }
        try {
            if (this.b) {
                defpackage.agve.a(this.c);
                this.a.o();
            } else {
                ajtyVar.s();
            }
        } finally {
            l();
        }
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final java.io.InputStream b() throws java.io.IOException {
        return new defpackage.ajtv(this.c.b(), this);
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    @java.lang.Deprecated
    public final void e() throws java.io.IOException {
        n();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final void f(java.io.OutputStream outputStream) throws java.io.IOException {
        super.f(outputStream);
        n();
    }

    @Override // defpackage.ajwa, defpackage.ajqb
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ajtu
    public final void hk() throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.ajtu
    public final void hl() throws java.io.IOException {
        throw null;
    }

    protected final void l() throws java.io.IOException {
        defpackage.ajty ajtyVar = this.a;
        if (ajtyVar != null) {
            try {
                ajtyVar.hl();
            } finally {
                this.a = null;
            }
        }
    }

    public final void m(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            defpackage.ajty ajtyVar = this.a;
            if (ajtyVar != null) {
                if (this.b) {
                    boolean zI = ajtyVar.i();
                    try {
                        inputStream.close();
                        this.a.o();
                    } catch (java.net.SocketException e) {
                        if (zI) {
                            throw e;
                        }
                    }
                } else {
                    ajtyVar.s();
                }
            }
            l();
        } catch (java.lang.Throwable th) {
            l();
            throw th;
        }
    }
}
