package h.n;

import h.g.b.x;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f48244a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f48245b;

    /* renamed from: c, reason: collision with root package name */
    private List f48246c;

    /* renamed from: d, reason: collision with root package name */
    private final i f48247d;

    public j(Matcher matcher, CharSequence charSequence) {
        x.f(matcher, "matcher");
        x.f(charSequence, "input");
        this.f48244a = matcher;
        this.f48245b = charSequence;
        this.f48247d = new i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult g() {
        return this.f48244a;
    }

    @Override // h.n.g
    public final String a() {
        String strGroup = g().group();
        x.e(strGroup, "group(...)");
        return strGroup;
    }

    @Override // h.n.g
    public final List b() {
        h hVar = this.f48246c;
        if (hVar == null) {
            hVar = new h(this);
            this.f48246c = hVar;
        }
        x.c(hVar);
        return hVar;
    }

    @Override // h.n.g
    public final h.k.j c() {
        MatchResult matchResultG = g();
        return h.k.n.u(matchResultG.start(), matchResultG.end());
    }

    @Override // h.n.g
    public final g d() {
        int iEnd = g().end() + (g().end() == g().start() ? 1 : 0);
        CharSequence charSequence = this.f48245b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher = this.f48244a.pattern().matcher(charSequence);
        x.e(matcher, "matcher(...)");
        return o.an(matcher, iEnd, charSequence);
    }

    @Override // h.n.g
    public final i e() {
        return this.f48247d;
    }
}
