package Bf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j[] f1696a;

    static {
        j[] jVarArr = {new j("IGNORE_CASE", 0), new j("MULTILINE", 1), new j("LITERAL", 2), new j("UNIX_LINES", 3), new j("COMMENTS", 4), new j("DOT_MATCHES_ALL", 5), new j("CANON_EQ", 6)};
        f1696a = jVarArr;
        ic.d.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f1696a.clone();
    }
}
