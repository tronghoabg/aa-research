package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class uaw extends yno {
    public int a = 0;
    private final aety b;
    private final Iterator c;

    public uaw(uax uaxVar) {
        this.b = ((aevt) uaxVar.b.a).p().c();
        this.c = ((yfq) uaxVar.a).listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abeg next() {
        aety aetyVar = this.b;
        if (aetyVar.hasNext()) {
            aevn aevnVar = (aevn) aetyVar.next();
            this.a = aevnVar.a();
            return (abeg) aevnVar.getKey();
        }
        Iterator it = this.c;
        if (!it.hasNext()) {
            throw new IllegalStateException("Calling next() on an exhausted iterator");
        }
        this.a = 0;
        return (abeg) it.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.c.hasNext();
    }
}
