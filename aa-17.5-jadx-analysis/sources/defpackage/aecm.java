package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class aecm implements Closeable {
    public final ajna a;
    public final aech b;
    private final aeck c;

    public aecm(ajna ajnaVar) {
        this.a = ajnaVar;
        aeck aeckVar = new aeck(ajnaVar);
        this.c = aeckVar;
        this.b = new aech(aeckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(int r2, short r3, byte r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecm.a(int, short, byte, int):java.util.List");
    }

    public final void b() throws IOException {
        ajna ajnaVar = this.a;
        ajnaVar.f();
        ajnaVar.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
