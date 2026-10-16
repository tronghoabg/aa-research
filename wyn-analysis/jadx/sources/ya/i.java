package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f48053a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f48054b;

    static {
        i iVar = new i("UNKNOWN", 0);
        f48053a = iVar;
        f48054b = new i[]{iVar, new i("BASE", 1), new i("TRANSLATE", 2), new i("ENTITY_EXTRACTION", 3), new i("CUSTOM", 4), new i("DIGITAL_INK", 5), new i("DIGITAL_INK_SEGMENTATION", 6), new i("TOXICITY_DETECTION", 7), new i("IMAGE_CAPTIONING", 8)};
    }

    public static i[] values() {
        return (i[]) f48054b.clone();
    }
}
