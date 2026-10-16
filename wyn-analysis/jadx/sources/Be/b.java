package be;

import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes5.dex */
public final class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1525a f19471a;

    public b(EnumC1525a enumC1525a, String str, Exception exc, int i5) {
        super((i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : exc);
        this.f19471a = enumC1525a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Qonversion NoCodesException: " + this.f19471a.f19470a + ".");
        if (getMessage() != null) {
            sb2.append(StringUtils.SPACE + getMessage() + ".");
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    public b(EnumC1525a enumC1525a, String str, Throwable th) {
        super(str, th);
        this.f19471a = enumC1525a;
    }
}
