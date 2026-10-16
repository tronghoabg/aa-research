package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class abmw {
    private static volatile int a = 100;
    public static final /* synthetic */ int l = 0;
    int g;
    int h;
    int i = a;
    public int j = Alert.DURATION_SHOW_INDEFINITELY;
    Object k;

    public static abmw J(byte[] bArr) {
        return P(bArr, 0, bArr.length);
    }

    public static abmw N(InputStream inputStream) {
        return inputStream == null ? P(aboi.a, 0, 0) : new abmv(inputStream);
    }

    public static abmw O(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return P(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return P(bArr, 0, iRemaining);
    }

    public static abmw P(byte[] bArr, int i, int i2) {
        abmu abmuVar = new abmu(bArr, i, i2);
        try {
            abmuVar.f(i2);
            return abmuVar;
        } catch (abon e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A() throws IOException;

    public abstract String B() throws IOException;

    public abstract void C(int i) throws abon;

    public abstract void D(int i);

    public abstract void E(int i) throws IOException;

    public abstract boolean F() throws IOException;

    public abstract boolean G() throws IOException;

    public abstract boolean H(int i) throws IOException;

    public abstract byte[] I() throws IOException;

    public final void K() throws abon {
        if (this.g + this.h >= this.i) {
            throw new abon("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void L() throws abon {
        if (this.h == 0) {
            C(0);
        }
    }

    public final void M() throws IOException {
        int iQ;
        do {
            iQ = q();
            if (iQ == 0) {
                return;
            }
            K();
            this.h++;
            this.h--;
        } while (H(iQ));
    }

    public abstract double b() throws IOException;

    public abstract float c() throws IOException;

    public abstract int d();

    public abstract int e();

    public abstract int f(int i) throws abon;

    public abstract int g() throws IOException;

    public abstract int h() throws IOException;

    public abstract int i() throws IOException;

    public abstract int k() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract long t() throws IOException;

    public abstract long v() throws IOException;

    public abstract long w() throws IOException;

    public abstract long x() throws IOException;

    public abstract long y() throws IOException;

    public abstract abms z() throws IOException;
}
