package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pgn {
    public static final pgn a;
    public static final pgn b;
    public static final pgn c;
    public static final pgn d;
    private static final /* synthetic */ pgn[] e;

    static {
        pgn pgnVar = new pgn("NONE", 0);
        a = pgnVar;
        pgn pgnVar2 = new pgn(CloudRecognizerProtocolStrings.SUCCESS, 1);
        b = pgnVar2;
        pgn pgnVar3 = new pgn("FAILURE", 2);
        c = pgnVar3;
        pgn pgnVar4 = new pgn("PREEMPTED_BY_START_REQUEST", 3);
        d = pgnVar4;
        e = new pgn[]{pgnVar, pgnVar2, pgnVar3, pgnVar4};
    }

    public static pgn valueOf(String str) {
        return (pgn) Enum.valueOf(pgn.class, str);
    }

    public static pgn[] values() {
        return (pgn[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
        }
        return true;
    }

    final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return true;
        }
        throw new RuntimeException(null, null);
    }
}
