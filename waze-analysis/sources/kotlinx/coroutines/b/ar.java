package kotlinx.coroutines.b;

/* loaded from: classes7.dex */
public final class ar extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51518a;

    /* renamed from: b, reason: collision with root package name */
    int f51519b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f51520c;

    /* renamed from: d, reason: collision with root package name */
    al f51521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f51520c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f51518a = obj;
        this.f51519b |= Integer.MIN_VALUE;
        return this.f51520c.collect(null, this);
    }
}
