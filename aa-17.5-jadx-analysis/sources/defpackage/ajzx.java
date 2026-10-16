package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ajzx implements Cloneable, Serializable, ajoy {
    private static final ajzy[] c = new ajzy[0];
    private static final long serialVersionUID = -5427236326487562174L;
    public final String a;
    private final String b;

    public ajzx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ajoy
    public final ajzy[] a() throws ajpr {
        String str = this.b;
        if (str == null) {
            return c;
        }
        int length = str.length();
        akaa akaaVar = akaa.a;
        akbh akbhVar = new akbh(length);
        akbhVar.f(str);
        return akaa.a.b(akbhVar, new akao(0, str.length()));
    }

    @Override // defpackage.ajpp
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ajpp
    public final String c() {
        return this.b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return akad.d(null, this).toString();
    }
}
