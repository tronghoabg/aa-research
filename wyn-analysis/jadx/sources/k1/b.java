package K1;

import A7.CallableC0255h0;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class b extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f6331a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, CallableC0255h0 callableC0255h0) {
        super(callableC0255h0);
        this.f6331a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f6331a;
        try {
            Object obj = get();
            if (aVar.f6329d.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e7) {
            Log.w("AsyncTask", e7);
        } catch (CancellationException unused) {
            if (aVar.f6329d.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e10) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
