package com.waze.uid.c;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.uid.activities.UidFragmentActivity;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class be extends android.support.v4.app.ar implements com.waze.uid.b.b {

    /* renamed from: a, reason: collision with root package name */
    private final FeedbackScreenOrigin f44262a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.uid.activities.e f44263b;

    /* renamed from: c, reason: collision with root package name */
    protected UidFragmentActivity f44264c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44265d;

    /* renamed from: e, reason: collision with root package name */
    private final bd f44266e;

    /* renamed from: f, reason: collision with root package name */
    private int f44267f;

    public /* synthetic */ be(int i2, FeedbackScreenOrigin feedbackScreenOrigin, com.waze.uid.activities.e eVar, boolean z, bd bdVar, int i3) {
        this(i2, (i3 & 2) != 0 ? null : feedbackScreenOrigin, (i3 & 4) != 0 ? com.waze.uid.activities.e.f44088b : eVar, ((i3 & 8) == 0) & z, (i3 & 16) != 0 ? bd.f44257a : bdVar);
    }

    public boolean d() {
        return false;
    }

    public final com.waze.uid.activities.e g() {
        return this.f44263b;
    }

    public final bd h() {
        return this.f44266e;
    }

    protected final String i() {
        String strName;
        FeedbackScreenOrigin feedbackScreenOrigin = this.f44262a;
        return (feedbackScreenOrigin == null || (strName = feedbackScreenOrigin.name()) == null) ? "UNKNOWN" : strName;
    }

    protected final void j(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        UidFragmentActivity uidFragmentActivity = this.f44264c;
        if (uidFragmentActivity != null) {
            uidFragmentActivity.o(sVar);
        }
    }

    @Override // android.support.v4.app.ar
    public void onAttach(Context context) {
        h.g.b.x.f(context, "context");
        super.onAttach(context);
        if (context instanceof UidFragmentActivity) {
            this.f44264c = (UidFragmentActivity) context;
        }
    }

    @Override // android.support.v4.app.ar
    public void onPause() {
        Window window;
        super.onPause();
        android.support.v4.app.av activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f44267f);
    }

    @Override // android.support.v4.app.ar
    public void onResume() {
        Window window;
        super.onResume();
        android.support.v4.app.av activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i2 = attributes != null ? attributes.softInputMode : this.f44267f;
        int i3 = true != this.f44265d ? 0 : 32;
        this.f44267f = i2;
        window.setSoftInputMode(i3);
    }

    public void p(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, "activityEvent");
        String name = getClass().getName();
        Objects.toString(sVar);
        com.waze.shared_infra.i.h.k(name, "unhandled event ".concat(sVar.toString()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(int i2, FeedbackScreenOrigin feedbackScreenOrigin, com.waze.uid.activities.e eVar, boolean z, bd bdVar) {
        super(i2);
        h.g.b.x.f(eVar, "fragmentViewType");
        h.g.b.x.f(bdVar, "fragmentOrientation");
        this.f44262a = feedbackScreenOrigin;
        this.f44263b = eVar;
        this.f44265d = z;
        this.f44266e = bdVar;
        this.f44267f = 1;
    }
}
