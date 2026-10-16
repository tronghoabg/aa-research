package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class ysz implements yta {
    public static final ysz a;
    private static final /* synthetic */ ysz[] b;

    static {
        ysz yszVar = new ysz();
        a = yszVar;
        b = new ysz[]{yszVar};
    }

    private ysz() {
    }

    public static ysz valueOf(String str) {
        return (ysz) Enum.valueOf(ysz.class, str);
    }

    public static ysz[] values() {
        return (ysz[]) b.clone();
    }

    @Override // defpackage.yta
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return zeb.l(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
        }
        throw null;
    }
}
