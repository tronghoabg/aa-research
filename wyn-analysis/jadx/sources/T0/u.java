package t0;

import U8.v0;
import d0.C2384c;
import ff.AbstractC2640A;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import r0.AbstractC3898c;
import r0.C3905j;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f45536a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45538c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45539d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45540e;

    /* renamed from: f, reason: collision with root package name */
    public t f45541f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f45542g;

    public u(t layoutNode) {
        AbstractC3340k.e(layoutNode, "layoutNode");
        this.f45536a = layoutNode;
        this.f45537b = true;
        this.f45542g = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.internal.i, tf.p] */
    public static final void b(u uVar, C3905j c3905j, int i5, y yVar) {
        float f10 = i5;
        long jF = v0.f(f10, f10);
        while (true) {
            jF = yVar.e0(jF);
            yVar = yVar.f45562f;
            AbstractC3340k.b(yVar);
            if (yVar.equals(uVar.f45536a.f45533x)) {
                break;
            } else if (((Map) yVar.I().f2261e).containsKey(c3905j)) {
                float fH = yVar.H(c3905j);
                jF = v0.f(fH, fH);
            }
        }
        int iH = c3905j instanceof C3905j ? AbstractC4345a.H(C2384c.c(jF)) : AbstractC4345a.H(C2384c.b(jF));
        HashMap map = uVar.f45542g;
        if (map.containsKey(c3905j)) {
            int iIntValue = ((Number) AbstractC2640A.P(c3905j, map)).intValue();
            C3905j c3905j2 = AbstractC3898c.f44291a;
            AbstractC3340k.e(c3905j, "<this>");
            iH = ((Number) c3905j.f44300a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iH))).intValue();
        }
        map.put(c3905j, Integer.valueOf(iH));
    }

    public final boolean a() {
        return this.f45538c || this.f45539d || this.f45540e;
    }

    public final void c() {
        u uVar;
        u uVar2;
        boolean zA = a();
        t tVar = this.f45536a;
        if (!zA) {
            t tVarJ = tVar.j();
            if (tVarJ == null) {
                return;
            }
            tVar = tVarJ.f45527r.f45541f;
            if (tVar == null || !tVar.f45527r.a()) {
                t tVar2 = this.f45541f;
                if (tVar2 == null || tVar2.f45527r.a()) {
                    return;
                }
                t tVarJ2 = tVar2.j();
                if (tVarJ2 != null && (uVar2 = tVarJ2.f45527r) != null) {
                    uVar2.c();
                }
                t tVarJ3 = tVar2.j();
                tVar = (tVarJ3 == null || (uVar = tVarJ3.f45527r) == null) ? null : uVar.f45541f;
            }
        }
        this.f45541f = tVar;
    }
}
