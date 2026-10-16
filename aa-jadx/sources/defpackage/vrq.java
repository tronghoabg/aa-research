package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vrq {
    public static /* synthetic */ java.lang.String a(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "EXPLICITLY_ENABLED";
        }
        return "EXPLICITLY_DISABLED";
    }
}
