package x8;

import A7.I0;
import A7.J0;
import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import l8.AbstractC3414P;

/* renamed from: x8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4500c implements J0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4498a f47856b;

    public /* synthetic */ C4500c(InterfaceC4498a interfaceC4498a, int i5) {
        this.f47855a = i5;
        this.f47856b = interfaceC4498a;
    }

    @Override // A7.J0
    public final void a(String str, String str2, Bundle bundle, long j8) {
        InterfaceC4498a interfaceC4498a = this.f47856b;
        switch (this.f47855a) {
            case 0:
                d dVar = (d) interfaceC4498a;
                if (dVar.f47857a.contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    AbstractC3414P abstractC3414P = AbstractC4499b.f47849a;
                    String strC = I0.c(str2, I0.f525c, I0.f523a);
                    if (strC != null) {
                        str2 = strC;
                    }
                    bundle2.putString("events", str2);
                    dVar.f47858b.f(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC4499b.f47849a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(MediationMetaData.KEY_NAME, str2);
                    bundle3.putLong("timestampInMillis", j8);
                    bundle3.putBundle("params", bundle);
                    ((e) interfaceC4498a).f47859a.f(3, bundle3);
                    break;
                }
                break;
        }
    }
}
