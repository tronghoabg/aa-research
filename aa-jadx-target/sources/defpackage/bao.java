package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bao implements defpackage.and {
    private final defpackage.afer a;
    private final defpackage.dlz b;
    private final boolean c;
    private final defpackage.and d;

    public bao(defpackage.afer aferVar, defpackage.dlz dlzVar, boolean z, defpackage.and andVar) {
        this.a = aferVar;
        this.b = dlzVar;
        this.c = z;
        this.d = andVar;
    }

    @Override // defpackage.and
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((java.lang.Number) this.a.invoke()).intValue();
        defpackage.dlz dlzVar = defpackage.dlz.b;
        if (this.c || this.b != dlzVar) {
            f -= fIntValue;
        }
        return this.d.a(f, f2, f3 - fIntValue);
    }

    @Override // defpackage.and
    public final /* synthetic */ defpackage.aej b() {
        return defpackage.anc.a;
    }
}
