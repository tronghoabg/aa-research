package defpackage;

import com.google.android.gms.car.CarUiInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class rzs implements rck {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rzs(rnw rnwVar, int i) {
        this.b = i;
        this.a = rnwVar;
    }

    @Override // defpackage.rck
    public final void a(CarUiInfo carUiInfo) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((rnw) obj).w();
            return;
        }
        ror rorVar = ((rzx) obj).g;
        if (rorVar == null) {
            rrd.d(5, "CAR.CLIENT.WM.WIN", null, "Received CarUiInfoChanged after presentation is null. CarUiInfo: %s", carUiInfo);
        } else {
            rzx.r(rorVar, carUiInfo);
        }
    }

    public /* synthetic */ rzs(rzx rzxVar, int i) {
        this.b = i;
        this.a = rzxVar;
    }
}
