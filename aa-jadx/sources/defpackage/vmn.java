package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vmn extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        return new java.text.SimpleDateFormat("H:mm", java.util.Locale.US);
    }
}
