package g4;

import A.C0217j;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2700a extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f35707i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0217j f35708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2700a(C0217j c0217j, int i5) {
        super(0);
        this.f35707i = i5;
        this.f35708j = c0217j;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f35707i) {
            case 0:
                CacheControl.Companion companion = CacheControl.f42175n;
                Headers headers = (Headers) this.f35708j.f171g;
                companion.getClass();
                return CacheControl.Companion.a(headers);
            default:
                String strA = ((Headers) this.f35708j.f171g).a("Content-Type");
                if (strA == null) {
                    return null;
                }
                MediaType.f42292d.getClass();
                return MediaType.Companion.b(strA);
        }
    }
}
