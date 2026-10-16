package A7;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfr;
import f4.C2556c;
import f4.C2559f;
import f4.InterfaceC2562i;
import x.C4412e;
import x.C4417j;

/* renamed from: A7.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0252g0 extends C4417j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f869a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252g0(C0249f0 c0249f0) {
        super(20);
        this.f870b = c0249f0;
    }

    @Override // x.C4417j
    public Object create(Object obj) {
        switch (this.f869a) {
            case 0:
                String str = (String) obj;
                AbstractC1732v.f(str);
                C0249f0 c0249f0 = (C0249f0) this.f870b;
                c0249f0.h0();
                AbstractC1732v.f(str);
                if (!TextUtils.isEmpty(str)) {
                    C4412e c4412e = c0249f0.f862h;
                    zzfr.zzd zzdVar = (zzfr.zzd) c4412e.get(str);
                    if (zzdVar != null && zzdVar.zza() != 0) {
                        if (!c4412e.containsKey(str) || c4412e.get(str) == null) {
                            c0249f0.B0(str);
                        } else {
                            c0249f0.q0(str, (zzfr.zzd) c4412e.get(str));
                        }
                        return (zzb) c0249f0.f864j.snapshot().get(str);
                    }
                }
                return null;
            default:
                return super.create(obj);
        }
    }

    @Override // x.C4417j
    public void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        switch (this.f869a) {
            case 1:
                C2559f c2559f = (C2559f) obj2;
                ((InterfaceC2562i) ((X2.j) this.f870b).f16075b).r((C2556c) obj, c2559f.f34815a, c2559f.f34816b, c2559f.f34817c);
                break;
            default:
                super.entryRemoved(z2, obj, obj2, obj3);
                break;
        }
    }

    @Override // x.C4417j
    public int sizeOf(Object obj, Object obj2) {
        switch (this.f869a) {
            case 1:
                return ((C2559f) obj2).f34817c;
            default:
                return super.sizeOf(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252g0(int i5, X2.j jVar) {
        super(i5);
        this.f870b = jVar;
    }
}
