package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dsz {
    public dsz(char[] cArr) {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
    }

    static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
        return callStyle.setAnswerButtonColorHint(i);
    }

    static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
        return callStyle.setDeclineButtonColorHint(i);
    }

    static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z) {
        return callStyle.setIsVideo(z);
    }

    static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }

    public static final afco i(aitx aitxVar) {
        bwi bwiVar = aivh.d;
        afco afcoVar = ((ajbw) aitxVar).a;
        return afcoVar.get(bwiVar) == null ? afcoVar.plus(new aivj(null)) : afcoVar;
    }

    public static final fkr k(boolean z) {
        fks fksVar = new fks();
        return z ? new fkt(fksVar) : fksVar;
    }

    public static final zgp l(Executor executor, afdr afdrVar) {
        return dsg.w(new fjy(executor, afdrVar, 0));
    }

    public static gjv m(fkr fkrVar, fod fodVar) {
        fodVar.getClass();
        return fkrVar.d(dtb.l(fodVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:26:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.io.FileOutputStream r12, defpackage.afck r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.egq
            if (r0 == 0) goto L13
            r0 = r13
            egq r0 = (defpackage.egq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            egq r0 = new egq
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r11 = r0.d
            afcr r13 = defpackage.afcr.a
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r3 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r12 = r0.a
            defpackage.woy.dF(r11)
            r11 = r0
            goto L79
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            defpackage.woy.dF(r11)
            r3 = 10
            r11 = r0
        L3c:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L7d
            r0 = r12
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch: java.io.IOException -> L5a
            java.nio.channels.FileChannel r5 = defpackage.dsy.d(r0)     // Catch: java.io.IOException -> L5a
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L5a
            r0.getClass()     // Catch: java.io.IOException -> L5a
            return r0
        L5a:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L7c
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = defpackage.afyh.u(r1, r5, r6)
            if (r1 != r2) goto L7c
            r11.a = r12
            r0 = 0
            r11.b = r0
            r11.c = r3
            r11.e = r2
            java.lang.Object r0 = defpackage.aiow.c(r3, r11)
            if (r0 == r13) goto L7b
        L79:
            long r3 = r3 + r3
            goto L3c
        L7b:
            return r13
        L7c:
            throw r0
        L7d:
            java.io.FileOutputStream r12 = (java.io.FileOutputStream) r12
            java.nio.channels.FileChannel r0 = defpackage.dsy.d(r12)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r1 = 0
            java.nio.channels.FileLock r11 = r0.lock(r1, r3, r5)
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsz.j(java.io.FileOutputStream, afck):java.lang.Object");
    }
}
