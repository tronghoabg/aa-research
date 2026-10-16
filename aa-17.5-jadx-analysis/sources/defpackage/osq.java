package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import java.util.Map;

/* loaded from: classes.dex */
public class osq {
    private static volatile admf a;
    public static volatile adnl b;
    private static volatile admf c;
    private static volatile admf d;
    private static volatile admf e;
    private static volatile admf f;
    private static volatile admf g;
    private static volatile admf h;
    private static volatile admf i;
    private static volatile admf j;
    private static volatile admf k;
    private static volatile admf l;
    private static volatile admf m;
    private static volatile admf n;
    private static volatile admf o;
    private static volatile admf p;

    private osq() {
    }

    public static void A(MenuItem menuItem) {
        if (TextUtils.isEmpty(menuItem.c)) {
            Log.w("CSL.MenuItem", "MenuItem title should be non-empty");
        }
        int i2 = menuItem.a;
        if (i2 != 1 && menuItem.m) {
            throw new IllegalArgumentException("MenuItem is not a checkbox type but is checked");
        }
        if (i2 != 3 && menuItem.n != null) {
            throw new IllegalArgumentException("The menu is not a special view, but has remote views");
        }
        if ((menuItem.g != null ? 1 : 0) + (menuItem.e != 0 ? 1 : 0) + (menuItem.h != null ? 1 : 0) > 1) {
            throw new IllegalArgumentException("Cannot set multiple icon types.");
        }
        if (menuItem.i != 0 && i2 != 0) {
            throw new IllegalArgumentException("Cannot set right icon on non ITEM types.");
        }
    }

    public static /* synthetic */ orv B(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (orv) abnvVarQ;
    }

    public static /* synthetic */ osu C(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (osu) abnvVarQ;
    }

    public static void D(orv orvVar, abnp abnpVar) {
        abnpVar.t();
        orp orpVar = (orp) abnpVar.b;
        orp orpVar2 = orp.a;
        orpVar.h = orvVar;
        orpVar.b |= 32;
    }

    public static /* synthetic */ String E(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "DO_NOT_USE" : "USE_FOR_WPP" : "USE_FOR_GAL";
    }

    public static /* synthetic */ String F(Object[] objArr, Class cls) {
        String[] strArrSplit = "timeSinceStart".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append("[");
        int i2 = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i2]);
            sb.append("=");
            sb.append(objArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static /* synthetic */ String G(Object[] objArr, Class cls) {
        String[] strArrSplit = "connection".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append("[");
        int i2 = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i2]);
            sb.append("=");
            sb.append(objArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static /* synthetic */ boolean H(pej pejVar, Object[] objArr) {
        Object obj;
        Object obj2 = objArr[0];
        if (obj2 == null) {
            try {
                obj = pei.valueOf("INSTANCE");
            } catch (Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = new Object();
            }
            obj2 = obj;
            objArr[0] = obj2;
        }
        return pejVar == obj2;
    }

    public static /* synthetic */ boolean I(pej pejVar, Object[] objArr) {
        Object obj;
        Object obj2 = objArr[2];
        if (obj2 == null) {
            try {
                obj = peh.valueOf("INSTANCE");
            } catch (Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = new Object();
            }
            obj2 = obj;
            objArr[2] = obj2;
        }
        return pejVar == obj2;
    }

    public static /* synthetic */ boolean J(pej pejVar, Object[] objArr) {
        Object obj;
        Object obj2 = objArr[1];
        if (obj2 == null) {
            try {
                obj = peg.valueOf("INSTANCE");
            } catch (Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = new Object();
            }
            obj2 = obj;
            objArr[1] = obj2;
        }
        return pejVar == obj2;
    }

    public static /* synthetic */ pbn K(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (pbn) abnvVarQ;
    }

    public static /* synthetic */ abqk L(abnp abnpVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pbn) abnpVar.b).d));
        mapUnmodifiableMap.getClass();
        return new abqk(mapUnmodifiableMap);
    }

    public static ozy O(pbm pbmVar) {
        String str = pbmVar.c;
        str.getClass();
        String str2 = pbmVar.e;
        str2.getClass();
        String str3 = pbmVar.d;
        str3.getClass();
        xpv xpvVarB = xpv.b(pbmVar.f);
        if (xpvVarB == null) {
            xpvVarB = xpv.UNKNOWN_SECURITY_MODE;
        }
        abod abodVar = pbmVar.g;
        abodVar.getClass();
        return new ozy(str, str2, str3, xpvVarB, woy.cf(abodVar));
    }

    @ResultIgnorabilityUnspecified
    public static oxm P(oxn oxnVar) {
        return (oxm) oxnVar.a(oxm.class);
    }

    public static int Q(Notification notification) {
        Bundle bundle;
        Bundle bundle2 = notification.extras;
        return (bundle2 == null || (bundle = bundle2.getBundle("android.car.EXTENSIONS")) == null || bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 1) != 0) ? 1 : 0;
    }

    public static boolean R(owh owhVar, Context context, Resources resources) {
        owh owhVar2 = owh.SUPPORTS_WINDOW_INSETS;
        String str = owhVar.d;
        int identifier = resources.getIdentifier(str, "bool", context.getPackageName());
        if (identifier != 0) {
            return resources.getBoolean(identifier);
        }
        Boolean bool = owhVar.e;
        if (bool == null) {
            throw new Resources.NotFoundException("Can't find resource: @bool/".concat(String.valueOf(str)));
        }
        bool.booleanValue();
        return false;
    }

    public static admf g() {
        admf admfVarA;
        admf admfVar = d;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = d;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "AssistantSessionEnded");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                d = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf h() {
        admf admfVarA;
        admf admfVar = e;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = e;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "AssistantSessionResult");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(orx.a);
                admfVarA = xhVarC.a();
                e = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf i() {
        admf admfVarA;
        admf admfVar = o;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = o;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GeminiStateUpdate");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                o = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf j() {
        admf admfVarA;
        admf admfVar = p;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = p;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetCarActions");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osp.a);
                admfVarA = xhVarC.a();
                p = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf k() {
        admf admfVarA;
        admf admfVar = n;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = n;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetCarProperties");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(ost.a);
                admfVarA = xhVarC.a();
                n = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf l() {
        admf admfVarA;
        admf admfVar = i;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = i;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetDirectActions");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(otb.a);
                admfVarA = xhVarC.a();
                i = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf m() {
        admf admfVarA;
        admf admfVar = c;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = c;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "GetSessionData");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(oss.a);
                admfVarA = xhVarC.a();
                c = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf n() {
        admf admfVarA;
        admf admfVar = k;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = k;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "ModifySettings");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                k = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf o() {
        admf admfVarA;
        admf admfVar = m;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = m;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PerformCarControl");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(ote.a);
                admfVarA = xhVarC.a();
                m = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf p() {
        admf admfVarA;
        admf admfVar = j;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = j;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PerformDirectAction");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(otf.a);
                admfVarA = xhVarC.a();
                j = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf q() {
        admf admfVarA;
        admf admfVar = g;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = g;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PostAssistantSuggestions");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                g = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf r() {
        admf admfVarA;
        admf admfVar = h;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = h;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "PostMediaRecommendations");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                h = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf s() {
        admf admfVarA;
        admf admfVar = a;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = a;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "RequestAssistantSession");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                a = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf t() {
        admf admfVarA;
        admf admfVar = f;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = f;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "SendTranscriptionSessionEvent");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                f = admfVarA;
            }
        }
        return admfVarA;
    }

    public static admf u() {
        admf admfVarA;
        admf admfVar = l;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (osq.class) {
            admfVarA = l;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "VoiceSessionTypeUpdate");
                xhVarC.b();
                osn osnVar = osn.a;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(osnVar);
                xhVarC.c = new aect(osu.a);
                admfVarA = xhVarC.a();
                l = admfVarA;
            }
        }
        return admfVarA;
    }

    public static /* synthetic */ String v(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "PRIORITY_MAX" : "PRIORITY_HIGH" : "PRIORITY_DEFAULT" : "PRIORITY_LOW" : "PRIORITY_MIN" : "PRIORITY_UNSPECIFIED";
    }

    public static /* synthetic */ osa w(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (osa) abnvVarQ;
    }

    public static /* synthetic */ void x(Iterable iterable, abnp abnpVar) {
        abnpVar.t();
        osa osaVar = (osa) abnpVar.b;
        osa osaVar2 = osa.a;
        aboh abohVar = osaVar.f;
        if (!abohVar.c()) {
            osaVar.f = abnv.I(abohVar);
        }
        abmc.i(iterable, osaVar.f);
    }

    public static void y(int i2, abnp abnpVar) {
        abnpVar.t();
        osa osaVar = (osa) abnpVar.b;
        osa osaVar2 = osa.a;
        osaVar.c = i2 - 1;
        osaVar.b |= 1;
    }

    public static void z(abnp abnpVar) {
        DesugarCollections.unmodifiableList(((osa) abnpVar.b).f).getClass();
    }

    public osq(byte[] bArr) {
    }

    public void c() {
    }

    public void d() {
    }

    public void e(int i2) {
    }

    public void f(int i2) {
    }

    public void a(RecyclerView recyclerView, int i2) {
    }

    public void b(RecyclerView recyclerView, int i2, int i3) {
    }
}
