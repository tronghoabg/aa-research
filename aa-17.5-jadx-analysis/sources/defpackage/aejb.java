package defpackage;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aejb extends aegr implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    protected transient int[] a;
    protected int b;

    public aejb(byte[] bArr) {
        this.a = new int[2];
    }

    private final int n(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        while (i2 != 0) {
            i2--;
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.b];
        this.a = iArr;
        for (int i = 0; i < this.b; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public final aejr m() {
        return new aeiz(this);
    }

    @Override // defpackage.aegr, defpackage.aegj, defpackage.aejf
    public final aekm b() {
        return new aeja(this, 0);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean c(int i) {
        if (n(i) != -1) {
            return false;
        }
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 == iArr.length) {
            iArr = new int[i2 == 0 ? 2 : i2 + i2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.a[i3];
                i2 = i3;
            }
            this.a = iArr;
        }
        int i4 = this.b;
        this.b = i4 + 1;
        iArr[i4] = i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        return n(i) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return new aeiz(this);
    }

    @Override // defpackage.aegr
    public final boolean l(int i) {
        int iN = n(i);
        if (iN == -1) {
            return false;
        }
        int i2 = (this.b - iN) - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.a;
            int i4 = iN + i3;
            iArr[i4] = iArr[i4 + 1];
        }
        this.b--;
        return true;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final aejb clone() {
        try {
            aejb aejbVar = (aejb) super.clone();
            aejbVar.a = (int[]) this.a.clone();
            return aejbVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aeja(this, 0);
    }

    public aejb() {
        this.a = aejc.a;
    }

    public aejb(int[] iArr) {
        this.a = iArr;
        this.b = 0;
    }
}
