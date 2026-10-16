package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class isk {
    public static final yph a = yph.c("CAR.AUDIO");
    public final boolean b;
    public final Semaphore c;
    public final Semaphore d;
    protected final ipt e;
    public ByteBuffer f;
    public ish g;
    public boolean h;
    private final Supplier i;
    private final int j;
    private final int k;
    private final isj l;

    public isk(final String str, final int i, final int i2, ipt iptVar, boolean z) {
        Supplier supplier = new Supplier() { // from class: isi
            @Override // java.util.function.Supplier
            public final Object get() {
                yph yphVar = isk.a;
                return new ish(str, i, i2);
            }
        };
        this.c = new Semaphore(0);
        this.d = new Semaphore(0);
        this.l = new isj(this);
        this.h = false;
        this.i = supplier;
        this.j = i;
        this.k = i2;
        this.b = z;
        this.e = iptVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized ByteBuffer a() {
        if (this.f != null) {
            try {
                this.c.acquire();
                ByteBuffer byteBuffer = this.f;
                this.f = null;
                return byteBuffer;
            } catch (InterruptedException unused) {
            }
        }
        return null;
    }

    public final void b() {
        if (this.h) {
            ((ype) ((ype) a.f()).ai((char) 1293)).u("AAC Encoder already started.");
            return;
        }
        this.h = true;
        this.f = ByteBuffer.allocate(1024);
        this.d.drainPermits();
        this.c.drainPermits();
        ish ishVar = (ish) this.i.get();
        this.g = ishVar;
        if (!ishVar.u(this.l)) {
            throw new IllegalStateException("AacEncoder initialization timed out (MediaCodec freeze)");
        }
    }

    public final void c() {
        if (this.h) {
            this.f = null;
            ish ishVar = this.g;
            if (ishVar != null) {
                ishVar.t();
                this.g = null;
            }
            this.h = false;
        }
    }

    public final byte[] d(int i) {
        int i2 = i + 7;
        return new byte[]{-1, -7, (byte) (((this.j == 16000 ? 8 : 3) << 2) + 64), (byte) ((this.k << 6) + (i2 >> 11)), (byte) ((i2 & 2047) >> 3), (byte) (((i2 & 7) << 5) + 31), -4};
    }
}
