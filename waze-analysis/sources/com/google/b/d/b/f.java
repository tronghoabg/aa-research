package com.google.b.d.b;

import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.fo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final WeakHashMap f7091a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f7092b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        ai aiVar;
        x xVarA;
        WeakHashMap weakHashMap = f7092b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        an.v(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap2 = f7091a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } finally {
                }
            }
            if (cause2 == null) {
                aiVar = null;
            } else {
                weakHashMap2.put(th, (ab) weakHashMap2.get(cause2));
                aiVar = new ai();
            }
        }
        if (aiVar != null || (xVarA = j.a().f7137b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xVarA = j.a().f7137b; xVarA != null; xVarA = xVarA.a()) {
            arrayList.add(xVarA);
        }
        aa aaVar = new aa();
        aaVar.d(((x) arrayList.get(0)).f());
        ((x) arrayList.get(0)).l();
        aaVar.c();
        bi biVarC = bn.c(arrayList.size());
        bi biVarC2 = bn.c(arrayList.size());
        for (x xVar : fo.F(arrayList)) {
            biVarC2.g(xVar.c());
            biVarC.g(xVar.h());
        }
        WeakHashMap weakHashMap3 = f7091a;
        synchronized (weakHashMap3) {
            aaVar.e(biVarC2.f());
            aaVar.b(biVarC.f());
            weakHashMap3.put(th, aaVar.a());
        }
    }
}
