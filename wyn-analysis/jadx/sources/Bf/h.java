package Bf;

import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;

/* loaded from: classes5.dex */
public final /* synthetic */ class h extends C3338i implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1694a = new h(1, f.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    @Override // tf.l
    public final Object invoke(Object obj) {
        f p02 = (f) obj;
        AbstractC3340k.e(p02, "p0");
        Matcher matcher = p02.f1688a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = p02.f1689b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC3340k.d(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new f(matcher2, charSequence);
        }
        return null;
    }
}
