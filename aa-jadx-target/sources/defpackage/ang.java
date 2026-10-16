package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ang {
    public final defpackage.afer a;
    public final aiuf b;

    public ang(defpackage.afer aferVar, aiuf aiufVar) {
        this.a = aferVar;
        this.b = aiufVar;
    }

    public final java.lang.String toString() {
        aiug aiugVar = this.b;
        aiuv aiuvVar = aiugVar.b.get(aiuv.b);
        java.lang.String str = aiuvVar != null ? aiuvVar.a : null;
        java.lang.String string = java.lang.Integer.toString(hashCode(), 16);
        string.getClass();
        return "Request@" + string + (str != null ? defpackage.a.bp(str, "[", "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + aiugVar + ")";
    }
}
