package Y2;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class s extends J5.f {
    public static int I(int i5, byte[] bArr) {
        return (bArr[i5 + 3] & ForkServer.ERROR) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
    }
}
