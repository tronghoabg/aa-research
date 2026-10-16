package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.l f17732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f17733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tf.a f17734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.a f17735d;

    public s(tf.l lVar, tf.l lVar2, tf.a aVar, tf.a aVar2) {
        this.f17732a = lVar;
        this.f17733b = lVar2;
        this.f17734c = aVar;
        this.f17735d = aVar2;
    }

    public final void onBackCancelled() {
        this.f17735d.invoke();
    }

    public final void onBackInvoked() {
        this.f17734c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
        this.f17733b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC3340k.e(backEvent, "backEvent");
        this.f17732a.invoke(new b(backEvent));
    }
}
