package s8;

import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public class j extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        AbstractC1732v.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Throwable th) {
        super(str, th);
        AbstractC1732v.g(str, "Detail message must not be empty");
    }
}
