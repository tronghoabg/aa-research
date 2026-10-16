package z4;

import A7.C0237b0;
import java.io.File;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4612b {

    /* renamed from: a, reason: collision with root package name */
    public final String f48341a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f48342b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f48343c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f48344d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48345e;

    /* renamed from: f, reason: collision with root package name */
    public C0237b0 f48346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4613c f48347g;

    public C4612b(C4613c c4613c, String str) {
        this.f48347g = c4613c;
        this.f48341a = str;
        int i5 = c4613c.f48354g;
        this.f48342b = new long[i5];
        this.f48343c = new File[i5];
        this.f48344d = new File[i5];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < c4613c.f48354g; i10++) {
            sb2.append(i10);
            File[] fileArr = this.f48343c;
            String string = sb2.toString();
            File file = c4613c.f48348a;
            fileArr[i10] = new File(file, string);
            sb2.append(".tmp");
            this.f48344d[i10] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j8 : this.f48342b) {
            sb2.append(' ');
            sb2.append(j8);
        }
        return sb2.toString();
    }
}
