package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ybq<E> extends ybv<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient ylm a = f();
    public transient long b;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = f();
        for (int i2 = 0; i2 < i; i2++) {
            h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(l().size());
        for (ylb ylbVar : l()) {
            objectOutputStream.writeObject(ylbVar.b());
            objectOutputStream.writeInt(ylbVar.a());
        }
    }

    @Override // defpackage.ylc
    public final int a(Object obj) {
        ylm ylmVar = this.a;
        int iE = ylmVar.e(obj);
        if (iE == -1) {
            return 0;
        }
        return ylmVar.b[iE];
    }

    @Override // defpackage.ybv
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.ybv, defpackage.ylc
    public final int c(Object obj, int i) {
        woy.Q(true, "occurrences cannot be negative: %s", i);
        int iE = this.a.e(obj);
        if (iE == -1) {
            return 0;
        }
        int iC = this.a.c(iE);
        ylm ylmVar = this.a;
        if (iC > i) {
            ylmVar.k(iE, iC - i);
        } else {
            ylmVar.h(iE);
            i = iC;
        }
        this.b -= i;
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ylm ylmVar = this.a;
        ylmVar.d++;
        Arrays.fill(ylmVar.a, 0, ylmVar.c, (Object) null);
        Arrays.fill(ylmVar.b, 0, ylmVar.c, 0);
        Arrays.fill(ylmVar.e, -1);
        Arrays.fill(ylmVar.f, -1L);
        ylmVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.ybv
    public final Iterator d() {
        return new ybn(this);
    }

    @Override // defpackage.ybv
    public final Iterator e() {
        return new ybo(this);
    }

    public abstract ylm f();

    @Override // defpackage.ybv, defpackage.ylc
    public final boolean g(Object obj, int i) {
        wub.G(i, "oldCount");
        int iE = this.a.e(obj);
        if (iE == -1) {
            return i == 0;
        }
        if (this.a.c(iE) != i) {
            return false;
        }
        this.a.h(iE);
        this.b -= i;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    @Override // defpackage.ybv, defpackage.ylc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r21, int r22) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybq.h(java.lang.Object, int):void");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return ysi.h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ylc
    public final int size() {
        return wub.aw(this.b);
    }
}
