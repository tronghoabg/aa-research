package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class luo {
    public com.google.android.apps.auto.components.graphics.icon.GhIcon a;
    private android.content.ComponentName b;
    private java.lang.String c;
    private int d;
    private byte e;

    public final defpackage.lup a() {
        android.content.ComponentName componentName;
        java.lang.String str;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
        if (this.e == 1 && (componentName = this.b) != null && (str = this.c) != null && (ghIcon = this.a) != null) {
            return new defpackage.lup(componentName, str, ghIcon, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" componentName");
        }
        if (this.c == null) {
            sb.append(" appDisplayName");
        }
        if (this.a == null) {
            sb.append(" icon");
        }
        if (this.e == 0) {
            sb.append(" accentColor");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.e = (byte) 1;
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null appDisplayName");
        }
        this.c = str;
    }

    public final void d(android.content.ComponentName componentName) {
        if (componentName == null) {
            throw new java.lang.NullPointerException("Null componentName");
        }
        this.b = componentName;
    }
}
