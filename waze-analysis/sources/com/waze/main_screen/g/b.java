package com.waze.main_screen.g;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.waze.R;
import com.waze.sdk.bd;
import com.waze.sharedui.views.OvalButton;
import h.g.b.ar;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends OvalButton {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f26344a;

    /* renamed from: b, reason: collision with root package name */
    private com.waze.ui.r.a.e.b.a f26345b;

    /* renamed from: c, reason: collision with root package name */
    private Consumer f26346c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.firebase.messaging.l f26347d;

    public b(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.audio_button, this);
        this.f26344a = (ImageView) findViewById(R.id.audioButtonAppIcon);
        setOnClickListener(new com.waze.feedback.b(this, 16));
        setLongClickable(true);
        setOnLongClickListener(new a(this));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.main_screen.b.a.f, java.lang.Object] */
    public static /* synthetic */ void a(b bVar, View view) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        if (bVar.f26345b == com.waze.ui.r.a.e.b.a.f43359a) {
            com.waze.shared_infra.o.a aVarD = com.waze.design_components.g.b.d(view);
            Consumer consumer = bVar.f26346c;
            if (consumer != null) {
                consumer.u(aVarD.c(R.string.LOCK_SCREEN_NAVIGATION_MUSIC_BUTTON_CLICK_MESSAGE, new Object[0]));
                return;
            } else {
                com.waze.shared_infra.i.h.a("AudioButton: mLockedWarningCallback is null, can't display WazeToast to user");
                return;
            }
        }
        if (bd.d().g() != null) {
            String strG = bd.d().g();
            org.a.d.a.a aVar = com.waze.ax.b.f16123a;
            if (aVar instanceof org.a.d.a.b) {
                bVarC = ((org.a.d.a.b) aVar).l();
                int i2 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.ax.b.class);
            } else {
                bVarC = aVar.getKoin().a().c();
                int i3 = ar.f48106a;
                mVar = new h.g.b.m(com.waze.ax.b.class);
            }
            ((com.waze.ax.b) bVarC.a(mVar, null, null)).a(strG);
        }
        com.google.firebase.messaging.l lVar = bVar.f26347d;
        if (lVar == null) {
            return;
        }
        lVar.f10212a.c();
    }

    private final void i(Context context) {
        LayoutInflater.from(context).inflate(R.layout.audio_button, this);
        this.f26344a = (ImageView) findViewById(R.id.audioButtonAppIcon);
        setOnClickListener(new com.waze.feedback.b(this, 16));
        setLongClickable(true);
        setOnLongClickListener(new a(this));
    }

    private static final int j(int i2) {
        return Color.argb(Color.alpha(i2), (int) ((Color.red(i2) * 0.7f) + 76.5f), (int) ((Color.green(i2) * 0.7f) + 76.5f), (int) ((Color.blue(i2) * 0.7f) + 76.5f));
    }

    @Override // com.waze.sharedui.views.OvalButton
    public final void bz(int i2) {
        super.bz(j(i2));
    }

    public final void c(com.waze.ui.r.a.e.b.a aVar) {
        this.f26345b = aVar;
    }

    public final void d(Consumer consumer) {
        this.f26346c = consumer;
    }

    public final void e(Drawable drawable) {
        this.f26344a.setImageDrawable(drawable);
    }

    @Override // com.waze.sharedui.views.OvalButton
    public final void f(int i2) {
        super.f(j(i2));
    }

    @Override // com.waze.sharedui.views.OvalButton
    public final void g(int i2) {
        super.g(j(i2));
    }

    public final void h(com.google.firebase.messaging.l lVar) {
        this.f26347d = lVar;
    }
}
