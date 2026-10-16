package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1404v f18181a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18182b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f18183c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18184d;

    public C1383a0(AbstractC1404v abstractC1404v, String str, Object[] objArr) {
        this.f18181a = abstractC1404v;
        this.f18182b = str;
        this.f18183c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18184d = cCharAt;
            return;
        }
        int i5 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f18184d = i5 | (cCharAt2 << i11);
                return;
            } else {
                i5 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }
}
