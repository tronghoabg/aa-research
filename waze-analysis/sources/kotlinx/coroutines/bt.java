package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class bt extends cf implements s {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(br brVar) {
        cf cfVarE;
        super(true);
        boolean z = true;
        I(brVar);
        p pVarE = E();
        q qVar = pVarE instanceof q ? (q) pVarE : null;
        if (qVar == null || (cfVarE = qVar.e()) == null) {
            z = false;
            break;
        }
        while (!cfVarE.bJ()) {
            p pVarE2 = cfVarE.E();
            q qVar2 = pVarE2 instanceof q ? (q) pVarE2 : null;
            if (qVar2 == null || (cfVarE = qVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.f51768b = z;
    }

    @Override // kotlinx.coroutines.s
    public final boolean a() {
        return P(h.ab.f48028a);
    }

    @Override // kotlinx.coroutines.s
    public final void b(Throwable th) throws Throwable {
        P(new u(th));
    }

    @Override // kotlinx.coroutines.cf
    public final boolean bJ() {
        return this.f51768b;
    }

    @Override // kotlinx.coroutines.cf
    public final boolean bK() {
        return true;
    }
}
