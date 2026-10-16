package androidx.activity;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f17711a;

    public h(ComponentActivity componentActivity) {
        this.f17711a = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e7) {
            if (!TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e7;
            }
        } catch (NullPointerException e10) {
            if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }
}
