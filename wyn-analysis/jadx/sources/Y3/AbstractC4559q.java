package y3;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: y3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4559q {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC4561s f48019a;

    static {
        InterfaceC4561s c4547e;
        try {
            c4547e = new vb.e((WebViewProviderFactoryBoundaryInterface) tg.b.o(WebViewProviderFactoryBoundaryInterface.class, xg.g.x()));
        } catch (ClassNotFoundException unused) {
            c4547e = new C4547e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
        f48019a = c4547e;
    }
}
