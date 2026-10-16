package com.waze.ab;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GestureDetectorCompat;
import com.waze.R;
import com.waze.sharedui.views.OvalButton;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends com.waze.sharedui.d.a.d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final k f13802a;

    /* renamed from: b, reason: collision with root package name */
    private final GestureDetectorCompat f13803b;

    public l(Context context, k kVar) {
        super(context, R.style.MainSlideUpDialog);
        this.f13802a = kVar;
        this.f13803b = new GestureDetectorCompat(context, new j(this));
        i();
    }

    public static /* synthetic */ void e(l lVar, OvalButton ovalButton) {
        ovalButton.A();
        lVar.dismiss();
        k kVar = lVar.f13802a;
        if (kVar.f13800k != null) {
            kVar.f13800k.onCancel(lVar);
        }
    }

    public static /* synthetic */ void f(l lVar, OvalButton ovalButton) {
        ovalButton.D();
        ovalButton.A();
        lVar.dismiss();
        k kVar = lVar.f13802a;
        if (kVar.o != null) {
            kVar.o.a(1);
        }
    }

    public static /* synthetic */ boolean g(l lVar, int i2) {
        if (i2 != 4) {
            return false;
        }
        k kVar = lVar.f13802a;
        if (kVar.f13801l != null) {
            kVar.f13801l.a();
        }
        lVar.dismiss();
        return true;
    }

    public static /* synthetic */ void h(l lVar, OvalButton ovalButton) {
        ovalButton.A();
        lVar.dismiss();
        k kVar = lVar.f13802a;
        if (kVar.o != null) {
            kVar.o.a(0);
        }
    }

    private final void i() {
        k kVar = this.f13802a;
        if (!kVar.f13798i) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
        }
        setContentView(R.layout.confirm_dialog_bottom_sheet);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.confirmMainLayout);
        Window window = getWindow();
        if (window != null) {
            com.waze.shared_infra.g.e.f(window);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.confirmDialogBottomSheetContainer);
            if (viewGroup2 != null) {
                com.waze.shared_infra.g.e.b(viewGroup2, viewGroup);
            }
        }
        TextView textView = (TextView) findViewById(R.id.confirmTitle);
        TextView textView2 = (TextView) findViewById(R.id.confirmText);
        if (TextUtils.isEmpty(kVar.f13790a)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(kVar.f13790a);
        }
        textView2.setText(Html.fromHtml(kVar.f13791b != null ? kVar.f13791b : ""));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setLinkTextColor(textView2.getCurrentTextColor());
        if (kVar.f13794e != null) {
            findViewById(R.id.confirmImageContainer).setVisibility(0);
            ImageView imageView = (ImageView) findViewById(R.id.confirmImage);
            imageView.setImageDrawable(kVar.f13794e);
            if (kVar.f13797h != 0) {
                imageView.setLayoutParams(new FrameLayout.LayoutParams(kVar.f13797h, kVar.f13797h));
            }
            kVar.f13795f;
        }
        OvalButton ovalButton = (OvalButton) findViewById(R.id.confirmSend);
        byte[] bArr = null;
        com.waze.a.y yVar = new com.waze.a.y(this, ovalButton, 2, bArr);
        OvalButton ovalButton2 = (OvalButton) findViewById(R.id.confirmCloseOvalButton);
        View viewFindViewById = findViewById(R.id.confirmCloseTextButtonSeparator);
        TextView textView3 = (TextView) findViewById(R.id.confirmCloseTextButton);
        kVar.f13793d;
        if (TextUtils.isEmpty(null)) {
            ovalButton2.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            kVar.f13799j;
            textView3.setOnClickListener(yVar);
            kVar.f13793d;
            textView3.setText((CharSequence) null);
            textView3.setPaintFlags(textView3.getPaintFlags() | 8);
            textView3.setVisibility(0);
            viewFindViewById.setVisibility(0);
            ovalButton2.setVisibility(8);
        }
        ((TextView) findViewById(R.id.confirmSendText)).setText(kVar.f13792c);
        kVar.f13796g;
        ovalButton.setOnClickListener(new com.waze.a.y(this, ovalButton, 3, bArr));
        if (kVar.f13798i) {
            findViewById(R.id.confirmLayoutSpace).setOnClickListener(new com.waze.a.y(this, ovalButton, 4, bArr));
        }
        kVar.m;
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.waze.ab.i
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return l.g(this.f13788a, i2);
            }
        });
        kVar.n;
        ovalButton.A();
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
            window2.setStatusBarColor(0);
        }
    }

    @Override // com.waze.ab.g
    public final void a() {
        i();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f13803b.onTouchEvent(motionEvent);
    }
}
