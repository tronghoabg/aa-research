package cg;

import java.nio.channels.WritableByteChannel;

/* renamed from: cg.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1619h extends F, WritableByteChannel {
    InterfaceC1619h L(int i5, int i10, String str);

    InterfaceC1619h T(int i5, int i10, byte[] bArr);

    @Override // cg.F, java.io.Flushable
    void flush();

    C1618g getBuffer();

    long q(H h10);

    InterfaceC1619h u(C1621j c1621j);

    InterfaceC1619h write(byte[] bArr);

    InterfaceC1619h writeByte(int i5);

    InterfaceC1619h writeDecimalLong(long j8);

    InterfaceC1619h writeUtf8(String str);
}
