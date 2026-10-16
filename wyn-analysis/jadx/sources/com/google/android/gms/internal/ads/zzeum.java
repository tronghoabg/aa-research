package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeum implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;
    private final zzflg zzc;
    private final View zzd;

    public zzeum(zzhcp zzhcpVar, Context context, zzflg zzflgVar, ViewGroup viewGroup) {
        this.zza = zzhcpVar;
        this.zzb = context;
        this.zzc = zzflgVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzbix.zza(this.zzb);
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeul
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 3;
    }

    public final /* synthetic */ zzeun zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzeun(this.zzb, this.zzc.zzf, arrayList);
    }
}
