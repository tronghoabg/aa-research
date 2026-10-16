package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends au {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f47308a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.f f47309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(ae aeVar, com.waze.uid.f fVar, String str) {
        super(aeVar.f46599g);
        this.f47309b = fVar;
        this.f47308a = str;
        Objects.requireNonNull(aeVar);
    }

    @Override // e.a.d.au
    public final void a() {
        ae.s(this.f47309b, e.a.ee.f47410j.g(String.format("Unable to find compressor by name %s", this.f47308a)), new e.a.cm());
    }
}
