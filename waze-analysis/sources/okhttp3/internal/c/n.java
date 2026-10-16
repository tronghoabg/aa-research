package okhttp3.internal.c;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n extends okhttp3.internal.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f56044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, String str) {
        super(str);
        this.f56044a = oVar;
    }

    @Override // okhttp3.internal.b.a
    public final long b() {
        return this.f56044a.a(System.nanoTime());
    }
}
