package k.a;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import h.g.b.x;
import java.io.EOFException;
import java.util.ArrayList;
import k.ab;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f50748a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final k.k f50749b;

    /* renamed from: c, reason: collision with root package name */
    private static final k.k f50750c;

    /* renamed from: d, reason: collision with root package name */
    private static final k.k f50751d;

    /* renamed from: e, reason: collision with root package name */
    private static final k.k f50752e;

    /* renamed from: f, reason: collision with root package name */
    private static final k.k f50753f;

    static {
        k.k kVar = k.k.f50843a;
        f50749b = okhttp3.internal.publicsuffix.a.d(DomExceptionUtils.SEPARATOR);
        f50750c = okhttp3.internal.publicsuffix.a.d("\\");
        f50751d = okhttp3.internal.publicsuffix.a.d("/\\");
        f50752e = okhttp3.internal.publicsuffix.a.d(".");
        f50753f = okhttp3.internal.publicsuffix.a.d("..");
    }

    public static final /* synthetic */ int a(ab abVar) {
        int iU = k.k.u(abVar.f(), f50749b);
        return iU != -1 ? iU : k.k.u(abVar.f(), f50750c);
    }

    public static final /* synthetic */ int b(ab abVar) {
        if (abVar.f().d() == 0) {
            return -1;
        }
        if (abVar.f().a(0) == 47) {
            return 1;
        }
        if (abVar.f().a(0) == 92) {
            if (abVar.f().d() <= 2 || abVar.f().a(1) != 92) {
                return 1;
            }
            int iE = abVar.f().e(f50750c, 2);
            return iE != -1 ? iE : abVar.f().d();
        }
        if (abVar.f().d() > 2 && abVar.f().a(1) == 58 && abVar.f().a(2) == 92) {
            char cA = (char) abVar.f().a(0);
            if (cA < 'a' || cA >= '{') {
                return (cA < 'A' || cA >= '[') ? -1 : 3;
            }
            return 3;
        }
        return -1;
    }

    public static final ab i(ab abVar, ab abVar2, boolean z) {
        x.f(abVar, "<this>");
        x.f(abVar2, "child");
        if (abVar2.m() || abVar2.c() != null) {
            return abVar2;
        }
        k.k kVarL = l(abVar);
        if (kVarL == null && (kVarL = l(abVar2)) == null) {
            kVarL = n(ab.f50788a);
        }
        k.h hVar = new k.h();
        hVar.Z(abVar.f());
        if (hVar.q() > 0) {
            hVar.Z(kVarL);
        }
        hVar.Z(abVar2.f());
        return j(hVar, z);
    }

    public static final ab j(k.h hVar, boolean z) throws EOFException {
        k.k kVar;
        char cB;
        k.k kVarH;
        x.f(hVar, "<this>");
        k.h hVar2 = new k.h();
        k.k kVarM = null;
        int i2 = 0;
        while (true) {
            if (!hVar.W(f50749b)) {
                kVar = f50750c;
                if (!hVar.W(kVar)) {
                    break;
                }
            }
            byte bC = hVar.c();
            if (kVarM == null) {
                kVarM = m(bC);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && x.n(kVarM, kVar);
        if (z2) {
            x.c(kVarM);
            hVar2.Z(kVarM);
            hVar2.Z(kVarM);
        } else if (i2 > 0) {
            x.c(kVarM);
            hVar2.Z(kVarM);
        } else {
            long jM = hVar.m(f50751d);
            if (kVarM == null) {
                kVarM = jM == -1 ? n(ab.f50788a) : m(hVar.b(jM));
            }
            if (x.n(kVarM, kVar) && hVar.q() >= 2 && hVar.b(1L) == 58 && (((cB = (char) hVar.b(0L)) >= 'a' && cB < '{') || (cB >= 'A' && cB < '['))) {
                if (jM == 2) {
                    hVar2.l(hVar, 3L);
                } else {
                    hVar2.l(hVar, 2L);
                }
            }
        }
        boolean z3 = hVar2.q() > 0;
        ArrayList arrayList = new ArrayList();
        while (!hVar.R()) {
            long jM2 = hVar.m(f50751d);
            if (jM2 == -1) {
                kVarH = hVar.G();
            } else {
                kVarH = hVar.H(jM2);
                hVar.c();
            }
            k.k kVar2 = f50753f;
            if (x.n(kVarH, kVar2)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || x.n(h.a.i.T(arrayList), kVar2)))) {
                        arrayList.add(kVarH);
                    } else if (!z2 || arrayList.size() != 1) {
                        h.a.i.x(arrayList);
                    }
                }
            } else if (!x.n(kVarH, f50752e) && !x.n(kVarH, k.k.f50843a)) {
                arrayList.add(kVarH);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                hVar2.Z(kVarM);
            }
            hVar2.Z((k.k) arrayList.get(i3));
        }
        if (hVar2.q() == 0) {
            hVar2.Z(f50752e);
        }
        return new ab(hVar2.G());
    }

    public static final /* synthetic */ boolean k(ab abVar) {
        k.k kVarF = abVar.f();
        k.k kVar = f50753f;
        x.f(kVar, "suffix");
        return kVarF.v(kVarF.d() - kVar.d(), kVar, kVar.d()) && (abVar.f().d() == 2 || abVar.f().v(abVar.f().d() + (-3), f50749b, 1) || abVar.f().v(abVar.f().d() + (-3), f50750c, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k.k l(ab abVar) {
        k.k kVarF = abVar.f();
        k.k kVar = f50749b;
        if (kVarF.e(kVar, 0) != -1) {
            return kVar;
        }
        k.k kVarF2 = abVar.f();
        k.k kVar2 = f50750c;
        if (kVarF2.e(kVar2, 0) == -1) {
            return null;
        }
        return kVar2;
    }

    private static final k.k m(byte b2) {
        if (b2 == 47) {
            return f50749b;
        }
        if (b2 == 92) {
            return f50750c;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k.k n(String str) {
        if (x.n(str, DomExceptionUtils.SEPARATOR)) {
            return f50749b;
        }
        if (x.n(str, "\\")) {
            return f50750c;
        }
        throw new IllegalArgumentException("not a directory separator: ".concat(String.valueOf(str)));
    }
}
