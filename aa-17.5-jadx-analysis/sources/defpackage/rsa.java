package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rsa {
    public static final rsa a;
    public static final rsa b;
    public static final rsa c;
    public static final rsa d;
    public static final rsa e;
    public static final rsa f;
    public static final rsa g;
    public static final rsa h;
    public static final rsa i;
    public static final rsa j;
    public static final rsa k;
    public static final rsa l;
    public static final rsa m;
    public static final rsa n;
    public static final rsa o;
    public static final rsa p;
    private static final /* synthetic */ rsa[] q;

    static {
        rsa rsaVar = new rsa("ENTERED_ACCESSORY_MODE", 0);
        a = rsaVar;
        rsa rsaVar2 = new rsa("EXITED_ACCESSORY_MODE", 1);
        b = rsaVar2;
        rsa rsaVar3 = new rsa("CONFIGURED", 2);
        c = rsaVar3;
        rsa rsaVar4 = new rsa("LOST_CONFIGURED", 3);
        d = rsaVar4;
        rsa rsaVar5 = new rsa("CONNECTED", 4);
        e = rsaVar5;
        rsa rsaVar6 = new rsa("DISCONNECTED", 5);
        f = rsaVar6;
        rsa rsaVar7 = new rsa("ENTERED_MTP_MODE", 6);
        g = rsaVar7;
        rsa rsaVar8 = new rsa("EXITED_MTP_MODE", 7);
        h = rsaVar8;
        rsa rsaVar9 = new rsa("ENTERED_PTP_MODE", 8);
        i = rsaVar9;
        rsa rsaVar10 = new rsa("EXITED_PTP_MODE", 9);
        j = rsaVar10;
        rsa rsaVar11 = new rsa("DATA_UNLOCKED", 10);
        k = rsaVar11;
        rsa rsaVar12 = new rsa("DATA_LOCKED", 11);
        l = rsaVar12;
        rsa rsaVar13 = new rsa("ENTERED_ADB_MODE", 12);
        m = rsaVar13;
        rsa rsaVar14 = new rsa("EXITED_ADB_MODE", 13);
        n = rsaVar14;
        rsa rsaVar15 = new rsa("ENTERED_AUDIO_SOURCE_MODE", 14);
        o = rsaVar15;
        rsa rsaVar16 = new rsa("EXITED_AUDIO_SOURCE_MODE", 15);
        p = rsaVar16;
        q = new rsa[]{rsaVar, rsaVar2, rsaVar3, rsaVar4, rsaVar5, rsaVar6, rsaVar7, rsaVar8, rsaVar9, rsaVar10, rsaVar11, rsaVar12, rsaVar13, rsaVar14, rsaVar15, rsaVar16};
    }

    public static rsa valueOf(String str) {
        return (rsa) Enum.valueOf(rsa.class, str);
    }

    public static rsa[] values() {
        return (rsa[]) q.clone();
    }
}
