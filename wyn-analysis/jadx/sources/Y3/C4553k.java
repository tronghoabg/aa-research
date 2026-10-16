package y3;

import android.webkit.WebResourceError;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x3.AbstractC4463f;

/* renamed from: y3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4553k extends AbstractC4463f {

    /* renamed from: a, reason: collision with root package name */
    public WebResourceError f48002a;

    /* renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f48003b;

    @Override // x3.AbstractC4463f
    public final CharSequence a() throws IllegalArgumentException {
        AbstractC4557o.f48006a.getClass();
        if (this.f48002a == null) {
            tc.j jVar = AbstractC4558p.f48018a;
            this.f48002a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) jVar.f46015a).convertWebResourceError(Proxy.getInvocationHandler(this.f48003b));
        }
        return this.f48002a.getDescription();
    }

    @Override // x3.AbstractC4463f
    public final int b() throws IllegalArgumentException {
        AbstractC4557o.f48007b.getClass();
        if (this.f48002a == null) {
            tc.j jVar = AbstractC4558p.f48018a;
            this.f48002a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) jVar.f46015a).convertWebResourceError(Proxy.getInvocationHandler(this.f48003b));
        }
        return this.f48002a.getErrorCode();
    }
}
