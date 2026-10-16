package C6;

import A7.CallableC0305y0;
import A7.Y0;
import D6.C0392q;
import D6.C0395s;
import G6.L;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfxq;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzhcf;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f implements Runnable, zzbar {

    /* renamed from: p, reason: collision with root package name */
    public static final long f1816p = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1820d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1821e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1822f;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f1823g;

    /* renamed from: h, reason: collision with root package name */
    public final zzfxq f1824h;

    /* renamed from: i, reason: collision with root package name */
    public Context f1825i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f1826j;
    public H6.a k;

    /* renamed from: l, reason: collision with root package name */
    public final H6.a f1827l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1828m;

    /* renamed from: o, reason: collision with root package name */
    public int f1830o;

    /* renamed from: a, reason: collision with root package name */
    public final Vector f1817a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1818b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f1819c = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public final CountDownLatch f1829n = new CountDownLatch(1);

    public f(Context context, H6.a aVar) {
        this.f1825i = context;
        this.f1826j = context;
        this.k = aVar;
        this.f1827l = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f1823g = executorServiceNewCachedThreadPool;
        zzbio zzbioVar = zzbix.zzds;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        this.f1828m = zBooleanValue;
        this.f1824h = zzfxq.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        zzbio zzbioVar2 = zzbix.zzdp;
        zzbiv zzbivVar = c0395s.f2492c;
        this.f1821e = ((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue();
        this.f1822f = ((Boolean) zzbivVar.zzd(zzbix.zzdt)).booleanValue();
        if (((Boolean) zzbivVar.zzd(zzbix.zzdr)).booleanValue()) {
            this.f1830o = 2;
        } else {
            this.f1830o = 1;
        }
        if (!((Boolean) zzbivVar.zzd(zzbix.zzex)).booleanValue()) {
            this.f1820d = c();
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzet)).booleanValue()) {
            zzcfy.zza.execute(this);
            return;
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzcfy.zza.execute(this);
        } else {
            run();
        }
    }

    public final boolean a() throws InterruptedException {
        try {
            this.f1829n.await();
            return true;
        } catch (InterruptedException e7) {
            int i5 = L.f4523b;
            H6.l.g("Interrupted during GADSignals creation.", e7);
            return false;
        }
    }

    public final String b(Context context) {
        zzbar zzbarVarF;
        if (!a() || (zzbarVarF = f()) == null) {
            return "";
        }
        d();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return zzbarVarF.zzl(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean c() {
        Context context = this.f1825i;
        S3.l lVar = new S3.l(this);
        return new zzfzh(this.f1825i, zzfyn.zzb(context, this.f1824h), lVar, ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdq)).booleanValue()).zzd(1);
    }

    public final void d() {
        Vector vector = this.f1817a;
        zzbar zzbarVarF = f();
        if (vector.isEmpty() || zzbarVarF == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzbarVarF.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzbarVarF.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void e(boolean z2) {
        String str = this.k.f4927a;
        Context context = this.f1825i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzawu zzawuVarZze = zzawv.zze();
        zzawuVarZze.zzb(z2);
        zzawuVarZze.zza(str);
        this.f1818b.set(zzbav.zzt(context, (zzawv) zzawuVarZze.zzbu()));
    }

    public final zzbar f() {
        return ((!this.f1821e || this.f1820d) ? this.f1830o : 1) == 2 ? (zzbar) this.f1819c.get() : (zzbar) this.f1818b.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = this.f1829n;
        try {
            zzbio zzbioVar = zzbix.zzex;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                this.f1820d = c();
            }
            boolean z2 = this.k.f4930d;
            boolean z10 = false;
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzbN)).booleanValue() && z2) {
                z10 = true;
            }
            if (((!this.f1821e || this.f1820d) ? this.f1830o : 1) == 1) {
                e(z10);
                if (this.f1830o == 2) {
                    this.f1823g.execute(new Y0(1, this, z10));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = this.f1825i;
                    H6.a aVar = this.k;
                    boolean z11 = this.f1828m;
                    zzawu zzawuVarZze = zzawv.zze();
                    zzawuVarZze.zzb(z10);
                    zzawuVarZze.zza(aVar.f4927a);
                    zzawv zzawvVar = (zzawv) zzawuVarZze.zzbu();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzbao zzbaoVarZza = zzbao.zza(context, zzawvVar, z11);
                    this.f1819c.set(zzbaoVarZza);
                    if (this.f1822f && !zzbaoVarZza.zzb()) {
                        this.f1830o = 1;
                        e(z10);
                    }
                } catch (NullPointerException e7) {
                    this.f1830o = 1;
                    e(z10);
                    this.f1824h.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e7);
                }
            }
            countDownLatch.countDown();
            this.f1825i = null;
            this.k = null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            this.f1825i = null;
            this.k = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(MotionEvent motionEvent) {
        zzbar zzbarVarF = f();
        if (zzbarVarF == null) {
            this.f1817a.add(new Object[]{motionEvent});
            return;
        }
        d();
        try {
            zzbarVarF.zzd(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zze(int i5, int i10, int i11) {
        zzbar zzbarVarF = f();
        if (zzbarVarF == null) {
            this.f1817a.add(new Object[]{Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11)});
            return;
        }
        d();
        try {
            zzbarVarF.zze(i5, i10, i11);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!a()) {
            return "";
        }
        zzbar zzbarVarF = f();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmn)).booleanValue()) {
            U u10 = n.f1857D.f1863c;
            U.j(4, view);
        }
        if (zzbarVarF == null) {
            return "";
        }
        d();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return zzbarVarF.zzf(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzh(View view) {
        zzbar zzbarVarF = f();
        if (zzbarVarF != null) {
            try {
                zzbarVarF.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbar zzbarVarF;
        zzbar zzbarVarF2;
        try {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdM)).booleanValue()) {
                if (this.f1829n.getCount() != 0 || (zzbarVarF2 = f()) == null) {
                    return;
                }
                zzbarVarF2.zzi(stackTraceElementArr);
                return;
            }
            if (!a() || (zzbarVarF = f()) == null) {
                return;
            }
            zzbarVarF.zzi(stackTraceElementArr);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzj(Context context, View view, Activity activity) {
        zzbio zzbioVar = zzbix.zzmm;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbiv zzbivVar = c0395s.f2492c;
        try {
            if (!zBooleanValue) {
                zzbar zzbarVarF = f();
                if (((Boolean) zzbivVar.zzd(zzbix.zzmn)).booleanValue()) {
                    U u10 = n.f1857D.f1863c;
                    U.j(2, view);
                }
                return zzbarVarF != null ? zzbarVarF.zzj(context, view, activity) : "";
            }
            if (!a()) {
                return "";
            }
            zzbar zzbarVarF2 = f();
            if (((Boolean) zzbivVar.zzd(zzbix.zzmn)).booleanValue()) {
                U u11 = n.f1857D.f1863c;
                U.j(2, view);
            }
            return zzbarVarF2 != null ? zzbarVarF2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzk(Context context) {
        try {
            return (String) zzhcf.zzd(new CallableC0305y0(this, false, context, 4), this.f1823g).get(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzdG)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzbak.zza(context, this.f1827l.f4927a, f1816p, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzl(Context context) {
        return b(context);
    }
}
