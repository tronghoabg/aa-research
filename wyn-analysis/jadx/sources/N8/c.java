package N8;

import R0.e;
import R8.s;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.g;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f8600a;

    public c(s sVar) {
        this.f8600a = sVar;
    }

    public static c a() {
        c cVar = (c) g.e().c(c.class);
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Boolean bool) {
        e eVar = this.f8600a.f10511b;
        synchronized (eVar) {
            eVar.f10051c = false;
            eVar.f10056h = bool;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) eVar.f10052d).edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            editorEdit.apply();
            synchronized (eVar.f10054f) {
                try {
                    if (eVar.f()) {
                        if (!eVar.f10050b) {
                            ((TaskCompletionSource) eVar.f10055g).trySetResult(null);
                            eVar.f10050b = true;
                        }
                    } else if (eVar.f10050b) {
                        eVar.f10055g = new TaskCompletionSource();
                        eVar.f10050b = false;
                    }
                } finally {
                }
            }
        }
    }
}
