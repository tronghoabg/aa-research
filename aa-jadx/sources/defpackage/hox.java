package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hox extends defpackage.hnk {
    @Override // defpackage.hnk
    public final /* bridge */ /* synthetic */ defpackage.hnl a(android.os.Bundle bundle, java.util.Set set) {
        int i;
        java.lang.String string = bundle.getString(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
        string.getClass();
        int iHashCode = string.hashCode();
        if (iHashCode == -1471810650) {
            if (string.equals("SCROLL_DELTA")) {
                i = 2;
                return new defpackage.hoy(i, bundle.getInt("axes"), bundle.getFloat("x"), bundle.getFloat("y"), set);
            }
            throw new java.lang.IllegalArgumentException();
        }
        if (iHashCode == -1457521584) {
            if (string.equals("SCROLL_START")) {
                i = 1;
                return new defpackage.hoy(i, bundle.getInt("axes"), bundle.getFloat("x"), bundle.getFloat("y"), set);
            }
            throw new java.lang.IllegalArgumentException();
        }
        if (iHashCode == -47016396 && string.equals("SCROLL_STOP")) {
            i = 3;
            return new defpackage.hoy(i, bundle.getInt("axes"), bundle.getFloat("x"), bundle.getFloat("y"), set);
        }
        throw new java.lang.IllegalArgumentException();
    }
}
