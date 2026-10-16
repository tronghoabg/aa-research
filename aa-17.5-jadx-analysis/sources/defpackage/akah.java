package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class akah implements Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    public final ajpt a;
    public final String b;
    public final String c;

    public akah(String str, String str2, ajpt ajptVar) {
        ahgm.e(str, "Method");
        this.b = str;
        this.c = str2;
        ahgm.e(ajptVar, "Version");
        this.a = ajptVar;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return akad.e(null, this).toString();
    }
}
