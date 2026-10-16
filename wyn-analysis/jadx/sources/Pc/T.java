package Pc;

import a.AbstractC1304a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Locale;
import uc.C4271h;

/* loaded from: classes5.dex */
public final class T extends J8.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f9375a;

    public T(U u10) {
        this.f9375a = u10;
    }

    @Override // J8.x
    public final void onCodeAutoRetrievalTimeOut(String str) {
        HashMap map = new HashMap();
        map.put("verificationId", str);
        map.put(MediationMetaData.KEY_NAME, "Auth#phoneCodeAutoRetrievalTimeout");
        C4271h c4271h = this.f9375a.f9385j;
        if (c4271h != null) {
            c4271h.a(map);
        }
    }

    @Override // J8.x
    public final void onCodeSent(String str, J8.w wVar) {
        int iHashCode = wVar.hashCode();
        U.k.put(Integer.valueOf(iHashCode), wVar);
        HashMap map = new HashMap();
        map.put("verificationId", str);
        map.put("forceResendingToken", Integer.valueOf(iHashCode));
        map.put(MediationMetaData.KEY_NAME, "Auth#phoneCodeSent");
        C4271h c4271h = this.f9375a.f9385j;
        if (c4271h != null) {
            c4271h.a(map);
        }
    }

    @Override // J8.x
    public final void onVerificationCompleted(J8.u uVar) {
        int iHashCode = uVar.hashCode();
        U u10 = this.f9375a;
        u10.f9381f.getClass();
        HashMap map = C0788d.f9393i;
        C0788d.f9393i.put(Integer.valueOf(uVar.hashCode()), uVar);
        HashMap map2 = new HashMap();
        map2.put("token", Integer.valueOf(iHashCode));
        String str = uVar.f5818b;
        if (str != null) {
            map2.put("smsCode", str);
        }
        map2.put(MediationMetaData.KEY_NAME, "Auth#phoneVerificationCompleted");
        C4271h c4271h = u10.f9385j;
        if (c4271h != null) {
            c4271h.a(map2);
        }
    }

    @Override // J8.x
    public final void onVerificationFailed(s8.j jVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C0803t c0803tG = AbstractC1304a.G(jVar);
        map2.put("code", c0803tG.f9445a.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll(Constants.USER_ID_SEPARATOR, "-"));
        map2.put(PglCryptUtils.KEY_MESSAGE, c0803tG.getMessage());
        map2.put("details", c0803tG.f9446b);
        map.put("error", map2);
        map.put(MediationMetaData.KEY_NAME, "Auth#phoneVerificationFailed");
        C4271h c4271h = this.f9375a.f9385j;
        if (c4271h != null) {
            c4271h.a(map);
        }
    }
}
