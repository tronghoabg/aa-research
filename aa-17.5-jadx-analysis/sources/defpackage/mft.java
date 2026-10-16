package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class mft extends Fragment {
    public final Handler a;
    public final Runnable b;
    private final epy c;

    public mft(int i) {
        super(i);
        this.a = new Handler(Looper.getMainLooper());
        this.b = new jgw(this, 18, null);
        this.c = new mfs(this, 0);
    }

    public abstract void a(View view);

    @Override // android.support.v4.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!ldz.a.a().b()) {
            return layoutInflaterOnGetLayoutInflater;
        }
        Context context = layoutInflaterOnGetLayoutInflater.getContext();
        context.getClass();
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new pi(context, kfl.i()));
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        a(view);
        getLifecycle().c(this.c);
    }
}
