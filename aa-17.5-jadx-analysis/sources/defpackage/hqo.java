package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class hqo extends Thread {
    public volatile boolean a = false;
    private final BlockingQueue b;
    private final hqz c;
    private final tsu d;
    private final ieb e;

    public hqo(BlockingQueue blockingQueue, ieb iebVar, tsu tsuVar, hqz hqzVar) {
        this.b = blockingQueue;
        this.e = iebVar;
        this.d = tsuVar;
        this.c = hqzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x029f, code lost:
    
        if (r0 < 200) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a3, code lost:
    
        if (r0 > 299) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a5, code lost:
    
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ad, code lost:
    
        r0 = new defpackage.hqq(r0, r9, false, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ae, code lost:
    
        r2.e("network-http-complete");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b5, code lost:
    
        if (r0.e == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b7, code lost:
    
        r3 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b9, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ba, code lost:
    
        r5 = r2.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bc, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bd, code lost:
    
        if (r5 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02bf, code lost:
    
        r2.h("not-modified");
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02cc, code lost:
    
        r0 = r2.o(r0);
        r2.e("network-parse-complete");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d7, code lost:
    
        if (r2.i == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02d9, code lost:
    
        r3 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02db, code lost:
    
        if (r3 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02dd, code lost:
    
        r20.d.g(r2.c(), (defpackage.hqh) r3);
        r2.e("network-cache-written");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ed, code lost:
    
        r2.i();
        r20.c.b(r2, r0);
        r3 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f7, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f8, code lost:
    
        r5 = r2.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02fa, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fb, code lost:
    
        if (r5 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02fd, code lost:
    
        r3 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ff, code lost:
    
        if (r3 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030b, code lost:
    
        if (((defpackage.hqh) r3).a(java.lang.System.currentTimeMillis()) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030e, code lost:
    
        r3 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0312, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0313, code lost:
    
        r6 = (java.util.List) r5.a.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031b, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031c, code lost:
    
        if (r6 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0320, code lost:
    
        if (defpackage.hrf.b == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0322, code lost:
    
        r9 = new java.lang.Object[r16];
        r9[0] = java.lang.Integer.valueOf(r6.size());
        r9[r18] = r3;
        defpackage.hrf.d("Releasing %d waiting requests for cacheKey=%s.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0337, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033f, code lost:
    
        if (r3.hasNext() == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0341, code lost:
    
        r5.d.b((defpackage.hqt) r3.next(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0350, code lost:
    
        r5.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x035d, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x038d A[Catch: Exception -> 0x044c, all -> 0x044e, hrc -> 0x0473, TryCatch #1 {Exception -> 0x044c, blocks: (B:128:0x02ae, B:130:0x02b7, B:131:0x02b9, B:135:0x02bf, B:139:0x02cb, B:140:0x02cc, B:142:0x02d9, B:144:0x02dd, B:145:0x02ed, B:146:0x02f7, B:150:0x02fd, B:152:0x0301, B:155:0x030e, B:156:0x0312, B:160:0x031e, B:162:0x0322, B:163:0x0337, B:164:0x033b, B:166:0x0341, B:170:0x034f, B:171:0x0350, B:175:0x0357, B:126:0x02a5, B:176:0x0358, B:177:0x035d, B:122:0x028d, B:201:0x0389, B:203:0x038d, B:225:0x03ef, B:226:0x03f5, B:228:0x0409, B:230:0x0421, B:232:0x0423, B:233:0x0437, B:205:0x039a, B:208:0x03a0, B:210:0x03b6, B:219:0x03d3, B:220:0x03d8, B:221:0x03d9, B:222:0x03de, B:223:0x03df, B:224:0x03e7, B:234:0x0438, B:235:0x043d, B:236:0x043e, B:237:0x044b, B:194:0x037e, B:195:0x0381), top: B:252:0x0389 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039a A[Catch: Exception -> 0x044c, all -> 0x044e, hrc -> 0x0473, TryCatch #1 {Exception -> 0x044c, blocks: (B:128:0x02ae, B:130:0x02b7, B:131:0x02b9, B:135:0x02bf, B:139:0x02cb, B:140:0x02cc, B:142:0x02d9, B:144:0x02dd, B:145:0x02ed, B:146:0x02f7, B:150:0x02fd, B:152:0x0301, B:155:0x030e, B:156:0x0312, B:160:0x031e, B:162:0x0322, B:163:0x0337, B:164:0x033b, B:166:0x0341, B:170:0x034f, B:171:0x0350, B:175:0x0357, B:126:0x02a5, B:176:0x0358, B:177:0x035d, B:122:0x028d, B:201:0x0389, B:203:0x038d, B:225:0x03ef, B:226:0x03f5, B:228:0x0409, B:230:0x0421, B:232:0x0423, B:233:0x0437, B:205:0x039a, B:208:0x03a0, B:210:0x03b6, B:219:0x03d3, B:220:0x03d8, B:221:0x03d9, B:222:0x03de, B:223:0x03df, B:224:0x03e7, B:234:0x0438, B:235:0x043d, B:236:0x043e, B:237:0x044b, B:194:0x037e, B:195:0x0381), top: B:252:0x0389 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0409 A[Catch: Exception -> 0x044c, all -> 0x044e, hrc -> 0x0473, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044c, blocks: (B:128:0x02ae, B:130:0x02b7, B:131:0x02b9, B:135:0x02bf, B:139:0x02cb, B:140:0x02cc, B:142:0x02d9, B:144:0x02dd, B:145:0x02ed, B:146:0x02f7, B:150:0x02fd, B:152:0x0301, B:155:0x030e, B:156:0x0312, B:160:0x031e, B:162:0x0322, B:163:0x0337, B:164:0x033b, B:166:0x0341, B:170:0x034f, B:171:0x0350, B:175:0x0357, B:126:0x02a5, B:176:0x0358, B:177:0x035d, B:122:0x028d, B:201:0x0389, B:203:0x038d, B:225:0x03ef, B:226:0x03f5, B:228:0x0409, B:230:0x0421, B:232:0x0423, B:233:0x0437, B:205:0x039a, B:208:0x03a0, B:210:0x03b6, B:219:0x03d3, B:220:0x03d8, B:221:0x03d9, B:222:0x03de, B:223:0x03df, B:224:0x03e7, B:234:0x0438, B:235:0x043d, B:236:0x043e, B:237:0x044b, B:194:0x037e, B:195:0x0381), top: B:252:0x0389 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x037e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [hqz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqo.a():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.a) {
                    Thread.currentThread().interrupt();
                    return;
                }
                hrf.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
