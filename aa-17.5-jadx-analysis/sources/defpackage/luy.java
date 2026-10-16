package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.provider.Telephony;
import android.telephony.SmsManager;
import java.util.Map;

/* loaded from: classes2.dex */
public final class luy implements lux {
    private final Context a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public luy(Context context) {
        this.a = context;
    }

    private final void d(String str, String str2) {
        lxr.e();
        lxr.h(yzz.MESSAGING_APP, yzy.mT, str2);
        this.b.post(new kzu(str2, str, 9, null));
    }

    private final void e() {
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.a);
        this.b.post(new lqj(defaultSmsPackage, 7));
        lxr.e();
        lxr.h(yzz.MESSAGING_APP, yzy.mX, defaultSmsPackage);
    }

    private final void f(String str, String str2, String str3) {
        lxr.e();
        lxr.h(yzz.MESSAGING_APP, yzy.mU, str2);
        this.b.post(new kzu(str, str3, 8, null));
    }

    private final void g(String str, String str2) {
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.a);
        Map map = lva.h().b;
        woy.S(map.containsKey(str), "SMS conversation does not exist for ID: %s", str);
        Object obj = ((ids) map.get(str)).b;
        lxr.e();
        lxr.h(yzz.MESSAGING_APP, yzy.mY, defaultSmsPackage);
        SmsManager.getDefault().sendTextMessage((String) obj, null, str2, null, null);
        Map map2 = lva.h().b;
        woy.S(map2.containsKey(str), "SMS conversation does not exist for ID: %s", str);
        ((ids) map2.get(str)).a = true;
    }

    private static final String h(Intent intent) {
        lvd.c();
        return lvd.f(intent);
    }

    private static final boolean i(luj lujVar) {
        return lup.e().j(kio.b().e(), lujVar.a);
    }

    private static final void j(lug lugVar, String str) {
        luw luwVarB = luv.a().b(str, mqa.b);
        luf lufVar = new luf();
        lufVar.b(lugVar.a);
        lufVar.f(lugVar.b);
        lufVar.e(lugVar.d);
        lufVar.d(true);
        lufVar.c(lugVar.g);
        lufVar.b = lugVar.e;
        luwVarB.g(lufVar.a());
    }

    @Override // defpackage.lux
    public final void a(luj lujVar, lug lugVar) {
        if (i(lujVar)) {
            e();
        } else {
            d(lugVar.a, lujVar.a.getPackageName());
        }
        j(lugVar, lujVar.a.getPackageName());
    }

    @Override // defpackage.lux
    public final void b(luj lujVar, lug lugVar, String str) {
        if (i(lujVar)) {
            g(lugVar.a, str);
        } else {
            f(lugVar.a, lujVar.a.getPackageName(), str);
        }
        j(lugVar, lujVar.a.getPackageName());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // defpackage.lux
    public final boolean c(String str, Intent intent) {
        switch (str.hashCode()) {
            case -324516576:
                if (str.equals("com.google.android.gearhead.messaging.app.MARK_AS_READ")) {
                    String strH = h(intent);
                    lvd.c();
                    d(strH, lvd.e(intent));
                    break;
                }
                break;
            case 336292819:
                if (str.equals("com.google.android.gearhead.messaging.sms.REPLY")) {
                    String strH2 = h(intent);
                    lvd.c();
                    g(strH2, lvd.g(intent));
                    break;
                }
                break;
            case 1076654747:
                if (str.equals("com.google.android.gearhead.messaging.app.REPLY")) {
                    String strH3 = h(intent);
                    lvd.c();
                    String strE = lvd.e(intent);
                    lvd.c();
                    f(strH3, strE, lvd.g(intent));
                    break;
                }
                break;
            case 1626406120:
                if (str.equals("com.google.android.gearhead.messaging.sms.MARK_AS_READ")) {
                    e();
                    break;
                }
                break;
        }
        return true;
    }
}
