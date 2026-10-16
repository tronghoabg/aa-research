package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class xxb extends xxd {
    final /* synthetic */ xxd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxb(xxd xxdVar, xxd xxdVar2) {
        super(xxdVar2);
        this.a = xxdVar;
    }

    @Override // defpackage.xxd
    public final String b(Iterable iterable) {
        return d(iterable.iterator());
    }

    @Override // defpackage.xxd
    public final void c(Appendable appendable, Iterator it) throws IOException {
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                xxd xxdVar = this.a;
                appendable.append(xxdVar.c);
                appendable.append(xxdVar.a(next2));
            }
        }
    }
}
