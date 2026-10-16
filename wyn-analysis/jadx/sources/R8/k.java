package R8;

import D6.C0388o;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f10469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f10470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K3.r f10471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f10473f;

    public k(m mVar, long j8, Throwable th, Thread thread, K3.r rVar, boolean z2) {
        this.f10473f = mVar;
        this.f10468a = j8;
        this.f10469b = th;
        this.f10470c = thread;
        this.f10471d = rVar;
        this.f10472e = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        X8.c cVar;
        String str;
        long j8 = this.f10468a;
        long j10 = j8 / 1000;
        m mVar = this.f10473f;
        String strE = mVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f10479c.l();
        C0388o c0388o = mVar.f10488m;
        c0388o.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        c0388o.h(j10, this.f10470c, this.f10469b, strE, "crash", true);
        try {
            cVar = mVar.f10483g;
            str = ".ae" + j8;
            cVar.getClass();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e7);
        }
        if (!new File((File) cVar.f16186c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        K3.r rVar = this.f10471d;
        mVar.b(false, rVar, false);
        mVar.c(new e().f10455a, Boolean.valueOf(this.f10472e));
        return !mVar.f10478b.f() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) rVar.f6519i).get()).getTask().onSuccessTask(mVar.f10481e.f11034a, new S3.s(19, (Object) this, strE));
    }
}
