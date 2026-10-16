package J3;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5591a = r.f("WorkerFactory");

    public final q a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f5591a;
        q qVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(q.class);
        } catch (Throwable th) {
            r.d().c(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                qVar = (q) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                r.d().c(str2, "Could not instantiate " + str, th2);
            }
        }
        if (qVar == null || !qVar.isUsed()) {
            return qVar;
        }
        throw new IllegalStateException(R8.v.g("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
