package com.waze.sound.c;

import h.g.b.x;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r implements f {

    /* renamed from: a, reason: collision with root package name */
    private final ab f39643a;

    public /* synthetic */ r(byte[] bArr) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("PcmToWavEncoderImpl");
        x.e(eVarD, "create(...)");
        ab abVarB = av.b();
        x.f(eVarD, "logger");
        x.f(abVarB, "ioDispatcher");
        this.f39643a = abVarB;
    }

    public static final /* synthetic */ void b(byte[] bArr, int i2, int i3) {
        int i4 = i2 + 3;
        if (i4 >= bArr.length) {
            return;
        }
        bArr[i2] = (byte) (i3 & 255);
        bArr[i2 + 1] = (byte) ((i3 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i3 >> 16) & 255);
        bArr[i4] = (byte) ((i3 >> 24) & 255);
    }

    public static final /* synthetic */ void c(OutputStream outputStream, short s, int i2) throws IOException {
        Charset charset = h.n.a.f48221b;
        byte[] bytes = "RIFF".getBytes(charset);
        x.e(bytes, "getBytes(...)");
        outputStream.write(bytes);
        d(outputStream, 0);
        byte[] bytes2 = "WAVE".getBytes(charset);
        x.e(bytes2, "getBytes(...)");
        outputStream.write(bytes2);
        byte[] bytes3 = "fmt ".getBytes(charset);
        x.e(bytes3, "getBytes(...)");
        outputStream.write(bytes3);
        d(outputStream, 16);
        e(outputStream, (short) 1);
        e(outputStream, s);
        d(outputStream, i2);
        d(outputStream, ((i2 * s) * 16) >> 3);
        e(outputStream, (short) ((s * 16) >> 3));
        e(outputStream, (short) 16);
        byte[] bytes4 = "data".getBytes(charset);
        x.e(bytes4, "getBytes(...)");
        outputStream.write(bytes4);
        d(outputStream, 0);
    }

    private static final void d(OutputStream outputStream, int i2) throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        x.e(byteBufferOrder, "order(...)");
        byteBufferOrder.putInt(i2);
        outputStream.write(byteBufferOrder.array());
    }

    private static final void e(OutputStream outputStream, short s) throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        x.e(byteBufferOrder, "order(...)");
        byteBufferOrder.putShort(s);
        outputStream.write(byteBufferOrder.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.c.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.b.k r6, com.waze.h.c.a r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.sound.c.o
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sound.c.o r0 = (com.waze.sound.c.o) r0
            int r1 = r0.f39633c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39633c = r1
            goto L18
        L13:
            com.waze.sound.c.o r0 = new com.waze.sound.c.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f39631a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39633c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.ab r8 = r5.f39643a
            h.c.j r8 = (h.c.j) r8
            com.waze.sound.c.q r2 = new com.waze.sound.c.q
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f39633c = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.v(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            h.m r8 = (h.m) r8
            java.lang.Object r5 = r8.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.c.r.a(kotlinx.coroutines.b.k, com.waze.h.c.a, h.c.e):java.lang.Object");
    }

    public r() {
        this(null);
    }
}
