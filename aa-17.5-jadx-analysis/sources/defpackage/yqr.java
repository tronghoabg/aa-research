package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class yqr extends ypp {
    private final String a;

    protected yqr(String str) {
        this.a = str;
    }

    @Override // defpackage.ypp
    public String f() {
        return this.a;
    }

    @Override // defpackage.ypp
    public void g(RuntimeException runtimeException, ypo ypoVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
