package defpackage;

import android.os.UserHandle;
import android.service.notification.StatusBarNotification;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mab implements max {
    public static final lzz a = new lzz();
    public static final afgl b = new lcj(mki.b, 14);
    private static final yph c = yph.c("GH.NaviSBNProcessor");
    private final ohe e = new ohe();
    private final HashMap d = new HashMap();

    public static final mab c() {
        return (mab) b.getValue(a, lzz.a[0]);
    }

    private static final long e(StatusBarNotification statusBarNotification) {
        String tag = statusBarNotification.getTag();
        int id = statusBarNotification.getId();
        String packageName = statusBarNotification.getPackageName();
        UserHandle user = statusBarNotification.getUser();
        return (tag + id + packageName + user).hashCode();
    }

    private static final String f(StatusBarNotification statusBarNotification) {
        return 1 != osq.Q(statusBarNotification.getNotification()) ? "NAV_NOTIFICATION_HERO" : "NAV_NOTIFICATION_NORMAL";
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022d  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.max
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean a(android.service.notification.StatusBarNotification r27, int r28, boolean r29) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mab.a(android.service.notification.StatusBarNotification, int, boolean):boolean");
    }

    @Override // defpackage.max
    public final boolean b(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        long jE = e(statusBarNotification);
        Long lValueOf = Long.valueOf(jE);
        HashMap map = this.d;
        if (!map.containsKey(lValueOf)) {
            return false;
        }
        Object obj = map.get(lValueOf);
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        maa maaVar = (maa) obj;
        yop yopVarL = c.l();
        String str = maaVar.a;
        String str2 = maaVar.b;
        yopVarL.R("Cancelling navigation notification: %s %s %s", lValueOf, str, str2);
        nuj.b().g(str, jE, str2);
        map.remove(lValueOf);
        ohe oheVar = this.e;
        ((HashMap) oheVar.a).remove(Integer.valueOf(statusBarNotification.getId()));
        return true;
    }

    public final void d() {
        c.l().u("Cancelling all navigation notifications");
        HashMap map = this.d;
        for (Object obj : map.entrySet()) {
            obj.getClass();
            Map.Entry entry = (Map.Entry) obj;
            nuj nujVarB = nuj.b();
            String str = ((maa) entry.getValue()).a;
            Object key = entry.getKey();
            key.getClass();
            nujVarB.g(str, ((Number) key).longValue(), ((maa) entry.getValue()).b);
        }
        map.clear();
        ((HashMap) this.e.a).clear();
    }
}
