package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import j$.time.Instant;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class lxl extends lxj implements lhg, mnd {
    private static final String[] a;
    private static final String[] b;
    private final Queue c = new ydx(50);

    static {
        yph.c("GH.ConvSbnConverter.Log");
        a = new String[]{"reply"};
        b = new String[]{"read", "seen"};
    }

    public static lxl k() {
        return (lxl) mki.a.i(lxl.class);
    }

    @Override // defpackage.lxj
    public final /* bridge */ /* synthetic */ lvg a(Context context, StatusBarNotification statusBarNotification) {
        throw new UnsupportedOperationException("#convert should never be called.");
    }

    @Override // defpackage.lxj
    protected final boolean b(StatusBarNotification statusBarNotification) {
        StatusBarNotification statusBarNotification2;
        Instant instant;
        if (i(statusBarNotification.getPackageName())) {
            lxe lxeVar = new lxe();
            if (statusBarNotification == null) {
                throw new NullPointerException("Null sbn");
            }
            lxeVar.a = statusBarNotification;
            Instant instantNow = Instant.now();
            if (instantNow == null) {
                throw new NullPointerException("Null time");
            }
            lxeVar.b = instantNow;
            lxeVar.c(false);
            lxeVar.d(false);
            lwd lwdVar = new lwd(statusBarNotification, true);
            for (dst dstVar : lwdVar.g()) {
                if (lws.c(dstVar, a)) {
                    lxr.e();
                    lxr.h(yzz.MESSAGING_SBN, yzy.me, statusBarNotification.getPackageName());
                    lxeVar.d(true);
                }
                if (lws.c(dstVar, b)) {
                    lxr.e();
                    lxr.h(yzz.MESSAGING_SBN, yzy.mf, statusBarNotification.getPackageName());
                    lxeVar.c(true);
                }
            }
            boolean zJ = lwdVar.j();
            boolean z = lwdVar.c != null;
            boolean z2 = lwdVar.d != null;
            boolean z3 = lwdVar.e != null;
            statusBarNotification.getPackageName();
            lxeVar.c = zJ;
            int i = lxeVar.j | 1;
            lxeVar.d = z;
            lxeVar.e = z2;
            lxeVar.f = z3;
            lxeVar.j = (byte) (((byte) (((byte) (((byte) i) | 2)) | 4)) | 8);
            lxeVar.g = lwdVar.l();
            lxeVar.j = (byte) (lxeVar.j | 16);
            boolean zK = lwdVar.k();
            byte b2 = (byte) (lxeVar.j | 32);
            lxeVar.j = b2;
            Queue queue = this.c;
            if (b2 != -1 || (statusBarNotification2 = lxeVar.a) == null || (instant = lxeVar.b) == null) {
                StringBuilder sb = new StringBuilder();
                if (lxeVar.a == null) {
                    sb.append(" sbn");
                }
                if (lxeVar.b == null) {
                    sb.append(" time");
                }
                if ((lxeVar.j & 1) == 0) {
                    sb.append(" canConvert");
                }
                if ((lxeVar.j & 2) == 0) {
                    sb.append(" isMessagingStyle");
                }
                if ((lxeVar.j & 4) == 0) {
                    sb.append(" isBigPictureStyle");
                }
                if ((lxeVar.j & 8) == 0) {
                    sb.append(" isCarExtender");
                }
                if ((lxeVar.j & 16) == 0) {
                    sb.append(" hasReplyAction");
                }
                if ((lxeVar.j & 32) == 0) {
                    sb.append(" hasReadAction");
                }
                if ((lxeVar.j & 64) == 0) {
                    sb.append(" probablyHasReplyAction");
                }
                if ((lxeVar.j & 128) == 0) {
                    sb.append(" probablyHasReadAction");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            queue.add(new lxk(statusBarNotification2, instant, lxeVar.c, lxeVar.d, lxeVar.e, lxeVar.f, lxeVar.g, zK, lxeVar.h, lxeVar.i));
        }
        return false;
    }

    @Override // defpackage.lhg
    public final void c() {
        mnc.a().b(mnb.n, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        mnc.a().d(mnb.n);
        this.c.clear();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        Queue queue = this.c;
        if (queue.isEmpty()) {
            printWriter.println("No SBNs processed this session.");
            return;
        }
        mng mngVarA = mnh.a();
        mngVarA.b();
        int i = 1;
        mngVarA.d(true);
        mngVarA.c('|');
        mnf mnfVarL = mnk.l();
        mngVarA.a = "#";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "Time";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "Package";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "CanConvert";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "isBigPictureStyle";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "isCarExtender";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "hasRead";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "hasReply";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "probablyHasRead";
        mnfVarL.b(mngVarA.a());
        mngVarA.a = "probablyHasReply";
        mnfVarL.b(mngVarA.a());
        mnf mnfVarL2 = mnk.l();
        mngVarA.a = "#";
        mnfVarL2.b(mngVarA.a());
        mngVarA.a = "SBN";
        mnfVarL2.b(mngVarA.a());
        Iterator it = queue.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            lxk lxkVar = (lxk) it.next();
            i2 += i;
            Integer numValueOf = Integer.valueOf(i2);
            Instant instant = lxkVar.b;
            StatusBarNotification statusBarNotification = lxkVar.a;
            String packageName = statusBarNotification.getPackageName();
            Boolean boolValueOf = Boolean.valueOf(lxkVar.c);
            Boolean boolValueOf2 = Boolean.valueOf(lxkVar.d);
            Boolean boolValueOf3 = Boolean.valueOf(lxkVar.e);
            Boolean boolValueOf4 = Boolean.valueOf(lxkVar.g);
            Boolean boolValueOf5 = Boolean.valueOf(lxkVar.f);
            int i3 = i;
            Boolean boolValueOf6 = Boolean.valueOf(lxkVar.i);
            Boolean boolValueOf7 = Boolean.valueOf(lxkVar.h);
            Iterator it2 = it;
            Object[] objArr = new Object[10];
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
            mnfVarL.c(objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = numValueOf;
            objArr2[i3] = statusBarNotification;
            mnfVarL2.c(objArr2);
            i = i3;
            it = it2;
        }
        printWriter.println("Messaging Information Dump from Last SBNs Processed:");
        mnfVarL.a().m(printWriter);
        printWriter.println();
        printWriter.println("Raw SBN Dump:");
        mnfVarL2.a().m(printWriter);
    }
}
