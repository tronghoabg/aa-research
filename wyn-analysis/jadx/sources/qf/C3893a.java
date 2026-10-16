package qf;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3893a extends ByteArrayOutputStream {
    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        AbstractC3340k.d(buf, "buf");
        return buf;
    }
}
