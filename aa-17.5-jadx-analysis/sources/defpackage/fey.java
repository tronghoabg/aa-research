package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class fey implements few {
    public static Class a;
    public static Method b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    private static boolean f;
    private final View g;

    public fey(View view) {
        this.g = view;
    }

    public static void b() {
        if (f) {
            return;
        }
        try {
            a = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e2) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
        }
        f = true;
    }

    @Override // defpackage.few
    public final void setVisibility(int i) {
        this.g.setVisibility(i);
    }

    @Override // defpackage.few
    public final void a(ViewGroup viewGroup, View view) {
    }
}
