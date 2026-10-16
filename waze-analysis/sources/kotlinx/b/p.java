package kotlinx.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.ar;
import h.g.b.x;
import h.l.s;
import java.util.Map;
import kotlinx.b.c.bp;

/* loaded from: classes7.dex */
public final class p {
    public static final b a(h.l.c cVar) {
        x.f(cVar, "<this>");
        b bVarD = q.d(cVar);
        if (bVarD != null) {
            return bVarD;
        }
        bp.d(cVar);
        throw new h.e();
    }

    public static final b b(h.l.c cVar) {
        return q.d(cVar);
    }

    public static final b c(s sVar) {
        x.f(sVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return q.e(kotlinx.b.e.i.a(), sVar);
    }

    public static final b d() {
        x.f(null, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return q.c(kotlinx.b.e.i.a(), null);
    }

    public static final b e(kotlinx.b.e.e eVar) {
        return q.c(eVar, null);
    }

    public static final a f(kotlinx.b.c.b bVar, kotlinx.b.b.c cVar, String str) {
        x.f(bVar, "<this>");
        x.f(cVar, "decoder");
        a aVarD = bVar.d(cVar, str);
        if (aVarD != null) {
            return aVarD;
        }
        h.m.k.z(str, bVar.b());
        throw new h.e();
    }

    public static final l g(kotlinx.b.c.b bVar, kotlinx.b.b.f fVar, Object obj) {
        x.f(bVar, "<this>");
        x.f(fVar, "encoder");
        x.f(obj, "value");
        l lVarE = bVar.e(fVar, obj);
        if (lVarE != null) {
            return lVarE;
        }
        Class<?> cls = obj.getClass();
        int i2 = ar.f48106a;
        h.g.b.m mVar = new h.g.b.m(cls);
        h.l.c cVarB = bVar.b();
        x.f(mVar, "subClass");
        x.f(cVarB, "baseClass");
        String strC = mVar.c();
        if (strC == null) {
            strC = mVar.toString();
        }
        h.m.k.z(strC, cVarB);
        throw new h.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0228, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022f, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0236, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023d, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d A[Catch: IllegalArgumentException -> 0x024e, TryCatch #0 {IllegalArgumentException -> 0x024e, blocks: (B:57:0x01a3, B:47:0x016e, B:51:0x017d, B:53:0x018b, B:62:0x01c6, B:65:0x01cc, B:83:0x01ef), top: B:181:0x01a3 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okhttp3.q h(long r39, okhttp3.ab r41, java.lang.String r42) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.p.h(long, okhttp3.ab, java.lang.String):okhttp3.q");
    }

    public static final /* synthetic */ okhttp3.m j(String str) {
        okhttp3.m mVar = new okhttp3.m(str);
        okhttp3.m.s.put(str, mVar);
        return mVar;
    }

    private static final int k(String str, int i2, int i3, boolean z) {
        boolean z2;
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= ' ') {
                z2 = cCharAt < 127 || (cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':'));
            } else {
                if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                    }
                }
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public final synchronized okhttp3.m i(String str) {
        okhttp3.m mVar;
        String strConcat;
        x.f(str, "javaName");
        mVar = (okhttp3.m) okhttp3.m.s.get(str);
        if (mVar == null) {
            Map map = okhttp3.m.s;
            if (h.n.o.ah(str, "TLS_")) {
                String strSubstring = str.substring(4);
                x.e(strSubstring, "substring(...)");
                strConcat = "SSL_".concat(String.valueOf(strSubstring));
            } else if (h.n.o.ah(str, "SSL_")) {
                String strSubstring2 = str.substring(4);
                x.e(strSubstring2, "substring(...)");
                strConcat = "TLS_".concat(String.valueOf(strSubstring2));
            } else {
                strConcat = str;
            }
            mVar = (okhttp3.m) map.get(strConcat);
            if (mVar == null) {
                mVar = new okhttp3.m(str);
            }
            okhttp3.m.s.put(str, mVar);
        }
        return mVar;
    }
}
