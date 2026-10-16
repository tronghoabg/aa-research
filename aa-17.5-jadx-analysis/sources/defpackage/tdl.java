package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class tdl {
    private final short a;
    private final short b;
    private final int c;

    public tdl(short s, short s2, int i) {
        this.a = s;
        this.b = s2;
        this.c = i;
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byteArrayOutputStream.write(spu.aW(this.a));
        byteArrayOutputStream.write(spu.aW(this.b));
        byteArrayOutputStream.write(a.T(this.c));
    }
}
