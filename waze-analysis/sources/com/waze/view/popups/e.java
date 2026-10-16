package com.waze.view.popups;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.waze.R;
import com.waze.reports.cv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.sharedui.d.a.d {

    /* renamed from: a, reason: collision with root package name */
    private TextView f45295a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f45296b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f45297c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f45298d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f45299e;

    /* renamed from: f, reason: collision with root package name */
    private FrameLayout f45300f;

    /* renamed from: g, reason: collision with root package name */
    private final int f45301g;

    public e(Context context) {
        super(context, R.style.PopInDialog);
        this.f45301g = 2;
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        String strH;
        cv cvVar;
        cv cvVar2;
        int i2;
        int i3;
        int i4;
        super.onCreate(bundle);
        setContentView(R.layout.end_of_drive_encouragement_popup);
        getWindow().setLayout(-1, -1);
        this.f45295a = (TextView) findViewById(R.id.lblTitle);
        this.f45296b = (TextView) findViewById(R.id.lblDescription);
        this.f45297c = (TextView) findViewById(R.id.lblLeftWhite);
        this.f45298d = (TextView) findViewById(R.id.lblRightBlue);
        this.f45299e = (FrameLayout) findViewById(R.id.btnLeftWhite);
        this.f45300f = (FrameLayout) findViewById(R.id.btnRightBlue);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        int i5 = this.f45301g;
        if (i5 == 0) {
            throw null;
        }
        if (i5 - 1 != 1) {
            strH = aVarA.c(R.string.END_OF_DRIVE_ECOUNRAGEMENT_DESCRIPTION, new Object[0]);
            cvVar = new cv(this, 14);
            cvVar2 = new cv(this, 15);
            i2 = R.string.END_OF_DRIVE_GET_REMINDERS;
            i3 = R.string.NO_THANKS;
            i4 = R.string.END_OF_DRIVE_ECOUNRAGEMENT_TITLE;
        } else {
            strH = com.waze.speech.k.h((com.waze.shared_infra.o.a) com.waze.web.r.h(com.waze.shared_infra.o.a.class));
            cvVar = new cv(this, 12);
            cvVar2 = new cv(this, 13);
            i2 = R.string.END_OF_DRIVE_GOT_IT;
            i3 = R.string.SETTINGS;
            i4 = R.string.END_OF_DRIVE_REMINDER_TITLE;
        }
        this.f45295a.setText(aVarA.c(i4, new Object[0]));
        this.f45296b.setText(strH);
        this.f45297c.setText(aVarA.c(i3, new Object[0]));
        this.f45298d.setText(aVarA.c(i2, new Object[0]));
        this.f45299e.setOnClickListener(cvVar);
        this.f45300f.setOnClickListener(cvVar2);
    }
}
