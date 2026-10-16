package k2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: k2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3168z {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f39176b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f39177a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3168z(S1.k kVar) {
        this(0L);
        Uri uri = kVar.f10870a;
        Map map = Collections.EMPTY_MAP;
    }

    public C3168z(long j8) {
        this.f39177a = j8;
    }
}
