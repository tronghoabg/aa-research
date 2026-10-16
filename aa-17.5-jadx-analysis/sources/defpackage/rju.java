package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class rju {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public rju(Set set) {
        this.b = set;
        this.a = new boolean[256];
        for (int i = 0; i < 256; i++) {
            ((boolean[]) this.a)[i] = this.b.contains(Integer.valueOf(i));
        }
    }

    private static final ajfw C(final int i, boolean z, xxh xxhVar) {
        xxh xxhVarA;
        xxh xxmVar;
        xxh xxhVar2;
        abnp abnpVarN = ajfw.a.n();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        abnpVarN.t();
        ajfw ajfwVar = (ajfw) abnpVarN.b;
        ajfwVar.b |= 1;
        ajfwVar.c = elapsedCpuTime;
        abnpVarN.t();
        ajfw ajfwVar2 = (ajfw) abnpVarN.b;
        ajfwVar2.b |= 2;
        ajfwVar2.d = z;
        int iActiveCount = Thread.activeCount();
        abnpVarN.t();
        ajfw ajfwVar3 = (ajfw) abnpVarN.b;
        ajfwVar3.b |= 4;
        ajfwVar3.e = iActiveCount;
        String str = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(i));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    xxhVarA = xxh.g(randomAccessFile.readLine()).a(new kpi(9));
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        } catch (IOException unused) {
            xxhVarA = xvy.a;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (xxhVarA.f()) {
            int iIntValue = ((Integer) xxhVarA.b()).intValue();
            abnpVarN.t();
            ajfw ajfwVar4 = (ajfw) abnpVarN.b;
            ajfwVar4.b |= 16;
            ajfwVar4.g = iIntValue;
        }
        if (xxhVar.f()) {
            vqt vqtVar = (vqt) xxhVar.b();
            if (vqtVar.a) {
                yfq yfqVarA = vqtVar.a();
                xxj xxjVar = new xxj() { // from class: vqr
                    @Override // defpackage.xxj
                    public final boolean a(Object obj) {
                        return ((ActivityManager.RunningAppProcessInfo) obj).pid == i;
                    }
                };
                Iterator<E> it = yfqVarA.iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        xxmVar = xvy.a;
                        break;
                    }
                    Object next = it.next();
                    if (xxjVar.a(next)) {
                        next.getClass();
                        xxmVar = new xxm(next);
                        break;
                    }
                }
                xxhVar2 = (xxh) xxmVar.a(new kpi(6)).d(xvy.a);
            } else {
                xxhVar2 = xvy.a;
            }
            if (xxhVar2.f()) {
                String strFlattenToString = ((ComponentName) xxhVar2.b()).flattenToString();
                abnpVarN.t();
                ajfw ajfwVar5 = (ajfw) abnpVarN.b;
                strFlattenToString.getClass();
                ajfwVar5.b |= 32;
                ajfwVar5.h = strFlattenToString;
            }
        }
        return (ajfw) abnpVarN.q();
    }

    public static xxh j(Class cls) {
        try {
            return xxh.h((sxt) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException unused) {
            return xvy.a;
        }
    }

    public static /* synthetic */ yfy k() {
        return ylx.a(8, new Object[]{qnl.DO_NOTHING, sye.class, qnl.FILE_DELETION, syh.class, qnl.EXEC_SQL_FIX, syf.class, qnl.SEND_BROADCAST, syj.class, qnl.PROCESS_RESTART, syi.class, qnl.SHARED_PREFERENCES_DELETION, syk.class, qnl.COMPONENT_ENABLED_SETTING_FIX, syd.class, qnl.START_SERVICE, syl.class}, null);
    }

    public final ajfw A() {
        Object obj = this.a;
        int iMyPid = Process.myPid();
        vqt vqtVarD = vqs.d((Context) obj);
        return C(iMyPid, ((nfh) this.b).c(new vdv(vqtVarD, 7)), xxh.g(vqtVarD));
    }

    public final ajfw B(int i, xyc xycVar) {
        return C(i, ((nfh) this.b).c(xycVar), xxh.g((vqt) xycVar.gu()));
    }

    public final int a() throws qrz {
        return ((Integer) ((rox) this.a).b(new rct(this.b, 10))).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @ResultIgnorabilityUnspecified
    public final synchronized Object b(Class cls, rdn rdnVar) throws RemoteException {
        ?? r0 = this.b;
        Object objCast = cls.cast(r0.get(cls));
        if (objCast != null) {
            return objCast;
        }
        Object objA = rdnVar.a();
        r0.put(cls, objA);
        return objA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @ResultIgnorabilityUnspecified
    public final synchronized Object c(Class cls, String str, rdn rdnVar) throws RemoteException {
        Object objCast;
        ?? r0 = this.a;
        Map ywVar = (Map) r0.get(cls);
        if (ywVar != null) {
            objCast = cls.cast(ywVar.get(str));
        } else {
            ywVar = new yw();
            r0.put(cls, ywVar);
            objCast = null;
        }
        if (objCast != null) {
            return objCast;
        }
        Object objA = rdnVar.a();
        ywVar.put(str, objA);
        return objA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Object d(Class cls, xyc xycVar) {
        ?? r0 = this.b;
        Object objCast = cls.cast(r0.get(cls));
        if (objCast != null) {
            return objCast;
        }
        Object objGu = xycVar.gu();
        objGu.getClass();
        r0.put(cls, objGu);
        return objGu;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void e(Class cls) {
        this.b.remove(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void f(Class cls, Consumer consumer) {
        Object objCast = cls.cast(this.b.remove(cls));
        if (objCast != null) {
            consumer.accept(objCast);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void g(Class cls) {
        this.a.remove(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void h(Class cls, Consumer consumer) {
        Map map = (Map) this.a.remove(cls);
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                consumer.accept(cls.cast(it.next()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @ResultIgnorabilityUnspecified
    public final synchronized void i(Class cls, Object obj) {
        ?? r0 = this.b;
        List listSingletonList = Collections.singletonList(obj);
        r0.values().removeAll(listSingletonList);
        ?? r02 = this.a;
        Map map = (Map) r02.get(cls);
        if (map != null) {
            map.values().removeAll(listSingletonList);
            if (map.isEmpty()) {
                r02.remove(cls);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sxs] */
    public final void l(Context context, qnl qnlVar, qnj qnjVar) {
        Log.e("AppDoctor", "Failed on fix: " + qnlVar.a());
        abnp abnpVarN = qnk.a.n();
        String packageName = context.getPackageName();
        abnpVarN.t();
        qnk qnkVar = (qnk) abnpVarN.b;
        packageName.getClass();
        qnkVar.b |= 1;
        qnkVar.c = packageName;
        abnpVarN.t();
        qnk qnkVar2 = (qnk) abnpVarN.b;
        qnkVar2.g = qnjVar.a();
        qnkVar2.b |= 16;
        abnpVarN.t();
        qnk qnkVar3 = (qnk) abnpVarN.b;
        qnkVar3.f = aclh.e(6);
        qnkVar3.b |= 8;
        abnpVarN.t();
        qnk qnkVar4 = (qnk) abnpVarN.b;
        qnkVar4.e = qnlVar.a();
        qnkVar4.b |= 4;
        this.a.a((qnk) abnpVarN.q());
    }

    public final void m(Context context, qoa qoaVar, qnj qnjVar) {
        qnl qnlVarB;
        if (qoaVar != null) {
            qnlVarB = qnl.b(qoaVar.b);
            if (qnlVarB == null) {
                qnlVarB = qnl.UNRECOGNIZED;
            }
        } else {
            qnlVarB = qnl.UNSPECIFIED_FIX;
        }
        l(context, qnlVarB, qnjVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sxs] */
    public final void n(Context context, qnl qnlVar, qnj qnjVar) {
        abnp abnpVarN = qnk.a.n();
        String packageName = context.getPackageName();
        abnpVarN.t();
        qnk qnkVar = (qnk) abnpVarN.b;
        packageName.getClass();
        qnkVar.b |= 1;
        qnkVar.c = packageName;
        abnpVarN.t();
        qnk qnkVar2 = (qnk) abnpVarN.b;
        qnkVar2.g = qnjVar.a();
        qnkVar2.b |= 16;
        abnpVarN.t();
        qnk qnkVar3 = (qnk) abnpVarN.b;
        qnkVar3.f = aclh.e(5);
        qnkVar3.b |= 8;
        abnpVarN.t();
        qnk qnkVar4 = (qnk) abnpVarN.b;
        qnkVar4.e = qnlVar.a();
        qnkVar4.b |= 4;
        this.a.a((qnk) abnpVarN.q());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, sxs] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zgp] */
    public final boolean o(Context context, qnj qnjVar) {
        List<qoa> list;
        qnl qnlVarB;
        if (spu.ay(context)) {
            sxx sxxVar = new sxx();
            sxxVar.b = context;
            sxxVar.a = qnjVar;
            sxxVar.c = this.a;
            sxy sxyVarA = sxxVar.a();
            try {
                sxq sxqVar = new sxq(context);
                try {
                    rjs rjsVar = new rjs(new whk(this, sxqVar, sxyVarA, null));
                    yfy yfyVarK = k();
                    Bundle bundleCall = sxqVar.b.call("get_fixes", null, sxqVar.a());
                    if (bundleCall == null) {
                        Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                        int i = yfq.d;
                        list = yls.a;
                    } else {
                        byte[] byteArray = bundleCall.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                        if (byteArray == null) {
                            Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                            int i2 = yfq.d;
                            list = yls.a;
                        } else {
                            try {
                                abnv abnvVarD = abnv.D(qob.a, byteArray, 0, byteArray.length, abnj.a);
                                abnv.U(abnvVarD);
                                list = ((qob) abnvVarD).b;
                            } catch (abon e) {
                                Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                                int i3 = yfq.d;
                                list = yls.a;
                            }
                        }
                    }
                    for (qoa qoaVar : list) {
                        qnl qnlVarB2 = qnl.b(qoaVar.b);
                        if (qnlVarB2 == null) {
                            qnlVarB2 = qnl.UNRECOGNIZED;
                        }
                        if (yfyVarK.containsKey(qnlVarB2)) {
                            qnl qnlVarB3 = qnl.b(qoaVar.b);
                            if (qnlVarB3 == null) {
                                qnlVarB3 = qnl.UNRECOGNIZED;
                            }
                            xxh xxhVarJ = j((Class) yfyVarK.get(qnlVarB3));
                            if (xxhVarJ.f()) {
                                String str = qoaVar.d;
                                qnl qnlVarB4 = qnl.b(qoaVar.b);
                                if (qnlVarB4 == null) {
                                    qnlVarB4 = qnl.UNRECOGNIZED;
                                }
                                qnz qnzVar = qoaVar.c;
                                if (qnzVar == null) {
                                    qnzVar = qnz.a;
                                }
                                sxt sxtVar = (sxt) xxhVarJ.b();
                                rjsVar.f(new sxw(str, qnlVarB4, qnzVar, sxtVar, sxw.a));
                            } else {
                                m(sxyVarA.b, qoaVar, sxyVarA.a);
                            }
                        } else {
                            Context context2 = sxyVarA.b;
                            qnj qnjVar2 = sxyVarA.a;
                            if (qoaVar != null) {
                                qnlVarB = qnl.b(qoaVar.b);
                                if (qnlVarB == null) {
                                    qnlVarB = qnl.UNRECOGNIZED;
                                }
                            } else {
                                qnlVarB = qnl.UNSPECIFIED_FIX;
                            }
                            n(context2, qnlVarB, qnjVar2);
                        }
                    }
                    admq admqVarG = rjsVar.g(sxyVarA);
                    try {
                        admqVarG.b.get();
                        boolean z = admqVarG.a;
                        sxqVar.close();
                        return z;
                    } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                        m(context, qoa.a, qnjVar);
                        sxqVar.close();
                    }
                } finally {
                }
            } catch (RemoteException | RuntimeException unused2) {
                m(context, qoa.a, qnjVar);
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void p(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        ?? r0 = this.a;
        synchronized (r0) {
            map = new HashMap((Map) r0);
        }
        ?? r3 = this.b;
        synchronized (r3) {
            map2 = new HashMap((Map) r3);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).h(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((nok) entry2.getKey()).d(new skw(status));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, xuk] */
    @pib
    public final xuj q(@pic String str, xue xueVar) {
        str.getClass();
        xue xueVarD = xue.d((xue) this.a.a(), xueVar);
        xueVarD.getClass();
        nrd nrdVarF = xts.f();
        ?? r6 = nrdVarF.c;
        xuk xtwVar = (r6 == 0 || r6 == xtz.a) ? new xtw(str, xtw.a, xtw.b, xueVarD, nrdVarF) : r6.m(str, xueVarD, nrdVarF);
        xts.c(xtwVar);
        return new xuj(new xua(xtwVar, r6 == xtz.a));
    }

    public final wcj r(String str, double d) {
        return new wbx((String) this.b, str, (wcr) this.a, d);
    }

    public final wcj s(String str, long j) {
        return new wbz((String) this.b, str, (wcr) this.a, j);
    }

    public final wcj t(String str, String str2) {
        return new wcb((String) this.b, str, (wcr) this.a, str2);
    }

    public final wcj u(String str, boolean z) {
        return new wbt((String) this.b, str, (wcr) this.a, z);
    }

    public final wcj v(String str, wbs wbsVar, String str2) {
        return new wbv((String) this.b, str, (wcr) this.a, wbsVar, str2);
    }

    public final void w(String str, String str2, abms abmsVar) {
        abnp abnpVarN = abzo.a.n();
        abnpVarN.t();
        abzo abzoVar = (abzo) abnpVarN.b;
        abzoVar.b |= 1;
        abzoVar.e = str.concat(String.valueOf(str2));
        abnpVarN.t();
        abzo abzoVar2 = (abzo) abnpVarN.b;
        abzoVar2.c = 32;
        abzoVar2.d = abmsVar;
        ((nsy) this.a).e(abnpVarN);
    }

    public final void x(String str, Number number) {
        Object obj = this.a;
        if ((number instanceof Float) || (number instanceof Double)) {
            double dDoubleValue = number.doubleValue();
            abnp abnpVarN = abzo.a.n();
            abnpVarN.t();
            abzo abzoVar = (abzo) abnpVarN.b;
            abzoVar.b |= 1;
            abzoVar.e = str;
            abnpVarN.t();
            abzo abzoVar2 = (abzo) abnpVarN.b;
            abzoVar2.c = 11;
            abzoVar2.d = Double.valueOf(dDoubleValue);
            ((nsy) obj).e(abnpVarN);
            return;
        }
        long jLongValue = number.longValue();
        abnp abnpVarN2 = abzo.a.n();
        abnpVarN2.t();
        abzo abzoVar3 = (abzo) abnpVarN2.b;
        abzoVar3.b |= 1;
        abzoVar3.e = str;
        abnpVarN2.t();
        abzo abzoVar4 = (abzo) abnpVarN2.b;
        abzoVar4.c = 14;
        abzoVar4.d = Long.valueOf(jLongValue);
        ((nsy) obj).e(abnpVarN2);
    }

    public final void y(String str, String str2, Number number) {
        x(String.valueOf(str).concat(String.valueOf(str2)), number);
    }

    public final void z(String str, Number number) {
        y(str, (String) this.b, number);
    }

    public rju(String str, Object obj) {
        this.b = str;
        this.a = obj;
    }

    public rju(nfh nfhVar, Context context) {
        this.b = nfhVar;
        this.a = context;
    }

    public rju(ypp yppVar, ypo ypoVar) {
        this.a = yppVar;
        this.b = ypoVar;
    }

    public rju() {
        this.b = new yw();
        this.a = new yw();
    }

    public rju(nsy nsyVar, String str, boolean z) {
        this.a = nsyVar;
        String strReplaceAll = "";
        if (str != null && z) {
            strReplaceAll = vzk.a.matcher(str).replaceAll("");
        }
        this.b = strReplaceAll;
    }

    public rju(byte[] bArr) {
        sya syaVar = new sya();
        this.b = new ygp();
        this.a = syaVar;
    }

    public rju(byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public rju(rju rjuVar) {
        this.a = rjuVar.a;
        this.b = ((ygp) rjuVar.b).g();
    }

    public rju(Context context) {
        this.b = new wfg();
        aclh.o(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public rju(rkm rkmVar) {
        this.a = new rox(new nxt(3));
        this.b = rkmVar;
    }

    public rju(List list) {
        this.b = new ConcurrentSkipListSet();
        this.a = ygr.n(list);
    }

    public rju(Set set, byte[] bArr) {
        xue xueVarC = xue.c(set);
        xueVarC.getClass();
        this.b = xueVarC;
        this.a = new uxu(this, 4);
    }

    public rju(Class cls, Object obj) {
        this.a = cls;
        this.b = obj;
    }
}
