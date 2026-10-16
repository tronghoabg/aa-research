package defpackage;

import android.app.PendingIntent;
import android.os.SystemClock;
import android.view.View;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class n1 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ n1(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        switch (this.a) {
            case 0:
                o5 o5Var = u1.e;
                if (u1.c == 2 && o5Var != null && u1.a(o5Var.g)) {
                    u1.c(4);
                    break;
                }
                break;
            case 1:
                o5 o5Var2 = u1.e;
                if (u1.c == 2 && o5Var2 != null && (pendingIntent = o5Var2.f) != null) {
                    u1.d(pendingIntent, "tra loi");
                    u1.g = o5Var2.b;
                    u1.h = SystemClock.elapsedRealtime();
                    u1.c(3);
                    break;
                }
                break;
            case 2:
                o5 o5Var3 = u1.e;
                if (u1.c == 3 && o5Var3 != null && (pendingIntent2 = o5Var3.h) != null) {
                    u1.d(pendingIntent2, "cup may");
                    u1.c(1);
                    break;
                }
                break;
            case 3:
                y6 y6VarN = z6.n();
                if (y6VarN != null) {
                    ((e) y6VarN).w();
                    break;
                }
                break;
            default:
                y6 y6VarN2 = z6.n();
                if (y6VarN2 != null) {
                    ((e) y6VarN2).l();
                    break;
                }
                break;
        }
    }
}
