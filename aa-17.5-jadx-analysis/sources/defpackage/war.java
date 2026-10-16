package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class war {
    private static final Object a = new Object();
    public static volatile boolean b = false;
    private static volatile waq e;
    private static final wba f;
    private static final AtomicInteger g;
    final wap c;
    final String d;
    private Object h;
    private volatile int i = -1;
    private volatile Object j;
    private final boolean k;
    private volatile boolean l;

    static {
        new AtomicReference();
        f = new wba();
        g = new AtomicInteger();
    }

    public war(wap wapVar, String str, Object obj, boolean z) {
        if (wapVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.c = wapVar;
        this.d = str;
        this.h = obj;
        this.k = z;
        this.l = false;
    }

    public static void e() {
        g.incrementAndGet();
    }

    public static void f(Context context) {
        if (e != null || context == null) {
            return;
        }
        Object obj = a;
        synchronized (obj) {
            if (e == null) {
                synchronized (obj) {
                    waq waqVar = e;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (waqVar == null || waqVar.a != context) {
                        if (waqVar != null) {
                            Iterator it = vzu.a.values().iterator();
                            while (it.hasNext()) {
                                vzu vzuVar = (vzu) it.next();
                                synchronized (vzuVar) {
                                    if (vzuVar.f) {
                                        vzuVar.f = false;
                                    } else {
                                        ContentObserver contentObserver = vzuVar.e;
                                        if (contentObserver != null) {
                                            vzuVar.c.unregisterContentObserver(contentObserver);
                                            vzuVar.e = null;
                                        }
                                    }
                                }
                                it.remove();
                            }
                            wat.a();
                            vzz.a();
                        }
                        e = new waq(context, wub.L(new vks(context, 15)));
                        g.incrementAndGet();
                    }
                }
            }
        }
    }

    private final String g(String str) {
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.d;
        return zIsEmpty ? str2 : str.concat(String.valueOf(str2));
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0229 A[Catch: all -> 0x0257, TRY_LEAVE, TryCatch #11 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:71:0x013b, B:73:0x0143, B:74:0x0145, B:97:0x017b, B:99:0x017e, B:100:0x0180, B:102:0x0188, B:105:0x0190, B:107:0x0196, B:108:0x019a, B:128:0x01ef, B:133:0x01ff, B:135:0x0203, B:138:0x020a, B:148:0x0229, B:145:0x021b, B:131:0x01f7, B:152:0x0230, B:154:0x0233, B:156:0x0239, B:159:0x0241, B:160:0x0246, B:161:0x024a, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:59:0x011b, B:61:0x011f, B:69:0x0138, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:165:0x0251, B:166:0x0252, B:167:0x0254, B:168:0x0255, B:109:0x019b, B:111:0x019f, B:113:0x01b3, B:115:0x01be, B:114:0x01b9, B:116:0x01c0, B:118:0x01c4, B:120:0x01c8, B:122:0x01cc, B:125:0x01e2, B:126:0x01e9, B:127:0x01ee, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:75:0x0146, B:77:0x014a, B:79:0x0159, B:90:0x016e, B:91:0x0172, B:92:0x0175, B:93:0x0176), top: B:188:0x0018, inners: #5, #6, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0252 A[Catch: all -> 0x0257, TryCatch #11 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:71:0x013b, B:73:0x0143, B:74:0x0145, B:97:0x017b, B:99:0x017e, B:100:0x0180, B:102:0x0188, B:105:0x0190, B:107:0x0196, B:108:0x019a, B:128:0x01ef, B:133:0x01ff, B:135:0x0203, B:138:0x020a, B:148:0x0229, B:145:0x021b, B:131:0x01f7, B:152:0x0230, B:154:0x0233, B:156:0x0239, B:159:0x0241, B:160:0x0246, B:161:0x024a, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:59:0x011b, B:61:0x011f, B:69:0x0138, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:165:0x0251, B:166:0x0252, B:167:0x0254, B:168:0x0255, B:109:0x019b, B:111:0x019f, B:113:0x01b3, B:115:0x01be, B:114:0x01b9, B:116:0x01c0, B:118:0x01c4, B:120:0x01c8, B:122:0x01cc, B:125:0x01e2, B:126:0x01e9, B:127:0x01ee, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:75:0x0146, B:77:0x014a, B:79:0x0159, B:90:0x016e, B:91:0x0172, B:92:0x0175, B:93:0x0176), top: B:188:0x0018, inners: #5, #6, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[PHI: r2
  0x0046: PHI (r2v1 xxh) = (r2v0 xxh), (r2v0 xxh), (r2v4 xxh) binds: [B:11:0x0021, B:13:0x0025, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x0257, TryCatch #11 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:71:0x013b, B:73:0x0143, B:74:0x0145, B:97:0x017b, B:99:0x017e, B:100:0x0180, B:102:0x0188, B:105:0x0190, B:107:0x0196, B:108:0x019a, B:128:0x01ef, B:133:0x01ff, B:135:0x0203, B:138:0x020a, B:148:0x0229, B:145:0x021b, B:131:0x01f7, B:152:0x0230, B:154:0x0233, B:156:0x0239, B:159:0x0241, B:160:0x0246, B:161:0x024a, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:59:0x011b, B:61:0x011f, B:69:0x0138, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:165:0x0251, B:166:0x0252, B:167:0x0254, B:168:0x0255, B:109:0x019b, B:111:0x019f, B:113:0x01b3, B:115:0x01be, B:114:0x01b9, B:116:0x01c0, B:118:0x01c4, B:120:0x01c8, B:122:0x01cc, B:125:0x01e2, B:126:0x01e9, B:127:0x01ee, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:75:0x0146, B:77:0x014a, B:79:0x0159, B:90:0x016e, B:91:0x0172, B:92:0x0175, B:93:0x0176), top: B:188:0x0018, inners: #5, #6, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[Catch: all -> 0x024f, TRY_LEAVE, TryCatch #6 {, blocks: (B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1), top: B:183:0x0094, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b A[Catch: all -> 0x0257, TRY_ENTER, TryCatch #11 {, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0023, B:14:0x0027, B:16:0x0033, B:22:0x004e, B:24:0x0059, B:26:0x0069, B:71:0x013b, B:73:0x0143, B:74:0x0145, B:97:0x017b, B:99:0x017e, B:100:0x0180, B:102:0x0188, B:105:0x0190, B:107:0x0196, B:108:0x019a, B:128:0x01ef, B:133:0x01ff, B:135:0x0203, B:138:0x020a, B:148:0x0229, B:145:0x021b, B:131:0x01f7, B:152:0x0230, B:154:0x0233, B:156:0x0239, B:159:0x0241, B:160:0x0246, B:161:0x024a, B:28:0x007b, B:30:0x0083, B:58:0x0104, B:59:0x011b, B:61:0x011f, B:69:0x0138, B:31:0x0091, B:32:0x0093, B:56:0x00f6, B:165:0x0251, B:166:0x0252, B:167:0x0254, B:168:0x0255, B:109:0x019b, B:111:0x019f, B:113:0x01b3, B:115:0x01be, B:114:0x01b9, B:116:0x01c0, B:118:0x01c4, B:120:0x01c8, B:122:0x01cc, B:125:0x01e2, B:126:0x01e9, B:127:0x01ee, B:33:0x0094, B:35:0x009c, B:36:0x00a8, B:38:0x00ab, B:40:0x00b7, B:44:0x00c7, B:46:0x00cd, B:54:0x00ea, B:55:0x00f5, B:48:0x00d7, B:49:0x00db, B:50:0x00e1, B:75:0x0146, B:77:0x014a, B:79:0x0159, B:90:0x016e, B:91:0x0172, B:92:0x0175, B:93:0x0176), top: B:188:0x0018, inners: #5, #6, #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.war.b():java.lang.Object");
    }

    public final Object c() {
        if (this.l) {
            synchronized (this) {
                if (this.l) {
                    Object objA = a(this.h);
                    objA.getClass();
                    this.h = objA;
                    this.l = false;
                }
            }
        }
        return this.h;
    }

    public final String d() {
        return g(this.c.c);
    }

    public war(wap wapVar, String str, String str2) {
        if (wapVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.c = wapVar;
        this.d = str;
        this.h = str2;
        this.k = true;
        this.l = true;
    }
}
