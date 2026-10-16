package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class jac {
    public final ByteBuffer a;
    public byte[] b;
    public final boolean c;
    public final OutputStream d;
    final /* synthetic */ jad e;

    public jac(jad jadVar, OutputStream outputStream, int i) {
        this.e = jadVar;
        this.a = ByteBuffer.allocate(8);
        this.b = new byte[8];
        this.d = new BufferedOutputStream(outputStream, i);
        this.c = true;
    }

    public jac(jad jadVar, OutputStream outputStream) {
        this.e = jadVar;
        this.a = ByteBuffer.allocate(8);
        this.b = new byte[8];
        this.d = outputStream;
        this.c = false;
    }
}
