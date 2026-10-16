package defpackage;

import android.os.Looper;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes2.dex */
public class phs extends pho {
    public static final /* synthetic */ int d = 0;
    private static final yph e = yph.c("GH.WPP.SOCKET");
    private final Socket f;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, paa] */
    public phs(te teVar) {
        super((Looper) teVar.b, -1L, teVar.c);
        this.f = (Socket) teVar.d;
    }

    @Override // defpackage.pho
    protected tgu e() throws IOException {
        ((ype) ((ype) e.f()).ai((char) 6710)).u("Connecting the socket");
        boolean zN = koo.n();
        Socket socket = this.f;
        return zN ? jxc.i(socket, 1) : spu.aQ(socket);
    }

    @Override // defpackage.pho
    protected final void g() throws IOException {
        ((ype) ((ype) e.f()).ai((char) 6711)).u("Closing the socket");
        try {
            this.f.close();
        } catch (IOException e2) {
            ((ype) ((ype) ((ype) e.h()).p(e2)).ai((char) 6712)).u("Failed to close the socket, ignoring");
        }
    }
}
