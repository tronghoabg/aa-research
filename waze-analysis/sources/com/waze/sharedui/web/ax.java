package com.waze.sharedui.web;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39342a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f39343b = com.waze.shared_infra.i.a.d("WebViewUtils");

    static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (!"mailto".equals(uri.getScheme())) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(uri);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            f39343b.c("Error while parsing email elements %s", e2);
            return false;
        }
    }
}
