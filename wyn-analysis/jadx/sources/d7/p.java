package d7;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f34150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f34152c;

    public /* synthetic */ p(boolean z2, String str, o oVar) {
        this.f34150a = z2;
        this.f34151b = str;
        this.f34152c = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        o oVar = this.f34152c;
        int i5 = 0;
        boolean z2 = this.f34150a;
        String str = this.f34151b;
        String str2 = (z2 || !r.c(str, oVar, true, false).f34179a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i5 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i5++;
        }
        AbstractC1732v.i(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + AbstractC3598c.b(messageDigest.digest(oVar.f34149c)) + ", atk=" + z2 + ", ver=12451000.false";
    }
}
