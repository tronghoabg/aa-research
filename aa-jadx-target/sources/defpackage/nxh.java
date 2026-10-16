package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nxh {
    public static final defpackage.nxh a;
    public final java.lang.String b;
    public final boolean c;
    public final java.lang.CharSequence d;
    public final java.lang.CharSequence e;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon f;
    public final java.lang.Runnable g;
    public final defpackage.nxg h;
    public final defpackage.nve i;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon j;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon k;
    public final androidx.car.app.model.CarIcon l;
    public final android.app.PendingIntent m;
    public final defpackage.nxj n;
    public final defpackage.nxj o;
    public final defpackage.nxj p;
    public final java.lang.Integer q;
    public final java.lang.Integer r;
    public final boolean s;
    public final int t;
    public final int u;
    public int v;

    static {
        defpackage.nxe nxeVar = new defpackage.nxe("EMPTY_MODEL");
        nxeVar.g = new defpackage.nxg(new defpackage.nxf(defpackage.zbe.UNKNOWN_CONTEXT));
        a = new defpackage.nxh(nxeVar);
    }

    public nxh(defpackage.nxe nxeVar) {
        defpackage.nxg nxgVar = nxeVar.g;
        nxgVar.getClass();
        this.h = nxgVar;
        this.b = nxeVar.a;
        this.c = nxeVar.b;
        this.i = nxeVar.h;
        this.k = nxeVar.j;
        this.l = nxeVar.k;
        this.j = nxeVar.i;
        this.f = nxeVar.e;
        this.d = nxeVar.c;
        this.e = nxeVar.d;
        this.m = nxeVar.l;
        this.n = nxeVar.m;
        this.o = nxeVar.n;
        this.p = nxeVar.o;
        this.g = nxeVar.f;
        this.u = nxeVar.t;
        this.q = nxeVar.p;
        this.r = nxeVar.q;
        this.s = nxeVar.r;
        this.t = nxeVar.s;
        this.v = nxeVar.u;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.nxh)) {
            return false;
        }
        defpackage.nxh nxhVar = (defpackage.nxh) obj;
        if (j$.util.Objects.equals(this.b, nxhVar.b) && this.c == nxhVar.c && defpackage.nxj.c(this.k, nxhVar.k) && j$.util.Objects.equals(this.l, nxhVar.l) && defpackage.nxj.c(this.j, nxhVar.j) && defpackage.nxj.c(this.f, nxhVar.f)) {
            if (this.d.toString().contentEquals(nxhVar.d.toString())) {
                if (this.e.toString().contentEquals(nxhVar.e.toString()) && j$.util.Objects.equals(this.m, nxhVar.m) && j$.util.Objects.equals(this.n, nxhVar.n) && j$.util.Objects.equals(this.o, nxhVar.o) && j$.util.Objects.equals(this.p, nxhVar.p) && j$.util.Objects.equals(this.g, nxhVar.g) && this.u == nxhVar.u && j$.util.Objects.equals(this.q, nxhVar.q) && j$.util.Objects.equals(this.r, nxhVar.r) && this.s == nxhVar.s && this.t == nxhVar.t && this.v == nxhVar.v) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, java.lang.Boolean.valueOf(this.c), this.k, this.j, this.f, this.d, this.e, this.m, this.n, this.o, this.p, this.g, java.lang.Integer.valueOf(this.u), this.q, this.r, java.lang.Boolean.valueOf(this.s), java.lang.Integer.valueOf(this.t), java.lang.Integer.valueOf(this.v)});
    }

    public final java.lang.String toString() {
        char c;
        java.lang.String str;
        java.lang.String str2 = this.b;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.c);
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.k;
        androidx.car.app.model.CarIcon carIcon = this.l;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2 = this.j;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3 = this.f;
        java.lang.CharSequence charSequence = this.d;
        java.lang.CharSequence charSequence2 = this.e;
        android.app.PendingIntent pendingIntent = this.m;
        defpackage.nxj nxjVar = this.n;
        defpackage.nxj nxjVar2 = this.o;
        defpackage.nxj nxjVar3 = this.p;
        java.lang.Runnable runnable = this.g;
        int i = this.u;
        java.lang.String str3 = "null";
        if (i == 1) {
            c = 2;
            str = "SIMPLE";
        } else if (i != 2) {
            c = 2;
            if (i != 3) {
                str = i != 4 ? "null" : "THREE_ACTION";
            } else {
                str = "FEEDBACK";
            }
        } else {
            c = 2;
            str = "CALL";
        }
        java.lang.Integer num = this.q;
        java.lang.Integer num2 = this.r;
        java.lang.String str4 = str;
        defpackage.nxg nxgVar = this.h;
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(this.s);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.t);
        switch (this.v) {
            case 1:
                str3 = "NONE";
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                str3 = "CLOSE_BUTTON";
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                str3 = "CONTENT";
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                str3 = "ACTION_1";
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                str3 = "ACTION_2";
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                str3 = "ACTION_3";
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[20];
        objArr[0] = str2;
        objArr[1] = boolValueOf;
        objArr[c] = ghIcon;
        objArr[3] = carIcon;
        objArr[4] = ghIcon2;
        objArr[5] = ghIcon3;
        objArr[6] = charSequence;
        objArr[7] = charSequence2;
        objArr[8] = pendingIntent;
        objArr[9] = nxjVar;
        objArr[10] = nxjVar2;
        objArr[11] = nxjVar3;
        objArr[12] = runnable;
        objArr[13] = str4;
        objArr[14] = num;
        objArr[15] = num2;
        objArr[16] = nxgVar;
        objArr[17] = boolValueOf2;
        objArr[18] = numValueOf;
        objArr[19] = str3;
        return java.lang.String.format(locale, "HeadsUpViewModel[notificationKey=%s isUserDismissible=%blargeIcon=%s largeCarIcon=%s smallIcon=%s contentIcon=%s titleText=%s descText=%s contentIntent=%s action1=%s action2=%s action3=%s dismissAction=%s templateType=%s backgroundColor=%s themeId=%s TC=%s isWorkData=%b itemCount=%dfocusTarget=%s]", objArr);
    }
}
