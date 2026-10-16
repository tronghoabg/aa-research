package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes4.dex */
abstract class y {

    /* renamed from: b, reason: collision with root package name */
    private final String f27256b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27257c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27259e;

    /* renamed from: a, reason: collision with root package name */
    private final i8.y f27255a = new i8.y("IntegrityDialogWrapper");

    /* renamed from: d, reason: collision with root package name */
    private final Object f27258d = new Object();

    public y(String str, long j8) {
        this.f27256b = str;
        this.f27257c = j8;
    }

    public final Task a(Activity activity, int i5) {
        synchronized (this.f27258d) {
            try {
                if (this.f27259e) {
                    return Tasks.forResult(0);
                }
                this.f27259e = true;
                i8.y yVar = this.f27255a;
                Object[] objArr = {Integer.valueOf(i5)};
                yVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", i8.y.c(yVar.f36914a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i5);
                bundle.putString("package.name", this.f27256b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f27257c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
