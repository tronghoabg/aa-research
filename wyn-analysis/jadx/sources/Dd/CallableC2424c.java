package dd;

import S3.s;
import Va.Za;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzhw;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: dd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class CallableC2424c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2426e f34255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34256c;

    public /* synthetic */ CallableC2424c(C2426e c2426e, String str, int i5) {
        this.f34254a = i5;
        this.f34255b = c2426e;
        this.f34256c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Ya.a, IOException {
        TokenData tokenDataA;
        String str = this.f34256c;
        C2426e c2426e = this.f34255b;
        int i5 = this.f34254a;
        c2426e.getClass();
        switch (i5) {
            case 0:
                Account account = new Account(str, "com.google");
                String str2 = "oauth2:" + new B8.e(String.valueOf(' ')).e(c2426e.f34264f);
                String[] strArr = T6.d.f11764a;
                Bundle bundle = new Bundle();
                T6.d.f(account);
                AbstractC1732v.h("Calling this from your main thread can lead to deadlock");
                AbstractC1732v.g(str2, "Scope cannot be empty or null.");
                T6.d.f(account);
                Context context = c2426e.f34259a;
                T6.d.d(context);
                Bundle bundle2 = new Bundle(bundle);
                T6.d.e(context, bundle2);
                zzdc.zzd(context);
                if (zzhw.zze() && T6.d.g(context)) {
                    try {
                        Bundle bundle3 = (Bundle) T6.d.c(zzh.zza(context).zzc(account, str2, bundle2), "token retrieval");
                        if (bundle3 == null) {
                            T6.d.f11766c.f("Service call returned null.", new Object[0]);
                            throw new IOException("Service unavailable.");
                        }
                        tokenDataA = T6.d.a(context, bundle3);
                    } catch (com.google.android.gms.common.api.j e7) {
                        T6.d.f11766c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e7));
                    }
                } else {
                    tokenDataA = (TokenData) T6.d.b(context, T6.d.f11765b, new Za(account, str2, bundle2, context));
                }
                return tokenDataA.f26358b;
            default:
                String[] strArr2 = T6.d.f11764a;
                AbstractC1732v.h("Calling this from your main thread can lead to deadlock");
                Context context2 = c2426e.f34259a;
                T6.d.d(context2);
                Bundle bundle4 = new Bundle();
                T6.d.e(context2, bundle4);
                zzdc.zzd(context2);
                if (zzhw.zze() && T6.d.g(context2)) {
                    zzg zzgVarZza = zzh.zza(context2);
                    zzbw zzbwVar = new zzbw();
                    zzbwVar.zza(str);
                    try {
                        T6.d.c(zzgVarZza.zza(zzbwVar), "clear token");
                        return null;
                    } catch (com.google.android.gms.common.api.j e10) {
                        T6.d.f11766c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e10));
                    }
                }
                T6.d.b(context2, T6.d.f11765b, new s(25, str, bundle4));
                return null;
        }
    }
}
