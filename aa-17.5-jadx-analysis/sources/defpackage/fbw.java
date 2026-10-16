package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fbw implements fbp {
    public final Context a;
    public final String b;
    public final fbm c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final aezr g = woy.dG(new epp(this, 20));

    public fbw(Context context, String str, fbm fbmVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = fbmVar;
        this.d = z;
        this.e = z2;
    }

    private final fbv a() {
        return (fbv) this.g.a();
    }

    @Override // defpackage.fbp
    public final fbl b() {
        return a().b();
    }

    @Override // defpackage.fbp
    public final String c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }

    @Override // defpackage.fbp
    public final void d(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}
