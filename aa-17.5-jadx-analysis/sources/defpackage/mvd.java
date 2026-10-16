package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final /* synthetic */ class mvd implements afdr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ mvd(boolean z, int i, int i2) {
        this.c = i2;
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.c;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i != 0) {
            int i3 = this.b;
            if (true != this.a) {
                i2 = i3;
            }
            return Integer.valueOf(i2);
        }
        yph yphVar = mvk.a;
        int i4 = this.b;
        if (true != this.a) {
            i2 = i4;
        }
        return Integer.valueOf(i2);
    }
}
