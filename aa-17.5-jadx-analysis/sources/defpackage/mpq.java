package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
final class mpq implements mps {
    private final rjj a;

    public mpq(rjj rjjVar) {
        this.a = rjjVar;
    }

    @Override // defpackage.mps
    public final ComponentName a() {
        rjj rjjVar = this.a;
        int iOrdinal = rjjVar.ordinal();
        if (iOrdinal == 1) {
            return mpr.b;
        }
        if (iOrdinal == 2) {
            return mpr.c;
        }
        ((ype) ((ype) mpr.a.g()).ai((char) 5168)).y("Auxiliary display does not support fallback component for content type: %s", rjjVar);
        return null;
    }

    @Override // defpackage.mps
    public final Intent b(qrn qrnVar) {
        return new Intent();
    }

    @Override // defpackage.mps
    public final /* synthetic */ yfq c() {
        int i = yfq.d;
        return yls.a;
    }
}
