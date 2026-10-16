package defpackage;

import j$.util.Objects;
import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aets<K> extends aeqw<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    protected transient Object[] a;
    protected int b;

    public aets(Object[] objArr) {
        this.a = objArr;
        this.b = 0;
    }

    private final int d(Object obj) {
        Object[] objArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (Objects.equals(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.b];
        this.a = objArr;
        for (int i = 0; i < this.b; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: a */
    public final aety iterator() {
        return new aexi(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        if (d(k) != -1) {
            return false;
        }
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            objArr = new Object[i == 0 ? 2 : i + i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.a[i2];
                i = i2;
            }
            this.a = objArr;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        objArr[i3] = k;
        return true;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    public final aeus b() {
        return new aetr(this, 0);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aets clone() {
        try {
            aets aetsVar = (aets) super.clone();
            aetsVar.a = (Object[]) this.a.clone();
            return aetsVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return d(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new aexi(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return false;
        }
        int i = (this.b - iD) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = this.a;
            int i3 = iD + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.b - 1;
        this.b = i4;
        this.a[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aetr(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int i = this.b;
        if (tArr == null) {
            tArr = (T[]) new Object[i];
        } else if (tArr.length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.b));
        }
        System.arraycopy(this.a, 0, tArr, 0, this.b);
        int length = tArr.length;
        int i2 = this.b;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public aets() {
        this.a = aett.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.b;
        return i == 0 ? aett.a : Arrays.copyOf(this.a, i, Object[].class);
    }
}
