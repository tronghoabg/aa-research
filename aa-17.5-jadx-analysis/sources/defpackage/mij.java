package defpackage;

import android.graphics.Bitmap;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class mij implements afec {
    public Object a;
    private final /* synthetic */ int b;

    public mij(int i) {
        this.b = i;
        this.a = ylx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b != 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.a;
            if (obj2 != null) {
                ((cra) obj2).b = zBooleanValue;
            }
            return afak.a;
        }
        yfy yfyVar = (yfy) obj;
        ygp ygpVar = new ygp();
        if (!((yfy) this.a).keySet().equals(yfyVar.keySet())) {
            ygpVar.c("AAPRadioRoot");
        }
        ygp ygpVar2 = new ygp();
        ygpVar2.k(((yfy) this.a).keySet());
        ygpVar2.k(yfyVar.keySet());
        yno it = ygpVar2.g().iterator();
        while (it.hasNext()) {
            mih mihVar = (mih) it.next();
            Object obj3 = this.a;
            int i = yfq.d;
            yfq yfqVar = yls.a;
            yfq yfqVar2 = (yfq) ((yfy) obj3).getOrDefault(mihVar, yfqVar);
            yfq yfqVar3 = (yfq) yfyVar.getOrDefault(mihVar, yfqVar);
            if (!yfqVar2.isEmpty() || !yfqVar3.isEmpty()) {
                yph yphVar = mil.a;
                if (yfqVar2.size() == yfqVar3.size()) {
                    for (int i2 = 0; i2 < yfqVar2.size(); i2++) {
                        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) yfqVar2.get(i2);
                        MediaBrowserCompat.MediaItem mediaItem2 = (MediaBrowserCompat.MediaItem) yfqVar3.get(i2);
                        if (mediaItem.a == mediaItem2.a && Objects.equals(mediaItem.a(), mediaItem2.a())) {
                            MediaDescriptionCompat mediaDescriptionCompat = mediaItem.b;
                            CharSequence charSequence = mediaDescriptionCompat.b;
                            MediaDescriptionCompat mediaDescriptionCompat2 = mediaItem2.b;
                            if (TextUtils.equals(charSequence, mediaDescriptionCompat2.b) && TextUtils.equals(mediaDescriptionCompat.c, mediaDescriptionCompat2.c) && Objects.equals(mediaDescriptionCompat.f, mediaDescriptionCompat2.f) && ((bitmap = mediaDescriptionCompat.e) == (bitmap2 = mediaDescriptionCompat2.e) || (bitmap != null && bitmap2 != null && !bitmap.isRecycled() && !bitmap2.isRecycled() && bitmap.sameAs(bitmap2)))) {
                            }
                        }
                    }
                }
                ygpVar.c(mihVar.a());
            }
        }
        this.a = yfyVar;
        return ygpVar.g();
    }

    public mij(int i, byte[] bArr) {
        this.b = i;
    }
}
