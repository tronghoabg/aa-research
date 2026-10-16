package aa;

import D6.C0388o;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0388o f17409c;

    public b(C0388o c0388o, int i5, long j8) {
        this.f17409c = c0388o;
        this.f17407a = i5;
        this.f17408b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0388o c0388o = this.f17409c;
        int i5 = this.f17407a;
        final long j8 = this.f17408b;
        synchronized (c0388o) {
            final int i10 = i5 - 1;
            final Task taskC = ((h) c0388o.f2464c).c(3 - i10);
            final Task taskB = ((c) c0388o.f2465d).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask((ScheduledExecutorService) c0388o.f2467f, new Continuation() { // from class: aa.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    JSONObject jSONObject;
                    C0388o c0388o2 = c0388o;
                    Task task2 = taskC;
                    Task task3 = taskB;
                    long j10 = j8;
                    int i11 = i10;
                    c0388o2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new Z9.e("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new Z9.e("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    g gVar = (g) task2.getResult();
                    e eVarA = (e) task3.getResult();
                    e eVar = gVar.f17433b;
                    if (eVar != null) {
                        boolValueOf = Boolean.valueOf(eVar.f17427f >= j10);
                    } else {
                        boolValueOf = Boolean.valueOf(gVar.f17432a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        c0388o2.c(i11, j10);
                        return Tasks.forResult(null);
                    }
                    if (gVar.f17433b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (eVarA == null) {
                        eVarA = e.c().a();
                    }
                    e eVar2 = gVar.f17433b;
                    e eVarA2 = e.a(new JSONObject(eVar2.f17422a.toString()));
                    HashMap mapB = eVarA.b();
                    HashMap mapB2 = eVar2.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = eVarA.f17423b;
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (true) {
                        boolean zHasNext = itKeys.hasNext();
                        jSONObject = eVarA2.f17423b;
                        if (!zHasNext) {
                            break;
                        }
                        String next = itKeys.next();
                        JSONObject jSONObject3 = eVar2.f17423b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            JSONObject jSONObject4 = eVarA.f17426e;
                            boolean zHas = jSONObject4.has(next);
                            JSONObject jSONObject5 = eVar2.f17426e;
                            if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        } else {
                            hashSet.add(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    Z9.a aVar = new Z9.a(hashSet);
                    synchronized (c0388o2) {
                        Iterator it = ((LinkedHashSet) c0388o2.f2462a).iterator();
                        while (it.hasNext()) {
                            ((Z9.b) it.next()).a(aVar);
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
