package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* loaded from: classes2.dex */
public final class jwn {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H");

    public static void a(String str, Intent intent, boolean z) {
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 2807)).y("Asserting intent is valid %s", intent);
        ComponentName component = intent.getComponent();
        String action = intent.getAction();
        if (component != null && Objects.equals(component.getPackageName(), str)) {
            ((ype) yphVar.l().ai((char) 2812)).u("The intent is to start self");
            if (z && Collection.EL.stream(lem.a().b(kio.b().e(), nyj.a())).filter(new hmd(7)).noneMatch(new ghp(str, 12))) {
                throw new SecurityException("The app is not a turn by turn navigation app, therefore it cannot start itself in the car");
            }
            kad.g(yzy.sd, str);
        } else if (Objects.equals(action, "androidx.car.app.action.NAVIGATE")) {
            ((ype) yphVar.l().ai((char) 2810)).u("The intent is a nav intent");
            Uri data = intent.getData();
            if (data == null || !Objects.equals(data.getScheme(), "geo")) {
                throw new InvalidParameterException("Navigation intent has a malformed uri");
            }
            if (gkx.b(data) == null) {
                if (gkx.a(data) == null) {
                    throw new InvalidParameterException("Navigation intent has neither a location nor a query string");
                }
            } else if (data.getEncodedSchemeSpecificPart().contains("daddr=")) {
                throw new InvalidParameterException("Navigation intent has neither latitude,longitude nor a query string");
            }
            ((ype) yphVar.l().ai((char) 2803)).u("The navigation intent has properly formatted data");
            if (intent.getComponent() != null) {
                throw new SecurityException("Navigation intent cannot have a component");
            }
            ((ype) yphVar.l().ai((char) 2804)).u("The navigation intent correctly has no component");
            intent.getClass();
            gks.c("CarApp.H", "Converting from navigation intent to geo specific one %s", intent);
            gkv gkvVar = gkv.a;
            if (!gkv.b(intent)) {
                Log.e("CarApp.H.Tem", "[INVALID] Intent is not in the right input format.");
            }
            gld gldVar = gld.a;
            gks.h("CarApp.H.Tem", "Converting %s to %s, input intent is: %s", gkvVar, gldVar, intent);
            gkvVar.a(gldVar, intent);
            gks.h("CarApp.H.Tem", "Intent transformed, output intent is: %s", intent);
            kad.g(yzy.sc, str);
            ((ype) yphVar.l().ai((char) 2811)).y("Intent converted to legacy format %s", intent);
        } else if (Objects.equals(action, "android.intent.action.DIAL")) {
            ((ype) yphVar.l().ai((char) 2809)).u("The intent is a phone intent");
            b(intent);
            kad.g(yzy.sb, str);
        } else {
            if (!Objects.equals(action, "android.intent.action.CALL")) {
                if (component != null) {
                    throw new SecurityException("Explicitly starting a separate app is not supported");
                }
                throw new InvalidParameterException("The intent is not for a supported action");
            }
            ((ype) yphVar.l().ai((char) 2808)).u("The intent for action call");
            if (mki.a.c.getPackageManager().checkPermission("android.permission.CALL_PHONE", str) != 0) {
                throw new SecurityException("The app does not have required permission \"android.permission.CALL_PHONE\" for ACTION_CALL");
            }
            b(intent);
            kad.g(yzy.sa, str);
        }
        try {
            mpe.a().i(intent);
        } catch (IllegalArgumentException e) {
            gks.f("CarApp.H", e, "No app found to fulfil start intent, don't throw exception back to the app");
            obs.a().f(mki.a.c, mkn.h, R.string.no_app_to_fulfill, 1);
        }
    }

    private static void b(Intent intent) {
        if (!woy.al(intent.getDataString()).startsWith("tel:")) {
            throw new InvalidParameterException("Phone intent data is not properly formatted");
        }
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 2805)).u("The phone intent has properly formatted data");
        if (intent.getComponent() != null) {
            throw new SecurityException("Phone intent cannot have a component");
        }
        ((ype) yphVar.l().ai((char) 2806)).u("The phone intent correctly has no component");
    }
}
