package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nxj {
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon b;
    public final java.lang.String c;
    public final int d;

    static {
        int i = defpackage.nxi.a;
    }

    protected nxj(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, java.lang.String str, int i) {
        this.b = ghIcon;
        this.c = str;
        this.d = i;
    }

    static boolean c(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2) {
        if (ghIcon != ghIcon2) {
            return ghIcon != null && ghIcon.u(ghIcon2);
        }
        return true;
    }

    public abstract void a();

    public java.lang.String b() {
        return this.c;
    }
}
