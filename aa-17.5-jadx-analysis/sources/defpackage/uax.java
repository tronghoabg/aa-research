package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class uax implements Iterable {
    public final yfg a;
    final /* synthetic */ gjv b;

    public uax(gjv gjvVar, yfg yfgVar) {
        this.b = gjvVar;
        this.a = yfgVar;
    }

    public final int a(abeg abegVar) {
        return ((aevt) this.b.a).o(abegVar);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new uaw(this);
    }
}
