package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ixk extends mdd {
    public static final yph a = yph.c("CAR.POWER");
    public final Handler c;
    public final Context d;
    public ixj e;
    public final List b = new ArrayList(10);
    public final AtomicBoolean f = new AtomicBoolean(false);

    public ixk(Context context, Handler handler) {
        this.d = context;
        this.c = handler;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BatteryStateMonitor");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("temperature", -1) / 10;
        int intExtra2 = (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
        float f = intExtra;
        Pair pair = new Pair(new Date(), Float.valueOf(f));
        List list = this.b;
        list.add(pair);
        ixj ixjVar = this.e;
        ixjVar.getClass();
        ixs ixsVar = (ixs) ixjVar;
        ixsVar.e = f;
        ixsVar.d = intExtra2;
        ixsVar.d();
        while (list.size() > 10) {
            list.remove(0);
        }
    }
}
