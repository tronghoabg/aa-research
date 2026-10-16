package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class ajva implements ajpb {
    protected final ajpb c;

    public ajva(ajpb ajpbVar) {
        ahgm.e(ajpbVar, "Wrapped entity");
        this.c = ajpbVar;
    }

    @Override // defpackage.ajpb
    public long a() {
        return this.c.a();
    }

    @Override // defpackage.ajpb
    public InputStream b() throws IOException {
        return this.c.b();
    }

    @Override // defpackage.ajpb
    public final ajoy c() {
        return this.c.c();
    }

    @Override // defpackage.ajpb
    public final ajoy d() {
        return this.c.d();
    }

    @Override // defpackage.ajpb
    @Deprecated
    public void e() throws IOException {
        this.c.e();
    }

    @Override // defpackage.ajpb
    public void f(OutputStream outputStream) throws IOException {
        this.c.f(outputStream);
    }

    @Override // defpackage.ajpb
    public boolean g() {
        return this.c.g();
    }

    @Override // defpackage.ajpb
    public boolean h() {
        return this.c.h();
    }

    @Override // defpackage.ajpb
    public boolean i() {
        return this.c.i();
    }
}
