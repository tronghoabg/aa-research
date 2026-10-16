package android.support.v4.app;

import android.util.Log;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bf extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bv bvVar) {
        super(false);
        this.f172a = bvVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackCancelled() {
        if (bv.aM(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + this.f172a);
        }
        this.f172a.H();
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        if (bv.aM(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + this.f172a);
        }
        this.f172a.ah();
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackProgressed(BackEventCompat backEventCompat) {
        if (bv.aM(2)) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + this.f172a);
        }
        bv bvVar = this.f172a;
        a aVar = bvVar.f196b;
        if (aVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(aVar));
            Iterator it = bvVar.A(arrayList, 0, 1).iterator();
            while (it.hasNext()) {
                ((da) it.next()).p(backEventCompat);
            }
            ArrayList arrayList2 = bvVar.f198d;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((bq) arrayList2.get(i2)).onBackStackChangeProgressed(backEventCompat);
            }
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackStarted(BackEventCompat backEventCompat) {
        if (bv.aM(3)) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + this.f172a);
        }
        bv bvVar = this.f172a;
        bvVar.bq();
        bvVar.af(new bt(bvVar), false);
    }
}
