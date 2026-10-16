package defpackage;

import android.support.v4.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class bp implements bo {
    final String a;
    final int b;
    final int c;
    final /* synthetic */ bt d;

    public bp(bt btVar, String str, int i, int i2) {
        this.d = btVar;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.bo
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        bt btVar = this.d;
        Fragment fragment = btVar.p;
        if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().ao()) {
            return btVar.ag(arrayList, arrayList2, this.a, this.b, this.c);
        }
        return false;
    }
}
