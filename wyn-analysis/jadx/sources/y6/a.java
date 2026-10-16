package Y6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

/* loaded from: classes3.dex */
public abstract class a extends l {
    private static final h zza;
    private static final AbstractC1686a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        C7.l lVar = new C7.l(7);
        zzb = lVar;
        zzc = new i("SmsRetriever.API", lVar, hVar);
    }

    public a(Activity activity) {
        super(activity, activity, zzc, e.f26433X8, k.f26561c);
    }

    public a(Context context) {
        super(context, null, zzc, e.f26433X8, k.f26561c);
    }
}
