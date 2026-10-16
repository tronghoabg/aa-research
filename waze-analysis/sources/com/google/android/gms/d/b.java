package com.google.android.gms.d;

import com.google.android.libraries.phenotype.client.stable.am;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import com.google.v.eu;
import com.google.v.fi;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f5181a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5182b;

    private b() {
        this.f5182b = new CopyOnWriteArrayList();
    }

    public static b a() {
        if (f5181a == null) {
            synchronized (b.class) {
                if (f5181a == null) {
                    f5181a = new b();
                }
            }
        }
        return f5181a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void b(a aVar) {
        this.f5182b.add(0, aVar);
    }

    public final bm c(IOException iOException, com.google.android.libraries.e.b.a aVar) {
        return !(iOException.getCause() instanceof eu) ? bd.g(iOException) : bd.e(aVar.a(bd.h(this.f5182b)), IOException.class, new am(iOException, 11), cf.y());
    }

    public b(fi fiVar) {
        this.f5182b = fiVar;
    }
}
