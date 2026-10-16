package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class afec extends defpackage.afdy {
    public afec(defpackage.afdk afdkVar) {
        super(afdkVar);
        if (afdkVar != null && afdkVar.gT() != defpackage.afdp.a) {
            throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.afdk
    public final defpackage.afdo gT() {
        return defpackage.afdp.a;
    }
}
