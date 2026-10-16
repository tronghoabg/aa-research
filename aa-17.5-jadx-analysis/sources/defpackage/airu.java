package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class airu implements Iterable, afgc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public airu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [airp, java.lang.Object] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        ?? r1 = this.a;
        return i != 0 ? afez.d((Object[]) r1) : r1.a();
    }
}
