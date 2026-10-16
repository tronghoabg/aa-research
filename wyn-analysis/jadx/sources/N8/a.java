package N8;

import R8.r;
import S3.e;
import S3.l;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import y3.C4552j;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Q8.a, P8.a, O9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8596a;

    public /* synthetic */ a(b bVar) {
        this.f8596a = bVar;
    }

    @Override // Q8.a
    public void b(r rVar) {
        b bVar = this.f8596a;
        synchronized (bVar) {
            if (((Q8.a) bVar.f8599c) instanceof Q8.b) {
                ((ArrayList) bVar.f8597a).add(rVar);
            }
            ((Q8.a) bVar.f8599c).b(rVar);
        }
    }

    @Override // O9.a
    public void f(O9.b bVar) {
        b bVar2 = this.f8596a;
        bVar2.getClass();
        O8.c cVar = O8.c.f8921a;
        cVar.c("AnalyticsConnector now available.");
        w8.d dVar = (w8.d) bVar.get();
        l lVar = new l(dVar);
        e eVar = new e(12, false);
        w8.a aVarH = dVar.h("clx", eVar);
        if (aVarH == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            w8.a aVarH2 = dVar.h("crash", eVar);
            if (aVarH2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            aVarH = aVarH2;
        }
        if (aVarH == null) {
            cVar.g("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        cVar.c("Registered Firebase Analytics listener.");
        C4552j c4552j = new C4552j(20, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        G9.e eVar2 = new G9.e(lVar);
        synchronized (bVar2) {
            try {
                Iterator it = ((ArrayList) bVar2.f8597a).iterator();
                while (it.hasNext()) {
                    c4552j.b((r) it.next());
                }
                eVar.f10942c = c4552j;
                eVar.f10941b = eVar2;
                bVar2.f8599c = c4552j;
                bVar2.f8598b = eVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P8.a
    public void q(Bundle bundle) {
        ((P8.a) this.f8596a.f8598b).q(bundle);
    }
}
