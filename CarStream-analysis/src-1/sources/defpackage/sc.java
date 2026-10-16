package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class sc implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ r9 b;
    public final /* synthetic */ s9 c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ int e;

    public sc(Context context, r9 r9Var, s9 s9Var, int[] iArr, int i) {
        this.a = context;
        this.b = r9Var;
        this.c = s9Var;
        this.d = iArr;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec.n(this.a, this.b, this.c, this.d, this.e + 1);
    }
}
