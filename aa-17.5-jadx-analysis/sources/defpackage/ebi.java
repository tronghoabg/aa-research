package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class ebi {
    public ebi() {
    }

    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean f(View view) {
        return view.isScreenReaderFocusable();
    }

    static int g(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a.bp(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static eru h(aezr aezrVar) {
        return (eru) aezrVar.a();
    }

    public static aezr i(afhe afheVar, afdr afdrVar, afdr afdrVar2, afdr afdrVar3) {
        afheVar.getClass();
        return new ero(afheVar, afdrVar, afdrVar3, afdrVar2);
    }

    public static fbg j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            fbg fbgVar = tag instanceof fbg ? (fbg) tag : null;
            if (fbgVar != null) {
                return fbgVar;
            }
            Object objH = ebe.h(view);
            view = objH instanceof View ? (View) objH : null;
        }
        return null;
    }

    public static void k(View view, fbg fbgVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, fbgVar);
    }

    public static fbf l(fbg fbgVar) {
        return new fbf(new fbj(fbgVar, new deh(fbgVar, 10)));
    }

    public ebi(byte[] bArr) {
    }
}
