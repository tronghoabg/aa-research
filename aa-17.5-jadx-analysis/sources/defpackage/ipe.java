package defpackage;

import android.companion.virtual.VirtualDeviceManager;
import android.content.ComponentName;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ipe implements VirtualDeviceManager.ActivityListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ Object a;
    private final /* synthetic */ int c;

    public ipe(Object obj, int i) {
        this.c = i;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[Catch: Exception -> 0x0135, TryCatch #2 {Exception -> 0x0135, blocks: (B:19:0x007a, B:21:0x008e, B:24:0x00a4, B:26:0x00b2, B:32:0x00db, B:33:0x00e9, B:34:0x00ec, B:46:0x0131, B:42:0x00fb, B:43:0x010d, B:44:0x011f, B:28:0x00bd, B:29:0x00cb), top: B:67:0x007a, inners: #5, #6, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9 A[Catch: Exception -> 0x0135, TRY_LEAVE, TryCatch #2 {Exception -> 0x0135, blocks: (B:19:0x007a, B:21:0x008e, B:24:0x00a4, B:26:0x00b2, B:32:0x00db, B:33:0x00e9, B:34:0x00ec, B:46:0x0131, B:42:0x00fb, B:43:0x010d, B:44:0x011f, B:28:0x00bd, B:29:0x00cb), top: B:67:0x007a, inners: #5, #6, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityLaunchBlocked(int r18, android.content.ComponentName r19, android.os.UserHandle r20, android.content.IntentSender r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, android.os.RemoteException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipe.onActivityLaunchBlocked(int, android.content.ComponentName, android.os.UserHandle, android.content.IntentSender):void");
    }

    public final void onDisplayEmpty(int i) {
        Integer numValueOf;
        int i2 = this.c;
        if (i2 == 0) {
            ((ype) ipf.a.f()).R("Listener for %s - %s empty display: %s", ((ipf) this.a).b, this, Integer.valueOf(i));
            return;
        }
        if (i2 == 1) {
            ((ype) ipd.a.f()).R("Listener for black hole %s - %s empty display: %s", ((usw) this.a).c, this, Integer.valueOf(i));
            return;
        }
        ype ypeVar = (ype) ipn.a.f();
        Integer numValueOf2 = Integer.valueOf(i);
        Object obj = this.a;
        ypeVar.R("Listener for %s - %s empty display: %s", ((ipn) obj).i, this, numValueOf2);
        synchronized (obj) {
            iph iphVar = ((ipn) obj).f;
            numValueOf = iphVar != null ? Integer.valueOf(iphVar.c().getDisplayId()) : null;
        }
        if (numValueOf == null || numValueOf.intValue() != i) {
            ipn.a.l().u("Wrong display empty, ignoring");
        } else {
            ((ype) ipn.a.f()).u("Display empty, alerting listener");
            rbe.h(new ilp(this.a, 11));
        }
    }

    public final void onTopActivityChanged(int i, ComponentName componentName) {
        int i2 = this.c;
        if (i2 == 0) {
            componentName.getClass();
            ipf.a.l().S("Listener for %s - %s onTopActivityChanged to %s for display: %s", ((ipf) this.a).b, this, componentName, Integer.valueOf(i));
            return;
        }
        if (i2 == 1) {
            componentName.getClass();
            ipd.a.l().S("Listener for black hole %s - %s onTopActivityChanged to %s for display: %s", ((usw) this.a).c, this, componentName, Integer.valueOf(i));
            return;
        }
        componentName.getClass();
        yop yopVarL = ipn.a.l();
        ipn ipnVar = (ipn) this.a;
        yopVarL.S("Listener for %s - %s onTopActivityChanged to %s for display: %s", ipnVar.i, this, componentName, Integer.valueOf(i));
        String packageName = componentName.getPackageName();
        ComponentName componentName2 = ipnVar.e;
        if (TextUtils.equals(packageName, componentName2.getPackageName())) {
            return;
        }
        rpz rpzVarA = rpz.a(((ina) ipnVar.d).l);
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.PARKED_APP, yzy.LP);
        rrbVarH.p(componentName2);
        rrbVarH.d(componentName);
        rpzVarA.c(rrbVarH.l());
    }
}
