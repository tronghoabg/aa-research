package okhttp3;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class an extends ao {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f55894a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f55895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ byte[] f55896c;

    an(ae aeVar, int i2, byte[] bArr) {
        this.f55894a = aeVar;
        this.f55895b = i2;
        this.f55896c = bArr;
    }

    @Override // okhttp3.ao
    public final long a() {
        return this.f55895b;
    }

    @Override // okhttp3.ao
    public final ae b() {
        return this.f55894a;
    }

    @Override // okhttp3.ao
    public final void c(k.i iVar) {
        h.g.b.x.f(iVar, "sink");
        iVar.ab(this.f55896c, this.f55895b);
    }
}
