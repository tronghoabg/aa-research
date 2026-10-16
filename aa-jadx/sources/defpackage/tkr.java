package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tkr implements defpackage.tkv {
    public final defpackage.tkv a;

    public tkr(defpackage.tkv tkvVar) {
        this.a = tkvVar;
    }

    @Override // defpackage.tkv
    public final android.net.Uri a(java.lang.Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.tkv
    public final /* synthetic */ androidx.core.graphics.drawable.IconCompat c(android.net.Uri uri) {
        return defpackage.tna.m(this, uri);
    }

    @Override // defpackage.tkv
    public final java.lang.Object d(android.net.Uri uri) {
        return this.a.d(uri);
    }
}
