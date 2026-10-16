package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes2.dex */
public interface ajna extends ReadableByteChannel, ajoc {
    void A(long j) throws IOException;

    boolean B() throws IOException;

    boolean C(long j) throws IOException;

    long G(ajnb ajnbVar) throws IOException;

    boolean H(ajnb ajnbVar) throws IOException;

    void J(ajoa ajoaVar) throws IOException;

    byte d() throws IOException;

    int f() throws IOException;

    int g() throws IOException;

    long k() throws IOException;

    InputStream l();

    String o(long j) throws IOException;

    String p(long j) throws IOException;

    ajna q();

    ajnb s(long j) throws IOException;

    short w() throws IOException;

    short x() throws IOException;

    void z(long j) throws IOException;
}
