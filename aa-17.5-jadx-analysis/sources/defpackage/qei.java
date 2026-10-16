package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import com.google.android.apps.auto.carservice.service.impl.GearheadCarStartupService;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class qei implements xyc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qei(Context context, Class cls, xyc xycVar, int i) {
        this.d = i;
        this.a = context;
        this.b = cls;
        this.c = xycVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xyc] */
    @Override // defpackage.xyc
    public final Object gu() {
        int i = this.d;
        if (i == 0) {
            int i2 = qer.g;
            return new lwl((Context) this.a, (Class) this.b, (ltx) this.c.gu());
        }
        if (i != 1) {
            int i3 = ysy.a;
            int i4 = yti.a;
            yth ythVar = new yth();
            ythVar.e(((String) this.c).getBytes());
            ythVar.a.put((byte) 0);
            ythVar.h();
            ythVar.e(((String) this.b).getBytes());
            return ((ytq) ((nfh) this.a).b).i(ythVar.l().e());
        }
        Object obj = this.b;
        Context context = (Context) obj;
        jqj jqjVar = new jqj(context, new Configuration(((GearheadCarStartupService) obj).getResources().getConfiguration()), (Handler) this.a, (jnw) this.c);
        jqjVar.l = true;
        jox joxVar = jqjVar.i;
        jgw jgwVar = new jgw(jqjVar, 10);
        CountDownLatch countDownLatch = jqjVar.d;
        countDownLatch.getClass();
        joxVar.b(jgwVar, new jgw(countDownLatch, 11));
        return jqjVar;
    }

    public /* synthetic */ qei(GearheadCarStartupService gearheadCarStartupService, jnw jnwVar, Handler handler, int i) {
        this.d = i;
        this.b = gearheadCarStartupService;
        this.c = jnwVar;
        this.a = handler;
    }

    public /* synthetic */ qei(nfh nfhVar, String str, String str2, int i) {
        this.d = i;
        this.a = nfhVar;
        this.c = str;
        this.b = str2;
    }
}
