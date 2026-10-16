package e.a;

import java.nio.charset.StandardCharsets;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cc extends ch {

    /* renamed from: b, reason: collision with root package name */
    private final cd f46516b;

    /* synthetic */ cc(String str, cd cdVar) {
        super(str, false, cdVar);
        com.google.d.b.an.s(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        com.google.d.b.an.C(cdVar, "marshaller");
        this.f46516b = cdVar;
    }

    @Override // e.a.ch
    final Object a(byte[] bArr) {
        return this.f46516b.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // e.a.ch
    final byte[] b(Object obj) {
        String strB = this.f46516b.b(obj);
        com.google.d.b.an.C(strB, "null marshaller.toAsciiString()");
        return strB.getBytes(StandardCharsets.US_ASCII);
    }
}
