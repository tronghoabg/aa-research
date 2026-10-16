package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import S3.f;
import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import ff.G;
import ff.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzdk implements zzdg {

    @Nullable
    private static Timer zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzdl zzc;

    @NotNull
    private final E zzd;

    @Nullable
    private final zzda zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzdk(@NotNull Context context, @NotNull zzdl zzdlVar, @NotNull E e7) {
        this.zzb = context;
        this.zzc = zzdlVar;
        this.zzd = e7;
        zzda zzdaVar = null;
        Object[] objArr = 0;
        try {
            zzda zzdaVar2 = zzda.zzd;
            zzdaVar2 = zzdaVar2 == null ? new zzda(context, objArr == true ? 1 : 0) : zzdaVar2;
            zzda.zzd = zzdaVar2;
            zzdaVar = zzdaVar2;
        } catch (Exception unused) {
        }
        this.zze = zzdaVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        zzda zzdaVar;
        zzre zzreVarZzk;
        int iZzL;
        int i5;
        zzda zzdaVar2 = this.zze;
        if (zzdaVar2 != null) {
            List listZzd = zzdaVar2.zzd();
            AbstractC3340k.e(listZzd, "<this>");
            if ((listZzd instanceof RandomAccess) && (listZzd instanceof List)) {
                List list = listZzd;
                int size = list.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 20) {
                    int i11 = size - i10;
                    if (20 <= i11) {
                        i11 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(list.get(i12 + i10));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = listZzd.iterator();
                AbstractC3340k.e(iterator, "iterator");
                Iterator itX = !iterator.hasNext() ? u.f35431a : f.x(new G(iterator, null));
                while (itX.hasNext()) {
                    arrayList.add((List) itX.next());
                }
            }
            for (List<zzdb> list2 : arrayList) {
                zzor zzorVarZzi = zzos.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzdb zzdbVar : list2) {
                    try {
                        zzreVarZzk = zzre.zzk(zzhz.zzg().zzj(zzdbVar.zzc()));
                        iZzL = zzreVarZzk.zzL();
                        i5 = iZzL - 1;
                    } catch (Exception unused) {
                        zzda zzdaVar3 = this.zze;
                        if (zzdaVar3 != null) {
                            zzdaVar3.zzf(zzdbVar);
                        }
                    }
                    if (iZzL == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        zzorVarZzi.zzp(zzreVarZzk.zzf());
                    } else if (i5 == 1) {
                        zzorVarZzi.zzq(zzreVarZzk.zzg());
                    }
                    arrayList3.add(zzdbVar);
                }
                if (zzorVarZzi.zze() + zzorVarZzi.zzd() != 0) {
                    if (this.zzc.zza(((zzos) zzorVarZzi.zzj()).zzd()) && (zzdaVar = this.zze) != null) {
                        zzdaVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzdh(this), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzdg
    public final void zza(@NotNull zzre zzreVar) {
        H.D(this.zzd, null, new zzdj(this, zzreVar, null), 3);
        zzh();
    }
}
