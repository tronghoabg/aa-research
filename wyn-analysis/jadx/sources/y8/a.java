package Y8;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final V8.a f16713b = new V8.a();

    /* renamed from: c, reason: collision with root package name */
    public static final String f16714c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f16715d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final V1.c f16716e = new V1.c(11);

    /* renamed from: a, reason: collision with root package name */
    public final c f16717a;

    public a(c cVar) {
        this.f16717a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb2.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb2.append(str2.charAt(i5));
            }
        }
        return sb2.toString();
    }
}
