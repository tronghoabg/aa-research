package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class gli implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gli(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uw] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, xs] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            gej gejVar = (gej) obj;
            gejVar.getClass();
            int i2 = this.b;
            this.c.sendItemVisibilityChanged(this.a, i2, gejVar);
            return afak.a;
        }
        if (i != 1) {
            qu quVar = (qu) obj;
            quVar.getClass();
            int i3 = this.b;
            this.c.requestItemRange(this.a, i3, quVar);
            return afak.a;
        }
        cun cunVar = (cun) obj;
        cunVar.getClass();
        cuo cuoVar = (cuo) this.c;
        cunVar.r(cuoVar, (this.a - cuoVar.a) / 2, (this.b - cuoVar.b) / 2, BitmapDescriptorFactory.HUE_RED);
        return afak.a;
    }
}
