package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f32476a = 504;

    /* renamed from: b, reason: collision with root package name */
    public static String f32477b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f32478c;

    /* renamed from: d, reason: collision with root package name */
    private static Context f32479d;

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f32478c)) {
                f32478c = (String) com.pgl.ssdk.ces.a.meta(303, f32479d, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f32478c;
    }

    public static void b() {
        Context context = f32479d;
        if (context != null) {
            ar.b(new ao(context, Sdk.SDKError.Reason.MRAID_ERROR_VALUE, null));
            f32476a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static void a(Context context, String str) {
        if (f32479d == null) {
            f32479d = context;
        }
        int i5 = f32476a;
        if (i5 == 102 || i5 == 202 || i5 == 200) {
            return;
        }
        f32477b = str;
        f32476a = 102;
        ar.b(new ao(context, Sdk.SDKError.Reason.MRAID_ERROR_VALUE, null));
    }

    public static synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length > 0) {
                Object objMeta = com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, f32479d, bArr);
                if ((objMeta instanceof Integer) && ((Integer) objMeta).intValue() == 0) {
                    f32476a = 200;
                } else if (objMeta instanceof String) {
                    f32478c = (String) objMeta;
                    f32476a = 200;
                }
            }
        }
    }
}
