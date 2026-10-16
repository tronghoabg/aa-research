package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmf {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends defpackage.ahpn<M>, T> T getExtensionOrNull(defpackage.ahpn<M> ahpnVar, defpackage.ahpp<M, T> ahppVar) {
        ahpnVar.getClass();
        ahppVar.getClass();
        if (ahpnVar.hasExtension(ahppVar)) {
            return (T) ahpnVar.getExtension(ahppVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends defpackage.ahpn<M>, T> T getExtensionOrNull(defpackage.ahpn<M> ahpnVar, defpackage.ahpp<M, java.util.List<T>> ahppVar, int i) {
        ahpnVar.getClass();
        ahppVar.getClass();
        if (i < ahpnVar.getExtensionCount(ahppVar)) {
            return (T) ahpnVar.getExtension(ahppVar, i);
        }
        return null;
    }
}
