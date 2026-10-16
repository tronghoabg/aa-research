package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wvv {
    public int a;
    public boolean b;
    public final Object c;

    public wvv(int i, ykd ykdVar) {
        this.c = new WeakReference(ykdVar);
        this.a = i;
    }

    final boolean a(ykd ykdVar) {
        return ykdVar != null && ((WeakReference) this.c).get() == ykdVar;
    }

    public wvv(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }
}
