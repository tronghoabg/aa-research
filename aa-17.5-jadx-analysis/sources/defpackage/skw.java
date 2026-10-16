package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class skw extends Exception {

    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public skw(Status status) {
        int i = status.f;
        String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }

    public final int a() {
        return this.a.f;
    }
}
