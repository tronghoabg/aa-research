package defpackage;

import android.content.ComponentName;
import android.telephony.SmsMessage;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.stream.Stream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import mesquite.messaging.model.Container;

/* loaded from: classes.dex */
public final class lva implements luh, lhg {
    static final Container a;
    public static final /* synthetic */ int c = 0;
    public final Map b = new LinkedHashMap();
    private final eqm d;
    private final Consumer e;

    static {
        Container.Builder builder = new Container.Builder();
        builder.b("SMS_CONTAINER");
        a = builder.a();
    }

    public lva() {
        eqm eqmVar = new eqm();
        this.d = eqmVar;
        this.e = new kok(this, 6);
        int i = yfq.d;
        eqmVar.m(yls.a);
    }

    public static lva h() {
        return (lva) mki.a.i(lva.class);
    }

    public static String i(SmsMessage smsMessage) {
        String originatingAddress = smsMessage.getOriginatingAddress();
        originatingAddress.getClass();
        return String.valueOf(originatingAddress.hashCode());
    }

    @Override // defpackage.luh
    public final eqj a() {
        yfq yfqVarQ = yfq.q(a);
        afco afcoVar = tby.a;
        return new eqm(yfqVarQ);
    }

    @Override // defpackage.luh
    public final eqj b(Container container) {
        return this.d;
    }

    @Override // defpackage.lhg
    public final void c() {
        lwx.a().b(this.e);
    }

    @Override // defpackage.lhg
    public final void d() {
        lwx.a().e(this.e);
        this.b.clear();
        j();
    }

    @Override // defpackage.luh
    public final luj e() {
        lui luiVar = new lui();
        ComponentName componentName = mkn.r;
        luiVar.a = GhIcon.j(componentName);
        luiVar.c(mki.a.c.getString(R.string.sms_app_name));
        luiVar.b(-65281);
        luiVar.d(componentName);
        return luiVar.a();
    }

    @Override // defpackage.luh
    public final void f(String str) {
        throw null;
    }

    @Override // defpackage.luh
    public final void g(lug lugVar) {
        throw null;
    }

    public final void j() {
        Stream streamSorted = Collection.EL.stream(this.b.values()).map(new lyd(1)).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(new luz(0))));
        int i = yfq.d;
        this.d.m((yfq) streamSorted.collect(ycm.a));
    }
}
