package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbe implements defpackage.rbn {
    public static android.view.ViewGroup b(android.view.ViewGroup viewGroup, android.view.View view) {
        if (view == null || view == viewGroup) {
            return viewGroup;
        }
        android.view.ViewGroup viewGroup2 = view.getParent() instanceof android.view.ViewGroup ? (android.view.ViewGroup) view.getParent() : null;
        if (viewGroup2 == null) {
            return viewGroup;
        }
        return c(viewGroup2) ? viewGroup2 : b(viewGroup, viewGroup2);
    }

    public static boolean c(android.view.ViewGroup viewGroup) {
        return rsv.d(viewGroup) && rsv.a(viewGroup) == 1;
    }

    @Override // defpackage.rbn
    public final android.view.View a(android.view.ViewGroup viewGroup, android.view.View view, int i, boolean z) {
        throw null;
    }
}
