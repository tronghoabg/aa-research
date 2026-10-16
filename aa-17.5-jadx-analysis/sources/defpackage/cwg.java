package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class cwg implements Comparator {
    public static final cwg a = new cwg(2);
    private final /* synthetic */ int b;

    public cwg(int i) {
        this.b = i;
    }

    private static final int a(nuo nuoVar) {
        int iOrdinal = nuoVar.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 2 : 0;
        }
        return 1;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            cxb cxbVar = (cxb) obj;
            cxb cxbVar2 = (cxb) obj2;
            int iB = affa.b(cxbVar.m, cxbVar2.m);
            return iB != 0 ? iB : affa.b(cxbVar.hashCode(), cxbVar2.hashCode());
        }
        if (i == 1) {
            ky kyVar = (ky) obj;
            ky kyVar2 = (ky) obj2;
            RecyclerView recyclerView = kyVar.d;
            if ((recyclerView == null) != (kyVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = kyVar.a;
            if (z != kyVar2.a) {
                return z ? -1 : 1;
            }
            int i2 = kyVar2.b - kyVar.b;
            if (i2 == 0 && (i2 = kyVar.c - kyVar2.c) == 0) {
                return 0;
            }
            return i2;
        }
        if (i == 2) {
            cxb cxbVar3 = (cxb) obj;
            cxb cxbVar4 = (cxb) obj2;
            int iB2 = affa.b(cxbVar4.m, cxbVar3.m);
            return iB2 != 0 ? iB2 : affa.b(cxbVar3.hashCode(), cxbVar4.hashCode());
        }
        if (i == 3) {
            int[] iArr = ebm.a;
            float z2 = ((View) obj).getZ();
            float z3 = ((View) obj2).getZ();
            if (z2 > z3) {
                return -1;
            }
            return z2 < z3 ? 1 : 0;
        }
        nur nurVar = ((nuh) obj).c;
        nuo nuoVar = nurVar.x;
        nur nurVar2 = ((nuh) obj2).c;
        nuo nuoVar2 = nurVar2.x;
        int iA = a(nuoVar);
        int iA2 = a(nuoVar2);
        if (iA == iA2) {
            long j = nurVar.i;
            long j2 = nurVar2.i;
            if (j == j2) {
                return 0;
            }
            if (j >= j2) {
                return 1;
            }
        } else if (iA >= iA2) {
            return 1;
        }
        return -1;
    }
}
