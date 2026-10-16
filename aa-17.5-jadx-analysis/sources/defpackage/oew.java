package defpackage;

/* loaded from: classes2.dex */
final class oew extends ofa {
    final /* synthetic */ ofb a;

    public oew(ofb ofbVar) {
        this.a = ofbVar;
    }

    @Override // defpackage.ofa
    public final void onCallStateChanged(int i) {
        if (i != 0) {
            this.a.B();
        }
    }
}
