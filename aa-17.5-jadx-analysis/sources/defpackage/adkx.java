package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class adkx {
    public final List a;
    public final adis b;
    public final Object[][] c;

    public adkx(List list, adis adisVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        adisVar.getClass();
        this.b = adisVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("addrs", this.a);
        xxgVarAo.b("attrs", this.b);
        xxgVarAo.b("customOptions", Arrays.deepToString(this.c));
        return xxgVarAo.toString();
    }
}
