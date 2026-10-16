package cg;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: cg.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1620i extends H, ReadableByteChannel {
    long F(InterfaceC1619h interfaceC1619h);

    boolean e(long j8, C1621j c1621j);

    C1618g getBuffer();

    InputStream inputStream();

    long m(C1621j c1621j);

    int r(x xVar);

    byte[] readByteArray();

    C1621j readByteString();

    String readString(Charset charset);

    boolean request(long j8);

    long s(C1621j c1621j);

    void skip(long j8);
}
