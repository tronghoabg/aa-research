package com.google.b.d.b;

import android.os.Trace;
import android.util.Base64;
import com.google.d.b.an;
import com.google.d.d.ci;
import j$.lang.Iterable$EL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {
    ai() {
    }

    static void a(x xVar) {
        if (h(xVar) || xVar.a() == null) {
            Trace.beginSection(xVar.d());
            g(xVar);
        } else {
            a(xVar.a());
            g(xVar);
        }
    }

    static void b(x xVar) {
        if (h(xVar) || xVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            b(xVar.a());
        }
    }

    static void c(x xVar, x xVar2) {
        if (xVar != null) {
            if (xVar2 != null) {
                if (xVar.a() == xVar2 && !h(xVar)) {
                    Trace.endSection();
                    return;
                } else if (xVar == xVar2.a() && !h(xVar2)) {
                    g(xVar2);
                    return;
                }
            }
            b(xVar);
        }
        if (xVar2 != null) {
            a(xVar2);
        }
    }

    public static p d(String str, aj ajVar) {
        boolean z;
        x xVarB;
        r rVar = q.f7113a;
        an.B(ajVar);
        w wVarA = j.a();
        x xVar = wVarA.f7137b;
        if (xVar == o.f7107a) {
            xVar = null;
            j.c(wVarA, null);
            z = true;
        } else {
            z = false;
        }
        if (xVar == null) {
            UUID uuidC = k.b().c();
            String strBo = a.bo(uuidC);
            b bVar = l.f7101a;
            ci ciVarD = j.d();
            if (!ciVarD.isEmpty()) {
                Iterable$EL.forEach(ciVarD, new m(0));
            }
            xVarB = new n(uuidC, strBo, str, rVar, bVar, wVarA);
        } else {
            xVarB = xVar instanceof d ? ((d) xVar).b(str, rVar, false, wVarA) : xVar.k(str, rVar, wVarA);
        }
        j.c(wVarA, xVarB);
        return new p(xVarB, z);
    }

    public static String e(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static ai f() {
        return new ai(null);
    }

    private static void g(x xVar) {
        String strC = xVar.c();
        int i2 = j.f7093a;
        if (strC.length() > 127) {
            strC = strC.substring(0, 127);
        }
        Trace.beginSection(strC);
    }

    private static boolean h(x xVar) {
        return xVar.e() != Thread.currentThread();
    }

    private ai(byte[] bArr) {
    }
}
