package defpackage;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class aahh extends zsm {
    private static final String b = "aahh";
    private final aagj c;
    private final aahg d;
    private final boolean e;

    public aahh(aagj aagjVar, aahg aahgVar) {
        aahf aahfVar = aahf.b;
        zkt.n(aagjVar, "key");
        this.c = aagjVar;
        this.d = aahgVar;
        this.e = true;
        zkt.n(aahfVar, "streetViewProtoDefaults");
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final void b() {
        g("onPermanentFailure");
        String str = b;
        if (zrn.e(str, 6)) {
            Log.e(str, String.format("onPermanentFailure(%s)", this.c));
        }
        this.d.c(this.c, true, false, new HashMap());
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aahh)) {
            return false;
        }
        aahh aahhVar = (aahh) obj;
        if (a.C(this.c, aahhVar.c)) {
            boolean z = aahhVar.e;
            if (a.C(true, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zsr
    public final int h() {
        return 40;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, true});
    }

    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
        aagj aagjVar = this.c;
        abnp abnpVarB = aahf.b(aagjVar.b, aagjVar.c, aagjVar.d);
        abnpVarB.t();
        acir acirVar = (acir) abnpVarB.b;
        acir acirVar2 = acir.a;
        acirVar.b |= 1;
        acirVar.c = aagjVar.a;
        acir acirVar3 = (acir) abnpVarB.q();
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("writeRequestData(%s) => %s", aagjVar, wox.at(acirVar3)));
        }
        zrp.b(dataOutputStream, acirVar3);
    }

    @Override // defpackage.zsr
    public final void j(DataInputStream dataInputStream) throws IOException {
        aciy aciyVar = aciy.a;
        aciy aciyVar2 = (aciy) zrp.a(abnv.L(aciy.class), dataInputStream);
        String str = b;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("readResponseData(%s) => %s", this.c, wox.au(aciyVar2)));
        }
        this.d.c(this.c, false, (aciyVar2.b & 128) != 0 && aciyVar2.j, aahf.a(aciyVar2));
    }

    @Override // defpackage.zsm
    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("key", this.c);
        zsaVarA.g("isImmediateRequest", true);
        return zsaVarA.toString();
    }
}
