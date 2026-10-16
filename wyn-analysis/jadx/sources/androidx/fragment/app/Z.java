package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import ff.AbstractC2641B;
import g.C2653a;
import h.AbstractC2762a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class Z extends AbstractC2762a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18349a;

    public /* synthetic */ Z(int i5) {
        this.f18349a = i5;
    }

    @Override // h.AbstractC2762a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f18349a) {
            case 0:
                g.j jVar = (g.j) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jVar.f35476b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = jVar.f35475a;
                        AbstractC3340k.e(intentSender, "intentSender");
                        jVar = new g.j(intentSender, null, jVar.f35477c, jVar.f35478d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
                if (e0.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] input = (String[]) obj;
                AbstractC3340k.e(input, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                AbstractC3340k.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                Intent input2 = (Intent) obj;
                AbstractC3340k.e(input2, "input");
                return input2;
            default:
                g.j input3 = (g.j) obj;
                AbstractC3340k.e(input3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input3);
                AbstractC3340k.d(intentPutExtra2, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra2;
        }
    }

    @Override // h.AbstractC2762a
    public R.e b(Context context, Object obj) {
        switch (this.f18349a) {
            case 1:
                String[] input = (String[]) obj;
                AbstractC3340k.e(input, "input");
                if (input.length == 0) {
                    return new R.e(ff.w.f35433a);
                }
                for (String str : input) {
                    if (Y0.e.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int iD = AbstractC2641B.D(input.length);
                if (iD < 16) {
                    iD = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new R.e(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // h.AbstractC2762a
    public final Object c(Intent intent, int i5) {
        switch (this.f18349a) {
            case 1:
                ff.w wVar = ff.w.f35433a;
                if (i5 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i10 == 0));
                        }
                        break;
                    }
                }
                break;
        }
        return new C2653a(intent, i5);
    }
}
