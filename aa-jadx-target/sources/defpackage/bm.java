package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bm implements defpackage.pa {
    final /* synthetic */ defpackage.bt a;
    private final /* synthetic */ int b;

    public bm(defpackage.bt btVar, int i) {
        this.b = i;
        this.a = btVar;
    }

    @Override // defpackage.pa
    public final /* synthetic */ void a(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            defpackage.bt btVar = this.a;
            androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
            android.support.v4.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (android.support.v4.app.FragmentManager.LaunchedFragmentInfo) btVar.u.pollLast();
            if (launchedFragmentInfo == null) {
                toString();
                android.util.Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            defpackage.bz bzVar = btVar.b;
            java.lang.String str = launchedFragmentInfo.a;
            android.support.v4.app.Fragment fragmentC = bzVar.c(str);
            if (fragmentC == null) {
                android.util.Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(java.lang.String.valueOf(str)));
                return;
            } else {
                fragmentC.onActivityResult(launchedFragmentInfo.b, activityResult.a, activityResult.b);
                return;
            }
        }
        if (i != 1) {
            defpackage.bt btVar2 = this.a;
            androidx.activity.result.ActivityResult activityResult2 = (androidx.activity.result.ActivityResult) obj;
            android.support.v4.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfo2 = (android.support.v4.app.FragmentManager.LaunchedFragmentInfo) btVar2.u.pollFirst();
            if (launchedFragmentInfo2 == null) {
                toString();
                android.util.Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            defpackage.bz bzVar2 = btVar2.b;
            java.lang.String str2 = launchedFragmentInfo2.a;
            android.support.v4.app.Fragment fragmentC2 = bzVar2.c(str2);
            if (fragmentC2 == null) {
                android.util.Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(java.lang.String.valueOf(str2)));
                return;
            } else {
                fragmentC2.onActivityResult(launchedFragmentInfo2.b, activityResult2.a, activityResult2.b);
                return;
            }
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((java.lang.Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        defpackage.bt btVar3 = this.a;
        android.support.v4.app.FragmentManager.LaunchedFragmentInfo launchedFragmentInfo3 = (android.support.v4.app.FragmentManager.LaunchedFragmentInfo) btVar3.u.pollFirst();
        if (launchedFragmentInfo3 == null) {
            toString();
            android.util.Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        defpackage.bz bzVar3 = btVar3.b;
        java.lang.String str3 = launchedFragmentInfo3.a;
        android.support.v4.app.Fragment fragmentC3 = bzVar3.c(str3);
        if (fragmentC3 == null) {
            android.util.Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(java.lang.String.valueOf(str3)));
        } else {
            fragmentC3.onRequestPermissionsResult(launchedFragmentInfo3.b, strArr, iArr);
        }
    }
}
