package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class kon {
    public final List a;
    public final boolean b;
    public final Handler c;
    public Handler e;
    public final pba g;
    public final ycc h;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public int f = 0;

    public kon(Handler handler, pba pbaVar, ycc yccVar) {
        this.g = pbaVar;
        pau pauVar = (pbaVar.c == 11 ? (pav) pbaVar.d : pav.a).e;
        this.a = (pauVar == null ? pau.a : pauVar).b;
        pau pauVar2 = (pbaVar.c == 11 ? (pav) pbaVar.d : pav.a).e;
        this.b = (pauVar2 == null ? pau.a : pauVar2).c;
        this.h = yccVar;
        this.c = handler;
    }

    public final boolean a() {
        return this.f >= this.a.size();
    }
}
