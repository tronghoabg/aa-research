package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import t3.C4093m;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f18517a = new t0();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f18518b;

    static {
        v0 v0Var;
        try {
            v0Var = (v0) C4093m.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            v0Var = null;
        }
        f18518b = v0Var;
    }

    public static final void a(ArrayList views, int i5) {
        AbstractC3340k.e(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i5);
        }
    }
}
