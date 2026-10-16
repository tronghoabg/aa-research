package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f51113a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f51114b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f51115c;

    /* renamed from: d, reason: collision with root package name */
    int f51116d;

    /* renamed from: e, reason: collision with root package name */
    ab f51117e;

    /* renamed from: f, reason: collision with root package name */
    String f51118f;

    /* renamed from: g, reason: collision with root package name */
    h.b f51119g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f51115c = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51114b = obj;
        this.f51116d |= Integer.MIN_VALUE;
        return ab.a(this.f51115c, null, this);
    }
}
