package E9;

import A0.p;
import A7.C0237b0;
import A7.RunnableC0285r1;
import D6.X;
import D9.k;
import H6.l;
import N.C0718d;
import N9.h;
import T3.m;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ef.C2532p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k3.AbstractC3181m;
import kotlin.jvm.internal.AbstractC3340k;
import x6.EnumC4471b;
import x6.x;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3601a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3602b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3603c;

    public c(Context context, EnumC4471b enumC4471b) {
        this.f3601a = x.a(context);
        this.f3603c = context.getApplicationContext();
        this.f3602b = enumC4471b;
    }

    public static void s(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e7) {
            D9.e.d("Error parsing background color: " + e7.toString() + " color: " + str);
        }
    }

    public static void t(Button button, N9.d dVar) {
        String str = dVar.f8610a.f8631b;
        String str2 = dVar.f8611b;
        try {
            Drawable background = button.getBackground();
            background.setTint(Color.parseColor(str2));
            button.setBackground(background);
        } catch (IllegalArgumentException e7) {
            D9.e.d("Error parsing background color: " + e7.toString());
        }
        button.setText(dVar.f8610a.f8630a);
        button.setTextColor(Color.parseColor(str));
    }

    public o3.g a() {
        AbstractC3181m abstractC3181m = (AbstractC3181m) this.f3601a;
        abstractC3181m.a();
        if (((AtomicBoolean) this.f3602b).compareAndSet(false, true)) {
            return (o3.g) ((C2532p) this.f3603c).getValue();
        }
        String strD = d();
        abstractC3181m.getClass();
        abstractC3181m.a();
        abstractC3181m.b();
        return abstractC3181m.g().I().A(strD);
    }

    public Task b(Executor executor, Callable callable, CancellationToken cancellationToken) {
        AbstractC1732v.l(((AtomicInteger) this.f3602b).get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        ((C0237b0) this.f3601a).t(new RunnableC0285r1(this, cancellationToken, cancellationTokenSource, callable, taskCompletionSource), new m(executor, cancellationToken, cancellationTokenSource, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void c() {
        ((ArrayList) this.f3602b).clear();
        this.f3603c = this.f3601a;
        o();
    }

    public abstract String d();

    public void e(Object obj) {
        ((ArrayList) this.f3602b).add(this.f3603c);
        this.f3603c = obj;
    }

    public k f() {
        return (k) this.f3602b;
    }

    public abstract View g();

    public View.OnClickListener h() {
        return null;
    }

    public abstract ImageView i();

    public abstract ViewGroup j();

    public abstract ViewTreeObserver.OnGlobalLayoutListener k(HashMap map, B9.a aVar);

    public abstract void l(int i5, Object obj);

    public abstract void m(int i5, Object obj);

    public abstract void n(int i5, int i10, int i11);

    public abstract void o();

    public void p() {
    }

    public void q(o3.g statement) {
        AbstractC3340k.e(statement, "statement");
        if (statement == ((o3.g) ((C2532p) this.f3603c).getValue())) {
            ((AtomicBoolean) this.f3602b).set(false);
        }
    }

    public abstract void r(int i5, int i10);

    public void u() {
        ArrayList arrayList = (ArrayList) this.f3602b;
        if (arrayList.isEmpty()) {
            C0718d.P("empty stack");
            throw null;
        }
        this.f3603c = arrayList.remove(arrayList.size() - 1);
    }

    public void v() {
        try {
            ((X) this.f3601a).zzv(((EnumC4471b) this.f3602b).f47731a);
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
    }

    public c(C0237b0 c0237b0) {
        this.f3602b = new AtomicInteger(0);
        this.f3603c = new AtomicBoolean(false);
        this.f3601a = c0237b0;
    }

    public c(AbstractC3181m database) {
        AbstractC3340k.e(database, "database");
        this.f3601a = database;
        this.f3602b = new AtomicBoolean(false);
        this.f3603c = Fe.c.z(new p(this, 24));
    }

    public c(k kVar, LayoutInflater layoutInflater, h hVar) {
        this.f3602b = kVar;
        this.f3603c = layoutInflater;
        this.f3601a = hVar;
    }

    public c(Object obj) {
        this.f3601a = obj;
        this.f3602b = new ArrayList();
        this.f3603c = obj;
    }
}
