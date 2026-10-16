package defpackage;

import android.content.Context;
import android.database.ContentObserver;

/* loaded from: classes.dex */
final class vzz {
    public static vzz a;
    public final Context b;
    public final ContentObserver c;
    public boolean d;

    public vzz(Context context) {
        this.d = false;
        this.b = context;
        this.c = new vzy();
    }

    static synchronized void a() {
        Context context;
        vzz vzzVar = a;
        if (vzzVar != null && (context = vzzVar.b) != null && vzzVar.c != null && vzzVar.d) {
            context.getContentResolver().unregisterContentObserver(a.c);
        }
        a = null;
    }

    static /* synthetic */ String b(Object obj, war warVar, String str) {
        return str + warVar.d() + ": " + String.valueOf(obj);
    }

    public vzz() {
        this.d = false;
        this.b = null;
        this.c = null;
    }
}
