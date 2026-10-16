package defpackage;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aefs extends aeeo implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient byte[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    protected final transient int f;
    public int g;
    protected final float h;

    public aefs(byte[] bArr) {
        this.h = 0.75f;
        int iP = adqs.p(16, 0.75f);
        this.d = iP;
        this.f = iP;
        this.b = iP - 1;
        this.e = adqs.q(iP, 0.75f);
        this.a = new byte[this.d + 1];
    }

    private final void p(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil(j / this.h)) - 1))));
        if (iMin > this.d) {
            o(iMin);
        }
    }

    private final void q(int i) {
        byte b;
        this.g--;
        byte[] bArr = this.a;
        loop0: while (true) {
            int i2 = (i + 1) & this.b;
            while (true) {
                b = bArr[i2];
                if (b == 0) {
                    break loop0;
                }
                int i3 = this.b;
                int i4 = (-1640531527) * b;
                int i5 = (i4 ^ (i4 >>> 16)) & i3;
                if (i <= i2) {
                    if (i >= i5 || i5 > i2) {
                        break;
                    } else {
                        i2 = (i2 + 1) & i3;
                    }
                } else if (i < i5 || i5 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            bArr[i] = b;
            i = i2;
        }
        bArr[i] = 0;
        int i6 = this.d;
        if (i6 <= this.f || this.g >= this.e / 4 || i6 <= 16) {
            return;
        }
        o(i6 >> 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        byte b;
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.g;
        float f = this.h;
        int iP = adqs.p(i2, f);
        this.d = iP;
        this.e = adqs.q(iP, f);
        int i3 = this.d;
        this.b = i3 - 1;
        byte[] bArr = new byte[i3 + 1];
        this.a = bArr;
        int i4 = this.g;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            byte b2 = objectInputStream.readByte();
            if (b2 == 0) {
                i = this.d;
                this.c = true;
                b = 0;
            } else {
                int i6 = (-1640531527) * b2;
                int i7 = this.b & (i6 ^ (i6 >>> 16));
                if (bArr[i7] != 0) {
                    do {
                        i7 = (i7 + 1) & this.b;
                    } while (bArr[i7] != 0);
                }
                int i8 = i7;
                b = b2;
                i = i8;
            }
            bArr[i] = b;
            i4 = i5;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        aefq aefqVar = new aefq(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.g; i != 0; i--) {
            objectOutputStream.writeByte(aefqVar.c());
        }
    }

    @Override // defpackage.aeeo, defpackage.aeeg, defpackage.aeez
    /* renamed from: a */
    public final aefl iterator() {
        return new aefq(this);
    }

    @Override // defpackage.aeeg, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Byte> collection) {
        if (this.h <= 0.5d) {
            n(collection.size());
        } else {
            p(this.g + collection.size());
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aeeo, defpackage.aeeg, defpackage.aeez
    public final aefz b() {
        return new aefr(this);
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public final boolean c(byte b) {
        byte b2;
        if (b != 0) {
            byte[] bArr = this.a;
            int i = (-1640531527) * b;
            int i2 = this.b & (i ^ (i >>> 16));
            byte b3 = bArr[i2];
            if (b3 != 0) {
                if (b3 != b) {
                    do {
                        i2 = (i2 + 1) & this.b;
                        b2 = bArr[i2];
                        if (b2 != 0) {
                        }
                    } while (b2 != b);
                }
                return false;
            }
            bArr[i2] = b;
        } else {
            if (this.c) {
                return false;
            }
            this.c = true;
        }
        int i3 = this.g;
        this.g = i3 + 1;
        if (i3 >= this.e) {
            o(adqs.p(i3 + 2, this.h));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.c = false;
        Arrays.fill(this.a, (byte) 0);
    }

    @Override // defpackage.aeeg
    public final boolean d(aeez aeezVar) {
        if (this.h <= 0.5d) {
            n(aeezVar.size());
        } else {
            p(this.g + aeezVar.size());
        }
        aefl it = aeezVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (c(it.c())) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aeeg, defpackage.aeez
    public final boolean e(byte b) {
        byte b2;
        if (b == 0) {
            return this.c;
        }
        byte[] bArr = this.a;
        int i = (-1640531527) * b;
        int i2 = this.b & (i ^ (i >>> 16));
        byte b3 = bArr[i2];
        if (b3 == 0) {
            return false;
        }
        if (b != b3) {
            do {
                i2 = (i2 + 1) & this.b;
                b2 = bArr[i2];
                if (b2 == 0) {
                    return false;
                }
            } while (b != b2);
        }
        return true;
    }

    @Override // defpackage.aeeo, java.util.Collection, java.util.Set
    public final int hashCode() {
        byte b;
        byte[] bArr = this.a;
        int i = 0;
        int i2 = 0;
        for (int iL = l(); iL != 0; iL--) {
            do {
                b = bArr[i2];
                i2++;
            } while (b == 0);
            i += b;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // defpackage.aeeo, defpackage.aeeg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new aefq(this);
    }

    @Override // defpackage.aeeo
    public final boolean k(byte b) {
        byte b2;
        if (b == 0) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            byte[] bArr = this.a;
            int i = this.d;
            bArr[i] = 0;
            int i2 = this.g - 1;
            this.g = i2;
            if (i > this.f && i2 < this.e / 4 && i > 16) {
                o(i >> 1);
            }
            return true;
        }
        byte[] bArr2 = this.a;
        int i3 = (-1640531527) * b;
        int i4 = this.b & (i3 ^ (i3 >>> 16));
        byte b3 = bArr2[i4];
        if (b3 == 0) {
            return false;
        }
        if (b == b3) {
            q(i4);
            return true;
        }
        do {
            i4 = (i4 + 1) & this.b;
            b2 = bArr2[i4];
            if (b2 == 0) {
                return false;
            }
        } while (b != b2);
        q(i4);
        return true;
    }

    public final int l() {
        boolean z = this.c;
        int i = this.g;
        return z ? i - 1 : i;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final aefs clone() {
        try {
            aefs aefsVar = (aefs) super.clone();
            aefsVar.a = (byte[]) this.a.clone();
            aefsVar.c = this.c;
            return aefsVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final void n(int i) {
        int iP = adqs.p(i, this.h);
        if (iP > this.d) {
            o(iP);
        }
    }

    protected final void o(int i) {
        byte b;
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[i + 1];
        int i2 = this.d;
        int iL = l();
        while (true) {
            int i3 = i - 1;
            if (iL == 0) {
                this.d = i;
                this.b = i3;
                this.e = adqs.q(i, this.h);
                this.a = bArr2;
                return;
            }
            do {
                i2--;
                b = bArr[i2];
            } while (b == 0);
            int i4 = b * (-1640531527);
            int i5 = (i4 ^ (i4 >>> 16)) & i3;
            if (bArr2[i5] != 0) {
                do {
                    i5 = (i5 + 1) & i3;
                } while (bArr2[i5] != 0);
            }
            bArr2[i5] = bArr[i2];
            iL--;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.aeeo, defpackage.aeeg, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aefr(this);
    }

    public aefs() {
        throw null;
    }
}
