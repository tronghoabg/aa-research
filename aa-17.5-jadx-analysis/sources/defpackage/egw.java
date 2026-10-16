package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class egw implements eha {
    private final abow a;
    private final abnj b;

    public egw(abow abowVar, abnj abnjVar) {
        abowVar.getClass();
        abnjVar.getClass();
        this.a = abowVar;
        this.b = abnjVar;
    }

    @Override // defpackage.eha
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.eha
    public final Object b(InputStream inputStream) throws eeq {
        try {
            Object objI = this.a.M().i(inputStream, this.b);
            objI.getClass();
            return objI;
        } catch (abon e) {
            throw new eeq("Cannot read proto.", e);
        }
    }

    @Override // defpackage.eha
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) throws IOException {
        ((abow) obj).g(outputStream);
        return afak.a;
    }
}
