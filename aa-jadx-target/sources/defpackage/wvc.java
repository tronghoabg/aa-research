package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wvc extends defpackage.emu {
    private final int a;

    public wvc(int i) {
        this.a = i;
    }

    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        int i = defpackage.wvd.B;
        float[] fArr = ((defpackage.wvd) obj).z;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.emu
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        defpackage.wvd wvdVar = (defpackage.wvd) obj;
        int i = defpackage.wvd.B;
        float[] fArr = wvdVar.z;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                defpackage.xei xeiVar = wvdVar.A;
                if (xeiVar != null) {
                    float fU = wvdVar.u() * 0.11f;
                    com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) xeiVar.a;
                    int i3 = (int) fU;
                    if (materialButton.k != i3) {
                        materialButton.k = i3;
                        materialButton.o();
                        materialButton.invalidate();
                    }
                }
                wvdVar.invalidateSelf();
            }
        }
    }
}
