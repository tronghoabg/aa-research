package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsu extends defpackage.lsk {
    private final boolean c;

    public lsu(android.content.ComponentName componentName, boolean z) {
        super(componentName);
        this.c = z;
    }

    @Override // defpackage.lsk
    protected final java.lang.String a() {
        return "REMOTE_STATUS " + this.c;
    }
}
