package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ics implements defpackage.huy {
    private final /* synthetic */ int a;

    public ics(int i) {
        this.a = i;
    }

    @Override // defpackage.huy
    public final /* synthetic */ defpackage.hxg a(java.lang.Object obj, int i, int i2, defpackage.huw huwVar) throws java.io.IOException {
        int i3 = this.a;
        if (i3 != 0) {
            return i3 != 1 ? new defpackage.iaj((java.io.File) obj) : new defpackage.icl((android.graphics.Bitmap) obj, 1);
        }
        return defpackage.icq.g((android.graphics.drawable.Drawable) obj);
    }

    @Override // defpackage.huy
    public final /* synthetic */ boolean b(java.lang.Object obj, defpackage.huw huwVar) throws java.io.IOException {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return true;
        }
        return true;
    }
}
