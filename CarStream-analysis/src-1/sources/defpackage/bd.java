package defpackage;

import com.carstream.tech.R;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class bd {
    public final int a;
    public final int b;
    public final String c;

    public bd(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public static bd a() {
        return new bd(3, R.drawable.ic_pause, null);
    }

    public static bd b(int i, String str) {
        return new bd(5, i, str);
    }
}
