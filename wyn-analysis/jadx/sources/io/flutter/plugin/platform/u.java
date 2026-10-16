package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes5.dex */
public final class u extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final C f37159a;

    /* renamed from: b, reason: collision with root package name */
    public C f37160b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f37161c;

    public u(Context context, C c10, Context context2) {
        super(context);
        this.f37159a = c10;
        this.f37161c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i5 = 0; i5 < stackTrace.length && i5 < 11; i5++) {
            if (stackTrace[i5].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i5].getMethodName().equals("<init>")) {
                return this.f37161c.getSystemService(str);
            }
        }
        if (this.f37160b == null) {
            this.f37160b = this.f37159a;
        }
        return this.f37160b;
    }
}
