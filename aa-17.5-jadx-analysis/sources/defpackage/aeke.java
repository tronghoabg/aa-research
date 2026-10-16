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
public final class aeke extends aegr implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    protected final transient int f;
    protected int g;
    protected final float h;

    public aeke(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.h = 0.75f;
        int iP = adqs.p(i, 0.75f);
        this.d = iP;
        this.f = iP;
        this.b = iP - 1;
        this.e = adqs.q(iP, 0.75f);
        this.a = new int[this.d + 1];
    }

    private final void q(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil(j / this.h)) - 1))));
        if (iMin > this.d) {
            p(iMin);
        }
    }

    private final void r(int i) {
        int i2;
        this.g--;
        int[] iArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.b;
            while (true) {
                i2 = iArr[i3];
                if (i2 == 0) {
                    break loop0;
                }
                int i4 = this.b;
                int i5 = (-1640531527) * i2;
                int i6 = (i5 ^ (i5 >>> 16)) & i4;
                if (i <= i3) {
                    if (i >= i6 || i6 > i3) {
                        break;
                    } else {
                        i3 = (i3 + 1) & i4;
                    }
                } else if (i < i6 || i6 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            iArr[i] = i2;
            i = i3;
        }
        iArr[i] = 0;
        int i7 = this.d;
        if (i7 <= this.f || this.g >= this.e / 4 || i7 <= 16) {
            return;
        }
        p(i7 >> 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        int i2;
        objectInputStream.defaultReadObject();
        int i3 = this.g;
        float f = this.h;
        int iP = adqs.p(i3, f);
        this.d = iP;
        this.e = adqs.q(iP, f);
        int i4 = this.d;
        this.b = i4 - 1;
        int[] iArr = new int[i4 + 1];
        this.a = iArr;
        int i5 = this.g;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            int i7 = objectInputStream.readInt();
            if (i7 == 0) {
                i2 = this.d;
                this.c = true;
                i = 0;
            } else {
                int i8 = (-1640531527) * i7;
                int i9 = this.b & (i8 ^ (i8 >>> 16));
                if (iArr[i9] != 0) {
                    do {
                        i9 = (i9 + 1) & this.b;
                    } while (iArr[i9] != 0);
                }
                int i10 = i9;
                i = i7;
                i2 = i10;
            }
            iArr[i2] = i;
            i5 = i6;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        aekc aekcVar = new aekc(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.g; i != 0; i--) {
            objectOutputStream.writeInt(aekcVar.nextInt());
        }
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public final aejr iterator() {
        return new aekc(this);
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        if (this.h <= 0.5d) {
            o(collection.size());
        } else {
            q(this.g + collection.size());
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aekd(this);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean c(int i) {
        int i2;
        if (i != 0) {
            int[] iArr = this.a;
            int i3 = (-1640531527) * i;
            int i4 = this.b & (i3 ^ (i3 >>> 16));
            int i5 = iArr[i4];
            if (i5 != 0) {
                if (i5 != i) {
                    do {
                        i4 = (i4 + 1) & this.b;
                        i2 = iArr[i4];
                        if (i2 != 0) {
                        }
                    } while (i2 != i);
                }
                return false;
            }
            iArr[i4] = i;
        } else {
            if (this.c) {
                return false;
            }
            this.c = true;
        }
        int i6 = this.g;
        this.g = i6 + 1;
        if (i6 >= this.e) {
            p(adqs.p(i6 + 2, this.h));
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
        Arrays.fill(this.a, 0);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean d(aejf aejfVar) {
        if (this.h <= 0.5d) {
            o(aejfVar.size());
        } else {
            q(this.g + aejfVar.size());
        }
        return super.d(aejfVar);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        int i2;
        if (i == 0) {
            return this.c;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.b & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return false;
        }
        if (i != i5) {
            do {
                i4 = (i4 + 1) & this.b;
                i2 = iArr[i4];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // defpackage.aegr, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.a;
        int i2 = 0;
        int i3 = 0;
        for (int iM = m(); iM != 0; iM--) {
            do {
                i = iArr[i3];
                i3++;
            } while (i == 0);
            i2 += i;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return new aekc(this);
    }

    @Override // defpackage.aegr
    public final boolean l(int i) {
        int i2;
        if (i == 0) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            int[] iArr = this.a;
            int i3 = this.d;
            iArr[i3] = 0;
            int i4 = this.g - 1;
            this.g = i4;
            if (i3 > this.f && i4 < this.e / 4 && i3 > 16) {
                p(i3 >> 1);
            }
            return true;
        }
        int[] iArr2 = this.a;
        int i5 = (-1640531527) * i;
        int i6 = this.b & (i5 ^ (i5 >>> 16));
        int i7 = iArr2[i6];
        if (i7 == 0) {
            return false;
        }
        if (i == i7) {
            r(i6);
            return true;
        }
        do {
            i6 = (i6 + 1) & this.b;
            i2 = iArr2[i6];
            if (i2 == 0) {
                return false;
            }
        } while (i != i2);
        r(i6);
        return true;
    }

    public final int m() {
        boolean z = this.c;
        int i = this.g;
        return z ? i - 1 : i;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final aeke clone() {
        try {
            aeke aekeVar = (aeke) super.clone();
            aekeVar.a = (int[]) this.a.clone();
            aekeVar.c = this.c;
            return aekeVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final void o(int i) {
        int iP = adqs.p(i, this.h);
        if (iP > this.d) {
            p(iP);
        }
    }

    protected final void p(int i) {
        int i2;
        int[] iArr = this.a;
        int[] iArr2 = new int[i + 1];
        int i3 = this.d;
        int iM = m();
        while (true) {
            int i4 = i - 1;
            if (iM == 0) {
                this.d = i;
                this.b = i4;
                this.e = adqs.q(i, this.h);
                this.a = iArr2;
                return;
            }
            do {
                i3--;
                i2 = iArr[i3];
            } while (i2 == 0);
            int i5 = i2 * (-1640531527);
            int i6 = (i5 ^ (i5 >>> 16)) & i4;
            if (iArr2[i6] != 0) {
                do {
                    i6 = (i6 + 1) & i4;
                } while (iArr2[i6] != 0);
            }
            iArr2[i6] = iArr[i3];
            iM--;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aekd(this);
    }

    public aeke() {
        throw null;
    }
}
