package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class oi extends oh {
    @Override // defpackage.og, defpackage.oe, defpackage.ok
    public void a(os osVar, os osVar2, Window window, View view, boolean z, boolean z2) {
        ebh.d(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator itA = ebf.b(viewGroup).a();
            while (true) {
                if (!itA.hasNext()) {
                    break;
                }
                Object tag = ((View) itA.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof edv)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof edv ? (edv) obj : null) != null) {
                                int i = ((edv) obj).a;
                                if (i == 1) {
                                    throw null;
                                }
                                if (i == 2) {
                                    throw null;
                                }
                                if (i == 4) {
                                    throw null;
                                }
                                if (i == 8) {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        ebj eddVar = Build.VERSION.SDK_INT >= 35 ? new edd(window) : Build.VERSION.SDK_INT >= 30 ? new edc(window) : new edb(window, new kwp(view));
        ecw.c(!z, eddVar);
        ecw.b(!z2, eddVar);
    }
}
