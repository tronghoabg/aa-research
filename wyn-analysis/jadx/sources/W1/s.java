package W1;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParsingReader;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15035b;

    public /* synthetic */ s(Object obj, int i5) {
        this.f15034a = i5;
        this.f15035b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15034a) {
            case 0:
                ((Handler) this.f15035b).post(runnable);
                break;
            default:
                ParsingReader.lambda$new$0((Metadata) this.f15035b, runnable);
                break;
        }
    }
}
