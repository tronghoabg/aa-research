package od;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class Y0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41848a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41849b;

    public Y0(Z0 z02) {
        this.f41849b = z02;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f41848a) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f41848a) {
            case 1:
                ((FileOutputStream) this.f41849b).flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i5) throws IOException {
        switch (this.f41848a) {
            case 0:
                write(new byte[]{(byte) i5}, 0, 1);
                break;
            default:
                ((FileOutputStream) this.f41849b).write(i5);
                break;
        }
    }

    public Y0(FileOutputStream fileOutputStream) {
        this.f41849b = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b5) throws IOException {
        switch (this.f41848a) {
            case 1:
                AbstractC3340k.e(b5, "b");
                ((FileOutputStream) this.f41849b).write(b5);
                break;
            default:
                super.write(b5);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i5, int i10) {
        switch (this.f41848a) {
            case 0:
                ((Z0) this.f41849b).g(i5, i10, bytes);
                break;
            default:
                AbstractC3340k.e(bytes, "bytes");
                ((FileOutputStream) this.f41849b).write(bytes, i5, i10);
                break;
        }
    }

    private final void a() {
    }
}
