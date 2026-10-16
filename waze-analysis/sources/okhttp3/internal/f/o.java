package okhttp3.internal.f;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56199a;

    /* renamed from: b, reason: collision with root package name */
    private final z f56200b;

    public o(w wVar, z zVar) {
        h.g.b.x.f(zVar, "reader");
        this.f56199a = wVar;
        this.f56200b = zVar;
    }

    @Override // h.g.a.a
    public final /* bridge */ /* synthetic */ Object invoke() throws Throwable {
        b bVar;
        z zVar;
        b bVar2 = b.f56141c;
        IOException e2 = null;
        try {
            zVar = this.f56200b;
            o oVar = this;
            h.g.b.x.f(this, "handler");
        } catch (IOException e3) {
            e2 = e3;
            bVar = bVar2;
        } catch (Throwable th) {
            th = th;
            bVar = bVar2;
            this.f56199a.x(bVar, bVar2, e2);
            okhttp3.internal.b.s(this.f56200b);
            throw th;
        }
        if (!zVar.b(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        do {
            o oVar2 = this;
        } while (zVar.b(false, this));
        bVar = b.f56139a;
        try {
            try {
                this.f56199a.x(bVar, b.f56147i, null);
                okhttp3.internal.b.s(zVar);
            } catch (IOException e4) {
                e2 = e4;
                b bVar3 = b.f56140b;
                this.f56199a.x(bVar3, bVar3, e2);
                okhttp3.internal.b.s(this.f56200b);
                return h.ab.f48028a;
            }
            return h.ab.f48028a;
        } catch (Throwable th2) {
            th = th2;
            this.f56199a.x(bVar, bVar2, e2);
            okhttp3.internal.b.s(this.f56200b);
            throw th;
        }
    }
}
