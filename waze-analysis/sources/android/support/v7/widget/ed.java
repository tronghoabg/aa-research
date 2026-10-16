package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ed {
    public ed() {
    }

    static void b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof gv) {
                editorInfo.hintText = ((gv) parent).a();
                return;
            }
        }
    }

    static int c(fb fbVar, dv dvVar, View view, View view2, en enVar, boolean z) {
        if (enVar.as() == 0 || fbVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(en.bu(view) - en.bu(view2)) + 1;
        }
        return Math.min(dvVar.k(), dvVar.a(view2) - dvVar.d(view));
    }

    static int d(fb fbVar, dv dvVar, View view, View view2, en enVar, boolean z, boolean z2) {
        if (enVar.as() == 0 || fbVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (fbVar.a() - Math.max(en.bu(view), en.bu(view2))) - 1) : Math.max(0, Math.min(en.bu(view), en.bu(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(dvVar.a(view2) - dvVar.d(view)) / (Math.abs(en.bu(view) - en.bu(view2)) + 1))) + (dvVar.j() - dvVar.d(view)));
        }
        return iMax;
    }

    static int e(fb fbVar, dv dvVar, View view, View view2, en enVar, boolean z) {
        if (enVar.as() == 0 || fbVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return fbVar.a();
        }
        return (int) (((dvVar.a(view2) - dvVar.d(view)) / (Math.abs(en.bu(view) - en.bu(view2)) + 1)) * fbVar.a());
    }

    public void onItemRangeChanged(int i2, int i3, Object obj) {
        onItemRangeChanged(i2, i3);
    }

    public ed(byte[] bArr) {
    }

    public void onItemRangeChanged(int i2, int i3) {
    }

    public void onChanged() {
    }

    public void onStateRestorationPolicyChanged() {
    }

    public void f(RecyclerView recyclerView, int i2) {
    }

    public void onItemRangeInserted(int i2, int i3) {
    }

    public void onItemRangeRemoved(int i2, int i3) {
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
    }

    public void onItemRangeMoved(int i2, int i3, int i4) {
    }
}
