package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c {
    public static final c STANDARD;
    public static final c UTC;
    public static final c WALL;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f50103a;

    static {
        c cVar = new c("UTC", 0);
        UTC = cVar;
        c cVar2 = new c("WALL", 1);
        WALL = cVar2;
        c cVar3 = new c("STANDARD", 2);
        STANDARD = cVar3;
        f50103a = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f50103a.clone();
    }
}
