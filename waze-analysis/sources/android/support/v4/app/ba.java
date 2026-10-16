package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.PrintWriter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ba<H> extends ay {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f162a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f163b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f164c;

    /* renamed from: d, reason: collision with root package name */
    private final bv f165d;

    public ba(Activity activity, Context context, Handler handler) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(handler, "handler");
        this.f162a = activity;
        this.f163b = context;
        this.f164c = handler;
        this.f165d = new bv();
    }

    @Override // android.support.v4.app.ay
    public View a(int i2) {
        throw null;
    }

    @Override // android.support.v4.app.ay
    public boolean b() {
        throw null;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object d();

    public void e() {
        throw null;
    }

    public boolean f(String str) {
        throw null;
    }

    public void g(PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public final Activity h() {
        return this.f162a;
    }

    public final Context i() {
        return this.f163b;
    }

    public final Handler j() {
        return this.f164c;
    }

    public final bv k() {
        return this.f165d;
    }

    public final void l(ar arVar, Intent intent, int i2, Bundle bundle) {
        h.g.b.x.f(arVar, "fragment");
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.f163b, intent, bundle);
    }

    public final void m(ar arVar, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        h.g.b.x.f(arVar, "fragment");
        h.g.b.x.f(intentSender, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        if (i2 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(this.f162a, intentSender, -1, intent, i3, i4, i5, bundle);
    }
}
