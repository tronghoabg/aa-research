package defpackage;

import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;

/* loaded from: classes3.dex */
public final class aagx {
    public static final String a = "aagx";
    public static final aagx b = new aagx();

    private aagx() {
    }

    public static aagy a(byte[] bArr) {
        return new aagy(new InflaterInputStream(new ByteArrayInputStream(bArr)));
    }
}
