package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.List;

/* loaded from: classes2.dex */
public final class flo extends fjv {
    public static final Object a;
    private static flo l;
    private static flo m;
    public Context b;
    public fiy c;
    public WorkDatabase d;
    public List e;
    public fkm f;
    public boolean g = false;
    public BroadcastReceiver.PendingResult h;
    public gjv i;
    public final kzt j;
    public ajdr k;
    private final aitx n;

    static {
        fjo.b("WorkManagerImpl");
        l = null;
        m = null;
        a = new Object();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public flo(Context context, final fiy fiyVar, ajdr ajdrVar, WorkDatabase workDatabase, final List list, fkm fkmVar, kzt kztVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        fjo fjoVar = new fjo(4);
        synchronized (fjo.a) {
            if (fjo.b == null) {
                fjo.b = fjoVar;
            }
        }
        this.b = applicationContext;
        this.k = ajdrVar;
        this.d = workDatabase;
        this.f = fkmVar;
        this.j = kztVar;
        this.c = fiyVar;
        this.e = list;
        ?? r10 = ajdrVar.a;
        this.n = r10;
        final WorkDatabase workDatabase2 = this.d;
        this.i = new gjv(workDatabase2, (char[]) null);
        fkm fkmVar2 = this.f;
        final ?? r7 = ajdrVar.e;
        String str = fkq.a;
        fkmVar2.c(new fkb() { // from class: fkp
            @Override // defpackage.fkb
            public final void a(fny fnyVar, boolean z) {
                String str2 = fkq.a;
                r7.execute(new xx(workDatabase2, fnyVar, list, fiyVar, 6));
            }
        });
        this.k.e(new ForceStopRunnable(applicationContext, this));
        Context context2 = this.b;
        String str2 = fkx.a;
        r10.getClass();
        context2.getClass();
        if (fou.a(context2, fiyVar)) {
            aimr.d(new hcg(aiyr.a(aimv.b(new hcg(workDatabase.x().i(), new fkv(null), 13), -1)), new fkw(context2, (afck) null, 0), 16), r10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static flo b(Context context) {
        flo floVarB;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                floVarB = l;
                if (floVarB == null) {
                    floVarB = m;
                }
            }
            return floVarB;
        }
        if (floVarB == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof fix)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((fix) applicationContext).a());
            floVarB = b(applicationContext);
        }
        return floVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x04a6, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a A[Catch: all -> 0x04cb, LOOP:5: B:106:0x030a->B:120:0x033a, LOOP_END, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:12:0x0018, B:14:0x0020, B:16:0x0045, B:22:0x006e, B:24:0x0127, B:26:0x012b, B:33:0x0143, B:35:0x014d, B:36:0x0151, B:38:0x0157, B:41:0x016c, B:42:0x0177, B:43:0x0178, B:45:0x017c, B:46:0x0181, B:48:0x019a, B:51:0x01a0, B:55:0x01ad, B:57:0x01b1, B:59:0x01b5, B:60:0x01ed, B:64:0x01f5, B:66:0x0212, B:67:0x022f, B:69:0x0236, B:71:0x0243, B:73:0x024f, B:78:0x025d, B:79:0x0266, B:80:0x0285, B:81:0x0286, B:90:0x029a, B:91:0x02a2, B:93:0x02a8, B:95:0x02c0, B:97:0x02c8, B:98:0x02ca, B:101:0x02d6, B:102:0x02da, B:103:0x02ee, B:105:0x02f4, B:106:0x030a, B:108:0x0310, B:110:0x031d, B:112:0x0329, B:120:0x033a, B:121:0x034a, B:122:0x0375, B:124:0x037a, B:131:0x038c, B:133:0x039d, B:134:0x03a3, B:136:0x03bb, B:137:0x03c1, B:139:0x03c9, B:140:0x03cf, B:142:0x03de, B:143:0x03e4, B:152:0x03fb, B:154:0x03ff, B:156:0x0403, B:157:0x0409, B:166:0x0420, B:168:0x0424, B:170:0x047b, B:161:0x0410, B:163:0x0415, B:165:0x0419, B:172:0x047e, B:147:0x03eb, B:149:0x03f0, B:151:0x03f4, B:127:0x0382, B:173:0x047f, B:174:0x049e, B:84:0x028e, B:86:0x0292, B:175:0x049f, B:176:0x04a6, B:65:0x0205, B:177:0x04a7, B:178:0x04ae, B:179:0x04af, B:180:0x04b6, B:28:0x0136, B:30:0x013a, B:32:0x013f, B:17:0x004f, B:19:0x0059, B:21:0x0061, B:181:0x04b7, B:182:0x04be, B:183:0x04bf, B:184:0x04c6, B:185:0x04c7, B:186:0x04c9), top: B:193:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ff A[Catch: all -> 0x04cb, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:12:0x0018, B:14:0x0020, B:16:0x0045, B:22:0x006e, B:24:0x0127, B:26:0x012b, B:33:0x0143, B:35:0x014d, B:36:0x0151, B:38:0x0157, B:41:0x016c, B:42:0x0177, B:43:0x0178, B:45:0x017c, B:46:0x0181, B:48:0x019a, B:51:0x01a0, B:55:0x01ad, B:57:0x01b1, B:59:0x01b5, B:60:0x01ed, B:64:0x01f5, B:66:0x0212, B:67:0x022f, B:69:0x0236, B:71:0x0243, B:73:0x024f, B:78:0x025d, B:79:0x0266, B:80:0x0285, B:81:0x0286, B:90:0x029a, B:91:0x02a2, B:93:0x02a8, B:95:0x02c0, B:97:0x02c8, B:98:0x02ca, B:101:0x02d6, B:102:0x02da, B:103:0x02ee, B:105:0x02f4, B:106:0x030a, B:108:0x0310, B:110:0x031d, B:112:0x0329, B:120:0x033a, B:121:0x034a, B:122:0x0375, B:124:0x037a, B:131:0x038c, B:133:0x039d, B:134:0x03a3, B:136:0x03bb, B:137:0x03c1, B:139:0x03c9, B:140:0x03cf, B:142:0x03de, B:143:0x03e4, B:152:0x03fb, B:154:0x03ff, B:156:0x0403, B:157:0x0409, B:166:0x0420, B:168:0x0424, B:170:0x047b, B:161:0x0410, B:163:0x0415, B:165:0x0419, B:172:0x047e, B:147:0x03eb, B:149:0x03f0, B:151:0x03f4, B:127:0x0382, B:173:0x047f, B:174:0x049e, B:84:0x028e, B:86:0x0292, B:175:0x049f, B:176:0x04a6, B:65:0x0205, B:177:0x04a7, B:178:0x04ae, B:179:0x04af, B:180:0x04b6, B:28:0x0136, B:30:0x013a, B:32:0x013f, B:17:0x004f, B:19:0x0059, B:21:0x0061, B:181:0x04b7, B:182:0x04be, B:183:0x04bf, B:184:0x04c6, B:185:0x04c7, B:186:0x04c9), top: B:193:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0424 A[Catch: all -> 0x04cb, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x000e, B:10:0x0015, B:12:0x0018, B:14:0x0020, B:16:0x0045, B:22:0x006e, B:24:0x0127, B:26:0x012b, B:33:0x0143, B:35:0x014d, B:36:0x0151, B:38:0x0157, B:41:0x016c, B:42:0x0177, B:43:0x0178, B:45:0x017c, B:46:0x0181, B:48:0x019a, B:51:0x01a0, B:55:0x01ad, B:57:0x01b1, B:59:0x01b5, B:60:0x01ed, B:64:0x01f5, B:66:0x0212, B:67:0x022f, B:69:0x0236, B:71:0x0243, B:73:0x024f, B:78:0x025d, B:79:0x0266, B:80:0x0285, B:81:0x0286, B:90:0x029a, B:91:0x02a2, B:93:0x02a8, B:95:0x02c0, B:97:0x02c8, B:98:0x02ca, B:101:0x02d6, B:102:0x02da, B:103:0x02ee, B:105:0x02f4, B:106:0x030a, B:108:0x0310, B:110:0x031d, B:112:0x0329, B:120:0x033a, B:121:0x034a, B:122:0x0375, B:124:0x037a, B:131:0x038c, B:133:0x039d, B:134:0x03a3, B:136:0x03bb, B:137:0x03c1, B:139:0x03c9, B:140:0x03cf, B:142:0x03de, B:143:0x03e4, B:152:0x03fb, B:154:0x03ff, B:156:0x0403, B:157:0x0409, B:166:0x0420, B:168:0x0424, B:170:0x047b, B:161:0x0410, B:163:0x0415, B:165:0x0419, B:172:0x047e, B:147:0x03eb, B:149:0x03f0, B:151:0x03f4, B:127:0x0382, B:173:0x047f, B:174:0x049e, B:84:0x028e, B:86:0x0292, B:175:0x049f, B:176:0x04a6, B:65:0x0205, B:177:0x04a7, B:178:0x04ae, B:179:0x04af, B:180:0x04b6, B:28:0x0136, B:30:0x013a, B:32:0x013f, B:17:0x004f, B:19:0x0059, B:21:0x0061, B:181:0x04b7, B:182:0x04be, B:183:0x04bf, B:184:0x04c6, B:185:0x04c7, B:186:0x04c9), top: B:193:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x034a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r28, defpackage.fiy r29) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flo.c(android.content.Context, fiy):void");
    }

    public final void d() {
        synchronized (a) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
        }
    }

    public final void e() {
        dsr dsrVar = this.c.h;
        flm flmVar = new flm(this, 8);
        fdi.b();
        flmVar.invoke();
    }

    public final void f(fny fnyVar, int i) {
        this.k.e(new fow(this.f, new gjv(fnyVar), true, i));
    }
}
