package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahob {
    public static final double a(double d, defpackage.aits aitsVar, defpackage.aits aitsVar2) {
        java.util.concurrent.TimeUnit timeUnit = aitsVar.h;
        java.util.concurrent.TimeUnit timeUnit2 = aitsVar2.h;
        long jConvert = timeUnit2.convert(1L, timeUnit);
        return jConvert > 0 ? d * jConvert : d / timeUnit.convert(1L, timeUnit2);
    }

    public static /* synthetic */ int m(boolean z) {
        return z ? 1231 : 1237;
    }
}
