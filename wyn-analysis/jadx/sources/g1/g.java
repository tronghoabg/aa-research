package g1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements InterfaceC2670f {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f35501a;

    public g(Object obj) {
        this.f35501a = d2.b.g(obj);
    }

    @Override // g1.InterfaceC2670f
    public final String a() {
        return this.f35501a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f35501a.equals(((InterfaceC2670f) obj).getLocaleList());
    }

    @Override // g1.InterfaceC2670f
    public final Locale get(int i5) {
        return this.f35501a.get(i5);
    }

    @Override // g1.InterfaceC2670f
    public final Object getLocaleList() {
        return this.f35501a;
    }

    public final int hashCode() {
        return this.f35501a.hashCode();
    }

    @Override // g1.InterfaceC2670f
    public final boolean isEmpty() {
        return this.f35501a.isEmpty();
    }

    @Override // g1.InterfaceC2670f
    public final int size() {
        return this.f35501a.size();
    }

    public final String toString() {
        return this.f35501a.toString();
    }
}
