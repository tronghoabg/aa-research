package Bf;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f1688a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1689b;

    /* renamed from: c, reason: collision with root package name */
    public e f1690c;

    public f(Matcher matcher, CharSequence input) {
        AbstractC3340k.e(input, "input");
        this.f1688a = matcher;
        this.f1689b = input;
    }

    public final List a() {
        if (this.f1690c == null) {
            this.f1690c = new e(this, 0);
        }
        e eVar = this.f1690c;
        AbstractC3340k.b(eVar);
        return eVar;
    }
}
