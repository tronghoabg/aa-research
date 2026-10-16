package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
final class ofg extends ieq {
    final /* synthetic */ ofi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofg(ofi ofiVar) {
        super(96, 96);
        this.a = ofiVar;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        ((ype) ((ype) ofi.a.f()).ai((char) 5831)).y("onLoadCleared from letterTileTarget. id=%s", spu.aT(this.a.c, new lst(4)));
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        ((ype) ((ype) ofi.a.g()).ai((char) 5832)).y("CurrentCallStreamItemProducer could not load letter tile photo. id=%s", spu.aT(this.a.c, new lst(5)));
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        ype ypeVar = (ype) ((ype) ofi.a.f()).ai(5833);
        ofi ofiVar = this.a;
        ypeVar.w("Loaded letter tile photo. id=%d", ofiVar.c.a);
        ofiVar.O((Bitmap) obj);
    }
}
