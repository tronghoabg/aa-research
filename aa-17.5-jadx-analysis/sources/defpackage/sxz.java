package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class sxz {
    public boolean a = false;
    public boolean b = false;

    public final void a(Context context) {
        if (this.b) {
            syc.a(context);
            syc.b();
        } else if (this.a) {
            syc.b();
        }
    }

    public final boolean b() {
        return this.a || this.b;
    }
}
