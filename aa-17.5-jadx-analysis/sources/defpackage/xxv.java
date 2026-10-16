package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class xxv implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ xxx b;

    public xxv(xxx xxxVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = xxxVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.h(this.a);
    }

    public final String toString() {
        xxd xxdVar = new xxd(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        xxdVar.g(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
