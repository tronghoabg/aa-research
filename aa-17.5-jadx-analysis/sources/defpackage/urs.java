package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes3.dex */
final class urs {
    public int a = 0;
    public yfq b;
    public yfq c;
    public final rjs d;
    private final yfq e;

    public urs(yfq yfqVar, rjs rjsVar) {
        this.e = yfqVar;
        this.d = rjsVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection] */
    final synchronized urr a() {
        yfq yfqVar;
        if (this.a == 0) {
            rjg rjgVar = new rjg(this.d);
            Stream map = Collection.EL.stream(this.e).map(new mix(rjgVar, 18));
            int i = yfq.d;
            this.c = (yfq) map.collect(ycm.a);
            this.b = yfq.o(rjgVar.a);
        }
        this.a++;
        yfqVar = this.c;
        yfqVar.getClass();
        return new urr(yfqVar, this);
    }
}
