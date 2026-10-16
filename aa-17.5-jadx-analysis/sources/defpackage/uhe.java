package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
final class uhe extends uhg {
    private final float b;

    public uhe(uwm uwmVar, float f) {
        super(uwmVar);
        this.b = f;
    }

    static uhe e(uhf uhfVar, ukq ukqVar) {
        float fMax = Math.max(uhfVar.e, 1.0f);
        uhi uhiVar = uhfVar.c;
        int iC = uhiVar.c() / 16;
        return new uhe(f(new aerv(uhiVar), fMax, iC + iC, false), (2048.0f / uhiVar.c()) / (256 << Math.max(ukqVar.a(), 4)));
    }

    @Override // defpackage.uhg
    public final float a(int i) {
        return (1.0f - b(i)) * 0.5f;
    }

    @Override // defpackage.uhg
    public final float b(int i) {
        return (i / 1.3333334f) + 1.0f;
    }

    @Override // defpackage.uhg
    public final float c() {
        return this.b;
    }

    @Override // defpackage.uhg
    public final float d(uhi uhiVar) {
        return BitmapDescriptorFactory.HUE_RED;
    }
}
