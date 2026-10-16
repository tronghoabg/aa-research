package h.n;

import h.g.b.x;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f48248a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48249b;

    public k(String str, int i2) {
        x.f(str, "pattern");
        this.f48248a = str;
        this.f48249b = i2;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f48248a, this.f48249b);
        x.e(patternCompile, "compile(...)");
        return new l(patternCompile);
    }
}
