package k1;

import android.view.View;

/* loaded from: classes.dex */
public abstract class L {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i5) {
        view.setImportantForAutofill(i5);
    }
}
