package okhttp3.internal.e;

import h.g.b.x;
import java.io.IOException;
import k.am;
import k.ao;
import k.h;
import k.s;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
abstract class a implements am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f56078a;

    /* renamed from: b, reason: collision with root package name */
    private final s f56079b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56080c;

    public a(g gVar) {
        this.f56078a = gVar;
        this.f56079b = new s(gVar.f56096c.h());
    }

    @Override // k.am
    public long a(h hVar, long j2) throws IOException {
        x.f(hVar, "sink");
        try {
            return this.f56078a.f56096c.a(hVar, j2);
        } catch (IOException e2) {
            this.f56078a.c().l();
            this.b();
            throw e2;
        }
    }

    public final void b() {
        g gVar = this.f56078a;
        if (gVar.f56098e == 6) {
            return;
        }
        if (gVar.f56098e == 5) {
            g.s(this.f56079b);
            gVar.f56098e = 6;
        } else {
            throw new IllegalStateException("state: " + gVar.f56098e);
        }
    }

    protected final boolean c() {
        return this.f56080c;
    }

    protected final void d() {
        this.f56080c = true;
    }

    @Override // k.am
    public final ao h() {
        return this.f56079b;
    }
}
