package I4;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class x implements q, Q4.a {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f5376a;

    public /* synthetic */ x(Resources resources) {
        this.f5376a = resources;
    }

    @Override // I4.q
    public p d(v vVar) {
        return new C0617b(this.f5376a, vVar.b(Uri.class, InputStream.class));
    }

    @Override // Q4.a
    public E4.B e(E4.B b5, B4.g gVar) {
        if (b5 == null) {
            return null;
        }
        return new L4.c(this.f5376a, b5);
    }
}
