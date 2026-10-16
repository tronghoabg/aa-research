package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class o implements f {

    /* renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.a f37598a;

    /* renamed from: b, reason: collision with root package name */
    private final A f37599b;

    /* renamed from: c, reason: collision with root package name */
    private final b f37600c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f37601d;

    o(j$.time.temporal.a aVar, A a5, b bVar) {
        this.f37598a = aVar;
        this.f37599b = a5;
        this.f37600c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb2) {
        String strA;
        Long lE = tVar.e(this.f37598a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) tVar.d().B(j$.time.temporal.l.e());
        if (mVar == null || mVar == j$.time.chrono.t.f37543d) {
            long jLongValue = lE.longValue();
            A a5 = this.f37599b;
            tVar.c();
            strA = this.f37600c.f37570a.a(jLongValue, a5);
        } else {
            long jLongValue2 = lE.longValue();
            A a10 = this.f37599b;
            tVar.c();
            strA = this.f37600c.f37570a.a(jLongValue2, a10);
        }
        if (strA != null) {
            sb2.append(strA);
            return true;
        }
        if (this.f37601d == null) {
            this.f37601d = new i(this.f37598a, 1, 19, z.NORMAL);
        }
        return this.f37601d.o(tVar, sb2);
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        Iterator itB;
        int length = charSequence.length();
        if (i5 < 0 || i5 > length) {
            throw new IndexOutOfBoundsException();
        }
        A a5 = qVar.k() ? this.f37599b : null;
        j$.time.chrono.m mVarG = qVar.g();
        b bVar = this.f37600c;
        j$.time.temporal.a aVar = this.f37598a;
        if (mVarG == null || mVarG == j$.time.chrono.t.f37543d) {
            qVar.h();
            itB = bVar.f37570a.b(a5);
        } else {
            qVar.h();
            itB = bVar.f37570a.b(a5);
        }
        Iterator it = itB;
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (qVar.r(str, 0, charSequence, i5, str.length())) {
                    return qVar.n(this.f37598a, ((Long) entry.getValue()).longValue(), i5, str.length() + i5);
                }
            }
            if (aVar == j$.time.temporal.a.ERA && !qVar.k()) {
                Iterator it2 = mVarG.N().iterator();
                while (it2.hasNext()) {
                    String string = ((j$.time.chrono.n) it2.next()).toString();
                    if (qVar.r(string, 0, charSequence, i5, string.length())) {
                        return qVar.n(this.f37598a, r7.getValue(), i5, string.length() + i5);
                    }
                }
            }
            if (qVar.k()) {
                return ~i5;
            }
        }
        if (this.f37601d == null) {
            this.f37601d = new i(this.f37598a, 1, 19, z.NORMAL);
        }
        return this.f37601d.q(qVar, charSequence, i5);
    }

    public final String toString() {
        A a5 = A.FULL;
        j$.time.temporal.a aVar = this.f37598a;
        A a10 = this.f37599b;
        if (a10 == a5) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + a10 + ")";
    }
}
