package defpackage;

import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class ntz {
    public GhIcon a;
    public CarIcon b;
    public GhIcon c;
    public String d;
    public String e;
    public nul f;
    public nua g;
    public nul h;
    public PendingIntent i;
    public String j;
    private long k;
    private byte l;

    public final nub a() {
        nua nuaVar;
        if (this.l == 1 && (nuaVar = this.g) != null) {
            return new nub(this.a, this.b, this.c, this.d, this.e, this.f, nuaVar, this.h, this.i, this.k, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" showWhenFormat");
        }
        if (this.l == 0) {
            sb.append(" timestampMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.k = j;
        this.l = (byte) 1;
    }
}
