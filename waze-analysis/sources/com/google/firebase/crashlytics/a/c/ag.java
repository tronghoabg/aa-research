package com.google.firebase.crashlytics.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.a.e.bb;
import com.google.firebase.crashlytics.a.e.bd;
import com.google.firebase.crashlytics.a.e.be;
import com.google.firebase.crashlytics.a.e.bf;
import com.google.firebase.crashlytics.a.e.bj;
import com.google.firebase.crashlytics.a.e.bm;
import com.google.firebase.crashlytics.a.e.bn;
import com.google.firebase.crashlytics.a.e.bp;
import com.google.firebase.crashlytics.a.e.bq;
import com.google.firebase.crashlytics.a.e.bs;
import com.google.firebase.crashlytics.a.e.bt;
import com.google.firebase.crashlytics.a.e.bu;
import com.google.firebase.crashlytics.a.e.bv;
import com.google.firebase.crashlytics.a.e.bw;
import com.google.firebase.crashlytics.a.e.bx;
import com.google.firebase.crashlytics.a.e.by;
import com.google.firebase.crashlytics.a.e.ca;
import com.google.firebase.crashlytics.a.e.cd;
import com.google.firebase.crashlytics.a.e.cf;
import com.google.firebase.crashlytics.a.e.cg;
import com.google.firebase.crashlytics.a.e.ch;
import com.google.firebase.crashlytics.a.e.co;
import com.google.firebase.crashlytics.a.e.cp;
import com.google.firebase.crashlytics.a.e.ct;
import com.google.firebase.crashlytics.a.e.cu;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    static final String f9105a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f9106b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9107c;

    /* renamed from: d, reason: collision with root package name */
    private final aq f9108d;

    /* renamed from: e, reason: collision with root package name */
    private final a f9109e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.i.c f9110f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.h.f f9111g;

    static {
        HashMap map = new HashMap();
        f9106b = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f9105a = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.0.4_1p");
    }

    public ag(Context context, aq aqVar, a aVar, com.google.firebase.crashlytics.a.i.c cVar, com.google.firebase.crashlytics.a.h.f fVar) {
        this.f9107c = context;
        this.f9108d = aqVar;
        this.f9109e = aVar;
        this.f9110f = cVar;
        this.f9111g = fVar;
    }

    private final ch d(int i2) {
        Context context = this.f9107c;
        c cVarB = c.b(context);
        Float fC = cVarB.c();
        Double dValueOf = fC != null ? Double.valueOf(fC.doubleValue()) : null;
        int iA = cVarB.a();
        boolean z = false;
        if (!g.l() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        long jC = g.c(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j2 = jC - memoryInfo.availMem;
        if (j2 <= 0) {
            j2 = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = statFs.getBlockCount();
        long availableBlocks = statFs.getAvailableBlocks();
        cg cgVar = new cg();
        cgVar.b(dValueOf);
        cgVar.c(iA);
        cgVar.f(z);
        cgVar.e(i2);
        cgVar.g(j2);
        cgVar.d((blockCount * blockSize) - (blockSize * availableBlocks));
        return cgVar.a();
    }

    private final List e() {
        bq bqVar = new bq();
        bqVar.b(0L);
        bqVar.d(0L);
        a aVar = this.f9109e;
        bqVar.c(aVar.f9069e);
        bqVar.f(aVar.f9066b);
        return Collections.singletonList(bqVar.a());
    }

    private final bu f(com.google.firebase.crashlytics.a.i.d dVar, int i2) {
        String str = dVar.f9771b;
        String str2 = dVar.f9770a;
        StackTraceElement[] stackTraceElementArr = dVar.f9772c;
        int i3 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.crashlytics.a.i.d dVar2 = dVar.f9773d;
        if (i2 >= 8) {
            for (com.google.firebase.crashlytics.a.i.d dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.f9773d) {
                i3++;
            }
        }
        bt btVar = new bt();
        btVar.f(str);
        btVar.e(str2);
        btVar.c(g(stackTraceElementArr, 4));
        btVar.d(i3);
        if (dVar2 != null && i3 == 0) {
            btVar.b(f(dVar2, i2 + 1));
        }
        return btVar.a();
    }

    private static final List g(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            by byVar = new by();
            byVar.c(i2);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            byVar.e(jMax);
            byVar.f(str);
            byVar.b(fileName);
            byVar.d(lineNumber);
            arrayList.add(byVar.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static final bw h() {
        bv bvVar = new bv();
        bvVar.d("0");
        bvVar.c("0");
        bvVar.b(0L);
        return bvVar.a();
    }

    private static final ca i(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        bx bxVar = new bx();
        bxVar.d(thread.getName());
        bxVar.c(i2);
        bxVar.b(g(stackTraceElementArr, i2));
        return bxVar.a();
    }

    public final co a(be beVar) {
        int i2 = this.f9107c.getResources().getConfiguration().orientation;
        cf cfVar = new cf();
        cfVar.g("anr");
        cfVar.f(beVar.f());
        List listUnmodifiableList = null;
        if (this.f9111g.c().f9741b.f9738c) {
            List<com.google.android.libraries.phenotype.client.stable.j> list = this.f9109e.f9067c;
            if (list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.libraries.phenotype.client.stable.j jVar : list) {
                    bb bbVar = new bb();
                    bbVar.d(jVar.h());
                    bbVar.b(jVar.f());
                    bbVar.c(jVar.g());
                    arrayList.add(bbVar.a());
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            }
        }
        bd bdVar = new bd();
        bdVar.c(beVar.a());
        bdVar.e(beVar.g());
        bdVar.g(beVar.c());
        bdVar.i(beVar.f());
        bdVar.d(beVar.b());
        bdVar.f(beVar.d());
        bdVar.h(beVar.e());
        bdVar.j(beVar.h());
        bdVar.b(listUnmodifiableList);
        be beVarA = bdVar.a();
        boolean z = beVarA.a() != 100;
        bp bpVar = new bp();
        bpVar.c(Boolean.valueOf(z));
        String strG = beVarA.g();
        int iB = beVarA.b();
        int iA = beVarA.a();
        h.g.b.x.f(strG, "processName");
        bpVar.d(com.google.firebase.crashlytics.a.k.a(strG, iB, iA, 8));
        bpVar.h(i2);
        bs bsVar = new bs();
        bsVar.b(beVarA);
        bsVar.e(h());
        bsVar.c(e());
        bpVar.f(bsVar.a());
        cfVar.b(bpVar.a());
        cfVar.c(d(i2));
        return cfVar.a();
    }

    public final cu b(String str, long j2) {
        Integer num;
        int i2 = cu.f9544a;
        bf bfVar = new bf();
        bfVar.l("19.0.4_1p");
        a aVar = this.f9109e;
        bfVar.h(aVar.f9065a);
        aq aqVar = this.f9108d;
        bfVar.i(aqVar.b().b());
        bfVar.g(aqVar.b().d());
        bfVar.f(aqVar.b().c());
        String str2 = aVar.f9070f;
        bfVar.d(str2);
        String str3 = aVar.f9071g;
        bfVar.e(str3);
        bfVar.k(4);
        bm bmVarM = ct.m();
        bmVarM.l(j2);
        bmVarM.n(str);
        bmVarM.h(f9105a);
        bj bjVar = new bj();
        bjVar.e(aqVar.d());
        bjVar.g(str2);
        bjVar.d(str3);
        bjVar.f(aqVar.b().b());
        com.google.firebase.crashlytics.a.h hVar = aVar.f9072h;
        bjVar.b(hVar.b());
        bjVar.c(hVar.c());
        bmVarM.b(bjVar.a());
        cp cpVar = new cp();
        cpVar.d(3);
        cpVar.e(Build.VERSION.RELEASE);
        cpVar.b(Build.VERSION.CODENAME);
        cpVar.c(g.m());
        bmVarM.k(cpVar.a());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str4 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) f9106b.get(str4.toLowerCase(Locale.US))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jC = g.c(this.f9107c);
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        boolean zL = g.l();
        int iA = g.a();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.PRODUCT;
        bn bnVar = new bn();
        bnVar.b(iIntValue);
        bnVar.f(Build.MODEL);
        bnVar.c(iAvailableProcessors);
        bnVar.h(jC);
        bnVar.d(blockCount * blockSize);
        bnVar.i(zL);
        bnVar.j(iA);
        bnVar.e(str5);
        bnVar.g(str6);
        bmVarM.e(bnVar.a());
        bmVarM.i(3);
        bfVar.m(bmVarM.a());
        return bfVar.a();
    }

    public final co c(Throwable th, Thread thread, String str, long j2, boolean z) {
        Context context = this.f9107c;
        int i2 = context.getResources().getConfiguration().orientation;
        com.google.firebase.crashlytics.a.i.c cVar = this.f9110f;
        com.google.firebase.crashlytics.a.i.d dVarA = com.google.firebase.crashlytics.a.i.d.a(th, cVar);
        cf cfVar = new cf();
        cfVar.g(str);
        cfVar.f(j2);
        cd cdVarC = com.google.firebase.crashlytics.a.k.c(context);
        Boolean boolValueOf = cdVarC.a() > 0 ? Boolean.valueOf(cdVarC.a() != 100) : null;
        bp bpVar = new bp();
        bpVar.c(boolValueOf);
        bpVar.d(cdVarC);
        bpVar.b(com.google.firebase.crashlytics.a.k.b(context));
        bpVar.h(i2);
        bs bsVar = new bs();
        ArrayList arrayList = new ArrayList();
        arrayList.add(i(thread, dVarA.f9772c, 4));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(i(key, cVar.a(entry.getValue()), 0));
                }
            }
        }
        bsVar.f(DesugarCollections.unmodifiableList(arrayList));
        bsVar.d(f(dVarA, 0));
        bsVar.e(h());
        bsVar.c(e());
        bpVar.f(bsVar.a());
        cfVar.b(bpVar.a());
        cfVar.c(d(i2));
        return cfVar.a();
    }
}
