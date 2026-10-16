package com.google.d.f.b;

import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static final ae f7732a = b(ae.f7736d);

    private static ae b(String[] strArr) {
        com.google.d.f.b.a.f fVar;
        try {
            fVar = com.google.d.f.b.a.g.f7701a;
        } catch (NoClassDefFoundError unused) {
            fVar = null;
        }
        if (fVar != null) {
            return fVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (ae) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
