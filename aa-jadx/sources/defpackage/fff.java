package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fff implements defpackage.ffd {
    public static java.lang.Class a;
    public static java.lang.reflect.Method b;
    public static boolean c;
    public static java.lang.reflect.Method d;
    public static boolean e;
    private static boolean f;
    private final android.view.View g;

    public fff(android.view.View view) {
        this.g = view;
    }

    public static void b() {
        if (f) {
            return;
        }
        try {
            a = java.lang.Class.forName("android.view.GhostView");
        } catch (java.lang.ClassNotFoundException e2) {
            android.util.Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
        }
        f = true;
    }

    @Override // defpackage.ffd
    public final void setVisibility(int i) {
        this.g.setVisibility(i);
    }

    @Override // defpackage.ffd
    public final void a(android.view.ViewGroup viewGroup, android.view.View view) {
    }
}
