package D6;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class Y0 extends zzbsc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f2391a;

    public /* synthetic */ Y0(Z0 z02) {
        Objects.requireNonNull(z02);
        this.f2391a = z02;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzb(List list) {
        int i5;
        ArrayList arrayList;
        Z0 z02 = this.f2391a;
        synchronized (z02.f2397d) {
            z02.f2400g = false;
            z02.f2401h = true;
            arrayList = new ArrayList(z02.f2399f);
            z02.f2399f.clear();
        }
        zzbsf zzbsfVarA = Z0.a(list);
        int size = arrayList.size();
        for (i5 = 0; i5 < size; i5++) {
            ((OnInitializationCompleteListener) arrayList.get(i5)).onInitializationComplete(zzbsfVarA);
        }
    }
}
