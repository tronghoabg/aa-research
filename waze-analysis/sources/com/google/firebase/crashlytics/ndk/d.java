package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i2 = JniNativeApi.f9790a;
        return str.toLowerCase().endsWith(".apk");
    }
}
