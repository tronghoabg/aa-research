package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ s9(t9 t9Var, int i) {
        this.a = i;
        this.b = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i("Đang nghe (máy không phát được tiếng báo)", false);
                break;
            case 1:
                t9 t9Var = this.b;
                t9Var.a = null;
                rc rcVar = t9Var.g;
                if (rcVar != null && rcVar.d) {
                    rcVar.a();
                    break;
                }
                break;
            default:
                this.b.j(true);
                break;
        }
    }
}
