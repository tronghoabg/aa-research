package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes3.dex */
final class aaax extends ContextWrapper {
    private final ClassLoader a;
    private final gjt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaax(gjt gjtVar) {
        super((Context) gjtVar.a);
        ClassLoader classLoader = aaax.class.getClassLoader();
        this.b = gjtVar;
        zkt.n(classLoader, "classLoader");
        this.a = classLoader;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.b.B();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }
}
