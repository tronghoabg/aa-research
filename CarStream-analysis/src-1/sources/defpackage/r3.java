package defpackage;

import androidx.car.app.model.OnClickListener;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class r3 implements OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s3 c;

    public /* synthetic */ r3(s3 s3Var, int i, int i2) {
        this.a = i2;
        this.c = s3Var;
        this.b = i;
    }

    @Override // androidx.car.app.model.OnClickListener
    public final void onClick() {
        switch (this.a) {
            case 0:
                s3.c(this.c, this.b);
                break;
            default:
                s3.c(this.c, this.b);
                break;
        }
    }
}
