package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zda implements Cloneable, Serializable {
    private static final long serialVersionUID = -8238943980617262692L;
    public final Charset a;
    public String b;
    public String c;
    public String d;
    public String e;
    private zdc f;

    public zda(Charset charset) {
        charset.getClass();
        this.a = charset;
    }

    public final zdc a() {
        zdc zdcVar = this.f;
        if (zdcVar != null) {
            return zdcVar;
        }
        zdc zdcVar2 = new zdc();
        this.f = zdcVar2;
        return zdcVar2;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zda zdaVar = new zda();
        String str = this.b;
        if (str != null) {
            zdaVar.b = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            zdaVar.c = str2;
        }
        String str3 = this.d;
        if (str3 != null) {
            zdaVar.d = str3;
        }
        String str4 = this.e;
        if (str4 != null) {
            zdaVar.e = str4;
        }
        zdc zdcVar = this.f;
        if (zdcVar != null) {
            zdaVar.f = zdcVar.clone();
        }
        return zdaVar;
    }

    public final String toString() throws IOException {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        zdc zdcVar = this.f;
        String strO = null;
        if (zdcVar != null && !zdcVar.A()) {
            strO = zeb.o(zdcVar, this.a);
        }
        return new zcz(str, str2, str3, strO, this.e, this.a).toString();
    }

    public zda() {
        this.a = zdb.a;
    }
}
