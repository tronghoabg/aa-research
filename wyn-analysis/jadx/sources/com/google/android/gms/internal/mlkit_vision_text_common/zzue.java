package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.C1730t;
import com.google.android.gms.common.internal.C1735y;
import com.google.android.gms.common.internal.InterfaceC1736z;
import com.google.android.gms.tasks.OnFailureListener;
import g7.C2713b;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzue {
    private final InterfaceC1736z zza;
    private final AtomicLong zzb = new AtomicLong(-1);

    public zzue(Context context, String str) {
        this.zza = new C2713b(context, null, C2713b.f35775a, new A("mlkit:vision"), k.f26561c);
    }

    public static zzue zza(Context context) {
        return new zzue(context, "mlkit:vision");
    }

    public final /* synthetic */ void zzb(long j8, Exception exc) {
        this.zzb.set(j8);
    }

    public final synchronized void zzc(int i5, int i10, long j8, long j10) {
        AtomicLong atomicLong = this.zzb;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.zzb.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        ((C2713b) this.zza).c(new C1735y(0, Arrays.asList(new C1730t(i5, i10, 0, j8, j10, null, null, 0, -1)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzud
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzb(jElapsedRealtime, exc);
            }
        });
    }
}
