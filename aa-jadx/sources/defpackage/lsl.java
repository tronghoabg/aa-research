package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsl extends defpackage.lsk {
    private final defpackage.lor c;

    public lsl(android.content.ComponentName componentName, defpackage.lor lorVar) {
        super(componentName);
        this.c = lorVar;
    }

    @Override // defpackage.lsk
    protected final java.lang.String a() {
        return "CONNECTION_STATUS ".concat(java.lang.String.valueOf(this.c.name()));
    }
}
