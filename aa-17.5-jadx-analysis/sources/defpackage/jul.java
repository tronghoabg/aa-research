package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.control.CarAction;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jul {
    public static int a;

    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.gcv r23, defpackage.cfy r24, defpackage.bux r25, int r26) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jul.a(gcv, cfy, bux, int):void");
    }

    public static PendingIntent b(Context context, String str, PendingIntent pendingIntent) {
        Intent intentPutExtra = new Intent("androidx.car.app.action.CarAppNotificationAction").putExtra("TemplateAppPackageName", str).putExtra("TemplateAppActionType", 1).putExtra("TemplateAppPendingIntent", pendingIntent);
        if (acob.aa()) {
            intentPutExtra.setPackage(context.getPackageName());
        }
        int i = a;
        a = i + 1;
        return PendingIntent.getBroadcast(context, i, intentPutExtra, 67108864);
    }

    public static final int c(kjz kjzVar) {
        return ((kju) kjzVar.b).b;
    }

    public static final int d(kjz kjzVar) {
        return ((kju) kjzVar.b).a;
    }

    public static final List e(List list, int i) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (a.Y(((kjz) obj).a.a, i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final eqj f(kjz kjzVar) {
        kjzVar.getClass();
        return kjq.a.a().b(kjzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.kjz r9, java.lang.Object r10, defpackage.afck r11) {
        /*
            boolean r0 = r11 instanceof defpackage.kjr
            if (r0 == 0) goto L13
            r0 = r11
            kjr r0 = (defpackage.kjr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kjr r0 = new kjr
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r11)
            aezw r11 = (defpackage.aezw) r11
            java.lang.Object r9 = r11.a
            return r9
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.woy.dF(r11)
            r10.getClass()
            kkh r11 = r9.a()
            java.util.ArrayDeque r2 = r11.i
            monitor-enter(r2)
            r2.addLast(r10)     // Catch: java.lang.Throwable -> L7c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7c
            aivh r4 = r11.j     // Catch: java.lang.Throwable -> L79
            r5 = 0
            if (r4 == 0) goto L4c
            r4.s(r5)     // Catch: java.lang.Throwable -> L79
        L4c:
            aitx r4 = r11.h     // Catch: java.lang.Throwable -> L79
            gfw r6 = new gfw     // Catch: java.lang.Throwable -> L79
            r7 = 16
            r6.<init>(r11, r5, r7)     // Catch: java.lang.Throwable -> L79
            r7 = 0
            r8 = 3
            aivh r4 = defpackage.ahnc.d(r4, r5, r7, r6, r8)     // Catch: java.lang.Throwable -> L79
            r11.j = r4     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r2)
            kkc r2 = new kkc
            r2.<init>(r10)
            r11.j(r2)
            kjo r11 = defpackage.kjq.a
            kjq r11 = r11.a()
            klq r9 = r9.a
            r0.b = r3
            java.lang.Object r9 = defpackage.kjq.h(r11, r9, r10, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            return r9
        L79:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7c
            throw r9     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jul.g(kjz, java.lang.Object, afck):java.lang.Object");
    }

    public static final void h(CarAction carAction) {
        carAction.getClass();
        kjq.a.a().l(carAction.a);
    }

    private static final long i(fwd fwdVar, bux buxVar) {
        return cjn.i(ca.bl(buxVar) ? fwdVar.a : fwdVar.b);
    }
}
