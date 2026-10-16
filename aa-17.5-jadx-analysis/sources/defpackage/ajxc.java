package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

@Deprecated
/* loaded from: classes2.dex */
public class ajxc extends ajxa {
    public volatile ajxb e;

    protected ajxc(ajso ajsoVar, ajxb ajxbVar) {
        super(ajsoVar, ajxbVar.e);
        this.e = ajxbVar;
    }

    protected final void A(ajxb ajxbVar) {
        if (this.c || ajxbVar == null) {
            throw new ajxf();
        }
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ajxb ajxbVarZ = z();
        if (ajxbVarZ != null) {
            ajxbVarZ.a();
        }
        ajxg ajxgVar = this.d;
        if (ajxgVar != null) {
            ajxgVar.close();
        }
    }

    @Override // defpackage.ajpa
    public final void h() throws IOException {
        ajxb ajxbVarZ = z();
        if (ajxbVarZ != null) {
            ajxbVarZ.a();
        }
        ajxg ajxgVar = this.d;
        if (ajxgVar != null) {
            ajxgVar.h();
        }
    }

    @Override // defpackage.ajsy, defpackage.ajsx
    public final ajtg m() {
        ajxb ajxbVarZ = z();
        A(ajxbVarZ);
        if (ajxbVarZ.c == null) {
            return null;
        }
        return ajxbVarZ.c.h();
    }

    @Override // defpackage.ajsy
    public final void n(akba akbaVar, akas akasVar) throws IOException {
        ajxb ajxbVarZ = z();
        A(ajxbVarZ);
        ahgm.e(akasVar, "HTTP parameters");
        ahkp.c(ajxbVarZ.c, "Route tracker");
        ahkp.b(ajxbVarZ.c.b, "Connection not open");
        ahkp.b(ajxbVarZ.c.g(), "Protocol layering without a tunnel not supported");
        ahkp.b(!ajxbVarZ.c.e(), "Multiple protocol layering not supported");
        ajpe ajpeVar = ajxbVarZ.c.a;
        ajxh ajxhVar = ajxbVarZ.d;
        ajxg ajxgVar = ajxbVarZ.e;
        ajxhVar.b(ajxgVar, ajpeVar, akbaVar, akasVar);
        ajxbVarZ.c.k(ajxgVar.j);
    }

    @Override // defpackage.ajsy
    public final void p(ajtg ajtgVar, akba akbaVar, akas akasVar) throws IOException, IllegalArgumentException {
        ajxb ajxbVarZ = z();
        A(ajxbVarZ);
        ahgm.e(akasVar, "HTTP parameters");
        if (ajxbVarZ.c != null) {
            ahkp.b(!ajxbVarZ.c.b, "Connection already open");
        }
        ajxbVarZ.c = new ajtl(ajtgVar);
        ajpe ajpeVarC = ajtgVar.c();
        ajxh ajxhVar = ajxbVarZ.d;
        ajxg ajxgVar = ajxbVarZ.e;
        ajxhVar.a(ajxgVar, ajpeVarC != null ? ajpeVarC : ajtgVar.a, ajtgVar.b, akbaVar, akasVar);
        ajtl ajtlVar = ajxbVarZ.c;
        if (ajtlVar == null) {
            throw new InterruptedIOException("Request aborted");
        }
        if (ajpeVarC == null) {
            ajtlVar.j(ajxgVar.j);
        } else {
            ajtlVar.i(ajpeVarC, ajxgVar.j);
        }
    }

    @Override // defpackage.ajsy
    public final void r(Object obj) {
        ajxb ajxbVarZ = z();
        A(ajxbVarZ);
        ajxbVarZ.b = obj;
    }

    @Override // defpackage.ajsy
    public final void t(akas akasVar) throws IOException {
        ajxb ajxbVarZ = z();
        A(ajxbVarZ);
        ahgm.e(akasVar, "HTTP parameters");
        ahkp.c(ajxbVarZ.c, "Route tracker");
        ahkp.b(ajxbVarZ.c.b, "Connection not open");
        ahkp.b(!ajxbVarZ.c.g(), "Connection is already tunnelled");
        ajxbVarZ.e.w(null, ajxbVarZ.c.a, false, akasVar);
        ajxbVarZ.c.m();
    }

    @Override // defpackage.ajxa
    protected synchronized void w() {
        this.e = null;
        super.w();
    }

    @Deprecated
    protected ajxb z() {
        throw null;
    }
}
