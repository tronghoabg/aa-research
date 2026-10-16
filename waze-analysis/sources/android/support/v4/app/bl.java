package android.support.v4.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bl implements ActivityResultCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f180a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f181b;

    bl(bv bvVar, int i2) {
        this.f181b = i2;
        this.f180a = bvVar;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final /* synthetic */ void onActivityResult(Object obj) {
        int i2 = this.f181b;
        if (i2 == 0) {
            ActivityResult activityResult = (ActivityResult) obj;
            bv bvVar = this.f180a;
            bo boVar = (bo) bvVar.f201g.pollLast();
            if (boVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            ce ceVar = bvVar.f204j;
            String str = boVar.f182a;
            ar arVarG = ceVar.g(str);
            if (arVarG == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                arVarG.onActivityResult(boVar.f183b, activityResult.getResultCode(), activityResult.getData());
                return;
            }
        }
        if (i2 != 1) {
            ActivityResult activityResult2 = (ActivityResult) obj;
            bv bvVar2 = this.f180a;
            bo boVar2 = (bo) bvVar2.f201g.pollFirst();
            if (boVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            ce ceVar2 = bvVar2.f204j;
            String str2 = boVar2.f182a;
            ar arVarG2 = ceVar2.g(str2);
            if (arVarG2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                arVarG2.onActivityResult(boVar2.f183b, activityResult2.getResultCode(), activityResult2.getData());
                return;
            }
        }
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = true != ((Boolean) arrayList.get(i3)).booleanValue() ? -1 : 0;
        }
        bv bvVar3 = this.f180a;
        bo boVar3 = (bo) bvVar3.f201g.pollFirst();
        if (boVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        ce ceVar3 = bvVar3.f204j;
        String str3 = boVar3.f182a;
        ar arVarG3 = ceVar3.g(str3);
        if (arVarG3 == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            arVarG3.onRequestPermissionsResult(boVar3.f183b, strArr, iArr);
        }
    }
}
