package defpackage;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class ewk implements fbd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fbd
    public final Bundle a() {
        aezu[] aezuVarArr;
        int i = this.b;
        Object obj = this.a;
        if (i == 0) {
            NavHostFragment navHostFragment = (NavHostFragment) obj;
            if (navHostFragment.a != 0) {
                Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                bundleZ.putInt("android-support-nav:fragment:graphId", navHostFragment.a);
                return bundleZ;
            }
            Bundle bundle = Bundle.EMPTY;
            bundle.getClass();
            return bundle;
        }
        ajdr ajdrVar = (ajdr) obj;
        for (Map.Entry entry : woy.bd(ajdrVar.d).entrySet()) {
            ajdrVar.f((String) entry.getKey(), ((ajab) entry.getValue()).b());
        }
        for (Map.Entry entry2 : woy.bd(ajdrVar.c).entrySet()) {
            ajdrVar.f((String) entry2.getKey(), ((fbd) entry2.getValue()).a());
        }
        ?? r5 = ajdrVar.a;
        if (r5.isEmpty()) {
            aezuVarArr = new aezu[0];
        } else {
            ArrayList arrayList = new ArrayList(r5.size());
            for (Map.Entry entry3 : r5.entrySet()) {
                arrayList.add(new aezu((String) entry3.getKey(), entry3.getValue()));
            }
            aezuVarArr = (aezu[]) arrayList.toArray(new aezu[0]);
        }
        return dsg.z((aezu[]) Arrays.copyOf(aezuVarArr, aezuVarArr.length));
    }
}
