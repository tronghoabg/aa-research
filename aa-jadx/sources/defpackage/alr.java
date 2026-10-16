package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class alr implements defpackage.cld {
    private final /* synthetic */ int c;
    public static final defpackage.alr b = new defpackage.alr(1);
    public static final defpackage.alr a = new defpackage.alr(0);

    private alr(int i) {
        this.c = i;
    }

    @Override // defpackage.cld
    public final defpackage.cku a(long j, defpackage.dlz dlzVar, defpackage.dlo dloVar) {
        if (this.c == 0) {
            float fDN = dloVar.dN(30.0f);
            return new defpackage.cks(new defpackage.cjj(-fDN, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Float.intBitsToFloat((int) (j >> 32)) + fDN, java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        float fDN2 = dloVar.dN(30.0f);
        return new defpackage.cks(new defpackage.cjj(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, -fDN2, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + fDN2));
    }
}
