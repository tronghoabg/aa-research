package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eaa implements defpackage.eab {
    private final android.view.ContentInfo a;

    public eaa(android.view.ContentInfo contentInfo) {
        defpackage.ebl.q(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.eab
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.eab
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.eab
    public final android.content.ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.eab
    public final android.view.ContentInfo d() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
