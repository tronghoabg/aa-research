package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class frg extends ajnh {
    private final afec a;
    private boolean b;

    public frg(ajoa ajoaVar, afec afecVar) {
        super(ajoaVar);
        this.a = afecVar;
    }

    @Override // defpackage.ajnh, defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws EOFException {
        if (this.b) {
            ajmyVar.A(j);
            return;
        }
        try {
            super.a(ajmyVar, j);
        } catch (IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }

    @Override // defpackage.ajnh, defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }

    @Override // defpackage.ajnh, defpackage.ajoa, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }
}
