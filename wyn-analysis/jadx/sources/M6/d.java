package M6;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7523a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7524b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f7525c = new AtomicReference(a.UNKNOWN);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f7526d = new AtomicReference(b.UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f7527e = new AtomicReference(c.UNKNOWN);

    public d(Context context) {
        this.f7523a = context;
    }
}
