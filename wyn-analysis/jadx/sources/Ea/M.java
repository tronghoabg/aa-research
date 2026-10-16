package ea;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final Y f34483a;

    /* renamed from: b, reason: collision with root package name */
    public final tf.a f34484b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34485c;

    /* renamed from: d, reason: collision with root package name */
    public int f34486d;

    /* renamed from: e, reason: collision with root package name */
    public C2481E f34487e;

    public M() {
        Y y10 = Y.f34509a;
        L l10 = L.f34482a;
        this.f34483a = y10;
        this.f34484b = l10;
        this.f34485c = a();
        this.f34486d = -1;
    }

    public final String a() {
        String string = ((UUID) this.f34484b.invoke()).toString();
        AbstractC3340k.d(string, "uuidGenerator().toString()");
        String lowerCase = Bf.r.h0(string, "-", "", false).toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
