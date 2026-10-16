package hb;

import cg.AbstractC1613b;
import cg.C1618g;
import cg.C1621j;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f36346a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.x f36347b;

    public u(String[] strArr, cg.x xVar) {
        this.f36346a = strArr;
        this.f36347b = xVar;
    }

    public static u a(String... strArr) {
        try {
            C1621j[] c1621jArr = new C1621j[strArr.length];
            C1618g c1618g = new C1618g();
            for (int i5 = 0; i5 < strArr.length; i5++) {
                y.b0(c1618g, strArr[i5]);
                c1618g.readByte();
                c1621jArr[i5] = c1618g.z(c1618g.f19902b);
            }
            return new u((String[]) strArr.clone(), AbstractC1613b.h(c1621jArr));
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
