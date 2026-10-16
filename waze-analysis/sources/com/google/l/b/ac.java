package com.google.l.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.AccessibleObject;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac {
    public static String a(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static com.google.l.i b(com.google.l.d.b bVar) {
        boolean z;
        try {
            try {
                bVar.r();
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return com.google.l.b.a.j.c(bVar);
            } catch (EOFException e3) {
                e = e3;
                z = false;
                if (z) {
                    return com.google.l.k.f12459a;
                }
                throw new com.google.l.q(e);
            }
        } catch (com.google.l.d.d e4) {
            throw new com.google.l.q(e4);
        } catch (IOException e5) {
            throw new com.google.l.j(e5);
        } catch (NumberFormatException e6) {
            throw new com.google.l.q(e6);
        }
    }

    public static Writer c(Appendable appendable) {
        return new ab(appendable);
    }

    public static void d(com.google.l.i iVar, com.google.l.d.c cVar) {
        com.google.l.b.a.j.f12288a.d(cVar, iVar);
    }

    public static boolean e(AccessibleObject accessibleObject, Object obj) {
        return z.f12409b.a(accessibleObject, obj);
    }

    public static int f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = ((com.google.l.r) it.next()).a();
            if (iA != 2) {
                return iA;
            }
        }
        return 1;
    }

    public static BigDecimal g(String str) {
        i(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger h(String str) {
        i(str);
        return new BigInteger(str);
    }

    private static void i(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }
}
