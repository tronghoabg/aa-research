package defpackage;

import android.graphics.Point;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class aacg implements aaeu {
    public LatLng a = null;
    final /* synthetic */ aach b;
    private final zwv c;

    public aacg(aach aachVar) {
        this.b = aachVar;
        this.c = aachVar.d;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) {
        aaemVar.j();
        Point pointA = ((aaet) aaemVar.b).l().a(this.c.l());
        this.a = aach.e(aaemVar, pointA.x, pointA.y);
    }
}
