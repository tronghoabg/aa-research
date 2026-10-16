package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class aisa implements Iterator, afgc {
    final /* synthetic */ Object a;
    private final Iterator b;
    private int c;
    private final /* synthetic */ int d;

    public aisa(airx airxVar, int i) {
        this.d = i;
        this.a = airxVar;
        this.b = new aisc((aisd) airxVar.a);
    }

    private final void a() {
        while (this.c < ((airx) this.a).b) {
            Iterator it = this.b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.c++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == 0) {
            return this.b.hasNext();
        }
        a();
        return this.c < 2 && this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [afeg, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.c;
            if (i >= 2) {
                throw new NoSuchElementException();
            }
            this.c = i + 1;
            return this.b.next();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        if (i2 < 0) {
            woy.bo();
        }
        Object obj = this.a;
        Iterator it = this.b;
        return ((aisb) obj).b.invoke(Integer.valueOf(i2), it.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public aisa(aisb aisbVar, int i) {
        this.d = i;
        this.a = aisbVar;
        this.b = new airl((airm) aisbVar.a);
    }
}
