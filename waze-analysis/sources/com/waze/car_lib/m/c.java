package com.waze.car_lib.m;

import androidx.car.app.CarContext;
import androidx.car.app.notification.CarNotificationManager;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.car_lib.r.au;
import com.waze.car_lib.r.av;
import com.waze.o.an;
import com.waze.o.bh;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c {
    public c() {
    }

    public static boolean c(CarContext carContext) {
        x.f(carContext, "carContext");
        return ContextCompat.checkSelfPermission(carContext, "android.permission.RECORD_AUDIO") == 0;
    }

    public static void d(CarNotificationManager carNotificationManager, String str, int i2) {
        x.f(carNotificationManager, "<this>");
        x.f(str, TtmlNode.ATTR_ID);
        NotificationChannelCompat.Builder builder = new NotificationChannelCompat.Builder(str, i2);
        builder.setName(str);
        carNotificationManager.createNotificationChannel(builder.build());
    }

    public static /* synthetic */ av e(bh bhVar) {
        x.f(bhVar, "builder");
        return new av(bhVar);
    }

    public static /* synthetic */ au f(an anVar) {
        x.f(anVar, "builder");
        return new au(anVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(androidx.car.app.CarContext r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.car_lib.m.b
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.car_lib.m.b r0 = (com.waze.car_lib.m.b) r0
            int r1 = r0.f20330c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20330c = r1
            goto L18
        L13:
            com.waze.car_lib.m.b r0 = new com.waze.car_lib.m.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f20328a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20330c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L28
            goto L51
        L28:
            r6 = move-exception
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            e.b.c.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            java.util.List r2 = h.a.i.d(r2)
            com.waze.car_lib.m.a r5 = new com.waze.car_lib.m.a
            r5.<init>(r8, r3)
            r7.requestPermissions(r2, r5)
            com.waze.car_lib.m.c r6 = (com.waze.car_lib.m.c) r6     // Catch: java.lang.Throwable -> L28
            r0.f20330c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L28
            if (r8 == r1) goto L57
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L28
            r8.booleanValue()     // Catch: java.lang.Throwable -> L28
            goto L5c
        L57:
            return r1
        L58:
            java.lang.Object r8 = e.b.c.a(r6)
        L5c:
            java.lang.Throwable r6 = h.m.c(r8)
            if (r6 != 0) goto L63
            return r8
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.m.c.b(androidx.car.app.CarContext, h.c.e):java.lang.Object");
    }

    public /* synthetic */ c(byte[] bArr, byte[] bArr2) {
    }
}
