package n2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import l8.d0;

/* renamed from: n2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3587j implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40858b;

    public /* synthetic */ C3587j(Object obj, int i5) {
        this.f40857a = i5;
        this.f40858b = obj;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        Object obj = this.f40858b;
        switch (this.f40857a) {
            case 0:
                d0 d0Var = o.f40885j;
                ((o) obj).e();
                break;
            default:
                d0 d0Var2 = r6.l.f44454j;
                ((r6.l) obj).f();
                break;
        }
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        Object obj = this.f40858b;
        switch (this.f40857a) {
            case 0:
                d0 d0Var = o.f40885j;
                ((o) obj).e();
                break;
            default:
                d0 d0Var2 = r6.l.f44454j;
                ((r6.l) obj).f();
                break;
        }
    }
}
