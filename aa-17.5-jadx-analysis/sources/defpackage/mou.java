package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public abstract class mou {
    public static final yph b = yph.c("GH.IntentInterceptor");
    public final String c;

    public mou(String str) {
        this.c = str;
    }

    protected abstract void a(Intent intent);

    protected abstract boolean b(Intent intent);
}
