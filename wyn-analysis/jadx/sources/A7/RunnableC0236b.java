package A7;

import com.google.android.gms.common.internal.AbstractC1732v;
import x.C4412e;

/* renamed from: A7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0236b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f810d;

    public /* synthetic */ RunnableC0236b(r rVar, String str, long j8, int i5) {
        this.f807a = i5;
        this.f808b = str;
        this.f809c = j8;
        this.f810d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f807a) {
            case 0:
                r rVar = this.f810d;
                rVar.c0();
                String str = this.f808b;
                AbstractC1732v.f(str);
                C4412e c4412e = rVar.f1034c;
                boolean zIsEmpty = c4412e.isEmpty();
                long j8 = this.f809c;
                if (zIsEmpty) {
                    rVar.f1035d = j8;
                }
                Integer num = (Integer) c4412e.get(str);
                if (num == null) {
                    if (c4412e.f47563c < 100) {
                        c4412e.put(str, 1);
                        rVar.f1033b.put(str, Long.valueOf(j8));
                        break;
                    } else {
                        rVar.zzj().f608i.c("Too many ads visible");
                        break;
                    }
                } else {
                    c4412e.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                r rVar2 = this.f810d;
                rVar2.c0();
                String str2 = this.f808b;
                AbstractC1732v.f(str2);
                C4412e c4412e2 = rVar2.f1034c;
                Integer num2 = (Integer) c4412e2.get(str2);
                if (num2 == null) {
                    rVar2.zzj().f605f.d("Call to endAdUnitExposure for unknown ad unit id", str2);
                    break;
                } else {
                    C0262j1 c0262j1K0 = rVar2.f0().k0(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c4412e2.put(str2, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        c4412e2.remove(str2);
                        C4412e c4412e3 = rVar2.f1033b;
                        Long l10 = (Long) c4412e3.get(str2);
                        long j10 = this.f809c;
                        if (l10 == null) {
                            rVar2.zzj().f605f.c("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j10 - l10.longValue();
                            c4412e3.remove(str2);
                            rVar2.k0(str2, jLongValue, c0262j1K0);
                        }
                        if (c4412e2.isEmpty()) {
                            long j11 = rVar2.f1035d;
                            if (j11 != 0) {
                                rVar2.i0(j10 - j11, c0262j1K0);
                                rVar2.f1035d = 0L;
                                break;
                            } else {
                                rVar2.zzj().f605f.c("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
