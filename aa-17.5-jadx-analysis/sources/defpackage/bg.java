package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class bg<H> extends be {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final bt e;

    public bg(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
        this.e = new bt();
    }

    @Override // defpackage.be
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.be
    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object e();

    public boolean o(String str) {
        str.getClass();
        return false;
    }

    public void u(String[] strArr) {
        strArr.getClass();
    }

    public final void v(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bg(Context context, Handler handler) {
        this(context instanceof Activity ? (Activity) context : null, context, handler);
        handler.getClass();
    }

    public void j() {
    }

    public void q(PrintWriter printWriter, String[] strArr) {
    }
}
