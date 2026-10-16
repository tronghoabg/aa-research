package defpackage;

import android.animation.TypeEvaluator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class ttd implements TypeEvaluator {
    public final usy a;
    final tmo b;

    public ttd(tmo tmoVar, usy usyVar) {
        this.b = tmoVar;
        usyVar.getClass();
        this.a = usyVar;
        usyVar.b();
        usyVar.j();
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            throw null;
        }
        this.a.f();
        throw null;
    }
}
