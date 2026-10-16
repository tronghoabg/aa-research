package M5;

import J5.f;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class a extends f {
    public static int I(int i5, byte[] bArr) {
        return (bArr[i5 + 3] & ForkServer.ERROR) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
    }
}
