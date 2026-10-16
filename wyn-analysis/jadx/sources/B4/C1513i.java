package b4;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: b4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513i implements InterfaceC1510f {

    /* renamed from: a, reason: collision with root package name */
    public final C2532p f19306a;

    /* renamed from: b, reason: collision with root package name */
    public final C2532p f19307b;

    public C1513i(C2532p c2532p, C2532p c2532p2) {
        this.f19306a = c2532p;
        this.f19307b = c2532p2;
    }

    @Override // b4.InterfaceC1510f
    public final InterfaceC1511g a(Object obj, h4.l lVar) {
        Uri uri = (Uri) obj;
        if (AbstractC3340k.a(uri.getScheme(), "http") || AbstractC3340k.a(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) {
            return new l(uri.toString(), lVar, this.f19306a, this.f19307b);
        }
        return null;
    }
}
