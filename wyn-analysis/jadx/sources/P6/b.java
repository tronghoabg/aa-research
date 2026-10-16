package P6;

import Q1.n;
import x6.C4476g;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9258a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4471b f9259b;

    /* renamed from: c, reason: collision with root package name */
    public final C4476g f9260c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9261d;

    public /* synthetic */ b(n nVar) {
        this.f9258a = (String) nVar.f9696b;
        this.f9259b = (EnumC4471b) nVar.f9697c;
        this.f9260c = (C4476g) nVar.f9698d;
        this.f9261d = nVar.f9695a;
    }

    public final EnumC4471b a() {
        EnumC4471b enumC4471b = this.f9259b;
        return enumC4471b == null ? EnumC4471b.INTERSTITIAL : enumC4471b;
    }
}
