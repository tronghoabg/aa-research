package defpackage;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface ajmz extends WritableByteChannel, ajoa {
    void P(int i) throws IOException;

    void Q(int i) throws IOException;

    void W(int i) throws IOException;

    void Y(long j) throws IOException;

    void Z(String str) throws IOException;

    @Override // defpackage.ajoa, java.io.Flushable
    void flush() throws IOException;
}
