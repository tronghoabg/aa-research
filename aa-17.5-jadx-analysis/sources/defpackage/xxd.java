package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class xxd {
    public final String c;

    public xxd(xxd xxdVar) {
        this.c = xxdVar.c;
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public String b(Iterable iterable) {
        return d(iterable.iterator());
    }

    public void c(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final String d(Iterator it) {
        StringBuilder sb = new StringBuilder();
        f(sb, it);
        return sb.toString();
    }

    public final String e(Object obj, Object obj2, Object... objArr) {
        return b(new xxc(objArr, obj, obj2));
    }

    public final void f(StringBuilder sb, Iterator it) {
        try {
            c(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void g(StringBuilder sb, Iterable iterable) {
        f(sb, iterable.iterator());
    }

    public xxd(String str) {
        this.c = str;
    }
}
