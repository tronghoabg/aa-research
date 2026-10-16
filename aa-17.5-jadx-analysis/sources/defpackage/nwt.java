package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public abstract class nwt {
    public final GhIcon b;
    public final String c;
    public final int d;

    static {
        int i = nws.a;
    }

    protected nwt(GhIcon ghIcon, String str, int i) {
        this.b = ghIcon;
        this.c = str;
        this.d = i;
    }

    static boolean c(GhIcon ghIcon, GhIcon ghIcon2) {
        if (ghIcon != ghIcon2) {
            return ghIcon != null && ghIcon.u(ghIcon2);
        }
        return true;
    }

    public abstract void a();

    public String b() {
        return this.c;
    }
}
