package com.google.firebase.crashlytics.a;

import com.google.firebase.crashlytics.a.e.cy;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface a {
    j getSessionFileProvider(String str);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(String str);

    void prepareNativeSession(String str, String str2, long j2, cy cyVar);
}
