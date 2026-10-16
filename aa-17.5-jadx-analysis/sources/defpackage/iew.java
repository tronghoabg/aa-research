package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
final class iew implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public iew(gjt gjtVar, int i) {
        this.b = i;
        this.a = new WeakReference(gjtVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b != 0) {
            if (Log.isLoggable("CustomViewTarget", 2)) {
                Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
            }
            gjt gjtVar = (gjt) this.a.get();
            if (gjtVar != null) {
                ?? r0 = gjtVar.b;
                if (!r0.isEmpty()) {
                    int iL = gjtVar.L();
                    int iK = gjtVar.K();
                    if (gjt.N(iL, iK)) {
                        ArrayList arrayList = new ArrayList((Collection) r0);
                        int size = arrayList.size();
                        while (i < size) {
                            ((ieu) arrayList.get(i)).e(iL, iK);
                            i++;
                        }
                        gjtVar.M();
                    }
                }
            }
            return true;
        }
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        iex iexVar = (iex) this.a.get();
        if (iexVar != null) {
            List list = iexVar.c;
            if (!list.isEmpty()) {
                int iB = iexVar.b();
                int iA = iexVar.a();
                if (iex.d(iB, iA)) {
                    ArrayList arrayList2 = new ArrayList(list);
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        ((ieu) arrayList2.get(i)).e(iB, iA);
                        i++;
                    }
                    iexVar.c();
                }
            }
        }
        return true;
    }

    public iew(iex iexVar, int i) {
        this.b = i;
        this.a = new WeakReference(iexVar);
    }
}
