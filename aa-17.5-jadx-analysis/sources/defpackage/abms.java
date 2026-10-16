package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class abms implements Iterable, Serializable {
    public static final abms d = new abmq(aboi.a);
    private static final long serialVersionUID = 1;
    private int a = 0;

    public static boolean C(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        a.F(i, i4, bArr.length);
        a.F(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static abms E(byte[] bArr, int i, int i2) throws abon {
        if (i2 == 0) {
            return d;
        }
        a.F(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new abmq(bArr2);
    }

    static abms F(byte[] bArr) throws abon {
        return bArr.length == 0 ? d : new abmq(bArr);
    }

    private static abms o(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (abms) it.next();
        }
        int i2 = i >>> 1;
        return o(it, i2).s(o(it, i - i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static abms t(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? d : o(iterable.iterator(), size);
    }

    public static abms u(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return d;
        }
        a.F(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new abmq(bArr);
    }

    public static abms v(byte[] bArr) {
        try {
            return E(bArr, 0, bArr.length);
        } catch (abon e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static abms w(byte[] bArr, int i, int i2) {
        try {
            return E(bArr, i, i2);
        } catch (abon e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static abms y(byte[] bArr) {
        try {
            return F(bArr);
        } catch (abon e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Deprecated
    public final void A(byte[] bArr, int i, int i2, int i3) {
        a.F(i, i + i3, d());
        a.F(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            k(bArr, i, i2, i3);
        }
    }

    public final boolean B() {
        return d() == 0;
    }

    public final byte[] D() {
        int iD = d();
        if (iD == 0) {
            return aboi.a;
        }
        byte[] bArr = new byte[iD];
        k(bArr, 0, 0, iD);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    protected abstract int c(int i, int i2, int i3);

    public abstract int d();

    public abstract abms e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abms)) {
            return false;
        }
        abms abmsVar = (abms) obj;
        int iD = d();
        if (iD != abmsVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i = this.a;
        int i2 = abmsVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return n(abmsVar);
        }
        return false;
    }

    public abstract abms f(int i, int i2);

    public abstract abmw g();

    public abstract InputStream h();

    public final int hashCode() {
        int iC = this.a;
        if (iC == 0) {
            int iD = d();
            iC = c(iD, 0, iD);
            if (iC == 0) {
                iC = 1;
            }
            this.a = iC;
        }
        return iC;
    }

    protected abstract String i(Charset charset);

    public abstract ByteBuffer j();

    protected abstract void k(byte[] bArr, int i, int i2, int i3);

    public abstract void l(abmk abmkVar) throws IOException;

    public abstract void m(OutputStream outputStream) throws IOException;

    protected abstract boolean n(abms abmsVar);

    protected abstract int p();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abmo iterator() {
        return new abml(this);
    }

    public final abms s(abms abmsVar) {
        if (Alert.DURATION_SHOW_INDEFINITELY - d() < abmsVar.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + d() + "+" + abmsVar.d());
        }
        int[] iArr = abpk.a;
        if (abmsVar.d() != 0) {
            if (d() == 0) {
                return abmsVar;
            }
            int iD = d() + abmsVar.d();
            if (iD < 128) {
                return abpk.G(this, abmsVar);
            }
            if (this instanceof abpk) {
                abpk abpkVar = (abpk) this;
                abms abmsVar2 = abpkVar.e;
                if (abmsVar2.d() + abmsVar.d() < 128) {
                    return new abpk(abpkVar.c, abpk.G(abmsVar2, abmsVar));
                }
                abms abmsVar3 = abpkVar.c;
                if (abmsVar3.p() > abmsVar2.p() && abpkVar.f > abmsVar.p()) {
                    return new abpk(abmsVar3, new abpk(abmsVar2, abmsVar));
                }
            }
            if (iD >= abpk.o(Math.max(p(), abmsVar.p()) + 1)) {
                return new abpk(this, abmsVar);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            wox.an(this, arrayDeque);
            wox.an(abmsVar, arrayDeque);
            this = (abms) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                this = new abpk((abms) arrayDeque.pop(), this);
            }
        }
        return this;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? abps.a(this) : abps.a(f(0, 47)).concat("..."));
    }

    public final abms x(int i) {
        return e(i, d());
    }

    public final String z(Charset charset) {
        return B() ? "" : i(charset);
    }
}
