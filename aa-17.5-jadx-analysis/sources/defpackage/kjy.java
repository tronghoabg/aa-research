package defpackage;

import android.content.Context;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.control.CarAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class kjy implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kjy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        switch (this.b) {
            case 0:
                return new kkh((kjz) this.a);
            case 1:
                kjo kjoVar = kjq.a;
                mki.a.f();
                CarInfo carInfoD = oni.d((qrn) this.a);
                if (carInfoD != null) {
                    return carInfoD;
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                CarAction carAction = ((kji) this.a).a;
                int i = kkz.a;
                jul.h(carAction);
                return afak.a;
            case 3:
                Object obj = this.a;
                int i2 = kkz.a;
                jul.h((CarAction) obj);
                return afak.a;
            case 4:
                return eqy.b(((kla) this.a).a(), new kki(5));
            case 5:
                return eqy.b(((kla) this.a).a(), new kki(4));
            case 6:
                return "ControlsHistoryManager-".concat(String.valueOf(((klj) this.a).b.d));
            case 7:
                fww.F((Context) this.a, "Simple Inline Notification no Icon");
                return afak.a;
            case 8:
                fww.F((Context) this.a, "Simple Inline Notification with Icon in Subtitle");
                return afak.a;
            case 9:
                fww.E((Context) this.a, "Simple Inline Notification with Message Count");
                return afak.a;
            case 10:
                fww.H((Context) this.a, "Play Aloud clicked");
                return afak.a;
            case 11:
                fww.H((Context) this.a, "Reply clicked");
                return afak.a;
            case 12:
                fww.H((Context) this.a, "Mute clicked");
                return afak.a;
            case 13:
                fww.H((Context) this.a, "Thumbs up clicked");
                return afak.a;
            case 14:
                fww.H((Context) this.a, "Thumbs down clicked");
                return afak.a;
            case 15:
                fww.H((Context) this.a, "Answer clicked");
                return afak.a;
            case 16:
                fww.H((Context) this.a, "Decline clicked");
                return afak.a;
            case 17:
                fww.H((Context) this.a, "Message clicked");
                return afak.a;
            case 18:
                fww.E((Context) this.a, "Single Action Notification");
                return afak.a;
            case 19:
                fww.E((Context) this.a, "Incoming Call Notification");
                return afak.a;
            default:
                fww.E((Context) this.a, "Simple Inline Notification with Message Count over 9");
                return afak.a;
        }
    }
}
