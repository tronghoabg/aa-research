package com.google.y.a.a.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class j implements Comparable {
    private final j c(Class cls) throws i {
        if (cls.isInstance(this)) {
            return (j) cls.cast(this);
        }
        throw new i("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    static int d(byte b2) {
        return (b2 >> 5) & 7;
    }

    public static f g(long j2) {
        return new f(j2);
    }

    public static h i(String str) {
        return new h(str);
    }

    public static j j(byte... bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return k.a(byteArrayInputStream, new com.google.y.a.a.b.b(byteArrayInputStream));
    }

    public static j k(InputStream inputStream) {
        return k.a(inputStream, new com.google.y.a.a.b.b(inputStream));
    }

    protected abstract int a();

    protected int b() {
        return 0;
    }

    public final d e() {
        return (d) c(d.class);
    }

    public final f f() {
        return (f) c(f.class);
    }

    public final g h() {
        return (g) c(g.class);
    }
}
