package Cd;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Cd.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0339g extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339g(Gd.a response, String cachedResponseText, int i5) {
        super(response, cachedResponseText);
        this.f2104b = i5;
        switch (i5) {
            case 1:
                AbstractC3340k.e(response, "response");
                AbstractC3340k.e(cachedResponseText, "cachedResponseText");
                super(response, cachedResponseText);
                this.f2105c = "Unhandled redirect: " + response.c().d().h().f6070a + ' ' + response.c().d().getUrl() + ". Status: " + response.e() + ". Text: \"" + cachedResponseText + '\"';
                break;
            case 2:
                AbstractC3340k.e(response, "response");
                AbstractC3340k.e(cachedResponseText, "cachedResponseText");
                super(response, cachedResponseText);
                this.f2105c = "Server error(" + response.c().d().h().f6070a + ' ' + response.c().d().getUrl() + ": " + response.e() + ". Text: \"" + cachedResponseText + '\"';
                break;
            default:
                AbstractC3340k.e(response, "response");
                AbstractC3340k.e(cachedResponseText, "cachedResponseText");
                this.f2105c = "Client request(" + response.c().d().h().f6070a + ' ' + response.c().d().getUrl() + ") invalid: " + response.e() + ". Text: \"" + cachedResponseText + '\"';
                break;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f2104b) {
        }
        return this.f2105c;
    }
}
