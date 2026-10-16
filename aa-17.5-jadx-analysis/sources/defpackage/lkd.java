package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final /* synthetic */ class lkd implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lkd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, lkc] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, lkc] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, lkc] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, lkc] */
    /* JADX WARN: Type inference failed for: r2v50, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        switch (this.b) {
            case 0:
                return (qx) ((qz) this.a).a().a(qx.class);
            case 1:
                mki.a.g();
                ols.E(kio.b().e(), (CarRegionId) ((pxp) this.a).a);
                return afak.a;
            case 2:
                lkl lklVar = (lkl) this.a;
                lklVar.b.invoke();
                lklVar.a();
                return afak.a;
            case 3:
                ((qn) this.a).c();
                return afak.a;
            case 4:
                this.a.invoke();
                return afak.a;
            case 5:
                qx qxVarG = ((qw) this.a).g();
                qxVarG.getClass();
                qxVarG.e("BROWSE");
                return afak.a;
            case 6:
                ((qw) this.a).g().c();
                return afak.a;
            case 7:
                ((qw) this.a).g().c();
                return afak.a;
            case 8:
                ((qw) this.a).g().c();
                return afak.a;
            case 9:
                this.a.g();
                return afak.a;
            case 10:
                this.a.h();
                return afak.a;
            case 11:
                this.a.g();
                return afak.a;
            case 12:
                this.a.h();
                return afak.a;
            case 13:
                ((ltn) this.a).c();
                return afak.a;
            case 14:
                int i = lzf.a;
                mki.a.g();
                return Boolean.valueOf(ols.z((qrn) this.a, raj.O));
            case 15:
                this.a.invoke();
                return afak.a;
            case 16:
                ((qw) this.a).g().c();
                return afak.a;
            case 17:
                Bundle arguments = ((Fragment) this.a).getArguments();
                boolean z = false;
                if (arguments != null && arguments.getBoolean("IS_HORIZONTAL")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return roc.am((ProjectionWindowAnimationChoreography) this.a);
            case 19:
                int i2 = mug.e;
                mki.a.g();
                return ols.v((qrn) this.a, CarDisplayId.a);
            default:
                return roc.am((ProjectionWindowAnimationChoreography) this.a);
        }
    }
}
