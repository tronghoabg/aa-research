package k;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aq {
    public static final String a(byte[] bArr) {
        h.g.b.x.f(bArr, "<this>");
        return new String(bArr, h.n.a.f48221b);
    }

    public static final byte[] b(String str) {
        h.g.b.x.f(str, "<this>");
        byte[] bytes = str.getBytes(h.n.a.f48221b);
        h.g.b.x.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ab c(String str, boolean z) {
        h.g.b.x.f(str, "<this>");
        int i2 = k.a.c.f50748a;
        h.g.b.x.f(str, "<this>");
        h hVar = new h();
        hVar.ar(str);
        return k.a.c.j(hVar, z);
    }

    public static /* synthetic */ ab d(File file) {
        h.g.b.x.f(file, "<this>");
        String string = file.toString();
        h.g.b.x.e(string, "toString(...)");
        return c(string, false);
    }

    public static final j f(am amVar) {
        h.g.b.x.f(amVar, "<this>");
        return new ah(amVar);
    }

    public static final am g(File file) {
        h.g.b.x.f(file, "<this>");
        return new v(new FileInputStream(file), ao.f50818c);
    }
}
