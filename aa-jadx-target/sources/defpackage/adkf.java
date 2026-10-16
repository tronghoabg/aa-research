package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adkf {
    public static final defpackage.adkf a = new defpackage.adkf(new defpackage.adkc(1), defpackage.adkc.a);
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    public adkf(adke... adkeVarArr) {
        for (int i = 0; i < 2; i++) {
            adke adkeVar = adkeVarArr[i];
            this.b.put(adkeVar.b(), adkeVar);
        }
    }
}
