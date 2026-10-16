package kotlinx.b.d.a;

import e.a.d.ka;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final a f51120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51121b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f51122c;

    /* renamed from: d, reason: collision with root package name */
    private int f51123d;

    public ab(kotlinx.b.d.h hVar, a aVar) {
        h.g.b.x.f(hVar, "configuration");
        h.g.b.x.f(aVar, "lexer");
        this.f51120a = aVar;
        this.f51121b = false;
        this.f51122c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(kotlinx.b.d.a.ab r12, h.b r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.d.a.ab.a(kotlinx.b.d.a.ab, h.b, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.b.d.k f() {
        a aVar = this.f51120a;
        byte bL = aVar.l();
        if (aVar.b() == 4) {
            a.s(aVar, "Unexpected leading comma", 0, null, 6);
            throw new h.e();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.r()) {
            arrayList.add(c());
            bL = aVar.l();
            if (bL != 4) {
                int i2 = aVar.f51108a;
                if (bL != 9) {
                    a.s(aVar, "Expected end of the array or comma", i2, null, 4);
                    throw new h.e();
                }
            }
        }
        if (bL == 8) {
            aVar.a((byte) 9);
        } else if (bL == 4) {
            kotlinx.coroutines.d.d.l(aVar, "array");
            throw new h.e();
        }
        return new kotlinx.b.d.c(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.b.d.y g(boolean z) {
        a aVar = this.f51120a;
        String strE = !z ? aVar.e() : aVar.d();
        return (z || !h.g.b.x.n(strE, "null")) ? new kotlinx.b.d.q(strE, z) : kotlinx.b.d.t.f51222a;
    }

    public final kotlinx.b.d.k c() {
        kotlinx.b.d.v vVar;
        a aVar = this.f51120a;
        byte b2 = aVar.b();
        if (b2 == 1) {
            return g(true);
        }
        if (b2 == 0) {
            return g(false);
        }
        if (b2 != 6) {
            if (b2 == 8) {
                return f();
            }
            a.s(aVar, "Cannot read Json element because of unexpected ".concat(aj.N(b2)), 0, null, 6);
            throw new h.e();
        }
        int i2 = this.f51123d + 1;
        this.f51123d = i2;
        if (i2 == 200) {
            ka kaVar = new ka((h.g.a.q) new z(this, null));
            h.ab abVar = h.ab.f48028a;
            int i3 = h.a.f47921a;
            h.g.b.x.f(kaVar, "<this>");
            vVar = (kotlinx.b.d.k) new h.b(kaVar.b(), abVar).b();
        } else {
            byte bA = aVar.a((byte) 6);
            if (aVar.b() == 4) {
                a.s(aVar, "Unexpected leading comma", 0, null, 6);
                throw new h.e();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!aVar.r()) {
                    break;
                }
                String strD = aVar.d();
                aVar.a((byte) 5);
                linkedHashMap.put(strD, c());
                bA = aVar.l();
                if (bA != 4) {
                    if (bA != 7) {
                        a.s(aVar, "Expected end of the object or comma", 0, null, 6);
                        throw new h.e();
                    }
                }
            }
            if (bA == 6) {
                aVar.a((byte) 7);
            } else if (bA == 4) {
                kotlinx.coroutines.d.d.l(aVar, "object");
                throw new h.e();
            }
            vVar = new kotlinx.b.d.v(linkedHashMap);
        }
        this.f51123d--;
        return vVar;
    }
}
