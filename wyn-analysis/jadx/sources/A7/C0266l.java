package A7;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: A7.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0266l {

    /* renamed from: a, reason: collision with root package name */
    public final String f940a;

    /* renamed from: b, reason: collision with root package name */
    public long f941b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0257i f942c;

    public C0266l(C0257i c0257i, String str) {
        this.f942c = c0257i;
        AbstractC1732v.f(str);
        this.f940a = str;
    }

    public final List a() {
        Cursor cursorQuery;
        C0257i c0257i = this.f942c;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.f941b);
        String str = this.f940a;
        Cursor cursor = null;
        try {
            try {
                cursorQuery = c0257i.l0().query("raw_events", new String[]{"rowid", MediationMetaData.KEY_NAME, "timestamp", "metadata_fingerprint", JsonStorageKeyNames.DATA_KEY, "realtime"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
            } catch (SQLiteException e7) {
                c0257i.zzj().f605f.b(N.h0(str), "Data loss. Error querying raw events batch. appId", e7);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!cursorQuery.moveToFirst()) {
                List list = Collections.EMPTY_LIST;
                cursorQuery.close();
                return list;
            }
            do {
                long j8 = cursorQuery.getLong(0);
                long j10 = cursorQuery.getLong(3);
                boolean z2 = cursorQuery.getLong(5) == 1;
                byte[] blob = cursorQuery.getBlob(4);
                if (j8 > this.f941b) {
                    this.f941b = j8;
                }
                try {
                    zzfy.zzf.zza zzaVar = (zzfy.zzf.zza) S1.t0(zzfy.zzf.zze(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    zzaVar.zza(string).zzb(cursorQuery.getLong(2));
                    arrayList.add(new C0260j(j8, j10, z2, (zzfy.zzf) ((zzjt) zzaVar.zzai())));
                } catch (IOException e10) {
                    c0257i.zzj().f605f.b(N.h0(str), "Data loss. Failed to merge raw event. appId", e10);
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
