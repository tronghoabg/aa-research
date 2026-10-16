package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ann implements defpackage.apw {
    final /* synthetic */ defpackage.ano a;

    public ann(defpackage.ano anoVar) {
        this.a = anoVar;
    }

    @Override // defpackage.apw
    public final float a(float f) {
        if (java.lang.Float.isNaN(f)) {
            return 0.0f;
        }
        defpackage.ano anoVar = this.a;
        float fFloatValue = ((java.lang.Number) anoVar.a.invoke(java.lang.Float.valueOf(f))).floatValue();
        anoVar.d.b(java.lang.Boolean.valueOf(fFloatValue > 0.0f));
        anoVar.e.b(java.lang.Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
