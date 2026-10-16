package A7;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdh;
import n7.C3597b;

/* renamed from: A7.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0272n {

    /* renamed from: d, reason: collision with root package name */
    public static volatile zzdh f960d;

    /* renamed from: a, reason: collision with root package name */
    public final C0 f961a;

    /* renamed from: b, reason: collision with root package name */
    public final RunnableC0278p f962b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f963c;

    public AbstractC0272n(C0 c02) {
        AbstractC1732v.i(c02);
        this.f961a = c02;
        this.f962b = new RunnableC0278p(0, this, c02);
    }

    public final void a() {
        this.f963c = 0L;
        d().removeCallbacks(this.f962b);
    }

    public final void b(long j8) {
        a();
        if (j8 >= 0) {
            ((C3597b) this.f961a.zzb()).getClass();
            this.f963c = System.currentTimeMillis();
            if (d().postDelayed(this.f962b, j8)) {
                return;
            }
            this.f961a.zzj().f605f.d("Failed to schedule delayed post. time", Long.valueOf(j8));
        }
    }

    public abstract void c();

    public final Handler d() {
        zzdh zzdhVar;
        if (f960d != null) {
            return f960d;
        }
        synchronized (AbstractC0272n.class) {
            try {
                if (f960d == null) {
                    f960d = new zzdh(this.f961a.zza().getMainLooper());
                }
                zzdhVar = f960d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzdhVar;
    }
}
