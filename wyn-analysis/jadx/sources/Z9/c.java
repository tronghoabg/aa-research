package Z9;

import Va.Za;
import android.util.Log;
import ba.C1521a;
import ba.RunnableC1522b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import t8.C4147a;
import t8.C4149c;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements SuccessContinuation, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f17048a;

    public /* synthetic */ c(d dVar) {
        this.f17048a = dVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        d dVar = this.f17048a;
        Task taskB = dVar.f17053d.b();
        Task taskB2 = dVar.f17054e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(dVar.f17052c, new A5.g(dVar, taskB, taskB2, 8));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws JSONException {
        boolean z2;
        d dVar = this.f17048a;
        dVar.getClass();
        if (task.isSuccessful()) {
            aa.c cVar = dVar.f17053d;
            synchronized (cVar) {
                cVar.f17414c = Tasks.forResult(null);
            }
            cVar.f17413b.a();
            aa.e eVar = (aa.e) task.getResult();
            if (eVar != null) {
                JSONArray jSONArray = eVar.f17425d;
                C4149c c4149c = dVar.f17051b;
                if (c4149c != null) {
                    try {
                        c4149c.c(d.e(jSONArray));
                    } catch (JSONException e7) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e7);
                    } catch (C4147a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    }
                }
                Za za2 = dVar.f17060l;
                try {
                    da.d dVarU = ((C1521a) za2.f13916b).u(eVar);
                    Iterator it = ((Set) za2.f13918d).iterator();
                    while (it.hasNext()) {
                        ((Executor) za2.f13917c).execute(new RunnableC1522b((O8.b) it.next(), dVarU, 0));
                    }
                } catch (f e11) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
