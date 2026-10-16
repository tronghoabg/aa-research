package w9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4385d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4385d f47417a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4385d f47418b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4385d f47419c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4385d f47420d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4385d f47421e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC4385d f47422f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC4385d f47423g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC4385d f47424h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC4385d f47425i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC4385d f47426j;
    public static final /* synthetic */ EnumC4385d[] k;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4385d EF11;

    static {
        EnumC4385d enumC4385d = new EnumC4385d("ALL", 0);
        EnumC4385d enumC4385d2 = new EnumC4385d("LISTEN_STREAM_IDLE", 1);
        f47417a = enumC4385d2;
        EnumC4385d enumC4385d3 = new EnumC4385d("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
        f47418b = enumC4385d3;
        EnumC4385d enumC4385d4 = new EnumC4385d("WRITE_STREAM_IDLE", 3);
        f47419c = enumC4385d4;
        EnumC4385d enumC4385d5 = new EnumC4385d("WRITE_STREAM_CONNECTION_BACKOFF", 4);
        f47420d = enumC4385d5;
        EnumC4385d enumC4385d6 = new EnumC4385d("HEALTH_CHECK_TIMEOUT", 5);
        f47421e = enumC4385d6;
        EnumC4385d enumC4385d7 = new EnumC4385d("ONLINE_STATE_TIMEOUT", 6);
        f47422f = enumC4385d7;
        EnumC4385d enumC4385d8 = new EnumC4385d("GARBAGE_COLLECTION", 7);
        f47423g = enumC4385d8;
        EnumC4385d enumC4385d9 = new EnumC4385d("RETRY_TRANSACTION", 8);
        f47424h = enumC4385d9;
        EnumC4385d enumC4385d10 = new EnumC4385d("CONNECTIVITY_ATTEMPT_TIMER", 9);
        f47425i = enumC4385d10;
        EnumC4385d enumC4385d11 = new EnumC4385d("INDEX_BACKFILL", 10);
        f47426j = enumC4385d11;
        k = new EnumC4385d[]{enumC4385d, enumC4385d2, enumC4385d3, enumC4385d4, enumC4385d5, enumC4385d6, enumC4385d7, enumC4385d8, enumC4385d9, enumC4385d10, enumC4385d11};
    }

    public static EnumC4385d valueOf(String str) {
        return (EnumC4385d) Enum.valueOf(EnumC4385d.class, str);
    }

    public static EnumC4385d[] values() {
        return (EnumC4385d[]) k.clone();
    }
}
