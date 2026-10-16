package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dom {
    public final dpl a;
    public int b;
    public int c;
    private int d;
    private final ArrayList e;
    private ajmd f;

    public dom(byte[] bArr) {
        new ArrayList();
        this.a = new dpl(new char[0]);
        this.c = 1000;
    }

    public static cfy h(cfy cfyVar, doj dojVar, afec afecVar) {
        return cfyVar.a(new doo(dojVar, afecVar));
    }

    public final int a() {
        int i = this.c;
        this.c = i + 1;
        return i;
    }

    public final dok b(float f) throws dpm {
        dos dosVar = new dos(Integer.valueOf(a()));
        dpl dplVarD = d(dosVar);
        dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "hGuideline");
        dplVarD.s("start", f);
        e(7);
        e(Float.floatToIntBits(f));
        return new dok(dosVar.h, 0, dosVar);
    }

    public final dol c(float f) throws dpm {
        dos dosVar = new dos(Integer.valueOf(a()));
        dpl dplVarD = d(dosVar);
        dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "vGuideline");
        dplVarD.s("start", f);
        e(1);
        e(Float.floatToIntBits(f));
        return new dol(dosVar.h, 0, dosVar);
    }

    public final dpl d(dos dosVar) throws dpm {
        String string = dosVar.a().toString();
        dpl dplVar = this.a;
        if (dplVar.l(string) == null) {
            dplVar.r(string, new dpl(new char[0]));
        }
        dph dphVarI = dplVar.i(string);
        if (dphVarI instanceof dpl) {
            return (dpl) dphVarI;
        }
        throw new dpm("no object found for key <" + string + ">, found [" + dphVarI.y() + "] : " + String.valueOf(dphVarI), dplVar);
    }

    public final void e(int i) {
        this.b = ((this.b * 1009) + i) % 1000000007;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dom) {
            return affa.f(this.a, ((dom) obj).a);
        }
        return false;
    }

    public final doj f() {
        int i = this.d;
        this.d = i + 1;
        ArrayList arrayList = this.e;
        doj dojVar = (doj) woy.bI(arrayList, i);
        if (dojVar != null) {
            return dojVar;
        }
        doj dojVar2 = new doj(Integer.valueOf(this.d));
        arrayList.add(dojVar2);
        return dojVar2;
    }

    public final void g() {
        ((dpg) this.a).a.clear();
        this.c = 1000;
        this.b = 0;
        this.d = 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final dok i(dos[] dosVarArr) throws dpm {
        dos dosVar = new dos(Integer.valueOf(a()));
        dpf dpfVar = new dpf(new char[0]);
        int i = 0;
        while (true) {
            if (i >= dosVarArr.length) {
                break;
            }
            dpfVar.q(dpn.a(dosVarArr[i].a().toString()));
            i++;
        }
        dpl dplVarD = d(dosVar);
        dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
        dplVarD.t("direction", "bottom");
        dplVarD.s("margin", BitmapDescriptorFactory.HUE_RED);
        dplVarD.r("contains", dpfVar);
        e(15);
        for (dos dosVar2 : dosVarArr) {
            e(dosVar2.hashCode());
        }
        e(Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED));
        return new dok(dosVar.h, 0, dosVar);
    }

    public final dol j(dos[] dosVarArr) throws dpm {
        dos dosVar = new dos(Integer.valueOf(a()));
        dpf dpfVar = new dpf(new char[0]);
        int i = 0;
        while (true) {
            if (i >= dosVarArr.length) {
                break;
            }
            dpfVar.q(dpn.a(dosVarArr[i].a().toString()));
            i++;
        }
        dpl dplVarD = d(dosVar);
        dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
        dplVarD.t("direction", "end");
        dplVarD.s("margin", BitmapDescriptorFactory.HUE_RED);
        dplVarD.r("contains", dpfVar);
        e(13);
        for (dos dosVar2 : dosVarArr) {
            e(dosVar2.hashCode());
        }
        e(Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED));
        return new dol(dosVar.h, 0, dosVar);
    }

    public final dol k(dos[] dosVarArr) throws dpm {
        dos dosVar = new dos(Integer.valueOf(a()));
        dpf dpfVar = new dpf(new char[0]);
        int i = 0;
        while (true) {
            if (i >= dosVarArr.length) {
                break;
            }
            dpfVar.q(dpn.a(dosVarArr[i].a().toString()));
            i++;
        }
        dpl dplVarD = d(dosVar);
        dplVarD.t(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, "barrier");
        dplVarD.t("direction", "start");
        dplVarD.s("margin", BitmapDescriptorFactory.HUE_RED);
        dplVarD.r("contains", dpfVar);
        e(10);
        for (dos dosVar2 : dosVarArr) {
            e(dosVar2.hashCode());
        }
        e(Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED));
        return new dol(dosVar.h, 0, dosVar);
    }

    public final ajmd l() {
        ajmd ajmdVar = this.f;
        if (ajmdVar != null) {
            return ajmdVar;
        }
        ajmd ajmdVar2 = new ajmd(this, null);
        this.f = ajmdVar2;
        return ajmdVar2;
    }

    public dom() {
        this((byte[]) null);
    }

    public dom(char[] cArr) {
        this((byte[]) null);
        this.d = 0;
        this.e = new ArrayList();
    }
}
