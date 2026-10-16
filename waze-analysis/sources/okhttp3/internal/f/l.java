package okhttp3.internal.f;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class l extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f56193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, w wVar, ad adVar) {
        super(str);
        this.f56192a = wVar;
        this.f56193b = adVar;
    }

    @Override // okhttp3.internal.b.a
    public final long b() {
        try {
            this.f56192a.m().m(this.f56193b);
            return -1L;
        } catch (IOException e2) {
            w wVar = this.f56192a;
            okhttp3.internal.g.g.f56287a.m("Http2Connection.Listener failure for ".concat(String.valueOf(wVar.g())), 4, e2);
            try {
                this.f56193b.t(b.f56140b, e2);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
