package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yso extends defpackage.ysl {
    public static final defpackage.ysl a = new defpackage.yso();

    @Override // defpackage.ysl
    public final defpackage.yqu a(java.lang.String str) {
        return new defpackage.ysi(java.util.logging.Logger.getLogger(str.replace('$', '.')));
    }

    public final java.lang.String toString() {
        return "Default logger backend factory";
    }
}
