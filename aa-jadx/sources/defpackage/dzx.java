package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dzx implements defpackage.dzy {
    private final android.view.ContentInfo.Builder a;

    public dzx(android.content.ClipData clipData, int i) {
        this.a = new android.view.ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.dzy
    public final defpackage.ead a() {
        return new defpackage.ead(new defpackage.eaa(this.a.build()));
    }

    @Override // defpackage.dzy
    public final void b(android.os.Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.dzy
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.dzy
    public final void d(android.net.Uri uri) {
        this.a.setLinkUri(uri);
    }
}
