package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class aac implements Iterator, afgc {
    public int a = -1;
    final /* synthetic */ Object b;
    private final Iterator c;
    private final /* synthetic */ int d;

    public aac(aaa aaaVar, int i) {
        this.d = i;
        this.b = aaaVar;
        this.c = afrg.a(new zz(aaaVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Iterator it = this.c;
        return i != 0 ? it.hasNext() : it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        Iterator it = this.c;
        return i != 0 ? it.next() : it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        int i2 = this.a;
        if (i != 0) {
            if (i2 != -1) {
                ((aaa) this.b).a.e(i2);
                this.a = -1;
                return;
            }
            return;
        }
        if (i2 != -1) {
            ((aad) this.b).a.i(i2);
            this.a = -1;
        }
    }

    public aac(aad aadVar, int i) {
        this.d = i;
        this.b = aadVar;
        this.c = afrg.a(new aab(aadVar, this, null));
    }
}
