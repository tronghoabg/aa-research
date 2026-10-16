package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AppBarScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.AppBarScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void clickableItem$default(AppBarScope appBarScope, a aVar, p pVar, String str, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickableItem");
            }
            appBarScope.clickableItem(aVar, pVar, str, z | (!((i2 & 8) == 0)));
        }

        public static /* synthetic */ void toggleableItem$default(AppBarScope appBarScope, boolean z, l lVar, p pVar, String str, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleableItem");
            }
            appBarScope.toggleableItem(z, lVar, pVar, str, z2 | (!((i2 & 16) == 0)));
        }
    }

    void clickableItem(a<ab> aVar, p<? super Composer, ? super Integer, ab> pVar, String str, boolean z);

    void customItem(p<? super Composer, ? super Integer, ab> pVar, q<? super AppBarMenuState, ? super Composer, ? super Integer, ab> qVar);

    void toggleableItem(boolean z, l<? super Boolean, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, String str, boolean z2);
}
