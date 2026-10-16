package E5;

import U1.C0838h;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import k8.InterfaceC3207p;

/* renamed from: E5.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0467q implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3497a;

    @Override // k8.InterfaceC3207p
    public final Object get() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        switch (this.f3497a) {
            case 0:
                return new C0459k();
            case 1:
                byte[] bArr = new byte[12];
                F5.h.f3908h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new C0838h(new o2.e(0), 50000, 50000, UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL, 5000, -1, false, 0);
            case 3:
                byte[] bArr2 = new byte[12];
                V1.f.f12916i.nextBytes(bArr2);
                return Base64.encodeToString(bArr2, 10);
            case 4:
                throw new IllegalStateException();
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    objInvoke.getClass();
                    return (N1.X) objInvoke;
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
