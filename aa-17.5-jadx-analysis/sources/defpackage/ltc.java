package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ltc {
    public static final ltc a;
    public static final ltc b;
    private static final /* synthetic */ ltc[] f;
    public final long c;
    public final String d;
    public final String e;

    static {
        ltc ltcVar = new ltc("SECONDARY", 0, 16L, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS");
        a = ltcVar;
        ltc ltcVar2 = new ltc("TERTIARY", 1, 32L, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", "com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT");
        b = ltcVar2;
        ltc[] ltcVarArr = {ltcVar, ltcVar2};
        f = ltcVarArr;
        affa.p(ltcVarArr);
    }

    private ltc(String str, int i, long j, String str2, String str3) {
        this.c = j;
        this.d = str2;
        this.e = str3;
    }

    public static ltc valueOf(String str) {
        return (ltc) Enum.valueOf(ltc.class, str);
    }

    public static ltc[] values() {
        return (ltc[]) f.clone();
    }
}
