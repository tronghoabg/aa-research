package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class afa implements aex {
    private final float a;
    private final float b;
    private final float c;
    private final afs d;

    public afa(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        afs afsVar = new afs();
        if (f < BitmapDescriptorFactory.HUE_RED) {
            afp.a("Damping ratio must be non-negative");
        }
        afsVar.c = f;
        if (afsVar.a() <= BitmapDescriptorFactory.HUE_RED) {
            afp.a("Spring stiffness constant must be positive.");
        }
        afsVar.b = Math.sqrt(f2);
        this.d = afsVar;
    }

    @Override // defpackage.aec
    /* renamed from: a */
    public final /* synthetic */ agn c(bii biiVar) {
        return new agt(this);
    }

    @Override // defpackage.aex
    public final float b(float f, float f2, float f3) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aex
    public final float c(long j, float f, float f2, float f3) {
        afs afsVar = this.d;
        afsVar.a = f2;
        return Float.intBitsToFloat((int) (afsVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.aex
    public final float d(long j, float f, float f2, float f3) {
        afs afsVar = this.d;
        afsVar.a = f2;
        return Float.intBitsToFloat((int) (afsVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    @Override // defpackage.aex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afa.e(float, float, float):long");
    }
}
