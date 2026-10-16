package Ea;

import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class f extends Ba.b implements Ca.g {

    /* renamed from: f, reason: collision with root package name */
    public final Ca.h f3638f;

    public f(a aVar, Executor executor, zzuc zzucVar, Ca.h hVar) {
        super(aVar, executor);
        this.f3638f = hVar;
        zzow zzowVar = new zzow();
        zzowVar.zze(hVar.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzrx zzrxVar = new zzrx();
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(A6.c.P(1));
        zzrxVar.zze(zzsaVar.zzc());
        zzowVar.zzh(zzrxVar.zzf());
        zzucVar.zzd(zzuf.zzg(zzowVar, 1), zzov.ON_DEVICE_TEXT_CREATE);
    }

    @Override // com.google.android.gms.common.api.p
    public final d7.d[] a() {
        return A6.h.T(this.f3638f);
    }
}
