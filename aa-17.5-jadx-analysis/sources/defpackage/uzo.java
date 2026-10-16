package defpackage;

/* loaded from: classes3.dex */
public final class uzo {
    public static final ziv a;
    public static final ziv b;
    public static final ziv c;

    static {
        int i = ziv.c;
        ziv zivVar = new ziv(new ajds("TELEMETRY"));
        a = zivVar;
        ajds ajdsVar = new ajds("HEADER_PROCESSING");
        ajdsVar.b(zivVar);
        ziv zivVar2 = new ziv(ajdsVar);
        b = zivVar2;
        ajds ajdsVar2 = new ajds("VERIFICATION");
        ajdsVar2.b(zivVar2);
        c = new ziv(ajdsVar2);
    }
}
