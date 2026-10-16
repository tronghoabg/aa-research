package okhttp3.internal.f;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class u extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56215a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f56216b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f56217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, w wVar, int i2, b bVar) {
        super(str);
        this.f56215a = wVar;
        this.f56216b = i2;
        this.f56217c = bVar;
    }

    @Override // okhttp3.internal.b.a
    public final long b() throws IOException {
        try {
            this.f56215a.H(this.f56216b, this.f56217c);
            return -1L;
        } catch (IOException e2) {
            this.f56215a.V(e2);
            return -1L;
        }
    }
}
