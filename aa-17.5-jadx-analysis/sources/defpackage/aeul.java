package defpackage;

import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeul<K> extends aeqw<K> implements Serializable, Cloneable {
    public static final /* synthetic */ int i = 0;
    private static final long serialVersionUID = 0;
    protected transient Object[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    protected final transient int f;
    protected int g;
    protected final float h;

    static {
        Collector.CC.of(new aetn(3), new mac(6), new rib(8), Collector.Characteristics.UNORDERED);
    }

    public aeul(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.h = 0.75f;
        int iP = adqs.p(i2, 0.75f);
        this.d = iP;
        this.f = iP;
        this.b = iP - 1;
        this.e = adqs.q(iP, 0.75f);
        this.a = new Object[this.d + 1];
    }

    private final void f(int i2) {
        Object obj;
        this.g--;
        Object[] objArr = this.a;
        loop0: while (true) {
            int i3 = (i2 + 1) & this.b;
            while (true) {
                obj = objArr[i3];
                if (obj == null) {
                    break loop0;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i4 = this.b;
                int i5 = (iHashCode ^ (iHashCode >>> 16)) & i4;
                if (i2 <= i3) {
                    if (i2 >= i5 || i5 > i3) {
                        break;
                    } else {
                        i3 = (i3 + 1) & i4;
                    }
                } else if (i2 < i5 || i5 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            objArr[i2] = obj;
            i2 = i3;
        }
        objArr[i2] = null;
        int i6 = this.d;
        if (i6 <= this.f || this.g >= this.e / 4 || i6 <= 16) {
            return;
        }
        e(i6 >> 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i2;
        objectInputStream.defaultReadObject();
        int i3 = this.g;
        float f = this.h;
        int iP = adqs.p(i3, f);
        this.d = iP;
        this.e = adqs.q(iP, f);
        int i4 = this.d;
        this.b = i4 - 1;
        Object[] objArr = new Object[i4 + 1];
        this.a = objArr;
        int i5 = this.g;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (object == null) {
                i2 = this.d;
                this.c = true;
            } else {
                int iHashCode = object.hashCode() * (-1640531527);
                i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
                if (objArr[i2] != null) {
                    do {
                        i2 = (i2 + 1) & this.b;
                    } while (objArr[i2] != null);
                }
            }
            objArr[i2] = object;
            i5 = i6;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        aeuj aeujVar = new aeuj(this);
        objectOutputStream.defaultWriteObject();
        for (int i2 = this.g; i2 != 0; i2--) {
            objectOutputStream.writeObject(aeujVar.next());
        }
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: a */
    public final aety iterator() {
        return new aeuj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        Object obj;
        if (k != null) {
            Object[] objArr = this.a;
            int iHashCode = k.hashCode() * (-1640531527);
            int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (!obj2.equals(k)) {
                    do {
                        i2 = (i2 + 1) & this.b;
                        obj = objArr[i2];
                        if (obj != null) {
                        }
                    } while (!obj.equals(k));
                }
                return false;
            }
            objArr[i2] = k;
        } else {
            if (this.c) {
                return false;
            }
            this.c = true;
        }
        int i3 = this.g;
        this.g = i3 + 1;
        if (i3 >= this.e) {
            e(adqs.p(i3 + 2, this.h));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends K> collection) {
        float f = this.h;
        if (f <= 0.5d) {
            int iP = adqs.p(collection.size(), f);
            if (iP > this.d) {
                e(iP);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.g + collection.size()) / f)) - 1))));
            if (iMin > this.d) {
                e(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    public final aeus b() {
        return new aeuk(this);
    }

    public final int c() {
        boolean z = this.c;
        int i2 = this.g;
        return z ? i2 - 1 : i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.c = false;
        Arrays.fill(this.a, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.c;
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
        Object obj3 = objArr[i2];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                i2 = (i2 + 1) & this.b;
                obj2 = objArr[i2];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aeul clone() {
        try {
            aeul aeulVar = (aeul) super.clone();
            aeulVar.a = (Object[]) this.a.clone();
            aeulVar.c = this.c;
            return aeulVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    protected final void e(int i2) {
        Object obj;
        Object[] objArr = this.a;
        Object[] objArr2 = new Object[i2 + 1];
        int i3 = this.d;
        int iC = c();
        while (true) {
            int i4 = i2 - 1;
            if (iC == 0) {
                this.d = i2;
                this.b = i4;
                this.e = adqs.q(i2, this.h);
                this.a = objArr2;
                return;
            }
            do {
                i3--;
                obj = objArr[i3];
            } while (obj == null);
            int iHashCode = obj.hashCode() * (-1640531527);
            int i5 = (iHashCode ^ (iHashCode >>> 16)) & i4;
            if (objArr2[i5] != null) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (objArr2[i5] != null);
            }
            objArr2[i5] = objArr[i3];
            iC--;
        }
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super K> consumer) {
        Object[] objArr = this.a;
        if (this.c) {
            consumer.accept(objArr[this.d]);
        }
        int i2 = this.d;
        while (i2 != 0) {
            i2--;
            Object obj = objArr[i2];
            if (obj != null) {
                consumer.accept(obj);
            }
        }
    }

    @Override // defpackage.aeqw, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.a;
        int iHashCode = 0;
        int i2 = 0;
        for (int iC = c(); iC != 0; iC--) {
            do {
                obj = objArr[i2];
                i2++;
            } while (obj == null);
            if (this != obj) {
                iHashCode += obj.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new aeuj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            Object[] objArr = this.a;
            int i2 = this.d;
            objArr[i2] = null;
            int i3 = this.g - 1;
            this.g = i3;
            if (i2 > this.f && i3 < this.e / 4 && i2 > 16) {
                e(i2 >> 1);
            }
            return true;
        }
        Object[] objArr2 = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i4 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
        Object obj3 = objArr2[i4];
        if (obj3 == null) {
            return false;
        }
        if (obj.equals(obj3)) {
            f(i4);
            return true;
        }
        do {
            i4 = (i4 + 1) & this.b;
            obj2 = objArr2[i4];
            if (obj2 == null) {
                return false;
            }
        } while (!obj.equals(obj2));
        f(i4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeuk(this);
    }

    public aeul() {
        throw null;
    }
}
