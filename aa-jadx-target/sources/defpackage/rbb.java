package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbb extends android.content.ContextWrapper {
    public final defpackage.rbc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbb(android.content.Context context) {
        super(context);
        context.getClass();
        android.content.res.Resources resources = context.getResources();
        resources.getClass();
        this.a = new defpackage.rbc(resources);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        return this.a;
    }
}
