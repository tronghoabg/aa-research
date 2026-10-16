package N6;

import sb.C4033a;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4033a f8547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8548c;

    public /* synthetic */ t(C4033a c4033a, String str, int i5) {
        this.f8546a = i5;
        this.f8547b = c4033a;
        this.f8548c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8546a) {
            case 0:
                ((C0776a) this.f8547b.f45410c).f8447b.evaluateJavascript(this.f8548c, null);
                break;
            default:
                ((C0776a) this.f8547b.f45410c).f8447b.evaluateJavascript(this.f8548c, null);
                break;
        }
    }
}
