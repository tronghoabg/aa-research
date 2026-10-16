package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jmd implements defpackage.tfl {
    private final /* synthetic */ defpackage.tfl a = new defpackage.tfm(defpackage.jmc.a);

    public static final java.lang.String c(android.companion.AssociationInfo associationInfo, java.lang.String str) {
        if (!defpackage.afga.f(ag$.ExternalSyntheticApiModelOutline0.m(associationInfo), "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION")) {
            throw new java.lang.IllegalArgumentException("Association must be for DEVICE_PROFILE_AUTOMOTIVE_PROJECTION!");
        }
        if (!hz$.ExternalSyntheticApiModelOutline2.m(associationInfo)) {
            throw new java.lang.IllegalArgumentException("Association must be self-managed!");
        }
        java.lang.CharSequence charSequenceM = ag$.ExternalSyntheticApiModelOutline0.m(associationInfo);
        if (charSequenceM == null) {
            throw new java.lang.IllegalArgumentException("Self-managed association must have display name set!");
        }
        java.lang.String string = charSequenceM.toString();
        if (str == null || defpackage.afga.f(string, str)) {
            return string;
        }
        throw new java.lang.IllegalArgumentException("Display name of returned association didn't match expected value!");
    }

    public final defpackage.jml a(android.content.Context context) {
        return (defpackage.jml) this.a.b(context);
    }

    @Override // defpackage.tfl
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.content.Context context) {
        throw null;
    }
}
