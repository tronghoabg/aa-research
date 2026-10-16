package A7;

import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public zzfy.zzk f537a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f538b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f539c;

    /* renamed from: d, reason: collision with root package name */
    public long f540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L1 f541e;

    public J1(L1 l12) {
        this.f541e = l12;
    }

    public final void a(zzfy.zzk zzkVar) {
        AbstractC1732v.i(zzkVar);
        this.f537a = zzkVar;
    }

    public final boolean b(zzfy.zzf zzfVar, long j8) {
        AbstractC1732v.i(zzfVar);
        if (this.f539c == null) {
            this.f539c = new ArrayList();
        }
        if (this.f538b == null) {
            this.f538b = new ArrayList();
        }
        if (this.f539c.isEmpty() || ((((zzfy.zzf) this.f539c.get(0)).zzd() / 1000) / 60) / 60 == ((zzfVar.zzd() / 1000) / 60) / 60) {
            long jZzcb = this.f540d + zzfVar.zzcb();
            L1 l12 = this.f541e;
            l12.O();
            if (jZzcb < Math.max(0, ((Integer) AbstractC0304y.f1192j.a(null)).intValue())) {
                this.f540d = jZzcb;
                this.f539c.add(zzfVar);
                this.f538b.add(Long.valueOf(j8));
                int size = this.f539c.size();
                l12.O();
                if (size < Math.max(1, ((Integer) AbstractC0304y.k.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }
}
