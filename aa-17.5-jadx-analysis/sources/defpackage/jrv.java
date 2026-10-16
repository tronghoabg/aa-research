package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class jrv {
    public static jqv a() {
        return (jqv) mki.a.i(jqv.class);
    }

    @ResultIgnorabilityUnspecified
    public static IllegalStateException b(yph yphVar, String str, Throwable th) {
        ((ype) ((ype) ((ype) yphVar.g()).p(th)).ai(2654)).y("%s", new zjd(zjc.a, str));
        return new IllegalStateException(str + ": " + th.getMessage(), th);
    }

    public static void c(Context context, yxo yxoVar) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        rxf.j(context, executorServiceNewSingleThreadExecutor, yxoVar);
        executorServiceNewSingleThreadExecutor.shutdown();
    }
}
