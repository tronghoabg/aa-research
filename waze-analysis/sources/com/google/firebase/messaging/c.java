package com.google.firebase.messaging;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10190a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f10191b = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[PHI: r14
  0x0094: PHI (r14v14 int) = (r14v8 int), (r14v13 int) binds: [B:18:0x007b, B:19:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.messaging.b a(android.content.Context r11, android.content.Context r12, com.google.firebase.messaging.v r13, java.lang.String r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c.a(android.content.Context, android.content.Context, com.google.firebase.messaging.v, java.lang.String, android.os.Bundle):com.google.firebase.messaging.b");
    }

    static boolean b(v vVar) {
        return vVar.h("google.c.a.e");
    }

    private static int c() {
        return f10191b.incrementAndGet();
    }

    private static Integer d(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(ContextCompat.getColor(context, i2));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }
}
