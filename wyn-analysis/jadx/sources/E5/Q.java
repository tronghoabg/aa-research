package E5;

import java.util.Arrays;
import ka.AbstractC3256n;
import okhttp3.Response;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public class Q extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3190a;

    public /* synthetic */ Q(byte b5, int i5) {
        this.f3190a = i5;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f3190a) {
            case 2:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(String str, int i5) {
        super(str);
        this.f3190a = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(String str, Throwable th, int i5) {
        super(str, th);
        this.f3190a = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(Throwable th, int i5) {
        super(th);
        this.f3190a = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Q(String str, String[] strArr, String[] strArr2) {
        this.f3190a = 15;
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Could not find '", str, "'. Looked for: ");
        sbW.append(Arrays.toString(strArr));
        sbW.append(", but only found: ");
        super(wg.b.c(sbW, Arrays.toString(strArr2), "."));
    }

    public Q(zg.Q q4) {
        this.f3190a = 17;
        StringBuilder sb2 = new StringBuilder("HTTP ");
        Response response = q4.f48595a;
        sb2.append(response.f42398d);
        sb2.append(StringUtils.SPACE);
        sb2.append(response.f42397c);
        super(sb2.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f3190a = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(int i5) {
        super(AbstractC3256n.g(i5, "Requires API level "));
        this.f3190a = 7;
    }
}
