package d7;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f34178d = new w(null, true, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34179a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34180b;

    /* renamed from: c, reason: collision with root package name */
    public final Exception f34181c;

    public w(String str, boolean z2, Exception exc) {
        this.f34179a = z2;
        this.f34180b = str;
        this.f34181c = exc;
    }

    public static w b(String str) {
        return new w(str, false, null);
    }

    public static w c(String str, Exception exc) {
        return new w(str, false, exc);
    }

    public String a() {
        return this.f34180b;
    }
}
