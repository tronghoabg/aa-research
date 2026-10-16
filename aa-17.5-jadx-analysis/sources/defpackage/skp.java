package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public class skp extends Exception {
    public final Intent b;

    public skp(String str, Intent intent) {
        super(str);
        this.b = intent;
    }
}
