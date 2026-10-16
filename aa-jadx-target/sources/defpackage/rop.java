package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rop extends android.content.ContextWrapper {
    private final android.content.Context a;

    public rop(android.content.Context context) {
        super(context);
        this.a = this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.Context getApplicationContext() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.ClassLoader getClassLoader() {
        return defpackage.ror.class.getClassLoader();
    }
}
