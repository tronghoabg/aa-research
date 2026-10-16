package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class pc {
    final /* synthetic */ ob g;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    private final Map h = new LinkedHashMap();
    public final List c = new ArrayList();
    public final transient Map d = new LinkedHashMap();
    public final Map e = new LinkedHashMap();
    public final Bundle f = new Bundle();

    public pc(ob obVar) {
        this.g = obVar;
    }

    private final void g(String str) {
        if (((Integer) this.b.get(str)) == null) {
            acf acfVar = new acf(1);
            Iterator itA = afrg.c(new airo(acfVar, new tbq(acfVar, 3))).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final oy a(String str, pf pfVar, ox oxVar) {
        g(str);
        this.d.put(str, new bii(oxVar, pfVar, (byte[]) null));
        Map map = this.e;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            oxVar.a(obj);
        }
        Bundle bundle = this.f;
        ActivityResult activityResult = (ActivityResult) dlz.g(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            oxVar.a(pfVar.a(activityResult.a, activityResult.b));
        }
        return new pb(this, str, pfVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    public final oy b(final String str, eqa eqaVar, final pf pfVar, final ox oxVar) {
        str.getClass();
        pfVar.getClass();
        oxVar.getClass();
        ept lifecycle = eqaVar.getLifecycle();
        if (lifecycle.a().a(eps.d)) {
            throw new IllegalStateException("LifecycleOwner " + eqaVar + " is attempting to register while current state is " + lifecycle.a() + ". LifecycleOwners must call register before they are STARTED.");
        }
        g(str);
        Map map = this.h;
        bii biiVar = (bii) map.get(str);
        if (biiVar == null) {
            biiVar = new bii(lifecycle);
        }
        epy epyVar = new epy() { // from class: oz
            @Override // defpackage.epy
            public final void a(eqa eqaVar2, epr eprVar) {
                pc pcVar = this.a;
                String str2 = str;
                if (epr.ON_START != eprVar) {
                    if (epr.ON_STOP == eprVar) {
                        pcVar.d.remove(str2);
                        return;
                    } else {
                        if (epr.ON_DESTROY == eprVar) {
                            pcVar.d(str2);
                            return;
                        }
                        return;
                    }
                }
                pf pfVar2 = pfVar;
                ox oxVar2 = oxVar;
                pcVar.d.put(str2, new bii(oxVar2, pfVar2, (byte[]) null));
                Map map2 = pcVar.e;
                if (map2.containsKey(str2)) {
                    Object obj = map2.get(str2);
                    map2.remove(str2);
                    oxVar2.a(obj);
                }
                Bundle bundle = pcVar.f;
                ActivityResult activityResult = (ActivityResult) dlz.g(bundle, str2, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str2);
                    oxVar2.a(pfVar2.a(activityResult.a, activityResult.b));
                }
            }
        };
        ((ept) biiVar.b).c(epyVar);
        biiVar.a.add(epyVar);
        map.put(str, biiVar);
        return new pa(this, str, pfVar);
    }

    public final void c(int i, String str) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void d(String str) {
        Integer num;
        if (!this.c.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        Map map = this.e;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) dlz.g(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        Map map2 = this.h;
        bii biiVar = (bii) map2.get(str);
        if (biiVar != null) {
            ?? r1 = biiVar.a;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((ept) biiVar.b).d((epy) it.next());
            }
            r1.clear();
            map2.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ox] */
    public final boolean e(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        bii biiVar = (bii) this.d.get(str);
        if ((biiVar != null ? biiVar.b : null) != null) {
            List list = this.c;
            if (list.contains(str)) {
                biiVar.b.a(((pf) biiVar.a).a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.e.remove(str);
        this.f.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public final void f(int i, pf pfVar, Object obj) {
        Bundle bundleExtra;
        ob obVar = this.g;
        sm smVarC = pfVar.c(obVar, obj);
        if (smVarC != null) {
            new Handler(Looper.getMainLooper()).post(new oa(this, i, smVarC, 0, null));
            return;
        }
        Intent intentB = pfVar.b(obj);
        if (intentB.getExtras() != null) {
            Bundle extras = intentB.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentB.setExtrasClassLoader(obVar.getClassLoader());
            }
        }
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (affa.f("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentB.getAction())) {
            String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            dsm.a(obVar, stringArrayExtra, i);
            return;
        }
        if (!affa.f("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentB.getAction())) {
            obVar.startActivityForResult(intentB, i, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            intentSenderRequest.getClass();
            obVar.startIntentSenderForResult(intentSenderRequest.a, i, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new oa(this, i, e, 2));
        }
    }

    public pc() {
    }
}
