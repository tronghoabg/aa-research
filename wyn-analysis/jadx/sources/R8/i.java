package R8;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final h f10461d = new h(0);

    /* renamed from: e, reason: collision with root package name */
    public static final A0.f f10462e = new A0.f(4);

    /* renamed from: a, reason: collision with root package name */
    public final X8.c f10463a;

    /* renamed from: b, reason: collision with root package name */
    public String f10464b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f10465c = null;

    public i(X8.c cVar) {
        this.f10463a = cVar;
    }

    public static void a(X8.c cVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.d(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e7);
        }
    }
}
