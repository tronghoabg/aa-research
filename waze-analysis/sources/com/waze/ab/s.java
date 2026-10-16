package com.waze.ab;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.google_assistant.aj;
import com.waze.sharedui.views.CheckBoxView;
import com.waze.sharedui.views.OvalButton;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends com.waze.sharedui.d.a.d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final o f13820a;

    /* renamed from: b, reason: collision with root package name */
    private CheckBoxView f13821b;

    public s(Context context, o oVar) {
        super(context, R.style.PopInDialog);
        this.f13820a = oVar;
        i();
    }

    public static /* synthetic */ void b(s sVar, Runnable runnable, DialogInterface dialogInterface) {
        runnable.run();
        o oVar = sVar.f13820a;
        if (oVar.f13815h != null) {
            oVar.f13815h.a(dialogInterface, sVar.f13821b.e());
        } else if (oVar.u != null) {
            oVar.u.onCancel(dialogInterface);
        }
    }

    public static /* synthetic */ void f(s sVar, Runnable runnable) {
        runnable.run();
        try {
            sVar.setOnCancelListener(null);
            sVar.cancel();
            sVar.dismiss();
        } catch (Exception unused) {
        }
        o oVar = sVar.f13820a;
        if (oVar.f13814g != null) {
            oVar.f13814g.a(true, sVar.f13821b.e());
            return;
        }
        q qVar = oVar.f13808a;
        if (qVar != null) {
            qVar.onClick(true);
        } else if (oVar.f13812e != null) {
            oVar.f13812e.onClick(sVar, 1);
        }
    }

    public static /* synthetic */ void g(s sVar, Runnable runnable) {
        runnable.run();
        try {
            sVar.setOnCancelListener(null);
            sVar.cancel();
            sVar.dismiss();
        } catch (Exception unused) {
        }
        o oVar = sVar.f13820a;
        if (oVar.f13814g != null) {
            oVar.f13814g.a(false, sVar.f13821b.e());
            return;
        }
        q qVar = oVar.f13808a;
        if (qVar != null) {
            qVar.onClick(false);
        } else if (oVar.f13812e != null) {
            oVar.f13812e.onClick(sVar, 0);
        }
    }

    private final void i() {
        o oVar = this.f13820a;
        if (oVar.v) {
            setContentView(R.layout.confirm_dialog_v);
        } else {
            setContentView(R.layout.confirm_dialog);
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            com.waze.shared_infra.g.e.f(window);
            View viewFindViewById = findViewById(R.id.dialogContainer);
            if (viewFindViewById != null) {
                com.waze.shared_infra.g.e.c(viewFindViewById);
            }
        }
        OvalButton ovalButton = (OvalButton) findViewById(R.id.confirmSend);
        OvalButton ovalButton2 = (OvalButton) findViewById(R.id.confirmClose);
        TextView textView = (TextView) findViewById(R.id.confirmSendText);
        TextView textView2 = (TextView) findViewById(R.id.confirmCloseText);
        final com.google.android.libraries.phenotype.client.stable.x xVar = new com.google.android.libraries.phenotype.client.stable.x(ovalButton, ovalButton2, 13);
        if (oVar.m <= 0) {
            xVar.run();
        } else if (oVar.f13811d) {
            ovalButton.u();
            ovalButton.G(oVar.m * 1000);
            ovalButton.y();
            ovalButton2.A();
        } else {
            ovalButton2.u();
            ovalButton2.G(oVar.m * 1000);
            ovalButton2.y();
            ovalButton.A();
        }
        byte[] bArr = null;
        if (oVar.f13816i != null) {
            com.waze.sharedui.views.v vVar = oVar.f13816i;
            int i2 = vVar.f39285d;
            if (i2 != 0) {
                ovalButton.t(i2);
                ovalButton.g(ContextCompat.getColor(ovalButton.getContext(), i2));
            }
            int i3 = vVar.f39286e;
            if (i3 != 0) {
                ovalButton.f(ContextCompat.getColor(ovalButton.getContext(), i3));
            }
            ovalButton.invalidate();
            textView.setTextColor(ResourcesCompat.getColor(getContext().getResources(), oVar.f13816i.f39286e, null));
        }
        if (oVar.f13817j != null) {
            textView.setText(oVar.f13817j);
        } else {
            ovalButton.setVisibility(8);
        }
        if (oVar.f13818k != null) {
            textView2.setText(oVar.f13818k);
        } else {
            ovalButton2.setVisibility(8);
        }
        ((TextView) findViewById(R.id.confirmTitle)).setText(oVar.f13809b);
        TextView textView3 = (TextView) findViewById(R.id.confirmText);
        if (oVar.f13810c != null) {
            textView3.setText(oVar.f13810c);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setLinkTextColor(textView3.getCurrentTextColor());
        } else {
            textView3.setVisibility(8);
        }
        ImageView imageView = (ImageView) findViewById(R.id.confirmImage);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.confirmImageContainer);
        if (oVar.n != null) {
            imageView.setImageBitmap(oVar.n);
            viewGroup.setVisibility(0);
        } else if (oVar.o != null) {
            imageView.setImageDrawable(oVar.o);
            viewGroup.setVisibility(0);
        } else if (oVar.p != 0) {
            imageView.setImageBitmap(BitmapFactory.decodeResource(getContext().getResources(), oVar.p));
            viewGroup.setVisibility(0);
        }
        this.f13821b = (CheckBoxView) findViewById(R.id.confirmCheckbox);
        if (oVar.f13819l != null) {
            String str = oVar.f13819l;
            View viewFindViewById2 = findViewById(R.id.confirmCheckboxFrame);
            if (str == null || str.length() <= 0) {
                viewFindViewById2.setVisibility(8);
            } else {
                if (ConfigValues.CONFIG_VALUE_VENUES_RTL_ADDRESSES.b().booleanValue()) {
                    ((TextView) findViewById(R.id.confirmCheckboxTextRtl)).setText(str);
                    findViewById(R.id.confirmCheckboxTextRtl).setVisibility(0);
                    findViewById(R.id.confirmCheckboxText).setVisibility(8);
                } else {
                    ((TextView) findViewById(R.id.confirmCheckboxText)).setText(str);
                    findViewById(R.id.confirmCheckboxText).setVisibility(0);
                    findViewById(R.id.confirmCheckboxTextRtl).setVisibility(8);
                }
                this.f13821b.c(false);
                viewFindViewById2.setOnClickListener(new com.google.android.material.datepicker.ac(this, 15));
                viewFindViewById2.setVisibility(0);
            }
        }
        ovalButton2.setOnClickListener(new com.waze.a.y(this, xVar, 5, bArr));
        ovalButton.setOnClickListener(new com.waze.a.y(this, xVar, 6, bArr));
        if (oVar.q != null) {
            oVar.s;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.confirmCustomViewFrame);
            frameLayout.setVisibility(0);
            ViewParent parent = oVar.q.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(oVar.q);
            }
            frameLayout.addView(oVar.q, oVar.r);
        }
        setCancelable(oVar.t);
        if (!oVar.t) {
            setCanceledOnTouchOutside(false);
        }
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.waze.ab.m
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                if (i4 != 4) {
                    return false;
                }
                s sVar = this.f13804a;
                o oVar2 = sVar.f13820a;
                if (oVar2.w == null) {
                    return false;
                }
                Runnable runnable = xVar;
                oVar2.w.a();
                runnable.run();
                sVar.dismiss();
                return true;
            }
        });
        setOnCancelListener(new aj(this, xVar, 1));
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.waze.ab.n
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                xVar.run();
                o oVar2 = this.f13806a.f13820a;
                if (oVar2.f13813f != null) {
                    oVar2.f13813f.run();
                }
            }
        });
    }

    @Override // com.waze.ab.g
    public final void a() {
        i();
    }

    public final boolean e() {
        return this.f13821b.e();
    }
}
