package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class rnu extends ContextWrapper {
    private final Context a;

    public rnu(Context context) {
        super(context);
        this.a = this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return rnw.class.getClassLoader();
    }
}
