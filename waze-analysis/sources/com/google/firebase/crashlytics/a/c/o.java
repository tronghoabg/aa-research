package com.google.firebase.crashlytics.a.c;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f9200a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i2 = this.f9200a;
        if (i2 == 0) {
            int i3 = aa.f9074f;
            return str.startsWith(".ae");
        }
        if (i2 == 1) {
            int i4 = i.f9186a;
            return str.startsWith("aqs.");
        }
        if (i2 != 2) {
            int i5 = com.google.firebase.crashlytics.a.f.a.f9695a;
            return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
        }
        int i6 = com.google.firebase.crashlytics.a.f.a.f9695a;
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }
}
