package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class pg extends pf {
    @Override // defpackage.pf
    public final /* bridge */ /* synthetic */ Object a(int i, Intent intent) {
        if (i != -1) {
            return afbf.a;
        }
        if (intent == null) {
            return afbf.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return afbf.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return woy.bc(woy.ci(woy.da(stringArrayExtra), arrayList));
    }

    @Override // defpackage.pf
    public final /* bridge */ /* synthetic */ Intent b(Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.pf
    public final /* bridge */ /* synthetic */ sm c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new sm(afbf.a, (byte[]) null);
        }
        for (String str : strArr) {
            if (dup.c(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(strArr.length), 16));
        for (String str2 : strArr) {
            aezu aezuVar = new aezu(str2, true);
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        return new sm(linkedHashMap, (byte[]) null);
    }
}
