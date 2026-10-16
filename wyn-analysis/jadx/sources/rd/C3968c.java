package rd;

import cg.AbstractC1613b;
import cg.C1610B;
import cg.C1621j;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* renamed from: rd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3968c {

    /* renamed from: b, reason: collision with root package name */
    public final C1610B f44763b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f44762a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public C3967b[] f44766e = new C3967b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f44767f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f44768g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f44769h = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f44764c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f44765d = 4096;

    public C3968c(C3971f c3971f) {
        this.f44763b = AbstractC1613b.d(c3971f);
    }

    public final int a(int i5) {
        int i10;
        int i11 = 0;
        if (i5 > 0) {
            int length = this.f44766e.length;
            while (true) {
                length--;
                i10 = this.f44767f;
                if (length < i10 || i5 <= 0) {
                    break;
                }
                int i12 = this.f44766e[length].f44761c;
                i5 -= i12;
                this.f44769h -= i12;
                this.f44768g--;
                i11++;
            }
            C3967b[] c3967bArr = this.f44766e;
            System.arraycopy(c3967bArr, i10 + 1, c3967bArr, i10 + 1 + i11, this.f44768g);
            this.f44767f += i11;
        }
        return i11;
    }

    public final C1621j b(int i5) throws IOException {
        if (i5 >= 0) {
            C3967b[] c3967bArr = AbstractC3970e.f44776b;
            if (i5 <= c3967bArr.length - 1) {
                return c3967bArr[i5].f44759a;
            }
        }
        int length = this.f44767f + 1 + (i5 - AbstractC3970e.f44776b.length);
        if (length >= 0) {
            C3967b[] c3967bArr2 = this.f44766e;
            if (length < c3967bArr2.length) {
                return c3967bArr2[length].f44759a;
            }
        }
        throw new IOException("Header index too large " + (i5 + 1));
    }

    public final void c(C3967b c3967b) {
        this.f44762a.add(c3967b);
        int i5 = this.f44765d;
        int i10 = c3967b.f44761c;
        if (i10 > i5) {
            Arrays.fill(this.f44766e, (Object) null);
            this.f44767f = this.f44766e.length - 1;
            this.f44768g = 0;
            this.f44769h = 0;
            return;
        }
        a((this.f44769h + i10) - i5);
        int i11 = this.f44768g + 1;
        C3967b[] c3967bArr = this.f44766e;
        if (i11 > c3967bArr.length) {
            C3967b[] c3967bArr2 = new C3967b[c3967bArr.length * 2];
            System.arraycopy(c3967bArr, 0, c3967bArr2, c3967bArr.length, c3967bArr.length);
            this.f44767f = this.f44766e.length - 1;
            this.f44766e = c3967bArr2;
        }
        int i12 = this.f44767f;
        this.f44767f = i12 - 1;
        this.f44766e[i12] = c3967b;
        this.f44768g++;
        this.f44769h += i10;
    }

    public final C1621j d() throws EOFException {
        int i5;
        C1610B c1610b = this.f44763b;
        byte b5 = c1610b.readByte();
        int i10 = b5 & ForkServer.ERROR;
        boolean z2 = (b5 & 128) == 128;
        int iE = e(i10, 127);
        if (!z2) {
            return c1610b.a(iE);
        }
        C3976k c3976k = C3976k.f44799d;
        long j8 = iE;
        c1610b.require(j8);
        byte[] byteArray = c1610b.f19864b.readByteArray(j8);
        c3976k.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        M2.e eVar = c3976k.f44800a;
        M2.e eVar2 = eVar;
        int i11 = 0;
        int i12 = 0;
        for (byte b10 : byteArray) {
            i11 = (i11 << 8) | (b10 & ForkServer.ERROR);
            i12 += 8;
            while (i12 >= 8) {
                eVar2 = ((M2.e[]) eVar2.f7308d)[(i11 >>> (i12 - 8)) & 255];
                if (((M2.e[]) eVar2.f7308d) == null) {
                    byteArrayOutputStream.write(eVar2.f7306b);
                    i12 -= eVar2.f7307c;
                    eVar2 = eVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            M2.e eVar3 = ((M2.e[]) eVar2.f7308d)[(i11 << (8 - i12)) & 255];
            if (((M2.e[]) eVar3.f7308d) != null || (i5 = eVar3.f7307c) > i12) {
                break;
            }
            byteArrayOutputStream.write(eVar3.f7306b);
            i12 -= i5;
            eVar2 = eVar;
        }
        return C1621j.l(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i5, int i10) throws EOFException {
        int i11 = i5 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte b5 = this.f44763b.readByte();
            int i13 = b5 & ForkServer.ERROR;
            if ((b5 & 128) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (b5 & 127) << i12;
            i12 += 7;
        }
    }
}
