package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class rjh implements sli {
    public final Status a;
    public final Object b;
    private final /* synthetic */ int c;

    public rjh(Status status, InputStream inputStream, int i) {
        this.c = i;
        this.a = status;
        this.b = inputStream;
    }

    @Override // defpackage.sli
    public final Status b() {
        return this.a;
    }

    public rjh(Status status, List list, int i) {
        this.c = i;
        this.a = status;
        this.b = list;
    }
}
