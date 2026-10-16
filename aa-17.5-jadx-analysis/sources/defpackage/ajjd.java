package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
final class ajjd extends ajnh {
    final /* synthetic */ scz a;
    private boolean b;
    private long c;
    private boolean d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajjd(scz sczVar, ajoa ajoaVar) {
        super(ajoaVar);
        ajoaVar.getClass();
        this.a = sczVar;
        this.d = true;
    }

    private final IOException c(IOException iOException) {
        if (this.b) {
            return iOException;
        }
        this.b = true;
        return this.a.h(true, false, true, iOException);
    }

    @Override // defpackage.ajnh, defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        try {
            if (this.d) {
                this.d = false;
            }
            super.a(ajmyVar, j);
            this.c += j;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // defpackage.ajnh, defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        try {
            super.close();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    @Override // defpackage.ajnh, defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }
}
