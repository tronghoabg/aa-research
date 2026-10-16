package sd;

import E4.n;
import com.unity3d.services.core.network.model.HttpRequest;

/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4034a {

    /* renamed from: a, reason: collision with root package name */
    public final String f45412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45413b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45414c;

    public C4034a(n nVar) {
        String str = (String) nVar.f2939c;
        this.f45412a = (String) nVar.f2940d;
        int i5 = nVar.f2938b;
        this.f45413b = i5 == -1 ? str.equals("http") ? 80 : str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1 : i5;
        this.f45414c = nVar.toString();
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4034a) && ((C4034a) obj).f45414c.equals(this.f45414c);
    }

    public final int hashCode() {
        return this.f45414c.hashCode();
    }

    public final String toString() {
        return this.f45414c;
    }
}
