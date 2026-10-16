package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ewr implements Iterator, afgc {
    final /* synthetic */ admg a;
    private int b = -1;
    private boolean c;

    public ewr(admg admgVar) {
        this.a = admgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < ((aau) this.a.a).c();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = true;
        admg admgVar = this.a;
        int i = this.b + 1;
        this.b = i;
        return (euz) ((aau) admgVar.a).e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        admg admgVar = this.a;
        int i = this.b;
        aau aauVar = (aau) admgVar.a;
        ((euz) aauVar.e(i)).e = null;
        int i2 = this.b;
        Object[] objArr = aauVar.c;
        Object obj = objArr[i2];
        Object obj2 = aav.a;
        if (obj != obj2) {
            objArr[i2] = obj2;
            aauVar.a = true;
        }
        this.b = i2 - 1;
        this.c = false;
    }
}
