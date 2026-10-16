package t6;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: t6.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4129E {

    /* renamed from: d, reason: collision with root package name */
    public static final U5.f f45818d = new U5.f(-9223372036854775807L, 2, false);

    /* renamed from: e, reason: collision with root package name */
    public static final U5.f f45819e = new U5.f(-9223372036854775807L, 3, false);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f45820a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerC4127C f45821b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f45822c;

    public C4129E(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i5 = u6.v.f46721a;
        this.f45820a = Executors.newSingleThreadExecutor(new Q1.w(strConcat, 1));
    }

    public final boolean a() {
        return this.f45821b != null;
    }
}
