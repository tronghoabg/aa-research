package W;

import A0.p;
import N.A0;
import N.P;
import N.Y;
import N.q0;

/* loaded from: classes.dex */
public final class b implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public S3.e f14921a;

    /* renamed from: b, reason: collision with root package name */
    public c f14922b;

    /* renamed from: c, reason: collision with root package name */
    public String f14923c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14924d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f14925e;

    /* renamed from: f, reason: collision with root package name */
    public G9.e f14926f;

    /* renamed from: g, reason: collision with root package name */
    public final p f14927g = new p(this, 13);

    public b(S3.e eVar, c cVar, String str, Object obj, Object[] objArr) {
        this.f14921a = eVar;
        this.f14922b = cVar;
        this.f14923c = str;
        this.f14924d = obj;
        this.f14925e = objArr;
    }

    public final void a() throws Exception {
        String strS;
        c cVar = this.f14922b;
        if (this.f14926f != null) {
            throw new IllegalArgumentException(("entry(" + this.f14926f + ") is not null").toString());
        }
        if (cVar != null) {
            p pVar = this.f14927g;
            Object objInvoke = pVar.invoke();
            if (objInvoke == null || cVar.b(objInvoke)) {
                this.f14926f = cVar.a(this.f14923c, pVar);
                return;
            }
            if (objInvoke instanceof Y) {
                Y y10 = (Y) objInvoke;
                P p10 = P.f7727c;
                A0 a02 = y10.f7734b;
                if (a02 == p10 || a02 == P.f7730f || a02 == P.f7728d) {
                    strS = "MutableState containing " + y10.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strS = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strS = gc.b.s(objInvoke);
            }
            throw new IllegalArgumentException(strS);
        }
    }

    @Override // N.q0
    public final void c() throws Exception {
        a();
    }

    @Override // N.q0
    public final void j() {
        G9.e eVar = this.f14926f;
        if (eVar != null) {
            eVar.H();
        }
    }

    @Override // N.q0
    public final void k() {
        G9.e eVar = this.f14926f;
        if (eVar != null) {
            eVar.H();
        }
    }
}
