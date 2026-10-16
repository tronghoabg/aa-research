package defpackage;

import android.content.Context;
import java.util.Random;

/* loaded from: classes.dex */
public final class tfv implements ackr {
    private final acku a;
    private final /* synthetic */ int b;

    public tfv(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new wba(((Boolean) ((acks) this.a).b).booleanValue());
            case 1:
                float fFloatValue = ((Float) ((acks) this.a).b).floatValue();
                vwz vwzVarD = vxa.d();
                vwzVarD.b(fFloatValue);
                vwzVarD.d = 3;
                return vwzVarD.a();
            case 2:
                vto vtoVar = (vto) ((vqu) ((aezk) ((xxh) this.a.a()).d(new qev(4))).a());
                vtoVar.getClass();
                return vtoVar;
            case 3:
                vsh vshVar = (vsh) spu.aJ((xxh) ((acks) this.a).b, new qed(16));
                vshVar.getClass();
                return vshVar;
            case 4:
                vso vsoVar = (vso) ((vqu) ((aezk) ((xxh) this.a.a()).d(new qev(8))).a());
                vsoVar.getClass();
                return vsoVar;
            case 5:
                vtw vtwVar = (vtw) spu.aJ((xxh) ((acks) this.a).b, new qed(12));
                vtwVar.getClass();
                return vtwVar;
            case 6:
                xxh xxhVar = (xxh) ((acks) this.a).b;
                return xxhVar.f() ? xxh.g((vrp) ((aezk) xxhVar.b()).a()) : xvy.a;
            case 7:
                vum vumVar = (vum) spu.aJ((xxh) ((acks) this.a).b, new qed(13));
                vumVar.getClass();
                return vumVar;
            case 8:
                vwo vwoVar = (vwo) ((vqu) ((aezk) ((xxh) this.a.a()).d(new qev(5))).a());
                vwoVar.getClass();
                return vwoVar;
            case 9:
                xxh xxhVar2 = (xxh) ((acks) this.a).b;
                vlk vlkVar = new vlk(null);
                woy.ab(vlkVar.b > 0, "Thread pool size must be less than or equal to %s", 2);
                return (vlk) xxhVar2.d(vlkVar);
            case 10:
                vxa vxaVar = (vxa) ((vqu) ((aezk) ((xxh) this.a.a()).d(new qev(7))).a());
                vxaVar.getClass();
                return vxaVar;
            case 11:
                vxl vxlVar = (vxl) spu.aJ((xxh) ((acks) this.a).b, new qed(15));
                vxlVar.getClass();
                return vxlVar;
            case 12:
                return new vrw((Context) ((acks) this.a).b);
            case 13:
                return new Random(((tmb) this.a.a()).a());
            case 14:
                vla vlaVar = (vla) this.a.a();
                vla.b(vlaVar);
                vlaVar.getClass();
                return vlaVar;
            case 15:
                return (tmb) ((xxh) ((acks) this.a).b).d(new tme());
            case 16:
                return new vle((tmb) this.a.a());
            case 17:
                return new vpb(ackq.b(this.a));
            case 18:
                Boolean bool = (Boolean) ((xxh) ((acks) this.a).b).d(false);
                bool.booleanValue();
                return bool;
            case 19:
                return new vqm((vrw) this.a.a());
            default:
                return new vqn((vqm) this.a.a());
        }
    }
}
