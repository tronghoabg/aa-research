package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f51275a;

    aa(kotlinx.coroutines.k kVar) {
        this.f51275a = kVar;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kotlinx.coroutines.k kVar = this.f51275a;
        h.ab abVar = h.ab.f48028a;
        kVar.resumeWith(abVar);
        return abVar;
    }
}
