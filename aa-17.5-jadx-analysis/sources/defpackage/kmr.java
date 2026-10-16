package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kmr {
    public static final yph a = yph.c("GH.ExperimentToken");
    public final suq b;
    public final Executor c;
    public final AtomicReference d;
    public final AtomicReference e;

    public kmr(Executor executor, Context context) {
        suq suqVar = new suq(context);
        ExperimentTokens experimentTokens = ExperimentTokens.b;
        this.d = new AtomicReference(experimentTokens);
        this.e = new AtomicReference(experimentTokens);
        this.c = executor;
        this.b = suqVar;
    }
}
