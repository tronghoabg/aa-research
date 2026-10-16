package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tlu implements tlw {
    private final Set a;

    public tlu(Set set) {
        this.a = set;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tlw) it.next()).close();
        }
    }
}
