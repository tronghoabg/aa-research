package m9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* renamed from: m9.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3512k implements InterfaceC3517p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f40488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f40489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40490d;

    public /* synthetic */ C3512k(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, int i5, int i10) {
        this.f40487a = i10;
        this.f40488b = taskCompletionSource;
        this.f40489c = taskCompletionSource2;
        this.f40490d = i5;
    }

    @Override // m9.InterfaceC3517p
    public final void a(Object obj, G g9) {
        switch (this.f40487a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f40489c;
                C3516o c3516o = (C3516o) obj;
                TaskCompletionSource taskCompletionSource2 = this.f40488b;
                if (g9 != null) {
                    taskCompletionSource2.setException(g9);
                    return;
                }
                try {
                    ((L) Tasks.await(taskCompletionSource.getTask())).remove();
                    s9.k kVar = c3516o.f40504c;
                    boolean z2 = kVar != null;
                    boolean z10 = c3516o.f40505d.f40469b;
                    if (z2 || !z10) {
                        if ((kVar != null) && z10 && this.f40490d == 2) {
                            taskCompletionSource2.setException(new G("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", F.UNAVAILABLE));
                        } else {
                            taskCompletionSource2.setResult(c3516o);
                        }
                    } else {
                        taskCompletionSource2.setException(new G("Failed to get document because the client is offline.", F.UNAVAILABLE));
                    }
                    return;
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError.initCause(e7);
                    throw assertionError;
                } catch (ExecutionException e10) {
                    AssertionError assertionError2 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a single document"));
                    assertionError2.initCause(e10);
                    throw assertionError2;
                }
            default:
                TaskCompletionSource taskCompletionSource3 = this.f40489c;
                Y y10 = (Y) obj;
                TaskCompletionSource taskCompletionSource4 = this.f40488b;
                if (g9 != null) {
                    taskCompletionSource4.setException(g9);
                    return;
                }
                try {
                    ((L) Tasks.await(taskCompletionSource3.getTask())).remove();
                    if (y10.f40463f.f40469b && this.f40490d == 2) {
                        taskCompletionSource4.setException(new G("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", F.UNAVAILABLE));
                    } else {
                        taskCompletionSource4.setResult(y10);
                    }
                    return;
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    AssertionError assertionError3 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError3.initCause(e11);
                    throw assertionError3;
                } catch (ExecutionException e12) {
                    AssertionError assertionError4 = new AssertionError("INTERNAL ASSERTION FAILED: ".concat("Failed to register a listener for a query result"));
                    assertionError4.initCause(e12);
                    throw assertionError4;
                }
        }
    }
}
