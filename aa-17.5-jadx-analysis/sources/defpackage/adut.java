package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* loaded from: classes.dex */
public final class adut {
    public int a;
    public int b;
    public Object c;

    public adut(byte[] bArr) {
        this.b = 0;
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final adis a() {
        return ((adjv) this.c.get(this.a)).f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final SocketAddress b() {
        return (SocketAddress) ((adjv) this.c.get(this.a)).e.get(this.b);
    }

    public final void c() {
        this.a = 0;
        this.b = 0;
    }

    public adut(List list) {
        this.c = list;
    }

    public adut() {
        this.c = null;
    }

    public adut(byte[] bArr, byte[] bArr2) {
    }
}
