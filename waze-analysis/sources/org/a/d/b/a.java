package org.a.d.b;

import com.google.android.gms.location.d;
import h.g.a.l;
import h.g.b.x;
import org.a.d.d.e;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f56372a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static org.a.d.a f56373b;

    private a() {
    }

    public static final org.a.d.a a() {
        org.a.d.a aVar = f56373b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final org.a.d.a b() {
        return f56373b;
    }

    public final d c(l lVar) {
        d dVar;
        x.f(lVar, "appDeclaration");
        synchronized (this) {
            byte[] bArr = null;
            dVar = new d(bArr, bArr);
            if (f56373b != null) {
                throw new e();
            }
            f56373b = dVar.d();
            lVar.invoke(dVar);
            dVar.e();
        }
        return dVar;
    }
}
