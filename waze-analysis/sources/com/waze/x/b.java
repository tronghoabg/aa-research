package com.waze.x;

import android.text.TextUtils;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b {
    REFRESH_USER,
    SEND_LOCATION,
    ENABLE_LOCATION_HISTORY;


    /* renamed from: e, reason: collision with root package name */
    private final String f45523e;

    b() {
        this.f45523e = TextUtils.isEmpty(null) ? name().toLowerCase() : null;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        return (b) d.f45536b.get(str);
    }
}
