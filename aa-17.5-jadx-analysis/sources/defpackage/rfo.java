package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class rfo {
    public static final ypf a = ols.R("CAR.AUDIO");
    public final int b;
    public final int d;
    public final boolean e;
    public ByteBuffer g;
    public final rei i;
    public rfn j;
    public final Semaphore f = new Semaphore(0);
    public final Semaphore h = new Semaphore(0);
    public final ykd l = new ykd(this, null);
    public boolean k = false;
    public final int c = 16;

    public rfo(int i, int i2, rei reiVar, boolean z) {
        this.b = i;
        this.d = i2;
        this.e = z;
        this.i = reiVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized ByteBuffer a() {
        if (this.g != null) {
            try {
                this.f.acquire();
                ByteBuffer byteBuffer = this.g;
                this.g = null;
                return byteBuffer;
            } catch (InterruptedException unused) {
            }
        }
        return null;
    }

    public final void b() {
        if (this.k) {
            this.g = null;
            rfn rfnVar = this.j;
            if (rfnVar != null) {
                rfnVar.e();
                this.j = null;
            }
            this.k = false;
        }
    }

    public final byte[] c(int i) {
        int i2 = i + 7;
        return new byte[]{-1, -7, (byte) (((this.b == 16000 ? 8 : 3) << 2) + 64), (byte) ((this.d << 6) + (i2 >> 11)), (byte) ((i2 & 2047) >> 3), (byte) (((i2 & 7) << 5) + 31), -4};
    }
}
