package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajkz extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(defpackage.ajjs.a);
        return simpleDateFormat;
    }
}
