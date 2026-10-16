package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class zsv implements Runnable {
    public static final String a = "zsv";
    public final zss b;
    public final List c;
    public final zsl d;
    public final ThreadFactory e;
    public final String f;
    public final String g;
    public final Context h;
    private final String i;
    private final hqw j;
    private final String k;
    private final xyc l;

    public zsv(Context context, zss zssVar, List list, String str, zsl zslVar, hqw hqwVar, String str2, String str3, xyc xycVar, ThreadFactory threadFactory) {
        this.h = context != null ? context.getApplicationContext() : null;
        this.b = zssVar;
        this.c = list;
        this.i = str;
        this.d = zslVar;
        this.j = hqwVar;
        this.k = str2;
        this.f = str3;
        this.g = "3.4.0";
        this.l = xycVar;
        this.e = threadFactory;
    }

    static String a(List list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(((zsr) list.get(i)).h());
        }
        return ysi.S(strArr);
    }

    private static final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zsr) it.next()).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x03af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        if (defpackage.zrn.e(r4, 3) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        android.util.Log.d(r4, java.lang.String.format("Expecting request type: %s but instead got: %s.  ABORTING!", java.lang.Integer.valueOf(r15.h()), java.lang.Integer.valueOf(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0143, code lost:
    
        throw new java.io.IOException("RequestType: " + r6 + " != " + r15.h());
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bf A[Catch: all -> 0x02b0, TryCatch #17 {all -> 0x02b0, blocks: (B:31:0x00b3, B:125:0x02b6, B:127:0x02bf, B:128:0x02c4, B:129:0x02c9, B:131:0x02cb, B:133:0x02d8, B:137:0x02eb, B:139:0x02f4, B:140:0x02fd, B:141:0x0304, B:134:0x02de, B:136:0x02e6), top: B:190:0x00b3 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsv.run():void");
    }
}
