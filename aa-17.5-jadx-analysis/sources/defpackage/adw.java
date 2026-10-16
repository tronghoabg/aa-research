package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class adw implements bym {
    public afec a;
    public final aitx b;
    public adu c;
    public aec d;
    public aivh e;
    private final bwq f = new ParcelableSnapshotMutableState(null, bxp.c);

    public adw(Object obj, bii biiVar, aec aecVar, Object obj2, String str, afec afecVar, aitx aitxVar) {
        this.a = afecVar;
        this.b = aitxVar;
        this.c = new adu(obj, biiVar, obj2, str);
        this.d = b(aecVar, obj2);
    }

    public static final aec b(aec aecVar, Object obj) {
        if (obj != null && (aecVar instanceof aft)) {
            aft aftVar = (aft) aecVar;
            if (!affa.f(aftVar.c, obj)) {
                return new aft(aftVar.a, aftVar.b, obj);
            }
        }
        return aecVar;
    }

    @Override // defpackage.bym
    public final Object a() {
        Object objA;
        bym bymVar = (bym) this.f.a();
        return (bymVar == null || (objA = bymVar.a()) == null) ? this.c.d() : objA;
    }
}
