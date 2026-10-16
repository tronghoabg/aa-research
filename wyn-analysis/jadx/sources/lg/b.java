package lg;

import com.applovin.impl.Z0;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f40285a = f.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    public final jg.a f40286b;

    /* renamed from: c, reason: collision with root package name */
    public final jg.b f40287c;

    /* renamed from: d, reason: collision with root package name */
    public long f40288d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40289e;

    public b(Z0 z02, com.unity3d.services.core.webview.b bVar) {
        this.f40286b = z02;
        this.f40287c = bVar;
    }

    public final void a(int i5) {
        if (this.f40289e || this.f40288d + i5 <= this.f40285a) {
            return;
        }
        this.f40289e = true;
        this.f40286b.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f40287c.h(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f40287c.h(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        a(bArr.length);
        ((OutputStream) this.f40287c.h(this)).write(bArr);
        this.f40288d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) throws IOException {
        a(i10);
        ((OutputStream) this.f40287c.h(this)).write(bArr, i5, i10);
        this.f40288d += i10;
    }

    @Override // java.io.OutputStream
    public final void write(int i5) throws IOException {
        a(1);
        ((OutputStream) this.f40287c.h(this)).write(i5);
        this.f40288d++;
    }
}
