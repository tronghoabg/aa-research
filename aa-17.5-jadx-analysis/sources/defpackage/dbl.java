package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* loaded from: classes.dex */
public final class dbl {
    public final afec a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public dbl(Context context, afec afecVar) {
        this.a = afecVar;
        this.d = new GestureDetector(context, new dbk(this));
    }

    public final void a() {
        this.b = 0;
        this.c = true;
    }
}
