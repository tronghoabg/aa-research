package androidx.fragment.app;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class O extends M {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentActivity f18332a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentActivity f18333b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f18334c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f18335d;

    public O(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f18332a = fragmentActivity;
        this.f18333b = fragmentActivity;
        this.f18334c = handler;
        this.f18335d = new f0();
    }
}
