package e.a.d;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class f implements ju {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46913a = Logger.getLogger(f.class.getName());

    @Override // e.a.d.ju
    public final void d() {
        if (w().g()) {
            return;
        }
        w().d();
    }

    @Override // e.a.d.ju
    public final void f() {
        q().g();
    }

    @Override // e.a.d.ju
    public final void g(int i2) {
        e.c(q(), i2);
    }

    @Override // e.a.d.ju
    public final void h(e.a.s sVar) {
        gm gmVarW = w();
        com.google.d.b.an.C(sVar, "compressor");
        gmVarW.h(sVar);
    }

    @Override // e.a.d.ju
    public final void n(InputStream inputStream) throws IOException {
        try {
            if (!w().g()) {
                w().f(inputStream);
            }
        } finally {
            dh.g(inputStream);
        }
    }

    @Override // e.a.d.ju
    public boolean o() {
        throw null;
    }

    protected abstract e q();

    protected abstract gm w();

    protected final void y(int i2) {
        e.b(q(), i2);
    }
}
