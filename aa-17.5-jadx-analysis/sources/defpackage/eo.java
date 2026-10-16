package defpackage;

import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class eo implements ow {
    final /* synthetic */ ContextWrapper a;
    private final /* synthetic */ int b;

    public eo(ContextWrapper contextWrapper, int i) {
        this.b = i;
        this.a = contextWrapper;
    }

    @Override // defpackage.ow
    public final void a() {
        int i = this.b;
        if (i == 0) {
            ContextWrapper contextWrapper = this.a;
            er erVarP = ((ep) contextWrapper).p();
            erVarP.f();
            ((ob) contextWrapper).getSavedStateRegistry().a("androidx:appcompat");
            erVarP.r();
            return;
        }
        if (i == 1) {
            ((bc) this.a).e.K();
            return;
        }
        ContextWrapper contextWrapper2 = this.a;
        if (i != 2) {
            ((qru) contextWrapper2).p.K();
            return;
        }
        ob obVar = (ob) contextWrapper2;
        Bundle bundleA = obVar.getSavedStateRegistry().a("android:support:activity-result");
        if (bundleA != null) {
            pc pcVar = obVar.j;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                pcVar.c.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                pcVar.f.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                Map map = pcVar.b;
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!pcVar.f.containsKey(str)) {
                        Map map2 = pcVar.a;
                        affz.i(map2);
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                pcVar.c(iIntValue, str2);
            }
        }
    }

    public /* synthetic */ eo(ob obVar, int i) {
        this.b = i;
        this.a = obVar;
    }
}
