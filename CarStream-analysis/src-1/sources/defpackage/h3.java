package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class h3 {
    public static final HashMap a = new HashMap();

    public static void a(String str, View view) {
        if (str == null || view == null) {
            return;
        }
        a.put(str, new WeakReference(view));
    }

    public static View b(String str) {
        HashMap map = a;
        WeakReference weakReference = (WeakReference) map.get(str);
        View view = weakReference == null ? null : (View) weakReference.get();
        if (view == null) {
            map.remove(str);
            return null;
        }
        if (view.isAttachedToWindow()) {
            return view;
        }
        return null;
    }
}
