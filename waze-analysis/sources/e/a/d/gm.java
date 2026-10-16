package e.a.d;

import androidx.collection.SieveCacheKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gm {

    /* renamed from: a, reason: collision with root package name */
    private final gl f47031a;

    /* renamed from: c, reason: collision with root package name */
    private kg f47033c;

    /* renamed from: d, reason: collision with root package name */
    private int f47034d;

    /* renamed from: h, reason: collision with root package name */
    private final kh f47038h;

    /* renamed from: i, reason: collision with root package name */
    private final jt f47039i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47040j;

    /* renamed from: k, reason: collision with root package name */
    private int f47041k;
    private long m;

    /* renamed from: b, reason: collision with root package name */
    private int f47032b = -1;

    /* renamed from: e, reason: collision with root package name */
    private e.a.s f47035e = e.a.q.f47844a;

    /* renamed from: f, reason: collision with root package name */
    private final gk f47036f = new gk(this);

    /* renamed from: g, reason: collision with root package name */
    private final ByteBuffer f47037g = ByteBuffer.allocate(5);

    /* renamed from: l, reason: collision with root package name */
    private int f47042l = -1;

    public gm(gl glVar, kh khVar, jt jtVar) {
        this.f47031a = glVar;
        this.f47038h = khVar;
        this.f47039i = jtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int i(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof e.a.ah) {
            return ((e.a.ah) inputStream).a(outputStream);
        }
        long jA = com.google.d.h.h.a(inputStream, outputStream);
        com.google.d.b.an.p(jA <= SieveCacheKt.NodeLinkMask, "Message size overflow: %s", jA);
        return (int) jA;
    }

    private final void j(boolean z, boolean z2) {
        kg kgVar = this.f47033c;
        this.f47033c = null;
        this.f47031a.t(kgVar, z, z2, this.f47041k);
        this.f47041k = 0;
    }

    private final void k(gj gjVar, boolean z) {
        int iA = gj.a(gjVar);
        int i2 = this.f47032b;
        if (i2 >= 0 && iA > i2) {
            throw new e.a.eh(e.a.ee.f47407g.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.f47032b))));
        }
        ByteBuffer byteBuffer = this.f47037g;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        kg kgVarA = this.f47038h.a(5);
        kgVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.f47033c = kgVarA;
            return;
        }
        gl glVar = this.f47031a;
        glVar.t(kgVarA, false, false, this.f47041k - 1);
        this.f47041k = 1;
        List list = gjVar.f47028b;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            glVar.t((kg) list.get(i3), false, false, 0);
        }
        this.f47033c = (kg) list.get(list.size() - 1);
        this.m = iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            kg kgVar = this.f47033c;
            if (kgVar != null && kgVar.b() == 0) {
                j(false, false);
            }
            if (this.f47033c == null) {
                com.google.d.b.an.v(this.f47034d > 0, "knownLengthPendingAllocation reached 0");
                kg kgVarA = this.f47038h.a(this.f47034d);
                this.f47033c = kgVarA;
                int i4 = this.f47034d;
                this.f47034d = i4 - Math.min(i4, kgVarA.b());
            }
            int iMin = Math.min(i3, this.f47033c.b());
            this.f47033c.d(bArr, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        }
    }

    public final void c() {
        if (this.f47040j) {
            return;
        }
        this.f47040j = true;
        kg kgVar = this.f47033c;
        if (kgVar != null && kgVar.a() == 0) {
            this.f47033c = null;
        }
        j(true, true);
    }

    public final void d() {
        kg kgVar = this.f47033c;
        if (kgVar == null || kgVar.a() <= 0) {
            return;
        }
        j(false, true);
    }

    public final void e(int i2) {
        com.google.d.b.an.v(this.f47032b == -1, "max size already set");
        this.f47032b = i2;
    }

    public final void f(InputStream inputStream) throws IOException {
        int i2;
        if (this.f47040j) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f47041k++;
        this.f47042l++;
        this.m = 0L;
        this.f47039i.j();
        e.a.s sVar = this.f47035e;
        e.a.r rVar = e.a.q.f47844a;
        try {
            int iAvailable = ((inputStream instanceof e.a.bf) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            if (iAvailable != 0 && sVar != rVar) {
                gj gjVar = new gj(this);
                OutputStream outputStreamB = this.f47035e.b(gjVar);
                try {
                    i2 = i(inputStream, outputStreamB);
                    outputStreamB.close();
                    int i3 = this.f47032b;
                    if (i3 >= 0 && i2 > i3) {
                        throw new e.a.eh(e.a.ee.f47407g.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.f47032b))));
                    }
                    k(gjVar, true);
                } catch (Throwable th) {
                    outputStreamB.close();
                    throw th;
                }
            } else if (iAvailable != -1) {
                this.m = iAvailable;
                int i4 = this.f47032b;
                if (i4 >= 0 && iAvailable > i4) {
                    throw new e.a.eh(e.a.ee.f47407g.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.f47032b))));
                }
                ByteBuffer byteBuffer = this.f47037g;
                byteBuffer.clear();
                byteBuffer.put((byte) 0).putInt(iAvailable);
                this.f47034d = iAvailable + 5;
                l(byteBuffer.array(), 0, byteBuffer.position());
                i2 = i(inputStream, this.f47036f);
            } else {
                gj gjVar2 = new gj(this);
                i2 = i(inputStream, gjVar2);
                k(gjVar2, false);
            }
            if (iAvailable != -1 && i2 != iAvailable) {
                throw new e.a.eh(e.a.ee.f47410j.g(String.format("Message length inaccurate %s != %s", Integer.valueOf(i2), Integer.valueOf(iAvailable))));
            }
            jt jtVar = this.f47039i;
            jtVar.l();
            jtVar.b(this.m);
            jtVar.k();
        } catch (e.a.eh e2) {
            throw e2;
        } catch (IOException e3) {
            throw new e.a.eh(e.a.ee.f47410j.g("Failed to frame message").f(e3));
        } catch (RuntimeException e4) {
            throw new e.a.eh(e.a.ee.f47410j.g("Failed to frame message").f(e4));
        }
    }

    public final boolean g() {
        return this.f47040j;
    }

    public final /* synthetic */ void h(e.a.s sVar) {
        this.f47035e = sVar;
    }
}
