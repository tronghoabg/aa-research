package defpackage;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aeox extends aell implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    protected transient long[] a;
    protected int b;

    public aeox(long[] jArr) {
        this.a = jArr;
        this.b = 0;
    }

    private final int n(long j) {
        long[] jArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.b];
        this.a = jArr;
        for (int i = 0; i < this.b; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: a */
    public final aepm m() {
        return new aeov(this);
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aeow(this, 0);
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean c(long j) {
        if (n(j) != -1) {
            return false;
        }
        int i = this.b;
        long[] jArr = this.a;
        if (i == jArr.length) {
            jArr = new long[i == 0 ? 2 : i + i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.a[i2];
                i = i2;
            }
            this.a = jArr;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        jArr[i3] = j;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        return n(j) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return new aeov(this);
    }

    @Override // defpackage.aell
    public final boolean l(long j) {
        int iN = n(j);
        if (iN == -1) {
            return false;
        }
        int i = (this.b - iN) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            long[] jArr = this.a;
            int i3 = iN + i2;
            jArr[i3] = jArr[i3 + 1];
        }
        this.b--;
        return true;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final aeox clone() {
        try {
            aeox aeoxVar = (aeox) super.clone();
            aeoxVar.a = (long[]) this.a.clone();
            return aeoxVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeow(this, 0);
    }

    public aeox() {
        this.a = aeoy.a;
    }
}
