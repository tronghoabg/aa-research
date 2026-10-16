package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rma extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
    }
}
