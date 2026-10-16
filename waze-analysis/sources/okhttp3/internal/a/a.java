package okhttp3.internal.a;

import java.net.Proxy;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55953a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f55953a = iArr;
    }
}
