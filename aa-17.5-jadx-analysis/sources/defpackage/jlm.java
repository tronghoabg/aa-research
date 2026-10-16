package defpackage;

import android.content.ComponentName;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class jlm {
    public boolean a;
    public final ArrayDeque b = new ArrayDeque();
    public final jll c;
    public boolean d;
    public ComponentName e;
    public rwv f;
    final /* synthetic */ jln g;

    public jlm(jln jlnVar) {
        this.g = jlnVar;
        this.c = new jll(jlnVar);
    }

    public final void a() {
        this.a = false;
        this.d = false;
        this.b.clear();
        this.e = null;
        this.f = null;
    }
}
