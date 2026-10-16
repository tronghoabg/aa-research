package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.crossprofile.CrossProfileNotificationPromptManager;
import com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final /* synthetic */ class kpg implements aezk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        switch (this.b) {
            case 0:
                return ((kpn) this.a).d;
            case 1:
                Object obj = this.a;
                yph yphVar = iya.a;
                return skn.a((Context) obj);
            case 2:
                yph yphVar2 = kpn.a;
                return ((lbi) mki.a.i(lbi.class)).a((Context) this.a, "connectivity_session_id_file");
            case 3:
                yph yphVar3 = mse.a;
                return this.a;
            case 4:
                yph yphVar4 = mse.a;
                return this.a;
            case 5:
                yph yphVar5 = mse.a;
                return new mpk((CarRegionId) this.a);
            case 6:
                int i = qer.g;
                return new kwo((Context) this.a);
            case 7:
                int i2 = qer.g;
                return new CrossProfileNotificationPromptManager((Context) this.a);
            case 8:
                int i3 = qer.g;
                return new off((Context) this.a);
            case 9:
                int i4 = qer.g;
                return new DoNotDisturbCallManagerImpl((Context) this.a);
            case 10:
                int i5 = qer.g;
                return new mdf((Context) this.a);
            case 11:
                int i6 = qer.g;
                return this.a;
            case 12:
                int i7 = qer.g;
                return this.a;
            case 13:
                int i8 = qer.g;
                return new lgp((Context) this.a);
            case 14:
                int i9 = qer.g;
                return new mom((Context) this.a);
            case 15:
                int i10 = qer.g;
                return new onu((Context) this.a);
            case 16:
                int i11 = qer.g;
                return new lmm((Context) this.a);
            case 17:
                int i12 = qer.g;
                return new lpq((Context) this.a);
            case 18:
                int i13 = qer.g;
                return new loy((Context) this.a);
            case 19:
                int i14 = qer.g;
                return new lne((Context) this.a, new lsq());
            default:
                int i15 = qer.g;
                return new nrz((Context) this.a);
        }
    }
}
