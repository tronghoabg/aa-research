package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class q implements e {
    public final j$.time.temporal.n a;
    public final TextStyle b;
    public final a0 c;
    public volatile i d;

    public q(j$.time.temporal.n nVar, TextStyle textStyle, a0 a0Var) {
        this.a = nVar;
        this.b = textStyle;
        this.c = a0Var;
    }

    @Override // j$.time.format.e
    public final boolean h(x xVar, StringBuilder sb) {
        Long lA = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.a aVar = (j$.time.chrono.a) xVar.a.w(j$.time.temporal.o.b);
        String strC = (aVar == null || aVar == j$.time.chrono.s.c) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(aVar, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, e0.NORMAL);
        }
        return this.d.h(xVar, sb);
    }

    @Override // j$.time.format.e
    public final int k(v vVar, CharSequence charSequence, int i) {
        a0 a0Var = this.c;
        j$.time.temporal.n nVar = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        TextStyle textStyle = z ? this.b : null;
        j$.time.chrono.a aVar = vVar.c().c;
        if (aVar == null && (aVar = vVar.a.d) == null) {
            aVar = j$.time.chrono.s.c;
        }
        j$.time.chrono.a aVar2 = aVar;
        Iterator itE = (aVar2 == null || aVar2 == j$.time.chrono.s.c) ? a0Var.e(nVar, textStyle, dateTimeFormatter.b) : a0Var.d(aVar2, nVar, textStyle, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (vVar.g(str, 0, charSequence, i, str.length())) {
                    return vVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (nVar == j$.time.temporal.a.ERA && !vVar.c) {
                Iterator it = aVar2.eras().iterator();
                while (it.hasNext()) {
                    String string = ((j$.time.chrono.m) it.next()).toString();
                    if (vVar.g(string, 0, charSequence, i, string.length())) {
                        return vVar.f(this.a, r8.getValue(), i, string.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, e0.NORMAL);
        }
        return this.d.k(vVar, charSequence, i);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        j$.time.temporal.n nVar = this.a;
        if (textStyle2 == textStyle) {
            return "Text(" + String.valueOf(nVar) + ")";
        }
        return "Text(" + String.valueOf(nVar) + "," + String.valueOf(textStyle2) + ")";
    }
}
