package com.waze.sharedui.g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeTextView;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends com.waze.sharedui.d.a {
    /* synthetic */ n(Context context, int i2, CharSequence charSequence, CharSequence charSequence2, List list, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        setContentView(R.layout.ob_dialog_bottom);
        u(findViewById(R.id.obDialogContainer));
        final int i3 = 0;
        if (i2 > 0) {
            ImageView imageView = (ImageView) findViewById(R.id.obDialogImage);
            imageView.setImageResource(i2);
            imageView.setVisibility(0);
        } else {
            findViewById(R.id.obDialogImage).setVisibility(8);
        }
        if (charSequence == null || charSequence.length() <= 0) {
            findViewById(R.id.obDialogTitle).setVisibility(8);
        } else {
            ((WazeTextView) findViewById(R.id.obDialogTitle)).setText(charSequence);
        }
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.obDialogText);
        if (charSequence2 == null || charSequence2.length() == 0) {
            wazeTextView.setVisibility(8);
        } else {
            wazeTextView.setText(charSequence2);
            wazeTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.obDialogInsertButtonsHere);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final m mVar = (m) it.next();
            final int i4 = 1;
            if (mVar instanceof l) {
                final l lVar = (l) mVar;
                OvalButton ovalButton = (OvalButton) layoutInflaterFrom.inflate(lVar.f38982i == 2 ? R.layout.ob_dialog_flat_button : R.layout.ob_dialog_button, viewGroup, false);
                TextView textView = (TextView) ovalButton.findViewById(R.id.dialog_item_text);
                textView.setText(Html.fromHtml(lVar.f38983c));
                int i5 = lVar.f38988h;
                textView.setTextSize(1, 17.0f);
                textView.setTextColor(ContextCompat.getColor(getContext(), lVar.f38985e));
                if (lVar.f38986f != -1) {
                    textView.setLinkTextColor(ContextCompat.getColor(getContext(), lVar.f38986f));
                }
                ovalButton.bz(ContextCompat.getColor(getContext(), lVar.f38980a));
                if (lVar.f38984d != null) {
                    ovalButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.sharedui.g.j

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ n f38970a;

                        {
                            this.f38970a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = i3;
                            m mVar2 = lVar;
                            if (i6 != 0) {
                                mVar2.f38984d.onClick(this.f38970a, 0);
                            } else {
                                ((l) mVar2).f38984d.onClick(this.f38970a, 0);
                            }
                        }
                    });
                }
                if (lVar.f38981b > 0) {
                    Drawable drawable = ContextCompat.getDrawable(getContext(), lVar.f38981b);
                    int iR = com.waze.shared_infra.i.h.r(25);
                    if (drawable != null) {
                        if (lVar.f38981b != R.drawable.google) {
                            drawable.setTint(ContextCompat.getColor(getContext(), R.color.primary_variant));
                        }
                        drawable.setBounds(0, 0, iR, iR);
                        textView.setCompoundDrawables(drawable, null, null, null);
                    }
                }
                viewGroup.addView(ovalButton);
            } else {
                View viewInflate = layoutInflaterFrom.inflate(true != mVar.f38987g ? R.layout.ob_dialog_text_normal : R.layout.ob_dialog_separator, viewGroup, false);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_item_text);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                int i6 = mVar.f38988h;
                textView2.setTextSize(1, 17.0f);
                textView2.setTextColor(ContextCompat.getColor(getContext(), mVar.f38985e));
                if (mVar.f38986f != -1) {
                    textView2.setLinkTextColor(ContextCompat.getColor(getContext(), mVar.f38986f));
                }
                textView2.setText(Html.fromHtml(mVar.f38983c));
                if (mVar.f38984d != null) {
                    textView2.setPaintFlags(textView2.getPaintFlags() | 8);
                    textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.waze.sharedui.g.j

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ n f38970a;

                        {
                            this.f38970a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62 = i4;
                            m mVar2 = mVar;
                            if (i62 != 0) {
                                mVar2.f38984d.onClick(this.f38970a, 0);
                            } else {
                                ((l) mVar2).f38984d.onClick(this.f38970a, 0);
                            }
                        }
                    });
                }
                viewGroup.addView(viewInflate);
            }
        }
        b();
        setCancelable(z);
        setCanceledOnTouchOutside(z);
        setOnCancelListener(new com.waze.design_components.c.f(onCancelListener, 9));
    }

    private final void b() {
        findViewById(R.id.footer).setVisibility(8);
    }

    public final void a() {
        b();
    }
}
