package a4;

import cg.C1618g;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17374a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f17375b;

    public h(C1330c c1330c) {
        this.f17375b = c1330c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f17374a) {
            case 0:
                ((C1330c) this.f17375b).close();
                return;
            default:
                if (((C1618g) this.f17375b) == null) {
                    throw new IllegalStateException("not attached to a buffer");
                }
                this.f17375b = null;
                return;
        }
    }

    public h() {
    }
}
