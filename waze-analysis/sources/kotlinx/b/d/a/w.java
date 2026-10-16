package kotlinx.b.d.a;

import h.g.b.ar;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.b.c.ca;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class w extends b {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.b.d.v f51182a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.b.a.q f51183b;

    /* renamed from: c, reason: collision with root package name */
    private int f51184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlinx.b.d.b bVar, kotlinx.b.d.v vVar, String str, kotlinx.b.a.q qVar) {
        super(bVar, str, null);
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(vVar, "value");
        this.f51182a = vVar;
        this.f51183b = qVar;
    }

    @Override // kotlinx.b.d.a.b, kotlinx.b.c.ch, kotlinx.b.b.e
    public final kotlinx.b.b.c beginStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        kotlinx.b.a.q qVar2 = this.f51183b;
        if (qVar != qVar2) {
            return super.beginStructure(qVar);
        }
        kotlinx.b.d.b bVarH = h();
        w wVar = this;
        kotlinx.b.d.k kVarW = w();
        String strD = qVar2.d();
        if (kVarW instanceof kotlinx.b.d.v) {
            return new w(bVarH, (kotlinx.b.d.v) kVarW, t(), qVar2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        int i2 = ar.f48106a;
        sb.append(new h.g.b.m(kotlinx.b.d.v.class).c());
        sb.append(", but had ");
        sb.append(new h.g.b.m(kVarW.getClass()).c());
        sb.append(" as the serialized body of ");
        sb.append(strD);
        sb.append(" at element: ");
        sb.append(wVar.q());
        throw kotlinx.coroutines.d.d.f(-1, sb.toString(), kVarW.toString());
    }

    @Override // kotlinx.b.b.c
    public int decodeElementIndex(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        while (this.f51184c < qVar.b()) {
            int i2 = this.f51184c;
            this.f51184c = i2 + 1;
            String strP = p(qVar, i2);
            int i3 = this.f51184c - 1;
            if (x().containsKey(strP)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // kotlinx.b.d.a.b, kotlinx.b.c.ch, kotlinx.b.b.e
    public final boolean decodeNotNullMark() {
        return super.decodeNotNullMark();
    }

    @Override // kotlinx.b.d.a.b, kotlinx.b.c.ch, kotlinx.b.b.c
    public void endStructure(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "descriptor");
        if (q.d(qVar, h()) || (qVar.h() instanceof kotlinx.b.a.f)) {
            return;
        }
        q.e(qVar, h());
        Set setC = ca.c(qVar);
        Map map = (Map) kotlinx.b.d.aa.f(h()).i(qVar, q.f());
        Set setKeySet = map != null ? map.keySet() : null;
        if (setKeySet == null) {
            setKeySet = e.c.d.a.p();
        }
        Set setV = e.c.d.a.v(setC, setKeySet);
        for (String str : x().a()) {
            if (!setV.contains(str) && !h.g.b.x.n(str, t())) {
                throw kotlinx.coroutines.d.d.e(-1, "Encountered an unknown key '" + str + "' at element: " + q() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) kotlinx.coroutines.d.d.j(x().toString())));
            }
        }
    }

    @Override // kotlinx.b.c.ch
    protected String o(kotlinx.b.a.q qVar, int i2) {
        Object next;
        h.g.b.x.f(qVar, "descriptor");
        q.e(qVar, h());
        String strC = qVar.c(i2);
        if (!x().a().contains(strC)) {
            Map mapC = q.c(h(), qVar);
            Iterator it = x().a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) mapC.get((String) next);
                if (num != null && num.intValue() == i2) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strC;
    }

    @Override // kotlinx.b.d.a.b
    protected kotlinx.b.d.k v(String str) {
        h.g.b.x.f(str, "tag");
        return (kotlinx.b.d.k) h.a.r.h(x(), str);
    }

    @Override // kotlinx.b.d.a.b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public kotlinx.b.d.v x() {
        return this.f51182a;
    }

    public /* synthetic */ w(kotlinx.b.d.b bVar, kotlinx.b.d.v vVar, String str, int i2) {
        this(bVar, vVar, (i2 & 4) != 0 ? null : str, (kotlinx.b.a.q) null);
    }
}
