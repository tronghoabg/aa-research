package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class puj implements pxb {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/network/gmmserver/AsyncGmmServerProtocolRpc");
    private static final Executor o = zfq.a;
    public final abow b;
    public final ackk c;
    public final pwh d;
    public final ackk e;
    public final pvn f;
    public final tmb g;
    public final accb h;
    public volatile String i;
    volatile zph j;
    public volatile ygr k;
    public final Executor l;
    public final pzn m;
    public final erb n;
    private final Context p;
    private final puw q;
    private final pzl r;
    private final pwp s;
    private final String t;
    private final pyb u;
    private final xxh v;
    private final qbi w;
    private final abpc x;

    public puj(pug pugVar, abow abowVar, pwh pwhVar, pwp pwpVar, pvn pvnVar) {
        this.b = abowVar;
        this.p = pugVar.a;
        this.c = pugVar.b;
        this.q = pugVar.c;
        this.r = pugVar.d;
        this.d = pwhVar;
        this.s = pwpVar;
        this.e = pugVar.e;
        this.f = pvnVar;
        this.l = pugVar.g;
        String str = pugVar.h;
        boolean z = true;
        if (str != null && str.isEmpty()) {
            z = false;
        }
        woy.N(z);
        this.t = pugVar.h;
        this.g = pugVar.f;
        this.n = pugVar.m;
        this.u = pugVar.i;
        this.m = pugVar.l;
        this.v = pugVar.j;
        this.w = pugVar.k;
        this.k = yly.a;
        accb accbVar = pwpVar.h;
        accbVar.getClass();
        this.h = accbVar;
        abpc abpcVar = pwpVar.i;
        abpcVar.getClass();
        this.x = abpcVar;
        Thread.currentThread().getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020c A[Catch: Exception -> 0x0424, all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:99:0x02ea, B:101:0x0307, B:123:0x03fd, B:125:0x041d, B:127:0x041f, B:46:0x01a0, B:63:0x01ea, B:65:0x0206, B:67:0x020c, B:77:0x024f, B:79:0x025d, B:80:0x026c, B:92:0x02bb, B:94:0x02c5, B:95:0x02cb, B:96:0x02df, B:130:0x0422, B:83:0x0280, B:84:0x028c, B:86:0x0292, B:88:0x02a0, B:91:0x02aa, B:68:0x0211, B:70:0x0225, B:71:0x022a, B:73:0x023f, B:74:0x0244, B:76:0x024b, B:49:0x01ab, B:59:0x01db, B:52:0x01bc, B:54:0x01c7, B:55:0x01c9, B:57:0x01d3, B:58:0x01d5, B:136:0x0429, B:131:0x0423), top: B:151:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0211 A[Catch: Exception -> 0x0424, all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:99:0x02ea, B:101:0x0307, B:123:0x03fd, B:125:0x041d, B:127:0x041f, B:46:0x01a0, B:63:0x01ea, B:65:0x0206, B:67:0x020c, B:77:0x024f, B:79:0x025d, B:80:0x026c, B:92:0x02bb, B:94:0x02c5, B:95:0x02cb, B:96:0x02df, B:130:0x0422, B:83:0x0280, B:84:0x028c, B:86:0x0292, B:88:0x02a0, B:91:0x02aa, B:68:0x0211, B:70:0x0225, B:71:0x022a, B:73:0x023f, B:74:0x0244, B:76:0x024b, B:49:0x01ab, B:59:0x01db, B:52:0x01bc, B:54:0x01c7, B:55:0x01c9, B:57:0x01d3, B:58:0x01d5, B:136:0x0429, B:131:0x0423), top: B:151:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025d A[Catch: Exception -> 0x0424, all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:99:0x02ea, B:101:0x0307, B:123:0x03fd, B:125:0x041d, B:127:0x041f, B:46:0x01a0, B:63:0x01ea, B:65:0x0206, B:67:0x020c, B:77:0x024f, B:79:0x025d, B:80:0x026c, B:92:0x02bb, B:94:0x02c5, B:95:0x02cb, B:96:0x02df, B:130:0x0422, B:83:0x0280, B:84:0x028c, B:86:0x0292, B:88:0x02a0, B:91:0x02aa, B:68:0x0211, B:70:0x0225, B:71:0x022a, B:73:0x023f, B:74:0x0244, B:76:0x024b, B:49:0x01ab, B:59:0x01db, B:52:0x01bc, B:54:0x01c7, B:55:0x01c9, B:57:0x01d3, B:58:0x01d5, B:136:0x0429, B:131:0x0423), top: B:151:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0280 A[Catch: Exception -> 0x0424, all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:99:0x02ea, B:101:0x0307, B:123:0x03fd, B:125:0x041d, B:127:0x041f, B:46:0x01a0, B:63:0x01ea, B:65:0x0206, B:67:0x020c, B:77:0x024f, B:79:0x025d, B:80:0x026c, B:92:0x02bb, B:94:0x02c5, B:95:0x02cb, B:96:0x02df, B:130:0x0422, B:83:0x0280, B:84:0x028c, B:86:0x0292, B:88:0x02a0, B:91:0x02aa, B:68:0x0211, B:70:0x0225, B:71:0x022a, B:73:0x023f, B:74:0x0244, B:76:0x024b, B:49:0x01ab, B:59:0x01db, B:52:0x01bc, B:54:0x01c7, B:55:0x01c9, B:57:0x01d3, B:58:0x01d5, B:136:0x0429, B:131:0x0423), top: B:151:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c5 A[Catch: Exception -> 0x0424, all -> 0x0430, TryCatch #1 {all -> 0x0430, blocks: (B:99:0x02ea, B:101:0x0307, B:123:0x03fd, B:125:0x041d, B:127:0x041f, B:46:0x01a0, B:63:0x01ea, B:65:0x0206, B:67:0x020c, B:77:0x024f, B:79:0x025d, B:80:0x026c, B:92:0x02bb, B:94:0x02c5, B:95:0x02cb, B:96:0x02df, B:130:0x0422, B:83:0x0280, B:84:0x028c, B:86:0x0292, B:88:0x02a0, B:91:0x02aa, B:68:0x0211, B:70:0x0225, B:71:0x022a, B:73:0x023f, B:74:0x0244, B:76:0x024b, B:49:0x01ab, B:59:0x01db, B:52:0x01bc, B:54:0x01c7, B:55:0x01c9, B:57:0x01d3, B:58:0x01d5, B:136:0x0429, B:131:0x0423), top: B:151:0x007b }] */
    @Override // defpackage.pxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zgp a(defpackage.udp r19, defpackage.pwz r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puj.a(udp, pwz):zgp");
    }
}
