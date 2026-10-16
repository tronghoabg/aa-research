package v8;

import com.google.android.gms.internal.measurement.zzdg;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
public final class c extends ThreadPoolExecutor {
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(zzdg.zza().zza(runnable));
    }
}
