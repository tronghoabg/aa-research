package okhttp3.internal.f;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class s extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f56211a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f56212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f56213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, w wVar, int i2, b bVar) {
        super(str);
        this.f56211a = wVar;
        this.f56212b = i2;
        this.f56213c = bVar;
    }

    @Override // okhttp3.internal.b.a
    public final long b() {
        w wVar = this.f56211a;
        wVar.f56231k.d(this.f56213c);
        int i2 = this.f56212b;
        synchronized (wVar) {
            wVar.x.remove(Integer.valueOf(i2));
        }
        return -1L;
    }
}
