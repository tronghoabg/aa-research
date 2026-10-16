package C7;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC1686a;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.C1720i;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapi.zbe;
import com.google.android.gms.internal.p001authapiphone.zzw;
import com.google.android.gms.internal.safetynet.zzaf;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class l extends AbstractC1686a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1903a;

    public /* synthetic */ l(int i5) {
        this.f1903a = i5;
    }

    @Override // com.google.android.gms.common.api.AbstractC1686a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C1720i c1720i, Object obj, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        switch (this.f1903a) {
            case 6:
                return new zzbe(context, looper, c1720i, (V6.c) obj, interfaceC1694h, interfaceC1704s);
            case 7:
                return new zzw(context, looper, c1720i, interfaceC1694h, interfaceC1704s);
            case 8:
            default:
                return super.buildClient(context, looper, c1720i, obj, interfaceC1694h, interfaceC1704s);
            case 9:
                return new g7.c(context, looper, c1720i, (A) obj, interfaceC1694h, interfaceC1704s);
            case 10:
                return new j7.h(context, looper, 308, c1720i, interfaceC1694h, interfaceC1704s);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        switch (this.f1903a) {
            case 5:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.EMPTY_LIST : googleSignInOptions.V();
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC1686a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C1720i c1720i, Object obj, com.google.android.gms.common.api.m mVar, n nVar) {
        switch (this.f1903a) {
            case 0:
                return new zzaf(context, looper, c1720i, mVar, nVar);
            case 1:
                c1720i.getClass();
                Integer num = c1720i.f26651g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new F7.a(context, looper, c1720i, bundle, mVar, nVar);
            case 2:
                obj.getClass();
                throw new ClassCastException();
            case 3:
                return new zzam(context, looper, c1720i, mVar, nVar);
            case 4:
                return new zbe(context, looper, c1720i, (V6.d) obj, mVar, nVar);
            case 5:
                return new b7.e(context, looper, c1720i, (GoogleSignInOptions) obj, mVar, nVar);
            case 6:
            case 7:
            default:
                return super.buildClient(context, looper, c1720i, obj, mVar, nVar);
            case 8:
                return new f9.c(context, looper, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, c1720i, mVar, nVar);
        }
    }
}
