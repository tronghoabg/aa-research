package com.waze.reports;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ToggleButton;
import com.waze.R;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.title.TitleBar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends android.support.v4.app.ar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f33623a = "com.waze.reports.aq";

    /* renamed from: b, reason: collision with root package name */
    private static String f33624b;

    /* renamed from: c, reason: collision with root package name */
    private static String f33625c;

    /* renamed from: d, reason: collision with root package name */
    private static String f33626d;

    /* renamed from: e, reason: collision with root package name */
    private static String f33627e;

    /* renamed from: f, reason: collision with root package name */
    private static String f33628f;

    /* renamed from: g, reason: collision with root package name */
    private static String f33629g;

    /* renamed from: h, reason: collision with root package name */
    private static String f33630h;

    /* renamed from: j, reason: collision with root package name */
    private String[] f33632j;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f33634l;
    private EditText m;
    private EditText n;
    private LayoutInflater o;
    private LinearLayout p;
    private SettingsTitleText q;
    private View r;
    private WazeSettingsView s;
    private Button t;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f33631i = {R.id.editOpeningHoursAdd1, R.id.editOpeningHoursAdd2, R.id.editOpeningHoursAdd3, R.id.editOpeningHoursAdd4, R.id.editOpeningHoursAdd5, R.id.editOpeningHoursAdd6, R.id.editOpeningHoursAdd7};

    /* renamed from: k, reason: collision with root package name */
    private final boolean[] f33633k = {false, false, false, false, false, false, false};
    private final com.waze.shared_infra.o.a u = com.waze.shared_infra.o.b.a();

    protected final void g(br brVar) {
        View viewInflate = this.o.inflate(R.layout.opening_hours_line, (ViewGroup) this.p, false);
        ((WazeTextView) viewInflate.findViewById(R.id.editOpeningHoursLineDays)).setText(brVar.b());
        ((WazeTextView) viewInflate.findViewById(R.id.editOpeningHoursLineHours)).setText(brVar.c());
        viewInflate.findViewById(R.id.editOpeningHoursLineClear).setOnClickListener(new ap(this, viewInflate, this.p.getChildCount() > 0 ? com.waze.bm.a.a.ad.d(this.p) : null, brVar));
        viewInflate.setTag(brVar);
        this.p.addView(viewInflate);
        viewInflate.getLayoutParams().height = (int) (getResources().getDisplayMetrics().density * 64.0f);
        this.q.setVisibility(0);
    }

    public final void h() {
        for (int i2 = 0; i2 < 7; i2++) {
            ((ToggleButton) this.r.findViewById(this.f33631i[i2])).setChecked(this.f33633k[i2]);
        }
    }

    final void i() {
        boolean[] zArr = this.f33633k;
        this.t.setEnabled(zArr[0] || zArr[1] || zArr[2] || zArr[3] || zArr[4] || zArr[5] || zArr[6]);
    }

    public final void j(ArrayList arrayList) {
        this.f33634l = arrayList;
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            for (int i2 = 0; i2 < 7; i2++) {
                this.f33633k[i2] = bundle.getBoolean(f33623a + ".mDayButtonPressed." + i2, false);
            }
            this.f33634l = bundle.getParcelableArrayList(String.valueOf(f33623a).concat(".mArrOpeningHours"));
        }
        if (f33624b == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEEE", new Locale(((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).getLanguagesLocale()));
            Calendar calendar = Calendar.getInstance();
            calendar.set(7, 1);
            f33624b = simpleDateFormat.format(calendar.getTime());
            calendar.set(7, 2);
            f33625c = simpleDateFormat.format(calendar.getTime());
            calendar.set(7, 3);
            f33626d = simpleDateFormat.format(calendar.getTime());
            calendar.set(7, 4);
            f33627e = simpleDateFormat.format(calendar.getTime());
            calendar.set(7, 5);
            f33628f = simpleDateFormat.format(calendar.getTime());
            calendar.set(7, 6);
            f33629g = simpleDateFormat.format(calendar.getTime());
            calendar.set(7, 7);
            f33630h = simpleDateFormat.format(calendar.getTime());
        }
        if (br.f33717a) {
            this.f33632j = new String[]{f33624b, f33625c, f33626d, f33627e, f33628f, f33629g, f33630h};
        } else {
            this.f33632j = new String[]{f33625c, f33626d, f33627e, f33628f, f33629g, f33630h, f33624b};
        }
        this.o = layoutInflater;
        View viewInflate = layoutInflater.inflate(R.layout.edit_place_opening_hours, viewGroup, false);
        this.r = viewInflate;
        TitleBar titleBar = (TitleBar) viewInflate.findViewById(R.id.theTitleBar);
        com.waze.shared_infra.o.a aVar = this.u;
        titleBar.c(aVar.c(R.string.EDIT_PLACE, new Object[0]));
        titleBar.h(R.drawable.confirm_icon);
        titleBar.n(new b(this, 7));
        titleBar.m(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 16));
        SettingsTitleText settingsTitleText = (SettingsTitleText) this.r.findViewById(R.id.editOpeningHoursTitle);
        this.q = settingsTitleText;
        settingsTitleText.a(aVar.c(R.string.OPENING_HOURS, new Object[0]));
        ((SettingsTitleText) this.r.findViewById(R.id.editOpeningHoursAddTitle)).a(aVar.c(R.string.ADD_HOURS, new Object[0]));
        al alVar = new al(this);
        for (int i3 = 0; i3 < 7; i3++) {
            ToggleButton toggleButton = (ToggleButton) this.r.findViewById(this.f33631i[i3]);
            toggleButton.setTextOn(this.f33632j[i3]);
            toggleButton.setTextOff(this.f33632j[i3]);
            toggleButton.setTag(Integer.valueOf(i3));
            toggleButton.setOnTouchListener(alVar);
        }
        b bVar = new b(this, 8, (byte[]) null);
        EditText editText = (EditText) this.r.findViewById(R.id.editOpeningHoursAddFrom);
        this.m = editText;
        editText.setOnClickListener(bVar);
        this.m.setText("10:00");
        EditText editText2 = (EditText) this.r.findViewById(R.id.editOpeningHoursAddTo);
        this.n = editText2;
        editText2.setOnClickListener(bVar);
        this.n.setText("19:00");
        ((WazeTextView) this.r.findViewById(R.id.editOpeningHoursTextTo)).setText(" " + aVar.c(R.string.HOURS_TO, new Object[0]) + " ");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) this.r.findViewById(R.id.editOpeningHoursAllDayCheck);
        this.s = wazeSettingsView;
        wazeSettingsView.A(aVar.c(R.string.OPEN_24_HOURS, new Object[0]));
        this.s.D(false);
        this.s.s(new ao(this));
        Button button = (Button) this.r.findViewById(R.id.editOpeningHoursAddButton);
        this.t = button;
        button.setText(aVar.c(R.string.ADD, new Object[0]));
        this.t.setOnClickListener(new b(this, 9, (char[]) null));
        this.p = (LinearLayout) this.r.findViewById(R.id.editOpeningHoursLinesContainer);
        i();
        ArrayList arrayList = this.f33634l;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f33634l = arrayList;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            g((br) arrayList.get(i4));
        }
        if (this.f33634l.isEmpty()) {
            this.q.setVisibility(8);
            if (bundle == null) {
                for (int i5 = 0; i5 < 5; i5++) {
                    this.f33633k[i5] = true;
                }
            }
        }
        h();
        i();
        return this.r;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        for (int i2 = 0; i2 < 7; i2++) {
            bundle.putBoolean(f33623a + ".mDayButtonPressed." + i2, this.f33633k[i2]);
        }
        bundle.putParcelableArrayList(String.valueOf(f33623a).concat(".mArrOpeningHours"), this.f33634l);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.shared_infra.g.e.d(view.findViewById(R.id.editOpeningHoursContainer), (ScrollView) view.findViewById(R.id.editOpeningHoursScrollView));
    }
}
