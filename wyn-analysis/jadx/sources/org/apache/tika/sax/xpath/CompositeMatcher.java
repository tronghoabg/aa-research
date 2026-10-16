package org.apache.tika.sax.xpath;

/* loaded from: classes5.dex */
public class CompositeMatcher extends Matcher {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f42951a;

    /* renamed from: b, reason: collision with root package name */
    private final Matcher f42952b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f42951a = matcher;
        this.f42952b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher matcherDescend = this.f42951a.descend(str, str2);
        Matcher matcherDescend2 = this.f42952b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        return matcherDescend == matcher ? matcherDescend2 : matcherDescend2 == matcher ? matcherDescend : (this.f42951a == matcherDescend && this.f42952b == matcherDescend2) ? this : new CompositeMatcher(matcherDescend, matcherDescend2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return this.f42951a.matchesAttribute(str, str2) || this.f42952b.matchesAttribute(str, str2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return this.f42951a.matchesElement() || this.f42952b.matchesElement();
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return this.f42951a.matchesText() || this.f42952b.matchesText();
    }
}
