package dg;

import R8.v;
import cg.C1618g;
import cg.C1621j;
import cg.y;
import ff.o;
import java.io.EOFException;
import java.util.ArrayList;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1621j f34290a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1621j f34291b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1621j f34292c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1621j f34293d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1621j f34294e;

    static {
        C1621j c1621j = C1621j.f19903d;
        f34290a = ab.b.c("/");
        f34291b = ab.b.c("\\");
        f34292c = ab.b.c("/\\");
        f34293d = ab.b.c(".");
        f34294e = ab.b.c("..");
    }

    public static final int a(y yVar) {
        if (yVar.f19938a.d() != 0) {
            C1621j c1621j = yVar.f19938a;
            if (c1621j.i(0) != 47) {
                if (c1621j.i(0) == 92) {
                    if (c1621j.d() > 2 && c1621j.i(1) == 92) {
                        C1621j other = f34291b;
                        AbstractC3340k.e(other, "other");
                        int iF = c1621j.f(other.f19904a, 2);
                        return iF == -1 ? c1621j.d() : iF;
                    }
                } else if (c1621j.d() > 2 && c1621j.i(1) == 58 && c1621j.i(2) == 92) {
                    char cI = (char) c1621j.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final y b(y yVar, y child, boolean z2) {
        AbstractC3340k.e(yVar, "<this>");
        AbstractC3340k.e(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        C1621j c1621jC = c(yVar);
        if (c1621jC == null && (c1621jC = c(child)) == null) {
            c1621jC = f(y.f19937b);
        }
        C1618g c1618g = new C1618g();
        c1618g.Q(yVar.f19938a);
        if (c1618g.f19902b > 0) {
            c1618g.Q(c1621jC);
        }
        c1618g.Q(child.f19938a);
        return d(c1618g, z2);
    }

    public static final C1621j c(y yVar) {
        C1621j c1621j = yVar.f19938a;
        C1621j c1621j2 = f34290a;
        if (C1621j.g(c1621j, c1621j2) != -1) {
            return c1621j2;
        }
        C1621j c1621j3 = f34291b;
        if (C1621j.g(yVar.f19938a, c1621j3) != -1) {
            return c1621j3;
        }
        return null;
    }

    public static final y d(C1618g c1618g, boolean z2) throws EOFException {
        long j8;
        C1621j c1621j;
        C1621j c1621j2;
        char cO;
        C1621j c1621j3;
        C1621j c1621jZ;
        C1618g c1618g2 = new C1618g();
        C1621j c1621jE = null;
        int i5 = 0;
        while (true) {
            j8 = 0;
            if (!c1618g.e(0L, f34290a)) {
                c1621j = f34291b;
                if (!c1618g.e(0L, c1621j)) {
                    break;
                }
            }
            byte b5 = c1618g.readByte();
            if (c1621jE == null) {
                c1621jE = e(b5);
            }
            i5++;
        }
        boolean z10 = i5 >= 2 && AbstractC3340k.a(c1621jE, c1621j);
        C1621j c1621j4 = f34292c;
        if (z10) {
            AbstractC3340k.b(c1621jE);
            c1618g2.Q(c1621jE);
            c1618g2.Q(c1621jE);
        } else if (i5 > 0) {
            AbstractC3340k.b(c1621jE);
            c1618g2.Q(c1621jE);
        } else {
            long jM = c1618g.m(c1621j4);
            if (c1621jE == null) {
                c1621jE = jM == -1 ? f(y.f19937b) : e(c1618g.o(jM));
            }
            if (AbstractC3340k.a(c1621jE, c1621j)) {
                c1621j2 = c1621jE;
                if (c1618g.f19902b >= 2 && c1618g.o(1L) == 58 && (('a' <= (cO = (char) c1618g.o(0L)) && cO < '{') || ('A' <= cO && cO < '['))) {
                    if (jM == 2) {
                        c1618g2.E(c1618g, 3L);
                    } else {
                        c1618g2.E(c1618g, 2L);
                    }
                }
            } else {
                c1621j2 = c1621jE;
            }
            c1621jE = c1621j2;
        }
        boolean z11 = c1618g2.f19902b > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zExhausted = c1618g.exhausted();
            c1621j3 = f34293d;
            if (zExhausted) {
                break;
            }
            long j10 = j8;
            long jM2 = c1618g.m(c1621j4);
            if (jM2 == -1) {
                c1621jZ = c1618g.z(c1618g.f19902b);
            } else {
                c1621jZ = c1618g.z(jM2);
                c1618g.readByte();
            }
            C1621j c1621j5 = f34294e;
            if (AbstractC3340k.a(c1621jZ, c1621j5)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z2 || (!z11 && (arrayList.isEmpty() || AbstractC3340k.a(o.y0(arrayList), c1621j5)))) {
                        arrayList.add(c1621jZ);
                    } else if ((!z10 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(AbstractC3935e.z(arrayList));
                    }
                }
            } else if (!AbstractC3340k.a(c1621jZ, c1621j3) && !AbstractC3340k.a(c1621jZ, C1621j.f19903d)) {
                arrayList.add(c1621jZ);
            }
            j8 = j10;
        }
        long j11 = j8;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c1618g2.Q(c1621jE);
            }
            c1618g2.Q((C1621j) arrayList.get(i10));
        }
        if (c1618g2.f19902b == j11) {
            c1618g2.Q(c1621j3);
        }
        return new y(c1618g2.z(c1618g2.f19902b));
    }

    public static final C1621j e(byte b5) {
        if (b5 == 47) {
            return f34290a;
        }
        if (b5 == 92) {
            return f34291b;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(b5, "not a directory separator: "));
    }

    public static final C1621j f(String str) {
        if (AbstractC3340k.a(str, "/")) {
            return f34290a;
        }
        if (AbstractC3340k.a(str, "\\")) {
            return f34291b;
        }
        throw new IllegalArgumentException(v.f("not a directory separator: ", str));
    }
}
