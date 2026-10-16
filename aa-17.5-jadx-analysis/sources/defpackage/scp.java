package defpackage;

/* loaded from: classes2.dex */
final class scp implements sef {
    final /* synthetic */ boolean a;

    public scp(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sef
    public final void a(seh sehVar) {
        bc bcVar = (bc) sehVar;
        if (this.a) {
            int i = scr.c;
        }
        if (bcVar.isFinishing()) {
            return;
        }
        bcVar.finish();
    }
}
