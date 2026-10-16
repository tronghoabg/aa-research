package defpackage;

import android.content.ContentResolver;

/* loaded from: classes.dex */
public class pid {
    protected final ContentResolver a;
    protected final String b;

    protected pid(ContentResolver contentResolver, String str) {
        this.a = contentResolver;
        if (str.contains("/")) {
            throw new IllegalArgumentException("fileName contains invalid characters: ".concat(String.valueOf(str)));
        }
        this.b = str;
    }
}
