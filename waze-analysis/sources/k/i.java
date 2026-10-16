package k;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface i extends WritableByteChannel, al {
    h B();

    i C(byte[] bArr);

    i D(long j2);

    i E(String str);

    void Z(k kVar);

    void ab(byte[] bArr, int i2);

    void ac(am amVar);

    void ae(int i2);

    void af(long j2);

    void ah(int i2);

    void aj(int i2);

    void an(String str, int i2, int i3);

    void flush();

    OutputStream s();
}
