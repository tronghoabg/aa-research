package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uqa implements ackr {
    private final acku a;
    private final /* synthetic */ int b;

    public uqa(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new gms((Executor) ((uxv) this.a).b());
            case 1:
                return new ykd(this.a);
            case 2:
                ackq.b(this.a);
                return new uqw();
            case 3:
                ackq.b(this.a);
                return new std(null, null);
            case 4:
                return new kex(this.a);
            case 5:
                return new std(null);
            case 6:
                return xvy.a;
            case 7:
                return (lvl) ((xxh) ((acks) this.a).b).d(new lvl());
            case 8:
                return new uxz((tmb) this.a.a());
            case 9:
                return new uya(ackq.b(this.a));
            case 10:
                return new htm(((uyq) this.a).b(), (byte[]) null);
            case 11:
                return new aacq(ackq.b(this.a));
            case 12:
                xxh xxhVarB = ((uyq) this.a).b();
                yra yraVar = yrc.c;
                String str = yraVar.a;
                int i = yraVar.f;
                yra yraVar2 = new yra(str, false, 2, yraVar.c, yraVar.d, yraVar.e);
                String str2 = (String) xxhVarB.d("");
                return !str2.isEmpty() ? new yra(str2, yraVar2.b, 2, yraVar2.c, yraVar2.d, yraVar2.e) : yraVar2;
            case 13:
                return woy.al(null);
            case 14:
                return new kex((Context) this.a.a(), (byte[]) null);
            case 15:
                try {
                    return new JSONObject(((uzl) this.a.a()).a.toString());
                } catch (JSONException unused) {
                    return new JSONObject();
                }
            case 16:
                try {
                    return new JSONObject(((uzm) this.a.a()).a.toString());
                } catch (JSONException unused2) {
                    return new JSONObject();
                }
            case 17:
                return new uzl(ackq.b(this.a));
            case 18:
                return new uzm(ackq.b(this.a));
            case 19:
                vuz vuzVar = (vuz) ((aezk) ((xxh) this.a.a()).d(new qed(17))).a();
                vuzVar.getClass();
                return vuzVar;
            default:
                return new vlo((Context) ((acks) this.a).b);
        }
    }
}
