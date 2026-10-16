package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class tfp extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        return new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.US);
    }
}
