package defpackage;

import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final /* synthetic */ class mfb implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ mfb(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.c != 0) {
            tj tjVar = (tj) obj;
            tjVar.getClass();
            tjVar.a(CarColor.createCustom(this.a, this.b));
            return afak.a;
        }
        tj tjVar2 = (tj) obj;
        tjVar2.getClass();
        tjVar2.a(CarColor.createCustom(this.a, this.b));
        return afak.a;
    }
}
