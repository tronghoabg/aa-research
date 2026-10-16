package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class ajwr extends ajva {
    final /* synthetic */ ajws a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajwr(ajws ajwsVar, ajpb ajpbVar) {
        super(ajpbVar);
        this.a = ajwsVar;
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final InputStream b() throws IOException {
        this.a.g = true;
        return super.b();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final void e() throws IOException {
        this.a.g = true;
        super.e();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final void f(OutputStream outputStream) throws IOException {
        this.a.g = true;
        super.f(outputStream);
    }
}
