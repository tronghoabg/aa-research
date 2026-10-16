package A7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C1730t;
import com.google.android.gms.common.internal.C1735y;
import com.google.android.gms.tasks.Task;
import g7.C2713b;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class L {

    /* renamed from: d, reason: collision with root package name */
    public static L f544d;

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f545e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    public final C0273n0 f546a;

    /* renamed from: b, reason: collision with root package name */
    public final C2713b f547b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f548c = new AtomicLong(-1);

    public L(Context context, C0273n0 c0273n0) {
        this.f547b = new C2713b(context, null, C2713b.f35775a, new com.google.android.gms.common.internal.A("measurement:api"), com.google.android.gms.common.api.k.f26561c);
        this.f546a = c0273n0;
    }

    public final synchronized void a(int i5, int i10, long j8, long j10) {
        this.f546a.f985n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f548c.get() != -1 && jElapsedRealtime - this.f548c.get() <= f545e.toMillis()) {
            return;
        }
        Task taskC = this.f547b.c(new C1735y(0, Arrays.asList(new C1730t(36301, i5, 0, j8, j10, null, null, 0, i10))));
        A2.d dVar = new A2.d(2);
        dVar.f272c = this;
        dVar.f271b = jElapsedRealtime;
        taskC.addOnFailureListener(dVar);
    }
}
