package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class upe implements upo {
    public static final yfq a = yfq.u(Pattern.compile(String.format("https?://(www.)?%s.*", "mapsresources-pa\\.googleapis\\.com")), Pattern.compile(String.format("https?://(www.)?%s.*", ".*mapsresources-pa\\.sandbox\\.googleapis\\.com")), Pattern.compile(String.format("https?://(www.)?%s.*", "google\\.com")), Pattern.compile(String.format("https?://(www.)?%s.*", "tactile\\.sandbox\\.google\\.com")), Pattern.compile(String.format("https?://(www.)?%s.*", "gstatic\\.com")));
    public final pwr b;

    public upe(pwr pwrVar) {
        this.b = pwrVar;
    }
}
