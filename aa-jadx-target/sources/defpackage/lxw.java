package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lxw extends defpackage.lxu implements defpackage.lhn, defpackage.mnj {
    private static final java.lang.String[] a;
    private static final java.lang.String[] b;
    private final java.util.Queue c = new defpackage.yfd(50);

    static {
        defpackage.yqm.c("GH.SbnConverter.Log");
        a = new java.lang.String[]{"reply"};
        b = new java.lang.String[]{"read", "seen"};
    }

    public static defpackage.lxw m() {
        return (defpackage.lxw) defpackage.mkp.a.i(defpackage.lxw.class);
    }

    @Override // defpackage.mnz
    public final /* bridge */ /* synthetic */ mog a(android.content.Context context, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("#convert should never be called.");
    }

    @Override // defpackage.lxu
    protected final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        android.service.notification.StatusBarNotification statusBarNotification2;
        j$.time.Instant instant;
        if (j(statusBarNotification.getPackageName())) {
            lxl lxlVar = new lxl();
            if (statusBarNotification == null) {
                throw new java.lang.NullPointerException("Null sbn");
            }
            lxlVar.a = statusBarNotification;
            j$.time.Instant instantNow = j$.time.Instant.now();
            if (instantNow == null) {
                throw new java.lang.NullPointerException("Null time");
            }
            lxlVar.b = instantNow;
            lxlVar.a(false);
            lxlVar.b(false);
            defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, true);
            for (defpackage.dta dtaVar : lwkVar.g()) {
                if (defpackage.lwz.c(dtaVar, a)) {
                    defpackage.lxy.e();
                    defpackage.lxy.h(defpackage.zbe.MESSAGING_SBN, defpackage.zbd.me, statusBarNotification.getPackageName());
                    lxlVar.b(true);
                }
                if (defpackage.lwz.c(dtaVar, b)) {
                    defpackage.lxy.e();
                    defpackage.lxy.h(defpackage.zbe.MESSAGING_SBN, defpackage.zbd.mf, statusBarNotification.getPackageName());
                    lxlVar.a(true);
                }
            }
            boolean zJ = lwkVar.j();
            boolean z = lwkVar.c != null;
            boolean z2 = lwkVar.d != null;
            boolean z3 = lwkVar.e != null;
            statusBarNotification.getPackageName();
            lxlVar.c = zJ;
            int i = lxlVar.j | 1;
            lxlVar.d = z;
            lxlVar.e = z2;
            lxlVar.f = z3;
            lxlVar.j = (byte) (((byte) (((byte) (((byte) i) | 2)) | 4)) | 8);
            lxlVar.g = lwkVar.l();
            lxlVar.j = (byte) (lxlVar.j | 16);
            boolean zK = lwkVar.k();
            byte b2 = (byte) (lxlVar.j | 32);
            lxlVar.j = b2;
            java.util.Queue queue = this.c;
            if (b2 != -1 || (statusBarNotification2 = lxlVar.a) == null || (instant = lxlVar.b) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (lxlVar.a == null) {
                    sb.append(" sbn");
                }
                if (lxlVar.b == null) {
                    sb.append(" time");
                }
                if ((lxlVar.j & 1) == 0) {
                    sb.append(" canConvert");
                }
                if ((lxlVar.j & 2) == 0) {
                    sb.append(" isMessagingStyle");
                }
                if ((lxlVar.j & 4) == 0) {
                    sb.append(" isBigPictureStyle");
                }
                if ((lxlVar.j & 8) == 0) {
                    sb.append(" isCarExtender");
                }
                if ((lxlVar.j & 16) == 0) {
                    sb.append(" hasReplyAction");
                }
                if ((lxlVar.j & 32) == 0) {
                    sb.append(" hasReadAction");
                }
                if ((lxlVar.j & 64) == 0) {
                    sb.append(" probablyHasReplyAction");
                }
                if ((lxlVar.j & 128) == 0) {
                    sb.append(" probablyHasReadAction");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            queue.add(new lxv(statusBarNotification2, instant, lxlVar.c, lxlVar.d, lxlVar.e, lxlVar.f, lxlVar.g, zK, lxlVar.h, lxlVar.i));
        }
        return false;
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.mni.a().d(defpackage.mnh.n);
        this.c.clear();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.mni.a().b(defpackage.mnh.n, this);
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        java.util.Queue queue = this.c;
        if (queue.isEmpty()) {
            printWriter.println("No SBNs processed this session.");
            return;
        }
        mnm mnmVarA = mnn.a();
        mnmVarA.b();
        int i = 1;
        mnmVarA.d(true);
        mnmVarA.c('|');
        mnl mnlVarL = mnq.l();
        mnmVarA.a = "#";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "Time";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "Package";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "CanConvert";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "isBigPictureStyle";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "isCarExtender";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "hasRead";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "hasReply";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "probablyHasRead";
        mnlVarL.b(mnmVarA.a());
        mnmVarA.a = "probablyHasReply";
        mnlVarL.b(mnmVarA.a());
        mnl mnlVarL2 = mnq.l();
        mnmVarA.a = "#";
        mnlVarL2.b(mnmVarA.a());
        mnmVarA.a = "SBN";
        mnlVarL2.b(mnmVarA.a());
        java.util.Iterator it = queue.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            lxv lxvVar = (lxv) it.next();
            i2 += i;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
            j$.time.Instant instant = lxvVar.b;
            android.service.notification.StatusBarNotification statusBarNotification = lxvVar.a;
            java.lang.String packageName = statusBarNotification.getPackageName();
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(lxvVar.c);
            java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(lxvVar.d);
            java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(lxvVar.e);
            java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(lxvVar.g);
            java.lang.Boolean boolValueOf5 = java.lang.Boolean.valueOf(lxvVar.f);
            int i3 = i;
            java.lang.Boolean boolValueOf6 = java.lang.Boolean.valueOf(lxvVar.i);
            java.lang.Boolean boolValueOf7 = java.lang.Boolean.valueOf(lxvVar.h);
            java.util.Iterator it2 = it;
            java.lang.Object[] objArr = new java.lang.Object[10];
            objArr[0] = numValueOf;
            objArr[i3] = instant;
            objArr[2] = packageName;
            objArr[3] = boolValueOf;
            objArr[4] = boolValueOf2;
            objArr[5] = boolValueOf3;
            objArr[6] = boolValueOf4;
            objArr[7] = boolValueOf5;
            objArr[8] = boolValueOf6;
            objArr[9] = boolValueOf7;
            mnlVarL.c(objArr);
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = numValueOf;
            objArr2[i3] = statusBarNotification;
            mnlVarL2.c(objArr2);
            i = i3;
            it = it2;
        }
        printWriter.println("Messaging Information Dump from Last SBNs Processed:");
        mnlVarL.a().m(printWriter);
        printWriter.println();
        printWriter.println("Raw SBN Dump:");
        mnlVarL2.a().m(printWriter);
    }
}
