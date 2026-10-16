package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class vkp implements pxc {
    private static final yob a = yob.c("com/google/android/libraries/navigation/internal/service/NavSdkUsageServerProtocolRpcProvider");
    private final CronetEngine b;
    private final tmb c;
    private final Executor d;
    private final aezk e;
    private final xyc f;
    private final zre g;

    public vkp(CronetEngine cronetEngine, tmb tmbVar, Executor executor, zre zreVar, aezk aezkVar, Context context) {
        xyc xycVarL;
        this.b = cronetEngine;
        this.c = tmbVar;
        this.d = executor;
        this.g = zreVar;
        this.e = aezkVar;
        try {
            xycVarL = wub.L(new vdv(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData, 4));
        } catch (PackageManager.NameNotFoundException e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9741)).u("Couldn't find NavSDK usage server override key from manifest.");
            xycVarL = wub.L(new txv(11));
            this.f = xycVarL;
        } catch (NullPointerException e2) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e2)).ai((char) 9742)).u("Couldn't load metadata config values.");
            xycVarL = wub.L(new txv(11));
            this.f = xycVarL;
        }
        this.f = xycVarL;
    }

    @Override // defpackage.pxc
    public final pxb a(abow abowVar, pwh pwhVar, pwp pwpVar) {
        vko vkoVar;
        String str = (String) this.f.gu();
        vko vkoVar2 = vko.PROD;
        if (vkoVar2.e.equals(str)) {
            vkoVar = vkoVar2;
        } else {
            vkoVar = vko.STAGING;
            if (!vkoVar.e.equals(str)) {
                vkoVar = vko.AUTOPUSH;
                if (!vkoVar.e.equals(str)) {
                    vkoVar = vko.EMPTY;
                }
            }
        }
        String str2 = vkoVar.f;
        if (str2.isEmpty()) {
            str2 = ((poq) this.e).a().b;
        } else {
            ((ynz) ((ynz) a.h()).ai((char) 9740)).y("Usage Server endpoint overridden by AndroidManifest.xml: %s", str2);
        }
        if (str2.isEmpty()) {
            str2 = vkoVar2.f;
        }
        return new vkn(abowVar, str2, this.b, pwhVar, this.g, this.c, this.d);
    }

    @Override // defpackage.pxc
    public final /* synthetic */ void b() {
    }
}
