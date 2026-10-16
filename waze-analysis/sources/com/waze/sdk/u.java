package com.waze.sdk;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.fe;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;
import com.waze.sharedui.views.OvalButton;
import j$.util.Objects;
import java.security.NoSuchAlgorithmException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends fe implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f35407i = 0;

    /* renamed from: a, reason: collision with root package name */
    final ImageView f35408a;

    /* renamed from: b, reason: collision with root package name */
    final OvalButton f35409b;

    /* renamed from: c, reason: collision with root package name */
    final TextView f35410c;

    /* renamed from: d, reason: collision with root package name */
    String f35411d;

    /* renamed from: e, reason: collision with root package name */
    String f35412e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f35413f;

    /* renamed from: g, reason: collision with root package name */
    boolean f35414g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ v f35415h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, View view) {
        super(view);
        Objects.requireNonNull(vVar);
        this.f35415h = vVar;
        this.f35408a = (ImageView) view.findViewById(R.id.audioPanelAppIcon);
        this.f35410c = (TextView) view.findViewById(R.id.audioPanelAppName);
        this.f35409b = (OvalButton) view.findViewById(R.id.audioPanelAppIndicator);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NoSuchAlgorithmException {
        boolean z = this.f35414g;
        v vVar = this.f35415h;
        if (z) {
            ae aeVar = vVar.f35417b;
            aeVar.ap(aeVar.f35222h);
            aeVar.R = false;
            return;
        }
        ae aeVar2 = vVar.f35417b;
        String strA = bq.a();
        aeVar2.ae.a(aeVar2.getContext(), this.f35412e, this.f35411d, strA);
        final String str = this.f35411d;
        final String str2 = this.f35412e;
        if (ap.f35250a.e(this.f35411d, strA, new Runnable() { // from class: com.waze.sdk.r
            @Override // java.lang.Runnable
            public final void run() {
                ae aeVar3 = this.f35401a.f35415h.f35417b;
                aeVar3.ae.b(aeVar3.getContext());
                aeVar3.an(str, str2);
            }
        })) {
            ae.A(aeVar2, this.f35411d, this.f35412e, this.f35413f);
        } else {
            aeVar2.ae.b(aeVar2.getContext());
            new com.waze.sharedui.d.a.d(aeVar2.getContext(), String.format(aeVar2.ac.c(R.string.AUDIO_SDK_POPUP_UPDATE_APP_TITLE, new Object[0]), this.f35412e), String.format(aeVar2.ac.c(R.string.AUDIO_SDK_POPUP_UPDATE_APP_MESSAGE, new Object[0]), this.f35412e), aeVar2.ac.c(R.string.AUDIO_SDK_POPUP_UPDATE_APP_MAIN_BUTTON_TITLE, new Object[0]), new View.OnClickListener() { // from class: com.waze.sdk.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    u uVar = this.f35404a;
                    SdkConfiguration.openAppInstallPage(uVar.f35415h.f35417b.getContext(), uVar.f35411d);
                }
            }, Integer.valueOf(aeVar2.getContext().getResources().getColor(R.color.Blue500_deprecated)), aeVar2.ac.c(R.string.AUDIO_SDK_POPUP_UPDATE_APP_SECONDARY_BUTTON_TITLE, new Object[0]), null, null, true, null).show();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            com.waze.view.anim.g.d(view).scaleX(0.85f).scaleY(0.85f).start();
        } else if (action == 1) {
            com.waze.view.anim.g.d(view).scaleX(1.0f).scaleY(1.0f).setListener(com.waze.view.anim.g.a(new t(this, view)));
        } else if (action == 3) {
            com.waze.view.anim.g.d(view).scaleX(1.0f).scaleY(1.0f);
        }
        return true;
    }
}
