package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class czv implements defpackage.affg {
    private final android.view.View a;

    public czv(android.view.View view) {
        this.a = view;
    }

    public final void a(int i, boolean z) {
        java.lang.Integer numD = defpackage.cie.d(i);
        if (numD != null) {
            int iIntValue = numD.intValue();
            try {
                this.a.playSoundEffect(android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.dbb.a(iIntValue, z) : android.view.SoundEffectConstants.getContantForFocusDirection(iIntValue));
            } catch (android.os.DeadObjectException unused) {
            }
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a(((defpackage.chz) obj).a, ((java.lang.Boolean) obj2).booleanValue());
        return defpackage.afbk.a;
    }
}
