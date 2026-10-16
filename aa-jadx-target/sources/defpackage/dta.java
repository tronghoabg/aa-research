package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dta {
    public final android.os.Bundle a;
    public final dut[] b;
    public boolean c;
    public boolean d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    @java.lang.Deprecated
    public int i;
    public java.lang.CharSequence j;
    public android.app.PendingIntent k;
    public boolean l;
    private androidx.core.graphics.drawable.IconCompat m;

    public dta(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, dut[] dutVarArr, boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4) {
        this.d = true;
        this.m = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.i = iconCompat.a();
        }
        this.j = defpackage.dte.c(charSequence);
        this.k = pendingIntent;
        this.a = bundle == null ? new android.os.Bundle() : bundle;
        this.b = dutVarArr;
        this.c = z;
        this.e = i;
        this.d = z2;
        this.f = z3;
        this.g = i2;
        this.h = i3;
        this.l = z4;
    }

    public final androidx.core.graphics.drawable.IconCompat a() {
        int i;
        androidx.core.graphics.drawable.IconCompat iconCompat = this.m;
        if (iconCompat != null || (i = this.i) == 0) {
            return iconCompat;
        }
        androidx.core.graphics.drawable.IconCompat iconCompatN = androidx.core.graphics.drawable.IconCompat.n(null, "", i);
        this.m = iconCompatN;
        return iconCompatN;
    }

    public dta(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, dut[] dutVarArr, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4) {
        this(i != 0 ? androidx.core.graphics.drawable.IconCompat.n(null, "", i) : null, charSequence, pendingIntent, bundle, dutVarArr, z, i2, z2, z3, i3, i4, z4);
    }

    public dta(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), (dut[]) null, true, 0, true, false, 0, 0, false);
    }

    public dta(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i != 0 ? androidx.core.graphics.drawable.IconCompat.n(null, "", i) : null, charSequence, pendingIntent);
    }
}
