package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al {
    static SharedPreferences a(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    static void c(bm bmVar) {
        bmVar.addListener(new android.support.v4.app.ae(bmVar, 17), cf.y());
    }
}
