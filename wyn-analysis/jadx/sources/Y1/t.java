package Y1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16379a;

    /* renamed from: b, reason: collision with root package name */
    public String f16380b;

    /* renamed from: c, reason: collision with root package name */
    public String f16381c;

    public String a() {
        StringBuilder sb2 = new StringBuilder("Flutter-GMA-5.3.1");
        if (this.f16380b != null) {
            sb2.append("_News-");
            sb2.append(this.f16380b);
        }
        if (this.f16381c != null) {
            sb2.append("_Game-");
            sb2.append(this.f16381c);
        }
        return sb2.toString();
    }

    public String toString() {
        switch (this.f16379a) {
            case 0:
                return this.f16380b + ", " + this.f16381c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(int i5, String str, String str2) {
        this.f16379a = i5;
        this.f16380b = str;
        this.f16381c = str2;
    }
}
