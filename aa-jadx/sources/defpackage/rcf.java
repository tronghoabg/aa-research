package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rcf implements defpackage.sme {
    public final android.graphics.Bitmap a;
    public final com.google.android.gms.common.api.Status b;

    public rcf(android.graphics.Bitmap bitmap, com.google.android.gms.common.api.Status status) {
        this.a = bitmap;
        this.b = status;
    }

    public final android.graphics.Bitmap a() {
        android.graphics.Bitmap bitmap;
        if (!com.google.android.gms.common.api.Status.a.equals(this.b) || (bitmap = this.a) == null) {
            throw new java.lang.IllegalStateException();
        }
        return bitmap;
    }

    @Override // defpackage.sme
    public final com.google.android.gms.common.api.Status b() {
        return this.b;
    }
}
