package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class tvp implements usj {
    private final /* synthetic */ int a;

    public /* synthetic */ tvp(int i) {
        this.a = i;
    }

    @Override // defpackage.usj
    public final void a(usy usyVar, too tooVar, float f, float[] fArr) {
        int i = this.a;
        if (i == 0) {
            usk.a(usyVar, tooVar, null, f, false, true, fArr);
        } else if (i != 1) {
            usk.a(usyVar, tooVar, null, f, true, false, fArr);
        } else {
            usk.a(usyVar, tooVar, null, f, false, false, fArr);
        }
    }
}
