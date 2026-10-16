package okhttp3.internal.f;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class m extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56194a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f56195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f56196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, w wVar, int i2, int i3) {
        super(str);
        this.f56194a = wVar;
        this.f56195b = i2;
        this.f56196c = i3;
    }

    @Override // okhttp3.internal.b.a
    public final long b() throws IOException {
        this.f56194a.G(true, this.f56195b, this.f56196c);
        return -1L;
    }
}
