package com.waze.bb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.waze.R;
import com.waze.sharedui.d.a.d;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final b f16187a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f16188b;

    /* renamed from: c, reason: collision with root package name */
    private WazeTextView f16189c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16190d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16191e;

    public c(Context context, boolean z, b bVar) {
        super(context, R.style.Dialog);
        this.f16188b = com.waze.shared_infra.o.b.a();
        this.f16187a = bVar;
        this.f16190d = false;
        this.f16191e = z;
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.f16190d = true;
        cVar.dismiss();
    }

    @Override // com.waze.sharedui.d.a.d, android.support.v7.app.ap, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f16187a.a(this.f16190d);
        super.dismiss();
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.phone_request_access);
        getWindow().setLayout(-1, -1);
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.rqAccessContinue);
        this.f16189c = wazeTextView;
        wazeTextView.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 18));
        TextView textView = (TextView) findViewById(R.id.rqAccessHeaderText);
        com.waze.shared_infra.o.a aVar = this.f16188b;
        textView.setText(aVar.c(R.string.REQUEST_CONTACTS_TITLE, new Object[0]));
        ((TextView) findViewById(R.id.rqAccessBodyText)).setText(aVar.c(R.string.REQUEST_CONTACTS_BODY, new Object[0]));
        this.f16189c.setText(aVar.c(R.string.REQUEST_CONTACTS_NEXT, new Object[0]));
        TextView textView2 = (TextView) findViewById(R.id.rqAccessLearnMore);
        textView2.setText(aVar.c(R.string.REQUEST_CONTACTS_LEARN_MORE, new Object[0]));
        textView2.setPaintFlags(8);
        textView2.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 19));
        TextView textView3 = (TextView) findViewById(R.id.rqAccessClose);
        textView3.setText(aVar.c(R.string.REQUEST_CONTACTS_CANCEL, new Object[0]));
        textView3.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 20));
        if (this.f16191e) {
            this.f16189c.setBackground(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.button_white_bg, null));
            this.f16189c.setBackgroundTintList(ColorStateList.valueOf(getContext().getResources().getColor(R.color.surface_default)));
            this.f16189c.setTextColor(ResourcesCompat.getColor(getContext().getResources(), R.color.primary_variant, null));
        }
    }
}
