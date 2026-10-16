package android.support.v7.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f1126a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Typeface f1127b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1128c;

    bf(TextView textView, Typeface typeface, int i2) {
        this.f1126a = textView;
        this.f1127b = typeface;
        this.f1128c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bj.o(this.f1126a, this.f1127b, this.f1128c);
    }
}
