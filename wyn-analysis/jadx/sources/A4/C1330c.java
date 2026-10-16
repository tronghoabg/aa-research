package a4;

import java.io.Closeable;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1329b f17351a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f17353c;

    public C1330c(f fVar, C1329b c1329b) {
        this.f17353c = fVar;
        this.f17351a = c1329b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17352b) {
            return;
        }
        this.f17352b = true;
        f fVar = this.f17353c;
        synchronized (fVar) {
            C1329b c1329b = this.f17351a;
            int i5 = c1329b.f17349h - 1;
            c1329b.f17349h = i5;
            if (i5 == 0 && c1329b.f17347f) {
                Bf.i iVar = f.f17356q;
                fVar.B(c1329b);
            }
        }
    }
}
