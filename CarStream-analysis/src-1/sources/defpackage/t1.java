package defpackage;

import android.app.PendingIntent;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ t1(int i, o5 o5Var) {
        this.a = i;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = u1.e != null && u1.e.a.equals(this.b.a);
                u1.e = this.b;
                if (z && u1.c != 1) {
                    u1.b();
                    break;
                } else {
                    u1.c(2);
                    break;
                }
            default:
                o5 o5Var = this.b;
                if (u1.e != null && u1.e.b.equals(o5Var.b)) {
                    PendingIntent pendingIntent = o5Var.h;
                    if (pendingIntent == null) {
                        pendingIntent = u1.e.h != null ? u1.e.h : u1.e.g;
                    }
                    PendingIntent pendingIntent2 = pendingIntent;
                    String str = !o5Var.d.isEmpty() ? o5Var.d : u1.e.d;
                    if (pendingIntent2 != o5Var.h || !str.equals(o5Var.d)) {
                        o5Var = new o5(o5Var.a, o5Var.b, o5Var.c, str, o5Var.e, o5Var.f, o5Var.g, pendingIntent2);
                    }
                }
                boolean z2 = u1.c == 3 && u1.e != null && u1.e.a.equals(o5Var.a);
                u1.e = o5Var;
                if (!z2) {
                    u1.c(3);
                    break;
                } else {
                    u1.b();
                    break;
                }
                break;
        }
    }
}
