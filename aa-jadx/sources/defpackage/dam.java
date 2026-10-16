package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dam implements defpackage.dch {
    private final android.view.View a;

    public dam(android.view.View view) {
        this.a = view;
    }

    @Override // defpackage.dch
    public final void a() {
        try {
            this.a.playSoundEffect(0);
        } catch (android.os.DeadObjectException unused) {
        }
    }
}
