package com.google.e.a;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f8775a = new CopyOnWriteArrayList();

    public static o a(String str) throws GeneralSecurityException {
        Iterator it = f8775a.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar.b(str)) {
                return oVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
