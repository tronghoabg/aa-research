package defpackage;

import android.os.Process;
import com.google.android.gms.car.diagnostics.CriticalError;

/* loaded from: classes.dex */
public final /* synthetic */ class sgu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ sgu(int i, int i2, Runnable runnable, int i3) {
        this.d = i3;
        this.a = i;
        this.b = i2;
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = this.d;
        int i2 = 1;
        if (i == 0) {
            yop yopVarAi = qsr.a.h().ai(7869);
            int i3 = this.b;
            int i4 = this.a;
            yopVarAi.B("Critical protocol error %d (%d)", i4, i3);
            wyd wydVar = ((sgw) this.c).a.h;
            ((qsr) wydVar.a).d.post(new sgu(wydVar, i4, i3, i2));
            return;
        }
        if (i == 1) {
            ((qsr) ((wyd) this.c).a).p(new CriticalError(this.a, this.b));
            return;
        }
        int[] iArr = tmi.a;
        int i5 = this.a;
        if (i5 <= 0 || i5 > 10) {
            throw new IllegalArgumentException("Invalid java priority: " + i5);
        }
        int i6 = this.b;
        if (tmi.a[i5 - 1] != i6) {
            Process.setThreadPriority(i6);
        }
        this.c.run();
    }

    public /* synthetic */ sgu(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
