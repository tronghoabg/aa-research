package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gev {
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
    public android.view.GestureDetector n;
    public boolean o;
    public final defpackage.gem p;
    private final android.content.Context q;
    private final android.os.Handler r;

    public gev(android.content.Context context, defpackage.gem gemVar, android.os.Handler handler) {
        this.q = context;
        this.p = gemVar;
        int scaledTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.i = scaledTouchSlop + scaledTouchSlop;
        this.j = 10;
        this.r = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.c = true;
            if (this.n == null) {
                this.n = new android.view.GestureDetector(context, new defpackage.geu(this), handler);
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
