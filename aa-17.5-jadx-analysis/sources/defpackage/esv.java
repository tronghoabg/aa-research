package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* loaded from: classes2.dex */
public class esv {
    public int c;
    public final Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;
    public esn j;

    public esv(Context context) {
        this.d = context.getApplicationContext();
    }

    public static final String q(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    @Deprecated
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public void k(Object obj) {
        esn esnVar = this.j;
        if (esnVar != null) {
            if (esm.d(2)) {
                Objects.toString(esnVar);
                Log.v("LoaderManager", "onLoadComplete: ".concat(esnVar.toString()));
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                esnVar.m(obj);
                return;
            }
            if (esm.d(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            esnVar.j(obj);
        }
    }

    public final void o() {
        if (this.e) {
            g();
        } else {
            this.h = true;
        }
    }

    public final void p() {
        l();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    protected void g() {
    }

    public void h() {
    }

    protected void l() {
    }

    public void m() {
    }

    public void n() {
    }
}
