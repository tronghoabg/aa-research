package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hvg implements hux {
    public final ibp a;

    public hvg(InputStream inputStream, hxl hxlVar) {
        ibp ibpVar = new ibp(inputStream, hxlVar);
        this.a = ibpVar;
        ibpVar.mark(5242880);
    }

    @Override // defpackage.hux
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.hux
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() throws IOException {
        ibp ibpVar = this.a;
        ibpVar.reset();
        return ibpVar;
    }
}
