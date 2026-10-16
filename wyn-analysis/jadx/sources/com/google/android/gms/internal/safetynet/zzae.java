package com.google.android.gms.internal.safetynet;

import C7.c;
import C7.f;
import C7.g;
import N7.e;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import c8.C1581e;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C1687a;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class zzae {
    private static final String zza = "zzae";

    public static r zza(o oVar, byte[] bArr, String str) {
        return ((J) oVar).f26468b.doRead((l) new zzi(oVar, bArr, str));
    }

    public static r zzb(o oVar, String str, int i5, String str2, int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return ((J) oVar).f26468b.doRead((l) new zzk(oVar, iArr, i5, str, str2));
    }

    public final r attest(o oVar, byte[] bArr) {
        return zza(oVar, bArr, null);
    }

    public final r enableVerifyApps(o oVar) {
        return ((J) oVar).f26468b.doRead((l) new zzm(this, oVar));
    }

    public final boolean isVerifyAppsEnabled(Context context) {
        i iVar = c.f1894a;
        g gVar = new g(context, null, c.f1894a, null, new k(new C1687a(), Looper.getMainLooper()));
        e eVarA = A.a();
        eVarA.f8589c = 4201;
        eVarA.f8590d = new C1581e(gVar);
        Task taskDoRead = gVar.doRead(eVarA.e());
        try {
            Tasks.await(taskDoRead, 15000L, TimeUnit.MILLISECONDS);
            return ((zzad) ((t) ((f) taskDoRead.getResult()).f421a)).isVerifyAppsEnabled();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return false;
        }
    }

    public final r listHarmfulApps(o oVar) {
        return ((J) oVar).f26468b.doRead((l) new zzn(this, oVar));
    }

    public final r lookupUri(o oVar, String str, String str2, int... iArr) {
        return zzb(oVar, str, 1, str2, iArr);
    }

    public final r verifyWithRecaptcha(o oVar, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
        }
        return ((J) oVar).f26468b.doRead((l) new zzo(this, oVar, str));
    }

    public final r lookupUri(o oVar, List<Integer> list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return ((J) oVar).f26468b.doRead((l) new zzj(this, oVar, list, str, null));
    }

    public final r isVerifyAppsEnabled(o oVar) {
        return ((J) oVar).f26468b.doRead((l) new zzl(this, oVar));
    }
}
