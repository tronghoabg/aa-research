package okhttp3.internal.f;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class v extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f56219b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f56220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, w wVar, int i2, long j2) {
        super(str);
        this.f56218a = wVar;
        this.f56219b = i2;
        this.f56220c = j2;
    }

    @Override // okhttp3.internal.b.a
    public final long b() throws IOException {
        try {
            this.f56218a.q().j(this.f56219b, this.f56220c);
            return -1L;
        } catch (IOException e2) {
            this.f56218a.V(e2);
            return -1L;
        }
    }
}
