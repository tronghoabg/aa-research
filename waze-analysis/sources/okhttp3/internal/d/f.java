package okhttp3.internal.d;

import h.g.b.x;
import h.n.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import k.k;
import kotlinx.b.p;
import okhttp3.ab;
import okhttp3.aq;
import okhttp3.q;
import okhttp3.s;
import okhttp3.z;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final k f56061a;

    /* renamed from: b, reason: collision with root package name */
    private static final k f56062b;

    static {
        k kVar = k.f50843a;
        f56061a = okhttp3.internal.publicsuffix.a.d("\"\\");
        f56062b = okhttp3.internal.publicsuffix.a.d("\t ,=");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        r19 = r8;
        r8 = r10;
        r3.add(new okhttp3.k(r19, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[Catch: EOFException -> 0x0153, PHI: r8
  0x0044: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v2 java.lang.String) binds: [B:8:0x0037, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {EOFException -> 0x0153, blocks: (B:9:0x0039, B:12:0x0044, B:14:0x004e, B:16:0x0054, B:17:0x0062, B:20:0x006e, B:22:0x0074, B:23:0x0096, B:25:0x00a4, B:27:0x00ae, B:61:0x0142, B:30:0x00b6, B:32:0x00bc, B:34:0x00c2, B:37:0x00cd, B:39:0x00d3, B:40:0x00d8, B:54:0x0127, B:56:0x012f, B:58:0x0135, B:43:0x00e7, B:45:0x00ed, B:46:0x00f9, B:49:0x0109, B:50:0x0117, B:51:0x011e, B:52:0x011f), top: B:67:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(okhttp3.z r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.d.f.a(okhttp3.z, java.lang.String):java.util.List");
    }

    public static final void b(s sVar, ab abVar, z zVar) {
        List listH;
        x.f(sVar, "<this>");
        x.f(abVar, "url");
        x.f(zVar, "headers");
        if (sVar == s.f56339a) {
            return;
        }
        int i2 = q.f56327a;
        x.f(abVar, "url");
        x.f(zVar, "headers");
        List listE = zVar.e("Set-Cookie");
        int size = listE.size();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            String str = (String) listE.get(i3);
            x.f(abVar, "url");
            x.f(str, "setCookie");
            q qVarH = p.h(System.currentTimeMillis(), abVar, str);
            if (qVarH != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qVarH);
            }
        }
        if (arrayList != null) {
            listH = DesugarCollections.unmodifiableList(arrayList);
            x.c(listH);
        } else {
            listH = h.a.i.h();
        }
        if (listH.isEmpty()) {
            return;
        }
        sVar.b(abVar, listH);
    }

    public static final boolean c(aq aqVar) {
        x.f(aqVar, "<this>");
        if (x.n(aqVar.i().c(), "HEAD")) {
            return false;
        }
        int iA = aqVar.a();
        return (((iA >= 100 && iA < 200) || iA == 204 || iA == 304) && okhttp3.internal.b.i(aqVar) == -1 && !o.m("chunked", aq.p(aqVar, "Transfer-Encoding"), true)) ? false : true;
    }

    private static final String d(k.h hVar) {
        long jM = hVar.m(f56062b);
        if (jM == -1) {
            jM = hVar.q();
        }
        if (jM != 0) {
            return hVar.w(jM);
        }
        return null;
    }

    private static final boolean e(k.h hVar) {
        boolean z = false;
        while (!hVar.R()) {
            byte b2 = hVar.b(0L);
            if (b2 != 44) {
                if (b2 != 32 && b2 != 9) {
                    break;
                }
                hVar.c();
            } else {
                hVar.c();
                z = true;
            }
        }
        return z;
    }
}
