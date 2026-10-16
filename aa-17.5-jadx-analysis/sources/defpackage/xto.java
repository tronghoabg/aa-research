package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class xto {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        xuk xukVarB;
        WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause == null && b(th) == null && (xukVarB = xts.b()) != null) {
            ArrayList arrayList = new ArrayList();
            for (xukVarB = xts.b(); xukVarB != null; xukVarB = xukVarB.a()) {
                arrayList.add(xukVarB);
            }
            UUID uuidF = ((xuk) arrayList.get(0)).f();
            if (uuidF == null) {
                throw new NullPointerException("Null rootTraceId");
            }
            ((xuk) arrayList.get(0)).l();
            yfl yflVarJ = yfq.j(arrayList.size());
            yfl yflVarJ2 = yfq.j(arrayList.size());
            for (xuk xukVar : yrm.U(arrayList)) {
                yflVarJ2.i(xukVar.c());
                yflVarJ.i(xukVar.h());
            }
            WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                yfq yfqVarG = yflVarJ2.g();
                if (yfqVarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                yfq yfqVarG2 = yflVarJ.g();
                if (yfqVarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new xun(yfqVarG, yfqVarG2, uuidF));
            }
        }
    }

    public static oct b(Throwable th) {
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            Throwable cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cause == null) {
                return null;
            }
            xun xunVar = (xun) weakHashMap.get(cause);
            weakHashMap.put(th, xunVar);
            return new oct(xunVar);
        }
    }
}
