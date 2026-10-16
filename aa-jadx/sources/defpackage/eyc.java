package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eyc implements defpackage.exs {
    final /* synthetic */ androidx.preference.PreferenceGroup a;
    final /* synthetic */ defpackage.eye b;

    public eyc(defpackage.eye eyeVar, androidx.preference.PreferenceGroup preferenceGroup) {
        this.b = eyeVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.exs
    public final boolean b() {
        this.a.V(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        this.b.s();
        return true;
    }
}
