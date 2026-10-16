package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eo implements defpackage.oz {
    final /* synthetic */ android.content.ContextWrapper a;
    private final /* synthetic */ int b;

    public eo(android.content.ContextWrapper contextWrapper, int i) {
        this.b = i;
        this.a = contextWrapper;
    }

    @Override // defpackage.oz
    public final void a() {
        int i = this.b;
        if (i == 0) {
            android.content.ContextWrapper contextWrapper = this.a;
            defpackage.er erVarP = ((defpackage.ep) contextWrapper).p();
            erVarP.f();
            ((defpackage.od) contextWrapper).getSavedStateRegistry().a("androidx:appcompat");
            erVarP.r();
            return;
        }
        if (i == 1) {
            ((defpackage.bc) this.a).e.ah();
            return;
        }
        android.content.ContextWrapper contextWrapper2 = this.a;
        if (i != 2) {
            ((defpackage.qso) contextWrapper2).p.ah();
            return;
        }
        defpackage.od odVar = (defpackage.od) contextWrapper2;
        android.os.Bundle bundleA = odVar.getSavedStateRegistry().a("android:support:activity-result");
        if (bundleA != null) {
            defpackage.pf pfVar = odVar.j;
            java.util.ArrayList<java.lang.Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            java.util.ArrayList<java.lang.String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                pfVar.c.addAll(stringArrayList2);
            }
            android.os.Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                pfVar.f.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                java.lang.String str = stringArrayList.get(i2);
                java.util.Map map = pfVar.b;
                if (map.containsKey(str)) {
                    java.lang.Integer num = (java.lang.Integer) map.remove(str);
                    if (!pfVar.f.containsKey(str)) {
                        java.util.Map map2 = pfVar.a;
                        defpackage.afgz.i(map2);
                        map2.remove(num);
                    }
                }
                java.lang.Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int iIntValue = num2.intValue();
                java.lang.String str2 = stringArrayList.get(i2);
                str2.getClass();
                pfVar.c(iIntValue, str2);
            }
        }
    }

    public /* synthetic */ eo(defpackage.od odVar, int i) {
        this.b = i;
        this.a = odVar;
    }
}
