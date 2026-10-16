package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jvb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jvb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static jvb a(Context context) {
        Resources resources = context.getResources();
        return new jvb(resources.getColor(R.color.default_primary_color), resources.getColor(R.color.default_primary_dark_color), resources.getColor(R.color.default_secondary_color), resources.getColor(R.color.default_secondary_dark_color), null);
    }

    public jvb(int i, int i2, int i3, int i4, char[] cArr) {
        this.d = i;
        this.a = i2;
        this.c = i3;
        this.b = i4;
    }
}
