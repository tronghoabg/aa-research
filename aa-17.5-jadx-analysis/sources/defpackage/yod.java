package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class yod extends yos {
    public yod(Class cls) {
        super("group_by", cls, true, true);
    }

    @Override // defpackage.yos
    public final void a(Iterator it, yor yorVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                yorVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            yorVar.a(str, sb.toString());
        }
    }
}
