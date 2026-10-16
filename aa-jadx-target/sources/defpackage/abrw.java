package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abrw extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        int i = defpackage.abrx.a;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.ENGLISH);
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new java.util.Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
