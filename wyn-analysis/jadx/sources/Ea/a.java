package Ea;

import A7.C0237b0;
import A7.S;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import ya.n;

/* loaded from: classes4.dex */
public final class a extends E9.c {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f3630i = true;

    /* renamed from: d, reason: collision with root package name */
    public final e f3632d;

    /* renamed from: e, reason: collision with root package name */
    public final zzuc f3633e;

    /* renamed from: f, reason: collision with root package name */
    public final zzue f3634f;

    /* renamed from: g, reason: collision with root package name */
    public final Ca.h f3635g;

    /* renamed from: j, reason: collision with root package name */
    public static final Ba.a f3631j = Ba.a.f1647b;

    /* renamed from: h, reason: collision with root package name */
    public static final C0237b0 f3629h = new C0237b0((byte) 0, 16);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zzuc zzucVar, e eVar, Ca.h hVar) {
        super(f3629h);
        hVar.getClass();
        this.f3633e = zzucVar;
        this.f3632d = eVar;
        this.f3634f = zzue.zza(ya.g.c().b());
        this.f3635g = hVar;
    }

    public final Ca.f w(Aa.a aVar) {
        Ca.f fVarC;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                fVarC = this.f3632d.c(aVar);
                x(zzou.NO_ERROR, jElapsedRealtime, aVar);
                f3630i = false;
            } catch (ua.a e7) {
                x(e7.f46746a == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, jElapsedRealtime, aVar);
                throw e7;
            }
        }
        return fVarC;
    }

    public final void x(zzou zzouVar, long j8, Aa.a aVar) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j8;
        this.f3633e.zzf(new S(this, jElapsedRealtime, zzouVar, aVar), zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(f3630i));
        zzsa zzsaVar = new zzsa();
        Ca.h hVar = this.f3635g;
        hVar.getClass();
        zzsaVar.zza(A6.c.P(1));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzesVarZzd = zzeqVar.zzd();
        final i iVar = new i(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        n nVar = n.f48065a;
        final zzuc zzucVar = this.f3633e;
        nVar.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzucVar.zzh(zzovVar, zzesVarZzd, jElapsedRealtime, iVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iD = hVar.d();
        int iZza = zzouVar.zza();
        this.f3634f.zzc(iD, iZza, jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
