package Pf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f9457a;

    public b(InputStream input) {
        AbstractC3340k.e(input, "input");
        this.f9457a = input;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9457a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    @Override // Pf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(Pf.a r9, long r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pf.b.j(Pf.a, long):long");
    }

    public final String toString() {
        return "RawSource(" + this.f9457a + ')';
    }
}
