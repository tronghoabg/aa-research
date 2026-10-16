package okhttp3.internal.publicsuffix;

import defpackage.affa;
import defpackage.afyh;
import defpackage.ahfd;
import defpackage.ajmj;
import defpackage.ajmk;
import defpackage.ajnb;
import defpackage.ajnf;
import defpackage.woy;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "publicSuffixList", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "getEffectiveTldPlusOne", "", "domain", "splitDomain", "", "findMatchingRule", "domainLabels", "Companion", "third_party.java.okhttp4_okhttp_kmp-android"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    public static final ajnb a;
    public static final List b;
    public static final PublicSuffixDatabase c;
    public final ajmj d;

    static {
        ajnb ajnbVar = ajnb.a;
        a = ahfd.c(42);
        b = woy.bg("*");
        c = new PublicSuffixDatabase(new ajmk(ajmk.f, ajnf.b));
    }

    public PublicSuffixDatabase(ajmj ajmjVar) {
        this.d = ajmjVar;
    }

    public final List a(String str) {
        List listK = afyh.K(str, new char[]{'.'}, 0);
        return affa.f(woy.bK(listK), "") ? woy.bS(listK, 1) : listK;
    }
}
