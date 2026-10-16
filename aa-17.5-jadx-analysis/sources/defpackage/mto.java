package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class mto implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ mto(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.a;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        switch (i) {
            case 0:
                mtp mtpVar = mtr.a;
                return a.Q();
            case 1:
                mtp mtpVar2 = mtr.a;
                return a.Q();
            case 2:
                mud.h.a().j();
                return afak.a;
            case 3:
                return new mtz(3);
            case 5:
                yph yphVar = myi.a;
            case 4:
                return true;
            case 6:
                yph yphVar2 = myi.a;
                return fValueOf;
            case 7:
                yph yphVar3 = myi.a;
                return afak.a;
            case 8:
                yph yphVar4 = myi.a;
                return afak.a;
            case 9:
                yph yphVar5 = myi.a;
                return afak.a;
            case 10:
                yph yphVar6 = myi.a;
                return afak.a;
            case 11:
                yph yphVar7 = myi.a;
                return fValueOf;
            case 12:
                yph yphVar8 = myi.a;
                return afak.a;
            case 13:
                yph yphVar9 = myi.a;
                return afak.a;
            case 14:
                kfl.h().q();
                mwc.a(yzy.Hp, null);
                return afak.a;
            case 15:
                aezr aezrVar = naq.d;
                return Duration.ofMillis(acpc.g());
            case 16:
                int i2 = nca.a;
                mwc.a(yzy.FB, null);
                return afak.a;
            case 17:
                int i3 = nca.a;
                mwc.a(yzy.FC, null);
                ncp ncpVarA = ncj.a.a().a();
                if (ncpVarA.a() instanceof ncv) {
                    ncpVarA.c(nco.a, "dismissed by user");
                }
                return afak.a;
            case 18:
                return new ncj();
            case 19:
                aezr aezrVar2 = ndj.a;
                return Pattern.compile("(\\d{1,2}:)?\\d{2}:\\d{2}$");
            default:
                return new ndn();
        }
    }
}
