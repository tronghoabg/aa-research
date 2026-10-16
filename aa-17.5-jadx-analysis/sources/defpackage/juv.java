package defpackage;

import android.content.Intent;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class juv extends nyh implements lhg {
    public static final yph a = yph.c("CarApp.H");
    public final Intent b;
    public boolean c;
    private final Map d;

    public juv() {
        super("TemplateCallingAppProvider");
        this.d = new ConcurrentHashMap();
        this.c = false;
        Intent intent = new Intent("androidx.car.app.CarAppService");
        this.b = intent;
        intent.addCategory("androidx.car.app.category.CALLING");
    }

    public static juv a() {
        return (juv) mki.a.b(juv.class, new jqw(2));
    }

    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        return (yfq) Map.EL.computeIfAbsent(this.d, nyjVar, new jxf(this, qrnVar, 1));
    }

    @Override // defpackage.lhg
    public final void c() {
        this.d.clear();
    }

    @Override // defpackage.lhg
    public final void d() {
        this.d.clear();
    }
}
