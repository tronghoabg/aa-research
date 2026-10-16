package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final j$.time.zone.c STANDARD;
    public static final j$.time.zone.c UTC;
    public static final j$.time.zone.c WALL;
    public static final /* synthetic */ j$.time.zone.c[] a;

    static {
        j$.time.zone.c cVar = new j$.time.zone.c("UTC", 0);
        UTC = cVar;
        j$.time.zone.c cVar2 = new j$.time.zone.c("WALL", 1);
        WALL = cVar2;
        j$.time.zone.c cVar3 = new j$.time.zone.c("STANDARD", 2);
        STANDARD = cVar3;
        a = new j$.time.zone.c[]{cVar, cVar2, cVar3};
    }

    public static j$.time.zone.c valueOf(java.lang.String str) {
        return (j$.time.zone.c) java.lang.Enum.valueOf(j$.time.zone.c.class, str);
    }

    public static j$.time.zone.c[] values() {
        return (j$.time.zone.c[]) a.clone();
    }
}
