package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class zzli {
    final /* synthetic */ zzlj zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    public /* synthetic */ zzli(zzlj zzljVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i5) {
                zzlj zzljVar2 = this.zza.zza;
                if (zzljVar2.zzae()) {
                    return;
                }
                zzljVar2.zzT(1, 19, Integer.valueOf(i5));
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return IntConsumer$CC.$default$andThen(this, intConsumer2);
            }
        };
        this.zzc = intConsumer;
        final zzea zzeaVarZzd = zzljVar.zzX().zzd(zzljVar.zzW(), null);
        Objects.requireNonNull(zzeaVarZzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzeaVarZzd.zzm(runnable);
            }
        }, intConsumer);
    }

    public final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
