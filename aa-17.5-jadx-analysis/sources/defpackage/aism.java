package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class aism implements aisj {
    public final Matcher a;
    public final aisl b = new aisl(this);
    private final CharSequence c;
    private List d;

    public aism(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.c = charSequence;
    }

    @Override // defpackage.aisj
    public final List a() {
        if (this.d == null) {
            this.d = new aisk(this);
        }
        List list = this.d;
        list.getClass();
        return list;
    }

    @Override // defpackage.aisj
    public final afha b() {
        Matcher matcher = this.a;
        return afpt.m(matcher.start(), matcher.end());
    }

    @Override // defpackage.aisj
    public final aisj c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.c;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return aihs.a(matcher2, iEnd, charSequence);
    }
}
