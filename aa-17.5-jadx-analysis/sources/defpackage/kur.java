package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class kur implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kur(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v34, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz, qsa {
        switch (this.b) {
            case 0:
                fww.F((Context) this.a, "Simple Inline Work Profile Notification");
                return afak.a;
            case 1:
                fww.F((Context) this.a, "Simple Inline Notification with Badged Icon");
                return afak.a;
            case 2:
                fww.F((Context) this.a, "Simple Inline Notification with Message Count");
                return afak.a;
            case 3:
                fww.F((Context) this.a, "Simple Inline Notification with Message Count over 9");
                return afak.a;
            case 4:
                fww.F((Context) this.a, "Single Action Notification");
                return afak.a;
            case 5:
                fww.F((Context) this.a, "Two Action Notification");
                return afak.a;
            case 6:
                fww.F((Context) this.a, "Message Notification");
                return afak.a;
            case 7:
                fww.F((Context) this.a, "Incoming Call Notification");
                return afak.a;
            case 8:
                fww.F((Context) this.a, "Simple Inline Notification");
                return afak.a;
            case 9:
                fww.F((Context) this.a, "Simple Inline Notification no Subtitle");
                return afak.a;
            case 10:
                fww.E((Context) this.a, "Two Action Notification");
                return afak.a;
            case 11:
                ?? r5 = this.a;
                kuw kuwVar = kuw.a;
                ljx ljxVar = (ljx) r5.a();
                if (ljxVar == null) {
                    return new GhIcon(8);
                }
                for (Number number : woy.bi(Integer.valueOf(ljxVar.f), Integer.valueOf(ljxVar.e), Integer.valueOf(ljxVar.d))) {
                    if (number.intValue() != 0) {
                        return GhIcon.r(ljxVar.b, number.intValue());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 12:
                this.a.invoke();
                return afak.a;
            case 13:
                ldy ldyVar = ldz.a;
                mki.a.g();
                return ols.o((qrn) this.a, CarDisplayId.a).b();
            case 14:
                return new cjd(lgi.a((Drawable) this.a));
            case 15:
                return new cjd(lgi.a((Drawable) this.a));
            case 16:
                return new cjd(lgi.a((Drawable) this.a));
            case 17:
                mki.a.g();
                rjr rjrVarX = ols.x(kio.b().e(), CarDisplayId.a);
                ((rox) rjrVarX.b).g(new rcu(rjrVarX, ((lgu) this.a).b(), 11));
                return afak.a;
            case 18:
                return new lgs();
            case 19:
                return new pxp((lgu) this.a);
            default:
                mki.a.g();
                ((lah) ols.x(kio.b().e(), CarDisplayId.a).a).F(new rcs(((lgu) this.a).b(), 9));
                return afak.a;
        }
    }
}
