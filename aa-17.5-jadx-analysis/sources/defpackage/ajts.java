package defpackage;

import java.io.IOException;
import java.net.Socket;

@Deprecated
/* loaded from: classes2.dex */
final class ajts extends ajtv implements ajtq {
    private final ajtn a;

    public ajts(ajtn ajtnVar) {
        super(ajtnVar);
        this.a = ajtnVar;
    }

    @Override // defpackage.ajtq
    public final Socket f(Socket socket, String str, int i) throws IOException {
        return this.a.b(socket, str, i);
    }
}
