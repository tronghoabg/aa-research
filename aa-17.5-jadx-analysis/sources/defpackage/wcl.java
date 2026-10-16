package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
final class wcl {
    public final boolean a;
    public final boolean b;
    public final ygr d;
    private final xwx e;
    private volatile String f = null;
    public final boolean c = false;

    public wcl(xwx xwxVar, boolean z, boolean z2, ygr ygrVar) {
        this.e = xwxVar;
        this.a = z;
        this.b = z2;
        this.d = ygrVar;
    }

    final String a(Context context) {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.e.a(context);
        this.f = str2;
        return str2;
    }
}
