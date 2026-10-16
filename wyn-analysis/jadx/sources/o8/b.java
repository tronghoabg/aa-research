package O8;

import S8.f;
import T3.r;
import T8.m;
import ad.L;
import android.util.Log;
import da.d;
import da.e;
import ff.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final X8.c f8920a;

    public b(X8.c cVar) {
        this.f8920a = cVar;
    }

    public final void a(d dVar) {
        X8.c cVar = this.f8920a;
        HashSet hashSet = dVar.f34200a;
        ArrayList arrayList = new ArrayList(p.a0(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            da.c cVar2 = (da.c) ((e) it.next());
            String str = cVar2.f34195b;
            String str2 = cVar2.f34197d;
            String strSubstring = cVar2.f34198e;
            String str3 = cVar2.f34196c;
            long j8 = cVar2.f34199f;
            L l10 = m.f11811a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new T8.b(str, str2, strSubstring, str3, j8));
        }
        synchronized (((I9.a) cVar.f16189f)) {
            try {
                if (((I9.a) cVar.f16189f).c(arrayList)) {
                    ((f) cVar.f16186c).f11035b.b(new r(1, cVar, ((I9.a) cVar.f16189f).b()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
