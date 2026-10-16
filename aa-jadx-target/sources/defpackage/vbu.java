package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vbu extends defpackage.zga {
    java.lang.Object a;

    public vbu(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.zga
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.zga
    public final java.lang.String eW() {
        java.lang.Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }
}
