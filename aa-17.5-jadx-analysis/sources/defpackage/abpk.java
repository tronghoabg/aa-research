package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class abpk extends abms {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};
    private static final long serialVersionUID = 1;
    public final int b;
    public final abms c;
    public final abms e;
    public final int f;
    private final int g;

    public abpk(abms abmsVar, abms abmsVar2) {
        this.c = abmsVar;
        this.e = abmsVar2;
        int iD = abmsVar.d();
        this.g = iD;
        this.b = iD + abmsVar2.d();
        this.f = Math.max(abmsVar.p(), abmsVar2.p()) + 1;
    }

    public static abms G(abms abmsVar, abms abmsVar2) {
        int iD = abmsVar.d();
        int iD2 = abmsVar2.d();
        byte[] bArr = new byte[iD + iD2];
        abmsVar.A(bArr, 0, 0, iD);
        abmsVar2.A(bArr, 0, iD, iD2);
        return abms.y(bArr);
    }

    public static int o(int i) {
        int[] iArr = a;
        int length = iArr.length;
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.abms
    public final byte a(int i) {
        a.G(i, this.b);
        return b(i);
    }

    @Override // defpackage.abms
    public final byte b(int i) {
        int i2 = this.g;
        return i < i2 ? this.c.b(i) : this.e.b(i - i2);
    }

    @Override // defpackage.abms
    protected final int c(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            return this.c.c(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.e.c(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.e.c(this.c.c(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.abms
    public final int d() {
        return this.b;
    }

    @Override // defpackage.abms
    public final abms e(int i, int i2) {
        return f(i, i2);
    }

    @Override // defpackage.abms
    public final abms f(int i, int i2) {
        int i3 = this.b;
        int iF = a.F(i, i2, i3);
        if (iF == 0) {
            return abms.d;
        }
        if (iF == i3) {
            return this;
        }
        int i4 = this.g;
        if (i2 <= i4) {
            return this.c.e(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.e.e(i - i4, i5);
        }
        return new abpk(this.c.x(i), this.e.e(0, i5));
    }

    @Override // defpackage.abms
    public final abmw g() {
        ArrayList arrayList = new ArrayList();
        abpi abpiVar = new abpi(this);
        while (abpiVar.hasNext()) {
            arrayList.add(abpiVar.next().j());
        }
        int i = abmw.l;
        return abmw.N(new aboo(arrayList));
    }

    @Override // defpackage.abms
    public final InputStream h() {
        return new abpj(this);
    }

    @Override // defpackage.abms
    protected final String i(Charset charset) {
        return new String(D(), charset);
    }

    @Override // defpackage.abms, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new abph(this);
    }

    @Override // defpackage.abms
    public final ByteBuffer j() {
        return ByteBuffer.wrap(D()).asReadOnlyBuffer();
    }

    @Override // defpackage.abms
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.g;
        if (i4 <= i5) {
            this.c.k(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.e.k(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.c.k(bArr, i, i2, i6);
            this.e.k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.abms
    public final void l(abmk abmkVar) throws IOException {
        this.c.l(abmkVar);
        this.e.l(abmkVar);
    }

    @Override // defpackage.abms
    public final void m(OutputStream outputStream) throws IOException {
        this.c.m(outputStream);
        this.e.m(outputStream);
    }

    @Override // defpackage.abms
    public final boolean n(abms abmsVar) {
        abpi abpiVar = new abpi(this);
        abmp abmpVarA = abpiVar.next();
        abpi abpiVar2 = new abpi(abmsVar);
        abmp abmpVarA2 = abpiVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iD = abmpVarA.d() - i;
            int iD2 = abmpVarA2.d() - i2;
            int iMin = Math.min(iD, iD2);
            if (!(i == 0 ? abmpVarA.o(abmpVarA2, i2, iMin) : abmpVarA2.o(abmpVarA, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                i = 0;
                abmpVarA = abpiVar.next();
            } else {
                i += iMin;
                abmpVarA = abmpVarA;
            }
            if (iMin == iD2) {
                abmpVarA2 = abpiVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // defpackage.abms
    protected final int p() {
        return this.f;
    }

    @Override // defpackage.abms
    public final boolean q() {
        return this.b >= o(this.f);
    }

    @Override // defpackage.abms
    /* renamed from: r */
    public final abmo iterator() {
        return new abph(this);
    }

    Object writeReplace() {
        return abms.y(D());
    }
}
