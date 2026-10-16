package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class ryk {
    public final List a;
    public final xxh b;
    public ssu c;
    public xxh d = xvy.a;
    public ryx e = ryx.a;
    public ryv f = null;

    public ryk(List list, xxh xxhVar) {
        this.a = list;
        this.b = xxhVar;
    }

    final void a(String str, xxh xxhVar) {
        ynp ynpVarListIterator = ((yfq) this.a).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ((ryb) ynpVarListIterator.next()).v(str, xxhVar);
        }
    }

    public final void b() {
        this.e = ryx.a;
        this.f = null;
    }
}
