package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class doh extends defpackage.dod {
    final /* synthetic */ defpackage.doi d;

    public doh(defpackage.doi doiVar) {
        this.d = doiVar;
    }

    @Override // defpackage.dod
    protected final java.lang.String b() {
        defpackage.doe doeVar = (defpackage.doe) this.d.a.get();
        if (doeVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + java.lang.String.valueOf(doeVar.a) + "]";
    }
}
