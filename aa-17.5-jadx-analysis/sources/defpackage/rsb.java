package defpackage;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes2.dex */
public final class rsb {
    public final int a;

    public rsb(Bundle bundle) {
        this.a = bundle.getInt("force_field_behavior");
    }

    public static int a(View view) {
        rsb rsbVarB = b(view);
        if (rsbVarB == null) {
            return 0;
        }
        return rsbVarB.a;
    }

    public static rsb b(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof Bundle)) {
            return null;
        }
        Bundle bundle = (Bundle) tag;
        if (bundle.getBoolean("is_focus_cluster", false)) {
            return new rsb(bundle);
        }
        return null;
    }

    public static void c(View view, rsb rsbVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_focus_cluster", true);
        bundle.putInt("force_field_behavior", rsbVar.a);
        view.setTag(bundle);
    }

    public static boolean d(View view) {
        Object tag = view.getTag();
        if (tag instanceof Bundle) {
            return ((Bundle) tag).getBoolean("is_focus_cluster", false);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((rsb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public rsb(int i) {
        this.a = i;
    }
}
