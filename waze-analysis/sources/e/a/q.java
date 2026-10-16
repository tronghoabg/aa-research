package e.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f47844a = new q(0);

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f47845b;

    private q(int i2) {
        this.f47845b = i2;
    }

    @Override // e.a.ae
    public final InputStream a(InputStream inputStream) {
        return this.f47845b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // e.a.s
    public final OutputStream b(OutputStream outputStream) {
        return this.f47845b != 0 ? new GZIPOutputStream(outputStream) : outputStream;
    }

    @Override // e.a.s, e.a.ae
    public final String c() {
        return this.f47845b != 0 ? "gzip" : "identity";
    }

    public q(int i2, byte[] bArr) {
        this.f47845b = i2;
    }
}
