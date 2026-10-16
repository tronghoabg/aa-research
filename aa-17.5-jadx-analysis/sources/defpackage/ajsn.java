package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

@Deprecated
/* loaded from: classes2.dex */
public final class ajsn extends ajva implements ajsu {
    protected ajsy a;
    protected final boolean b;

    public ajsn(ajpb ajpbVar, ajsy ajsyVar, boolean z) {
        super(ajpbVar);
        ahgm.e(ajsyVar, "Connection");
        this.a = ajsyVar;
        this.b = z;
    }

    private final void n() throws IOException {
        ajsy ajsyVar = this.a;
        if (ajsyVar == null) {
            return;
        }
        try {
            if (this.b) {
                ahkt.a(this.c);
                this.a.o();
            } else {
                ajsyVar.s();
            }
        } finally {
            l();
        }
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final InputStream b() throws IOException {
        return new ajsv(this.c.b(), this);
    }

    @Override // defpackage.ajva, defpackage.ajpb
    @Deprecated
    public final void e() throws IOException {
        n();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final void f(OutputStream outputStream) throws IOException {
        super.f(outputStream);
        n();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ajsu
    public final void hY() throws IOException {
        throw null;
    }

    @Override // defpackage.ajsu
    public final void hZ() throws IOException {
        throw null;
    }

    protected final void l() throws IOException {
        ajsy ajsyVar = this.a;
        if (ajsyVar != null) {
            try {
                ajsyVar.hZ();
            } finally {
                this.a = null;
            }
        }
    }

    public final void m(InputStream inputStream) throws IOException {
        try {
            ajsy ajsyVar = this.a;
            if (ajsyVar != null) {
                if (this.b) {
                    boolean zI = ajsyVar.i();
                    try {
                        inputStream.close();
                        this.a.o();
                    } catch (SocketException e) {
                        if (zI) {
                            throw e;
                        }
                    }
                } else {
                    ajsyVar.s();
                }
            }
        } finally {
            l();
        }
    }
}
