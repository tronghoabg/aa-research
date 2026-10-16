package h4;

import A7.RunnableC0307z;
import Ef.InterfaceC0501m0;
import Va.M6;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import y1.AbstractC4520a;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2774a implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36054a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1451o f36055b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36056c;

    public C2774a(AbstractC1451o abstractC1451o, InterfaceC0501m0 interfaceC0501m0) {
        this.f36055b = abstractC1451o;
        this.f36056c = interfaceC0501m0;
    }

    private final void a(InterfaceC1457v interfaceC1457v) {
    }

    private final void b(InterfaceC1457v interfaceC1457v) {
    }

    private final void c(InterfaceC1457v interfaceC1457v) {
    }

    private final /* synthetic */ void d(InterfaceC1457v interfaceC1457v) {
    }

    private final /* synthetic */ void e(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        int i5 = this.f36054a;
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
        switch (this.f36054a) {
            case 0:
                ((InterfaceC0501m0) this.f36056c).cancel(null);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
        int i5 = this.f36054a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1457v interfaceC1457v) {
        switch (this.f36054a) {
            case 0:
                M6.d(interfaceC1457v);
                break;
            default:
                ((EmojiCompatInitializer) this.f36056c).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC4520a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0307z(5), 500L);
                this.f36055b.c(this);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC1457v interfaceC1457v) {
        int i5 = this.f36054a;
        M6.e(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC1457v interfaceC1457v) {
        int i5 = this.f36054a;
    }

    public C2774a(EmojiCompatInitializer emojiCompatInitializer, AbstractC1451o abstractC1451o) {
        this.f36056c = emojiCompatInitializer;
        this.f36055b = abstractC1451o;
    }
}
