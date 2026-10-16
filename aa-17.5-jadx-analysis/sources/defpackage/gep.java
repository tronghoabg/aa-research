package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class gep {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public final int i;
    public final int j;
    public float k;
    public float l;
    public int m = 0;
    public GestureDetector n;
    public boolean o;
    public final geg p;
    private final Context q;
    private final Handler r;

    public gep(Context context, geg gegVar, Handler handler) {
        this.q = context;
        this.p = gegVar;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.i = scaledTouchSlop + scaledTouchSlop;
        this.j = Math.max(10, 0);
        this.r = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.c = true;
            if (this.n == null) {
                this.n = new GestureDetector(context, new geo(this), handler);
            }
        }
        if (i > 22) {
            this.d = true;
        }
    }

    public final boolean a() {
        return this.m != 0;
    }
}
