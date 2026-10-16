package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajsv extends InputStream implements InputStreamRetargetInterface, ajsu {
    protected InputStream a;
    private boolean b;
    private final ajsn c;

    public ajsv(InputStream inputStream, ajsn ajsnVar) {
        ahgm.e(inputStream, "Wrapped stream");
        this.a = inputStream;
        this.b = false;
        this.c = ajsnVar;
    }

    protected final void a() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                ajsn ajsnVar = this.c;
                if (ajsnVar != null) {
                    ajsy ajsyVar = ajsnVar.a;
                    if (ajsyVar != null) {
                        ajsyVar.hY();
                    }
                } else {
                    inputStream.close();
                }
            } finally {
                this.a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (!c()) {
            return 0;
        }
        try {
            return this.a.available();
        } catch (IOException e) {
            this.a();
            throw e;
        }
    }

    protected final void b(int i) throws IOException {
        InputStream inputStream = this.a;
        if (inputStream == null || i >= 0) {
            return;
        }
        try {
            ajsn ajsnVar = this.c;
            if (ajsnVar != null) {
                try {
                    ajsy ajsyVar = ajsnVar.a;
                    if (ajsyVar != null) {
                        if (ajsnVar.b) {
                            inputStream.close();
                            ajsnVar.a.o();
                        } else {
                            ajsyVar.s();
                        }
                    }
                    ajsnVar.l();
                } catch (Throwable th) {
                    ajsnVar.l();
                    throw th;
                }
            } else {
                inputStream.close();
            }
        } finally {
            this.a = null;
        }
    }

    protected final boolean c() throws IOException {
        if (this.b) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.a != null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = true;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                ajsn ajsnVar = this.c;
                if (ajsnVar != null) {
                    ajsnVar.m(inputStream);
                } else {
                    inputStream.close();
                }
            } finally {
                this.a = null;
            }
        }
    }

    @Override // defpackage.ajsu
    public final void hY() throws IOException {
        throw null;
    }

    @Override // defpackage.ajsu
    public final void hZ() throws IOException {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!c()) {
            return -1;
        }
        try {
            int i = this.a.read();
            b(i);
            return i;
        } catch (IOException e) {
            a();
            throw e;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!c()) {
            return -1;
        }
        try {
            int i3 = this.a.read(bArr, i, i2);
            b(i3);
            return i3;
        } catch (IOException e) {
            a();
            throw e;
        }
    }
}
