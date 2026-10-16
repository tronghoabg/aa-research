package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rsv {
    public final int a;

    public rsv(android.os.Bundle bundle) {
        this.a = bundle.getInt("force_field_behavior");
    }

    public static int a(android.view.View view) {
        defpackage.rsv rsvVarB = b(view);
        if (rsvVarB == null) {
            return 0;
        }
        return rsvVarB.a;
    }

    public static defpackage.rsv b(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof android.os.Bundle)) {
            return null;
        }
        android.os.Bundle bundle = (android.os.Bundle) tag;
        if (bundle.getBoolean("is_focus_cluster", false)) {
            return new defpackage.rsv(bundle);
        }
        return null;
    }

    public static void c(android.view.View view, defpackage.rsv rsvVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_focus_cluster", true);
        bundle.putInt("force_field_behavior", rsvVar.a);
        view.setTag(bundle);
    }

    public static boolean d(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof android.os.Bundle) {
            return ((android.os.Bundle) tag).getBoolean("is_focus_cluster", false);
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((defpackage.rsv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public rsv(int i) {
        this.a = i;
    }
}
