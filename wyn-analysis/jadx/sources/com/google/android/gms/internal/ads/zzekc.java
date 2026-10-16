package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbic;
import java.util.ArrayList;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes3.dex */
public final class zzekc {
    private final zzbhw zza;
    private final Context zzb;
    private final zzejh zzc;
    private final H6.a zzd;

    public zzekc(Context context, H6.a aVar, zzbhw zzbhwVar, zzejh zzejhVar) {
        this.zzb = context;
        this.zzd = aVar;
        this.zza = zzbhwVar;
        this.zzc = zzejhVar;
    }

    public final void zza(final boolean z2) {
        try {
            this.zzc.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekb
                @Override // com.google.android.gms.internal.ads.zzfos
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z2, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i5 = G6.L.f4523b;
            H6.l.c("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    public final Void zzb(boolean z2, SQLiteDatabase sQLiteDatabase) {
        if (z2) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzbic.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzifh e7) {
                int i5 = G6.L.f4523b;
                H6.l.c("Unable to deserialize proto from offline signals database:");
                H6.l.c(e7.getMessage());
            }
        }
        cursorQuery.close();
        Context context = this.zzb;
        zzbic.zzaf.zzc zzcVarZzB = zzbic.zzaf.zzB();
        zzcVarZzB.zzB(context.getPackageName());
        zzcVarZzB.zzH(Build.MODEL);
        zzcVarZzB.zzo(zzejw.zzc(sQLiteDatabase, 0));
        zzcVarZzB.zzj(arrayList);
        zzcVarZzB.zzs(zzejw.zzc(sQLiteDatabase, 1));
        zzcVarZzB.zzQ(zzejw.zzc(sQLiteDatabase, 3));
        C6.n.f1857D.k.getClass();
        zzcVarZzB.zzw(System.currentTimeMillis());
        zzcVarZzB.zzM(zzejw.zzd(sQLiteDatabase, 2));
        final zzbic.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
        int size = arrayList.size();
        long jZzb = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzbic.zzaf.zza zzaVar = (zzbic.zzaf.zza) arrayList.get(i10);
            if (zzaVar.zzf() == zzbic.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                jZzb = zzaVar.zzb();
            }
        }
        if (jZzb != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Long.valueOf(jZzb));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar2) {
                zzaVar2.zzaf(zzafVarZzbu);
            }
        });
        H6.a aVar = this.zzd;
        zzbic.zzar.zza zzaVarZzs = zzbic.zzar.zzs();
        zzaVarZzs.zzc(aVar.f4928b);
        zzaVarZzs.zzg(aVar.f4929c);
        zzaVarZzs.zzk(true == aVar.f4930d ? 0 : 2);
        final zzbic.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar2) {
                zzbic.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar2.zzI(zzaVarZzcc);
            }
        });
        zzbhwVar.zzc(10004);
        zzejw.zzb(sQLiteDatabase);
        return null;
    }
}
