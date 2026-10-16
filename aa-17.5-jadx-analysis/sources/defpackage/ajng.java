package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class ajng extends ajnf {
    public final ajnf c;

    public ajng(ajnf ajnfVar) {
        this.c = ajnfVar;
    }

    @Override // defpackage.ajnf
    public ajoa a(ajnr ajnrVar) throws IOException {
        throw null;
    }

    @Override // defpackage.ajnf
    public final List b(ajnr ajnrVar) throws IOException {
        throw null;
    }

    @Override // defpackage.ajnf
    public final ajnd c(ajnr ajnrVar) throws IOException {
        throw null;
    }

    @Override // defpackage.ajnf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    @Override // defpackage.ajnf
    public final ajne e(ajnr ajnrVar) throws IOException {
        ajne ajneVarE = this.c.e(ajnrVar);
        if (ajneVarE == null) {
            return null;
        }
        ajnr ajnrVar2 = ajneVarE.c;
        return ajnrVar2 == null ? ajneVarE : new ajne(ajneVarE.a, ajneVarE.b, ajnrVar2, ajneVarE.d, ajneVarE.e, ajneVarE.f, ajneVarE.g);
    }

    @Override // defpackage.ajnf
    public final ajoc f(ajnr ajnrVar) throws IOException {
        throw null;
    }

    @Override // defpackage.ajnf
    public final void g(ajnr ajnrVar, ajnr ajnrVar2) throws IOException {
        this.c.g(ajnrVar, ajnrVar2);
    }

    @Override // defpackage.ajnf
    public final ajoa j(ajnr ajnrVar) throws IOException {
        throw null;
    }

    @Override // defpackage.ajnf
    public final void k(ajnr ajnrVar) throws IOException {
        throw null;
    }

    @Override // defpackage.ajnf
    public final void l(ajnr ajnrVar) throws IOException {
        this.c.l(ajnrVar);
    }

    public final String toString() {
        return affw.b(getClass()).getSimpleName() + "(" + this.c + ")";
    }
}
