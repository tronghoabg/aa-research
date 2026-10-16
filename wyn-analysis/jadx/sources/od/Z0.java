package od;

import ad.C1355I;
import com.applovin.shadow.okio.Segment;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ka.AbstractC3256n;
import md.AbstractC3541i;
import md.C3542j;
import md.InterfaceC3543k;
import td.C4157a;

/* loaded from: classes5.dex */
public final class Z0 implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3671b f41857a;

    /* renamed from: c, reason: collision with root package name */
    public pd.t f41859c;

    /* renamed from: g, reason: collision with root package name */
    public final C1355I f41863g;

    /* renamed from: h, reason: collision with root package name */
    public final W1 f41864h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41865i;

    /* renamed from: j, reason: collision with root package name */
    public int f41866j;

    /* renamed from: l, reason: collision with root package name */
    public long f41867l;

    /* renamed from: b, reason: collision with root package name */
    public int f41858b = -1;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3543k f41860d = C3542j.f40651b;

    /* renamed from: e, reason: collision with root package name */
    public final Y0 f41861e = new Y0(this);

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f41862f = ByteBuffer.allocate(5);
    public int k = -1;

    public Z0(AbstractC3671b abstractC3671b, C1355I c1355i, W1 w12) {
        this.f41857a = abstractC3671b;
        this.f41863g = c1355i;
        this.f41864h = w12;
    }

    public static int h(C4157a c4157a, OutputStream outputStream) throws IOException {
        MessageLite messageLite = c4157a.f46032a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            c4157a.f46032a.writeTo(outputStream);
            c4157a.f46032a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = c4157a.f46034c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = td.c.f46039a;
        Fe.e.t(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[Segment.SIZE];
        long j8 = 0;
        while (true) {
            int i5 = byteArrayInputStream.read(bArr);
            if (i5 == -1) {
                int i10 = (int) j8;
                c4157a.f46034c = null;
                return i10;
            }
            outputStream.write(bArr, 0, i5);
            j8 += i5;
        }
    }

    @Override // od.W
    public final W a(InterfaceC3543k interfaceC3543k) {
        this.f41860d = interfaceC3543k;
        return this;
    }

    @Override // od.W
    public final void b(int i5) {
        Fe.e.w("max size already set", this.f41858b == -1);
        this.f41858b = i5;
    }

    @Override // od.W
    public final void c(C4157a c4157a) {
        if (this.f41865i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f41866j++;
        int i5 = this.k + 1;
        this.k = i5;
        this.f41867l = 0L;
        W1 w12 = this.f41864h;
        for (AbstractC3541i abstractC3541i : w12.f41842a) {
            abstractC3541i.i(i5);
        }
        boolean z2 = this.f41860d != C3542j.f40651b;
        try {
            int iAvailable = c4157a.available();
            int i10 = (iAvailable == 0 || !z2) ? i(c4157a, iAvailable) : f(c4157a);
            if (iAvailable != -1 && i10 != iAvailable) {
                throw md.k0.f40681m.h(R8.v.e(i10, iAvailable, "Message length inaccurate ", " != ")).a();
            }
            long j8 = i10;
            AbstractC3541i[] abstractC3541iArr = w12.f41842a;
            for (AbstractC3541i abstractC3541i2 : abstractC3541iArr) {
                abstractC3541i2.k(j8);
            }
            long j10 = this.f41867l;
            for (AbstractC3541i abstractC3541i3 : abstractC3541iArr) {
                abstractC3541i3.l(j10);
            }
            int i11 = this.k;
            long j11 = this.f41867l;
            for (AbstractC3541i abstractC3541i4 : w12.f41842a) {
                abstractC3541i4.j(i11, j11, j8);
            }
        } catch (IOException e7) {
            throw md.k0.f40681m.h("Failed to frame message").g(e7).a();
        } catch (md.m0 e10) {
            throw e10;
        } catch (RuntimeException e11) {
            throw md.k0.f40681m.h("Failed to frame message").g(e11).a();
        }
    }

    @Override // od.W
    public final void close() {
        if (this.f41865i) {
            return;
        }
        this.f41865i = true;
        pd.t tVar = this.f41859c;
        if (tVar != null && tVar.f43602c == 0) {
            this.f41859c = null;
        }
        d(true, true);
    }

    public final void d(boolean z2, boolean z10) {
        pd.t tVar = this.f41859c;
        this.f41859c = null;
        this.f41857a.u(tVar, z2, z10, this.f41866j);
        this.f41866j = 0;
    }

    public final void e(X0 x02, boolean z2) {
        ArrayList arrayList = x02.f41844a;
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((pd.t) it.next()).f43602c;
        }
        int i10 = this.f41858b;
        if (i10 >= 0 && i5 > i10) {
            md.k0 k0Var = md.k0.k;
            Locale locale = Locale.US;
            throw k0Var.h("message too large " + i5 + " > " + i10).a();
        }
        ByteBuffer byteBuffer = this.f41862f;
        byteBuffer.clear();
        byteBuffer.put(z2 ? (byte) 1 : (byte) 0).putInt(i5);
        this.f41863g.getClass();
        pd.t tVarH = C1355I.h(5);
        tVarH.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i5 == 0) {
            this.f41859c = tVarH;
            return;
        }
        int i11 = this.f41866j - 1;
        AbstractC3671b abstractC3671b = this.f41857a;
        abstractC3671b.u(tVarH, false, false, i11);
        this.f41866j = 1;
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            abstractC3671b.u((pd.t) arrayList.get(i12), false, false, 0);
        }
        this.f41859c = (pd.t) AbstractC3256n.e(arrayList, 1);
        this.f41867l = i5;
    }

    public final int f(C4157a c4157a) throws IOException {
        X0 x02 = new X0(this);
        OutputStream outputStreamH = this.f41860d.h(x02);
        try {
            int iH = h(c4157a, outputStreamH);
            outputStreamH.close();
            int i5 = this.f41858b;
            if (i5 < 0 || iH <= i5) {
                e(x02, true);
                return iH;
            }
            md.k0 k0Var = md.k0.k;
            Locale locale = Locale.US;
            throw k0Var.h("message too large " + iH + " > " + i5).a();
        } catch (Throwable th) {
            outputStreamH.close();
            throw th;
        }
    }

    @Override // od.W
    public final void flush() {
        pd.t tVar = this.f41859c;
        if (tVar == null || tVar.f43602c <= 0) {
            return;
        }
        d(false, true);
    }

    public final void g(int i5, int i10, byte[] bArr) {
        while (i10 > 0) {
            pd.t tVar = this.f41859c;
            if (tVar != null && tVar.f43601b == 0) {
                d(false, false);
            }
            if (this.f41859c == null) {
                this.f41863g.getClass();
                this.f41859c = C1355I.h(i10);
            }
            int iMin = Math.min(i10, this.f41859c.f43601b);
            this.f41859c.a(bArr, i5, iMin);
            i5 += iMin;
            i10 -= iMin;
        }
    }

    public final int i(C4157a c4157a, int i5) throws IOException {
        if (i5 == -1) {
            X0 x02 = new X0(this);
            int iH = h(c4157a, x02);
            e(x02, false);
            return iH;
        }
        this.f41867l = i5;
        int i10 = this.f41858b;
        if (i10 >= 0 && i5 > i10) {
            md.k0 k0Var = md.k0.k;
            Locale locale = Locale.US;
            throw k0Var.h("message too large " + i5 + " > " + i10).a();
        }
        ByteBuffer byteBuffer = this.f41862f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i5);
        if (this.f41859c == null) {
            int iPosition = byteBuffer.position() + i5;
            this.f41863g.getClass();
            this.f41859c = C1355I.h(iPosition);
        }
        g(0, byteBuffer.position(), byteBuffer.array());
        return h(c4157a, this.f41861e);
    }

    @Override // od.W
    public final boolean isClosed() {
        return this.f41865i;
    }
}
