package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class sxo {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    protected sxo(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static sxo c(String str) {
        return new sxm(str, false);
    }

    public abstract Object a();
}
