package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dzz implements defpackage.dzy {
    final android.content.ClipData a;
    final int b;
    int c;
    android.net.Uri d;
    android.os.Bundle e;

    public dzz(android.content.ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.dzy
    public final defpackage.ead a() {
        return new defpackage.ead(new defpackage.eac(this));
    }

    @Override // defpackage.dzy
    public final void b(android.os.Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.dzy
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.dzy
    public final void d(android.net.Uri uri) {
        this.d = uri;
    }
}
