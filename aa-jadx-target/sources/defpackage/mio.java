package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mio implements defpackage.affc {
    public java.lang.Object a;
    private final /* synthetic */ int b;

    public mio(int i) {
        this.b = i;
        this.a = defpackage.ync.a;
    }

    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this.b != 0) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = this.a;
            if (obj2 != null) {
                ((defpackage.crj) obj2).b = zBooleanValue;
            }
            return defpackage.afbk.a;
        }
        defpackage.yhe yheVar = (defpackage.yhe) obj;
        defpackage.yhv yhvVar = new defpackage.yhv();
        if (!((defpackage.yhe) this.a).keySet().equals(yheVar.keySet())) {
            yhvVar.c("AAPRadioRoot");
        }
        defpackage.yhv yhvVar2 = new defpackage.yhv();
        yhvVar2.k(((defpackage.yhe) this.a).keySet());
        yhvVar2.k(yheVar.keySet());
        defpackage.yot it = yhvVar2.g().iterator();
        while (it.hasNext()) {
            min minVar = (min) it.next();
            java.lang.Object obj3 = this.a;
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVar = defpackage.ymx.a;
            defpackage.ygw ygwVar2 = (defpackage.ygw) ((defpackage.yhe) obj3).getOrDefault(minVar, ygwVar);
            defpackage.ygw ygwVar3 = (defpackage.ygw) yheVar.getOrDefault(minVar, ygwVar);
            if (!ygwVar2.isEmpty() || !ygwVar3.isEmpty()) {
                defpackage.yqm yqmVar = miq.a;
                if (ygwVar2.size() == ygwVar3.size()) {
                    for (int i2 = 0; i2 < ygwVar2.size(); i2++) {
                        android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem = (android.support.v4.media.MediaBrowserCompat.MediaItem) ygwVar2.get(i2);
                        android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem2 = (android.support.v4.media.MediaBrowserCompat.MediaItem) ygwVar3.get(i2);
                        if (mediaItem.a == mediaItem2.a && j$.util.Objects.equals(mediaItem.a(), mediaItem2.a())) {
                            android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat = mediaItem.b;
                            java.lang.CharSequence charSequence = mediaDescriptionCompat.b;
                            android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat2 = mediaItem2.b;
                            if (android.text.TextUtils.equals(charSequence, mediaDescriptionCompat2.b) && android.text.TextUtils.equals(mediaDescriptionCompat.c, mediaDescriptionCompat2.c) && j$.util.Objects.equals(mediaDescriptionCompat.f, mediaDescriptionCompat2.f) && ((bitmap = mediaDescriptionCompat.e) == (bitmap2 = mediaDescriptionCompat2.e) || (bitmap != null && bitmap2 != null && !bitmap.isRecycled() && !bitmap2.isRecycled() && bitmap.sameAs(bitmap2)))) {
                            }
                        }
                    }
                }
                yhvVar.c(minVar.a());
                break;
            }
        }
        this.a = yheVar;
        return yhvVar.g();
    }

    public mio(int i, byte[] bArr) {
        this.b = i;
    }
}
