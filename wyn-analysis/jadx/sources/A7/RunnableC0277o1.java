package A7;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: A7.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0277o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1010a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N1 f1013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0271m1 f1015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1016g;

    public RunnableC0277o1(C0271m1 c0271m1, String str, String str2, N1 n12, boolean z2, zzdo zzdoVar) {
        this.f1011b = str;
        this.f1012c = str2;
        this.f1013d = n12;
        this.f1014e = z2;
        this.f1016g = zzdoVar;
        this.f1015f = c0271m1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e7 -> B:52:0x00ee). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        C0271m1 c0271m1;
        F f10;
        switch (this.f1010a) {
            case 0:
                N1 n12 = this.f1013d;
                String str = this.f1011b;
                zzdo zzdoVar = (zzdo) this.f1016g;
                C0271m1 c0271m12 = this.f1015f;
                Bundle bundle = new Bundle();
                try {
                    F f11 = c0271m12.f954d;
                    String str2 = this.f1012c;
                    if (f11 == null) {
                        c0271m12.zzj().f605f.b(str, "Failed to get user properties; not connected to service", str2);
                    } else {
                        bundle = U1.p0(f11.j(str, str2, this.f1014e, n12));
                        c0271m12.v0();
                        c0271m12.b0().A0(zzdoVar, bundle);
                    }
                } catch (RemoteException e7) {
                    c0271m12.zzj().f605f.b(str, "Failed to get user properties; remote exception", e7);
                } finally {
                    c0271m12.b0().A0(zzdoVar, bundle);
                }
                return;
            default:
                synchronized (((AtomicReference) this.f1016g)) {
                    try {
                        try {
                            c0271m1 = this.f1015f;
                            f10 = c0271m1.f954d;
                        } catch (RemoteException e10) {
                            this.f1015f.zzj().f605f.a(null, this.f1011b, e10, "(legacy) Failed to get user properties; remote exception");
                            ((AtomicReference) this.f1016g).set(Collections.EMPTY_LIST);
                        }
                        if (f10 == null) {
                            c0271m1.zzj().f605f.a(null, this.f1011b, this.f1012c, "(legacy) Failed to get user properties; not connected to service");
                            ((AtomicReference) this.f1016g).set(Collections.EMPTY_LIST);
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.f1016g).set(f10.j(this.f1011b, this.f1012c, this.f1014e, this.f1013d));
                        } else {
                            ((AtomicReference) this.f1016g).set(f10.d(null, this.f1011b, this.f1012c, this.f1014e));
                        }
                        this.f1015f.v0();
                        ((AtomicReference) this.f1016g).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f1016g).notify();
                    }
                }
        }
    }

    public RunnableC0277o1(C0271m1 c0271m1, AtomicReference atomicReference, String str, String str2, N1 n12, boolean z2) {
        this.f1016g = atomicReference;
        this.f1011b = str;
        this.f1012c = str2;
        this.f1013d = n12;
        this.f1014e = z2;
        this.f1015f = c0271m1;
    }
}
