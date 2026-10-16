package defpackage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
final class bm implements ox {
    final /* synthetic */ bt a;
    private final /* synthetic */ int b;

    public bm(bt btVar, int i) {
        this.b = i;
        this.a = btVar;
    }

    @Override // defpackage.ox
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            bt btVar = this.a;
            ActivityResult activityResult = (ActivityResult) obj;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) btVar.u.pollLast();
            if (fragmentManager$LaunchedFragmentInfo == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            bz bzVar = btVar.b;
            String str = fragmentManager$LaunchedFragmentInfo.a;
            Fragment fragmentC = bzVar.c(str);
            if (fragmentC == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                fragmentC.onActivityResult(fragmentManager$LaunchedFragmentInfo.b, activityResult.a, activityResult.b);
                return;
            }
        }
        if (i != 1) {
            bt btVar2 = this.a;
            ActivityResult activityResult2 = (ActivityResult) obj;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) btVar2.u.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            bz bzVar2 = btVar2.b;
            String str2 = fragmentManager$LaunchedFragmentInfo2.a;
            Fragment fragmentC2 = bzVar2.c(str2);
            if (fragmentC2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                fragmentC2.onActivityResult(fragmentManager$LaunchedFragmentInfo2.b, activityResult2.a, activityResult2.b);
                return;
            }
        }
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        bt btVar3 = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) btVar3.u.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        bz bzVar3 = btVar3.b;
        String str3 = fragmentManager$LaunchedFragmentInfo3.a;
        Fragment fragmentC3 = bzVar3.c(str3);
        if (fragmentC3 == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            fragmentC3.onRequestPermissionsResult(fragmentManager$LaunchedFragmentInfo3.b, strArr, iArr);
        }
    }
}
