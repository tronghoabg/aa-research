package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class uwd implements Iterable {
    final boolean a;
    final int b;
    final aewk c;

    public uwd(boolean z, int i, aewk aewkVar) {
        this.a = z;
        this.b = i;
        this.c = aewkVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<aewx> iterator() {
        return this.c.d().c();
    }
}
