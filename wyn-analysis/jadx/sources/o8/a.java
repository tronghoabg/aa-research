package O8;

import A5.j;
import L8.r;
import R8.v;
import U8.C0881m0;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f8917c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final r f8918a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f8919b = new AtomicReference(null);

    public a(r rVar) {
        this.f8918a = rVar;
        rVar.a(new B8.b(this, 24));
    }

    public final c a(String str) {
        a aVar = (a) this.f8919b.get();
        return aVar == null ? f8917c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f8919b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f8919b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j8, C0881m0 c0881m0) {
        String strF = v.f("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strF, null);
        }
        this.f8918a.a(new j(str, j8, c0881m0));
    }
}
