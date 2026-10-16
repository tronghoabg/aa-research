package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import androidx.collection.ArrayMap;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5988a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5989b;

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayMap f5990c = new ArrayMap();

    public static File a(Context context) {
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

    public static boolean b() {
        Boolean boolValueOf = f5989b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Process.isIsolated());
            f5989b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri c() {
        ArrayMap arrayMap = f5990c;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.fido");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.fido"))));
        arrayMap.put("com.google.android.gms.fido", uri2);
        return uri2;
    }
}
