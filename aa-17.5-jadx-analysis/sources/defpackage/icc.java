package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class icc implements hwx {
    private final /* synthetic */ int a;
    private final Object b;

    public icc(byte[] bArr, int i) {
        this.a = i;
        a.al(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.hwx
    public final int a() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ify.a((Bitmap) obj) : ((byte[]) obj).length;
    }

    @Override // defpackage.hwx
    public final Class b() {
        return this.a != 0 ? Bitmap.class : byte[].class;
    }

    @Override // defpackage.hwx
    public final /* synthetic */ Object c() {
        return this.b;
    }

    public icc(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.hwx
    public final void e() {
    }
}
