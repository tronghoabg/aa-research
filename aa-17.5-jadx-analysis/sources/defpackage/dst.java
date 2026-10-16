package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class dst {
    public final Bundle a;
    public final dum[] b;
    public boolean c;
    public boolean d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    @Deprecated
    public int i;
    public CharSequence j;
    public PendingIntent k;
    public boolean l;
    private IconCompat m;

    public dst(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, dum[] dumVarArr, boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4) {
        this.d = true;
        this.m = iconCompat;
        if (iconCompat != null && iconCompat.b() == 2) {
            this.i = iconCompat.a();
        }
        this.j = dsx.c(charSequence);
        this.k = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.b = dumVarArr;
        this.c = z;
        this.e = i;
        this.d = z2;
        this.f = z3;
        this.g = i2;
        this.h = i3;
        this.l = z4;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.m;
        if (iconCompat != null || (i = this.i) == 0) {
            return iconCompat;
        }
        IconCompat iconCompatN = IconCompat.n(null, "", i);
        this.m = iconCompatN;
        return iconCompatN;
    }

    public dst(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, dum[] dumVarArr, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4) {
        this(i != 0 ? IconCompat.n(null, "", i) : null, charSequence, pendingIntent, bundle, dumVarArr, z, i2, z2, z3, i3, i4, z4);
    }

    public dst(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), (dum[]) null, true, 0, true, false, 0, 0, false);
    }

    public dst(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.n(null, "", i) : null, charSequence, pendingIntent);
    }
}
