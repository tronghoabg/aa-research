package com.google.firebase.sessions;

import android.util.Base64;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10996a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final String f10997b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f10998c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f10999d;

    static {
        String strEncodeToString = Base64.encodeToString(h.n.o.q(q.b()), 10);
        f10997b = strEncodeToString;
        f10998c = "firebase_session_" + strEncodeToString + "_data";
        f10999d = "firebase_session_" + strEncodeToString + "_settings";
    }

    public static final String a() {
        return f10998c;
    }

    public static final String b() {
        return f10999d;
    }
}
