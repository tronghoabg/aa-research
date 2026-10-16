package od;

import java.io.Closeable;

/* renamed from: od.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3695j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final pd.g f41993a;

    /* renamed from: b, reason: collision with root package name */
    public final D0 f41994b;

    public C3695j(pd.g gVar, D0 d02) {
        this.f41993a = gVar;
        this.f41994b = d02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41993a.close();
    }
}
