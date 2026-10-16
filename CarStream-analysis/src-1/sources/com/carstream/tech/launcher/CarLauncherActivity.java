package com.carstream.tech.launcher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.launcher.AppRepo;
import com.carstream.tech.launcher.MediaHub;
import defpackage.c0;
import defpackage.g7;
import defpackage.h0;
import defpackage.k2;
import defpackage.l2;
import defpackage.l7;
import defpackage.m2;
import defpackage.o2;
import defpackage.p2;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class CarLauncherActivity extends Activity {
    private static final int CARD_H_DP = 196;
    private static final int CARD_RADIUS_DP = 28;
    private static final int CELL_DP = 140;
    private static final int ICON_DP = 76;
    private static final int ICON_RADIUS_DP = 19;
    private List<AppRepo.Entry> apps;
    private ImageView art;
    private boolean btCu;
    private LinearLayout chipNet;
    private TextView chipPin;
    private LinearLayout chipTroi;
    private Glyph chipTroiIcon;
    private TextView chipTroiSo;
    private TextView clock;
    private boolean daDoNet;
    private TextView date;
    private String ddCu;
    private LinearLayout ganDay;
    private String gioCu;
    private boolean gpsCu;
    private LinearLayout grid;
    private TextView mArtist;
    private ThanhTienDo mBar;
    private TextView mNhan;
    private Glyph mPlay;
    private TextView mTitle;
    private boolean manCon;
    private Glyph netBt;
    private View netCham;
    private TextView netDd;
    private TextView netGps;
    private Glyph netWifi;
    private String ngayCu;
    private boolean nightCu;
    private String pinCu;
    private ThanhTienDo spdBar;
    private TextView spdSo;
    private TextView spdTrip;
    private Speedo speedo;
    private String tocCu;
    private String tripCu;
    private String troiTxt;
    private String troiTxtCu;
    private Ui ui;
    private Weather weather;
    private boolean wifiCu;
    private int fullW = 0;
    private int fullH = 0;
    private final Handler h = new Handler(Looper.getMainLooper());
    private final MediaHub media = new MediaHub();
    private int troiKindCu = -1;
    private final SimpleDateFormat fmtGio = new SimpleDateFormat("HH:mm", Locale.getDefault());
    private final SimpleDateFormat fmtNgay = new SimpleDateFormat("EEEE, d/M", new Locale("vi"));
    private int troiKind = 0;
    private int demVerCu = Ui.demVer;
    private final AppRepo.Listener appCb = new AppRepo.Listener() { // from class: q2
        @Override // com.carstream.tech.launcher.AppRepo.Listener
        public final void onApps(List list) {
            this.a.lambda$new$0(list);
        }
    };
    private final Runnable demDoi = new p2(this, 1);
    private final Runnable tick = new Runnable() { // from class: com.carstream.tech.launcher.CarLauncherActivity.1
        @Override // java.lang.Runnable
        public void run() {
            Date date = new Date();
            String str = CarLauncherActivity.this.fmtGio.format(date);
            if (CarLauncherActivity.this.clock != null && !str.equals(CarLauncherActivity.this.gioCu)) {
                CarLauncherActivity.this.gioCu = str;
                CarLauncherActivity.this.clock.setText(str);
            }
            String strCap = Ui.cap(CarLauncherActivity.this.fmtNgay.format(date));
            if (CarLauncherActivity.this.date != null && !strCap.equals(CarLauncherActivity.this.ngayCu)) {
                CarLauncherActivity.this.ngayCu = strCap;
                CarLauncherActivity.this.date.setText(strCap);
            }
            CarLauncherActivity.this.h.postDelayed(this, 60080 - (System.currentTimeMillis() % 60000));
        }
    };
    private final Runnable nhipChip = new Runnable() { // from class: com.carstream.tech.launcher.CarLauncherActivity.2
        @Override // java.lang.Runnable
        public void run() {
            CarLauncherActivity.this.capNhatChip();
            CarLauncherActivity.this.h.postDelayed(this, 4000L);
        }
    };
    private final BroadcastReceiver nghePin = new BroadcastReceiver() { // from class: com.carstream.tech.launcher.CarLauncherActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            if (CarLauncherActivity.this.chipPin == null || intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", 100);
            if (intExtra < 0) {
                str = "";
            } else {
                str = Math.round((intExtra * 100.0f) / intExtra2) + "%";
            }
            if (str.equals(CarLauncherActivity.this.pinCu)) {
                return;
            }
            CarLauncherActivity.this.pinCu = str;
            CarLauncherActivity.this.chipPin.setText(str);
        }
    };
    private int iconCu = -1;
    private final Runnable veLaiSauDoiCo = new p2(this, 2);

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public class NenBanDo extends View {
        private final Paint p;

        public NenBanDo(Context context) {
            super(context);
            this.p = new Paint(1);
        }

        private Path duong(float f, float f2, float[] fArr) {
            Path path = new Path();
            path.moveTo((fArr[0] / 100.0f) * f, (fArr[1] / 100.0f) * f2);
            path.cubicTo((fArr[2] / 100.0f) * f, (fArr[3] / 100.0f) * f2, (fArr[4] / 100.0f) * f, (fArr[5] / 100.0f) * f2, (fArr[6] / 100.0f) * f, (fArr[7] / 100.0f) * f2);
            return path;
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            canvas.drawColor(CarLauncherActivity.this.ui.night ? -14935010 : -1447442);
            Paint paint = this.p;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.p.setStrokeCap(Paint.Cap.ROUND);
            this.p.setColor(CarLauncherActivity.this.ui.night ? -13882322 : -1);
            this.p.setStrokeWidth(CarLauncherActivity.this.ui.dp(14.0f));
            canvas.drawPath(duong(width, height, new float[]{-2.0f, 46.0f, 24.0f, 40.0f, 52.0f, 50.0f, 102.0f, 40.0f}), this.p);
            this.p.setStrokeWidth(CarLauncherActivity.this.ui.dp(10.0f));
            canvas.drawPath(duong(width, height, new float[]{30.0f, -2.0f, 27.0f, 32.0f, 34.0f, 64.0f, 26.0f, 102.0f}), this.p);
            this.p.setStrokeWidth(CarLauncherActivity.this.ui.dp(8.0f));
            canvas.drawPath(duong(width, height, new float[]{72.0f, -2.0f, 68.0f, 34.0f, 76.0f, 70.0f, 66.0f, 102.0f}), this.p);
            this.p.setColor(CarLauncherActivity.this.ui.blue);
            this.p.setStrokeWidth(CarLauncherActivity.this.ui.dp(6.0f));
            canvas.drawPath(duong(width, height, new float[]{8.0f, 92.0f, 26.0f, 70.0f, 48.0f, 56.0f, 74.0f, 30.0f}), this.p);
            this.p.setStyle(Paint.Style.FILL);
            float f = width * 0.08f;
            float f2 = height * 0.92f;
            canvas.drawCircle(f, f2, CarLauncherActivity.this.ui.dp(5.0f), this.p);
            this.p.setStyle(style);
            this.p.setStrokeWidth(CarLauncherActivity.this.ui.dp(3.0f));
            this.p.setColor(-1);
            canvas.drawCircle(f, f2, CarLauncherActivity.this.ui.dp(5.0f), this.p);
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public class ThanhTienDo extends View {
        private LinearGradient chuyen;
        private float chuyenW;
        private final int[] mau;
        private final int nen;
        private final RectF o;
        private final Paint p;
        private float v;

        public ThanhTienDo(Context context, int i, int[] iArr) {
            super(context);
            this.p = new Paint(1);
            this.o = new RectF();
            this.v = 0.0f;
            this.chuyenW = -1.0f;
            this.nen = i;
            this.mau = iArr;
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            float f = height / 2.0f;
            this.p.setShader(null);
            this.p.setColor(this.nen);
            this.o.set(0.0f, 0.0f, width, height);
            canvas.drawRoundRect(this.o, f, f, this.p);
            float f2 = this.v;
            if (f2 <= 0.0f) {
                return;
            }
            float fMax = Math.max(height, width * f2);
            int[] iArr = this.mau;
            if (iArr.length > 1) {
                if (this.chuyen == null || this.chuyenW != fMax) {
                    this.chuyenW = fMax;
                    int[] iArr2 = this.mau;
                    this.chuyen = new LinearGradient(0.0f, 0.0f, fMax, 0.0f, iArr2[0], iArr2[1], Shader.TileMode.CLAMP);
                }
                this.p.setShader(this.chuyen);
            } else {
                this.p.setColor(iArr[0]);
            }
            this.o.set(0.0f, 0.0f, fMax, height);
            canvas.drawRoundRect(this.o, f, f, this.p);
            this.p.setShader(null);
        }

        public void set(float f) {
            float fMax = Math.max(0.0f, Math.min(1.0f, f));
            if (Math.abs(fMax - this.v) < 0.002f) {
                return;
            }
            this.v = fMax;
            invalidate();
        }
    }

    private void bongMem(View view) {
        view.setElevation(this.ui.dp(5.0f));
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                view.setOutlineSpotShadowColor(638523178);
                view.setOutlineAmbientShadowColor(336533290);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildGanDay() {
        LinearLayout linearLayout = this.ganDay;
        if (linearLayout == null || this.apps == null) {
            return;
        }
        linearLayout.removeAllViews();
        List<AppRepo.Entry> list = AppRepo.topGanDay(this, this.apps, this.manCon ? 3 : 5, new p2(this, 0));
        if (list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("Gần đây:");
        textView.setTextColor(this.ui.sub);
        textView.setTextSize(this.ui.sp(16.0f));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = this.ui.s(8.0f);
        linearLayout2.addView(textView, layoutParams);
        Iterator<AppRepo.Entry> it = list.iterator();
        while (it.hasNext()) {
            linearLayout2.addView(vienThuocApp(it.next()));
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = this.ui.s(14.0f);
        this.ganDay.addView(linearLayout2, layoutParams2);
    }

    private void buildGrid() {
        int size;
        buildGanDay();
        LinearLayout linearLayout = this.grid;
        if (linearLayout == null || this.apps == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.grid.addView(sectionLabel(this.manCon ? "Chọn ứng dụng" : "Launcher"));
        int iS = this.ui.s(120.0f);
        Ui ui = this.ui;
        int iMax = Math.max(3, Math.max(iS, ui.paneW - (ui.s(56.0f) * 2)) / this.ui.s(140.0f));
        int iMax2 = Math.max(this.ui.dp(38.0f), Math.min(this.ui.s(76.0f), Math.round((r0 / iMax) * 0.54f)));
        LinearLayout linearLayout2 = null;
        for (int i = 0; i < this.apps.size(); i++) {
            if (i % iMax == 0) {
                linearLayout2 = new LinearLayout(this);
                linearLayout2.setOrientation(0);
                this.grid.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            }
            linearLayout2.addView(cell(this.apps.get(i), iMax2), new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
        if (linearLayout2 == null || (size = this.apps.size() % iMax) == 0) {
            return;
        }
        for (size = this.apps.size() % iMax; size < iMax; size++) {
            linearLayout2.addView(new View(this), new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
    }

    private void buildUi() {
        Intent intent;
        int i;
        int i2 = this.ui.paneW;
        int i3 = getResources().getDisplayMetrics().heightPixels;
        if ((this.fullW <= 0 || this.fullH <= 0) && (intent = getIntent()) != null) {
            this.fullW = intent.getIntExtra("csfw", 0);
            this.fullH = intent.getIntExtra("csfh", 0);
        }
        int i4 = this.fullW;
        if (i4 <= 0 || (i = this.fullH) <= 0) {
            float f = this.ui.d;
            this.manCon = ((float) i2) / f < 700.0f || ((float) i3) / f < 420.0f;
        } else {
            this.manCon = ((float) i2) < ((float) i4) * 0.85f || ((float) i3) < ((float) i) * 0.85f;
        }
        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackground(this.ui.bgDrawable());
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(this.ui.s(56.0f), this.ui.s(32.0f), this.ui.s(56.0f), this.ui.s(58.0f) + this.ui.s(48.0f));
        scrollView.addView(linearLayout);
        if (!this.manCon) {
            linearLayout.addView(header());
            linearLayout.addView(cardRow());
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        this.ganDay = linearLayout2;
        linearLayout2.setOrientation(1);
        linearLayout.addView(this.ganDay);
        LinearLayout linearLayout3 = new LinearLayout(this);
        this.grid = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout.addView(this.grid);
        setContentView(scrollView);
        this.h.removeCallbacks(this.tick);
        this.h.post(this.tick);
        if (this.apps != null) {
            buildGrid();
        }
        AppRepo.load(this, this.appCb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void capNhatChip() {
        String str;
        if (this.chipTroi != null && (str = this.troiTxt) != null && (this.troiKind != this.troiKindCu || !str.equals(this.troiTxtCu))) {
            this.troiKindCu = this.troiKind;
            String str2 = this.troiTxt;
            this.troiTxtCu = str2;
            this.chipTroiSo.setText(str2);
            Glyph glyph = this.chipTroiIcon;
            int i = this.troiKind;
            glyph.setKind(i == 2 ? 18 : i == 1 ? 17 : i == 3 ? 16 : 11);
            Glyph glyph2 = this.chipTroiIcon;
            int i2 = this.troiKind;
            glyph2.setColor(i2 == 2 ? this.ui.blue : i2 == 1 ? this.ui.sub : this.ui.orange);
            this.chipTroi.setVisibility(0);
        }
        if (this.chipNet != null) {
            veChipNet();
        }
    }

    private View cardRow() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        int iS = this.ui.s(196.0f);
        linearLayout.addView(speedCard(), new LinearLayout.LayoutParams(this.ui.s(210.0f), iS));
        linearLayout.addView(new View(this), new LinearLayout.LayoutParams(this.ui.s(18.0f), this.ui.s(1.0f)));
        linearLayout.addView(mapCard(), new LinearLayout.LayoutParams(0, iS, 1.4f));
        linearLayout.addView(new View(this), new LinearLayout.LayoutParams(this.ui.s(18.0f), this.ui.s(1.0f)));
        linearLayout.addView(mediaCard(), new LinearLayout.LayoutParams(0, iS, 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iS);
        layoutParams.bottomMargin = this.ui.s(28.0f);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private View cell(AppRepo.Entry entry, int i) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(this.ui.s(8.0f), this.ui.s(16.0f), this.ui.s(8.0f), this.ui.s(16.0f));
        linearLayout.setClickable(true);
        ImageView imageView = new ImageView(this);
        Bitmap bitmap = AppIcon.get(entry.pkg + "/" + entry.cls, entry.icon, i, this.ui.night);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Drawable drawable = entry.icon;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        imageView.setElevation(this.ui.dp(6.0f));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(i, i));
        TextView textView = new TextView(this);
        textView.setText(entry.label);
        textView.setTextColor(this.ui.text);
        textView.setTextSize(this.ui.sp(14.0f));
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.ui.s(11.0f);
        linearLayout.addView(textView, layoutParams);
        linearLayout.setOnClickListener(new m2(this, entry, 0));
        linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: n2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.a.lambda$cell$14(view, motionEvent);
            }
        });
        return linearLayout;
    }

    private TextView chipChu(int i, int i2, boolean z) {
        TextView textView = new TextView(this);
        textView.setTextColor(i2);
        textView.setTextSize(this.ui.sp(i));
        if (z) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setMaxLines(1);
        textView.setIncludeFontPadding(false);
        return textView;
    }

    private LinearLayout.LayoutParams chipIconLp(int i, int i2) {
        float f = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(f), this.ui.s(f));
        layoutParams.rightMargin = this.ui.s(i2);
        return layoutParams;
    }

    private LinearLayout.LayoutParams chipLp() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.ui.s(8.0f);
        return layoutParams;
    }

    private LinearLayout chipVo() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(this.ui.s(16.0f), this.ui.s(9.0f), this.ui.s(16.0f), this.ui.s(9.0f));
        Ui ui = this.ui;
        linearLayout.setBackground(vienThuoc(ui.card, ui.s(38.0f)));
        return linearLayout;
    }

    private int coIcon() {
        int iS = this.ui.s(120.0f);
        Ui ui = this.ui;
        int iMax = Math.max(iS, ui.paneW - (ui.s(56.0f) * 2));
        return Math.max(this.ui.dp(38.0f), Math.min(this.ui.s(76.0f), Math.round((iMax / Math.max(3, iMax / this.ui.s(140.0f))) * 0.54f)));
    }

    private View header() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setBaselineAligned(true);
        linearLayout2.setGravity(80);
        TextView textView = new TextView(this);
        this.clock = textView;
        textView.setTextColor(this.ui.text);
        this.clock.setTextSize(this.ui.sp(48.0f));
        this.clock.setTypeface(nang(800));
        this.clock.setIncludeFontPadding(false);
        this.clock.setLetterSpacing(-0.03f);
        linearLayout2.addView(this.clock);
        TextView textView2 = new TextView(this);
        this.date = textView2;
        textView2.setTextColor(this.ui.sub);
        this.date.setTextSize(this.ui.sp(15.0f));
        this.date.setTypeface(Typeface.DEFAULT_BOLD);
        this.date.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.ui.s(14.0f);
        linearLayout2.addView(this.date, layoutParams);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(new View(this), new LinearLayout.LayoutParams(0, this.ui.s(1.0f), 1.0f));
        this.chipTroi = chipVo();
        Glyph glyph = new Glyph(this, 11, this.ui.orange);
        this.chipTroiIcon = glyph;
        glyph.setClickable(false);
        this.chipTroi.addView(this.chipTroiIcon, chipIconLp(17, 8));
        TextView textViewChipChu = chipChu(14, this.ui.text, true);
        this.chipTroiSo = textViewChipChu;
        this.chipTroi.addView(textViewChipChu);
        this.chipTroi.setVisibility(8);
        linearLayout.addView(this.chipTroi, chipLp());
        LinearLayout linearLayoutChipVo = chipVo();
        Glyph glyph2 = new Glyph(this, 19, this.ui.green);
        glyph2.setClickable(false);
        linearLayoutChipVo.addView(glyph2, chipIconLp(16, 8));
        TextView textViewChipChu2 = chipChu(14, this.ui.text, true);
        this.chipPin = textViewChipChu2;
        linearLayoutChipVo.addView(textViewChipChu2);
        linearLayout.addView(linearLayoutChipVo, chipLp());
        LinearLayout linearLayoutChipVo2 = chipVo();
        this.chipNet = linearLayoutChipVo2;
        linearLayoutChipVo2.setPadding(this.ui.s(14.0f), this.ui.s(9.0f), this.ui.s(14.0f), this.ui.s(9.0f));
        linearLayout.addView(this.chipNet, chipLp());
        this.netCham = null;
        this.netGps = null;
        this.netBt = null;
        this.netWifi = null;
        this.netDd = null;
        this.daDoNet = false;
        this.gioCu = null;
        this.ngayCu = null;
        this.pinCu = null;
        this.troiKindCu = -1;
        this.troiTxtCu = null;
        View glyph3 = new Glyph(this, 12, this.ui.text);
        Ui ui = this.ui;
        glyph3.setBackground(vienThuoc(ui.card, ui.s(38.0f)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.ui.s(40.0f), this.ui.s(38.0f));
        layoutParams2.leftMargin = this.ui.s(8.0f);
        glyph3.setLayoutParams(layoutParams2);
        glyph3.setOnClickListener(new l2(this, 0));
        linearLayout.addView(glyph3);
        try {
            this.nghePin.onReceive(this, registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        } catch (Throwable unused) {
        }
        capNhatChip();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = this.ui.s(24.0f);
        linearLayout.setLayoutParams(layoutParams3);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hienToc(float f, float f2) {
        if (this.spdSo == null) {
            return;
        }
        String strValueOf = f < 0.0f ? "--" : String.valueOf(Math.round(f));
        if (!strValueOf.equals(this.tocCu)) {
            this.tocCu = strValueOf;
            this.spdSo.setText(strValueOf);
        }
        ThanhTienDo thanhTienDo = this.spdBar;
        if (thanhTienDo != null) {
            thanhTienDo.set(f >= 0.0f ? Math.min(1.0f, f / 90.0f) : 0.0f);
        }
        String str = String.format(new Locale("vi"), "Hôm nay %.1f km", Float.valueOf(f2));
        if (str.equals(this.tripCu)) {
            return;
        }
        this.tripCu = str;
        this.spdTrip.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cell$13(AppRepo.Entry entry, View view) {
        moApp(entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$cell$14(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view.setBackground(Ui.round(this.ui.card, r4.s(22.0f)));
            view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(90L).start();
            return false;
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        view.setBackground(null);
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(140L).start();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$header$5(View view) {
        moCaiDatNhanh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mapCard$6(String str, View view) {
        AppRepo.launchPackage(this, str);
        reportPaneApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaCard$10(View view) {
        String str;
        MediaHub.Info info = this.media.info();
        if (info == null || (str = info.pkg) == null) {
            return;
        }
        AppRepo.launchPackage(this, str);
        reportPaneApp(info.pkg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaCard$7(View view) {
        this.media.prev();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaCard$8(View view) {
        this.media.playPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaCard$9(View view) {
        this.media.next();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moCsopenNeuCo$2(String str) {
        AppRepo.launchPackage(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(List list) {
        this.apps = locHienThi(list);
        buildGrid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        this.demVerCu = Ui.demVer;
        this.ui.refresh(this);
        AppIcon.clearCache();
        buildUi();
        showMedia(this.media.info());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4() {
        this.ui.refresh(this);
        int iCoIcon = coIcon();
        if (iCoIcon != this.iconCu || this.ui.night != this.nightCu) {
            this.iconCu = iCoIcon;
            this.nightCu = this.ui.night;
            AppIcon.clearCache();
        }
        buildUi();
        showMedia(this.media.info());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$nhanScale$12(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view.animate().scaleX(0.95f).scaleY(0.95f).setDuration(90L).start();
            return false;
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(140L).start();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(String str, int i) {
        this.troiTxt = str;
        this.troiKind = i;
        capNhatChip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$vienThuocApp$11(AppRepo.Entry entry, View view) {
        moApp(entry);
    }

    private List<AppRepo.Entry> locHienThi(List<AppRepo.Entry> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (AppRepo.Entry entry : list) {
            if (AppRepo.hienTrenLauncher(this, entry.pkg)) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    private View mapCard() {
        String strFirstInstalled = AppRepo.firstInstalled(this, "vn.vietmap.live", "com.google.android.apps.maps");
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackground(Ui.roundStroke(this.ui.night ? -14935010 : -1447442, r2.s(28.0f), Math.max(1, this.ui.dp(1.0f)), this.ui.vien));
        bongMem(frameLayout);
        Ui.clipRound(frameLayout, this.ui.s(28.0f));
        frameLayout.addView(new NenBanDo(this), new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(this.ui.kinh(r5.s(14.0f)));
        linearLayout.setPadding(this.ui.s(14.0f), this.ui.s(8.0f), this.ui.s(14.0f), this.ui.s(8.0f));
        View glyph = new Glyph(this, 15, -1);
        glyph.setClickable(false);
        glyph.setBackground(Ui.round(this.ui.blue, r3.s(12.0f)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(42.0f), this.ui.s(42.0f));
        layoutParams.rightMargin = this.ui.s(12.0f);
        linearLayout.addView(glyph, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setText(strFirstInstalled == null ? "Chưa cài bản đồ" : AppRepo.tenApp(this, strFirstInstalled));
        textView.setTextColor(this.ui.text);
        textView.setTextSize(this.ui.sp(15.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(strFirstInstalled == null ? "" : "Chạm để dẫn đường");
        textView2.setTextColor(this.ui.sub);
        textView2.setTextSize(this.ui.sp(12.0f));
        textView2.setTypeface(typeface);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = this.ui.s(16.0f);
        layoutParams2.bottomMargin = this.ui.s(16.0f);
        frameLayout.addView(linearLayout, layoutParams2);
        if (strFirstInstalled != null) {
            frameLayout.setClickable(true);
            frameLayout.setOnClickListener(new h0(2, this, strFirstInstalled));
        }
        return frameLayout;
    }

    private View mediaCard() {
        LinearLayout linearLayoutTheVo = theVo();
        linearLayoutTheVo.setPadding(this.ui.s(22.0f), this.ui.s(18.0f), this.ui.s(22.0f), this.ui.s(18.0f));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = new ImageView(this);
        this.art = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.art.setBackground(Ui.round(this.ui.card2, r5.s(18.0f)));
        Ui.clipRound(this.art, this.ui.s(18.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(84.0f), this.ui.s(84.0f));
        layoutParams.rightMargin = this.ui.s(16.0f);
        linearLayout.addView(this.art, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        TextView textViewNhanHoa = nhanHoa("Đang phát", this.ui.red, 12, 0.04f);
        this.mNhan = textViewNhanHoa;
        linearLayout2.addView(textViewNhanHoa);
        TextView textView = new TextView(this);
        this.mTitle = textView;
        textView.setTextColor(this.ui.text);
        this.mTitle.setTextSize(this.ui.sp(18.0f));
        this.mTitle.setTypeface(nang(700));
        this.mTitle.setMaxLines(1);
        TextView textView2 = this.mTitle;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.mTitle.setLetterSpacing(-0.01f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.ui.s(6.0f);
        linearLayout2.addView(this.mTitle, layoutParams2);
        TextView textView3 = new TextView(this);
        this.mArtist = textView3;
        textView3.setTextColor(this.ui.sub);
        this.mArtist.setTextSize(this.ui.sp(13.0f));
        this.mArtist.setMaxLines(1);
        this.mArtist.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = this.ui.s(4.0f);
        linearLayout2.addView(this.mArtist, layoutParams3);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayoutTheVo.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        Ui ui = this.ui;
        this.mBar = new ThanhTienDo(this, ui.card2, new int[]{ui.red});
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, this.ui.s(4.0f));
        layoutParams4.topMargin = this.ui.s(12.0f);
        linearLayoutTheVo.addView(this.mBar, layoutParams4);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout3.addView(nutNhac(0, false, new l2(this, 1)));
        Glyph glyphNutNhac = nutNhac(1, true, new l2(this, 2));
        this.mPlay = glyphNutNhac;
        linearLayout3.addView(glyphNutNhac);
        linearLayout3.addView(nutNhac(3, false, new l2(this, 3)));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = this.ui.s(10.0f);
        linearLayoutTheVo.addView(linearLayout3, layoutParams5);
        linearLayoutTheVo.setClickable(true);
        linearLayoutTheVo.setOnClickListener(new l2(this, 4));
        return linearLayoutTheVo;
    }

    private Glyph mini(int i, int i2, int i3) {
        Glyph glyph = new Glyph(this, i, i2);
        glyph.setClickable(false);
        float f = i3;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(f), this.ui.s(f));
        layoutParams.rightMargin = this.ui.s(10.0f);
        glyph.setLayoutParams(layoutParams);
        return glyph;
    }

    private void moApp(AppRepo.Entry entry) {
        if (AppRepo.launch(this, entry)) {
            reportPaneApp(entry.pkg + "/" + entry.cls);
        }
    }

    private void moCaiDatNhanh() {
        try {
            l7 l7VarMirror = Cau.mirror();
            if (l7VarMirror != null && l7VarMirror.d()) {
                l7VarMirror.c('q');
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            startActivity(new Intent(this, (Class<?>) QsActivity.class));
        } catch (Throwable unused2) {
        }
    }

    private void moCsopenNeuCo() {
        String stringExtra;
        try {
            Intent intent = getIntent();
            if (intent != null && (stringExtra = intent.getStringExtra("csopen")) != null && !stringExtra.isEmpty()) {
                intent.removeExtra("csopen");
                setIntent(intent);
                this.h.postDelayed(new c0(3, this, stringExtra), 350L);
            }
        } catch (Throwable unused) {
        }
    }

    private Typeface nang(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Typeface typeface = Typeface.SANS_SERIF;
                return Typeface.create(Typeface.SANS_SERIF, i, false);
            }
        } catch (Throwable unused) {
        }
        return Typeface.create("sans-serif", 1);
    }

    private TextView nhanHoa(String str, int i, int i2, float f) {
        TextView textView = new TextView(this);
        textView.setText(str.toUpperCase(new Locale("vi")));
        textView.setTextColor(i);
        textView.setTextSize(this.ui.sp(i2));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLetterSpacing(f);
        textView.setIncludeFontPadding(false);
        return textView;
    }

    private View.OnTouchListener nhanScale() {
        return new o2();
    }

    private Glyph nutNhac(int i, boolean z, View.OnClickListener onClickListener) {
        Glyph glyph = new Glyph(this, i, this.ui.text);
        glyph.setOnClickListener(onClickListener);
        glyph.setOnTouchListener(nhanScale());
        int iS = this.ui.s(z ? 64.0f : 56.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iS, iS);
        layoutParams.leftMargin = this.ui.s(14.0f);
        layoutParams.rightMargin = this.ui.s(14.0f);
        glyph.setLayoutParams(layoutParams);
        return glyph;
    }

    private void reportPaneApp(String str) {
        try {
            l7 l7VarMirror = Cau.mirror();
            if (l7VarMirror == null) {
                return;
            }
            int displayId = getDisplay() != null ? getDisplay().getDisplayId() : getWindowManager().getDefaultDisplay().getDisplayId();
            OutputStream outputStream = l7VarMirror.d;
            if (outputStream == null) {
                return;
            }
            new Thread(new g7(l7VarMirror, str, displayId, outputStream), "mirror-pane-app").start();
        } catch (Throwable unused) {
        }
    }

    private TextView sectionLabel(String str) {
        TextView textViewNhanHoa = nhanHoa(str, this.ui.sub, 16, 0.08f);
        textViewNhanHoa.setPadding(0, 0, 0, this.ui.s(12.0f));
        return textViewNhanHoa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMedia(MediaHub.Info info) {
        TextView textView = this.mTitle;
        if (textView == null) {
            return;
        }
        if (info == null || !info.any) {
            textView.setText((info == null || !info.denied) ? "Chưa phát" : "Chưa cấp quyền đọc nhạc");
            this.mArtist.setText((info == null || !info.denied) ? "Mở một app nhạc" : "Helper sẽ tự cấp khi khởi động lại");
            this.art.setImageDrawable(null);
            this.mBar.setVisibility(4);
            Glyph glyph = this.mPlay;
            if (glyph != null) {
                glyph.setKind(1);
                return;
            }
            return;
        }
        String str = info.title;
        if (str == null) {
            str = "Đang phát";
        }
        textView.setText(str);
        TextView textView2 = this.mArtist;
        String str2 = info.artist;
        if (str2 == null && (str2 = info.pkg) == null) {
            str2 = "";
        }
        textView2.setText(str2);
        this.art.setImageBitmap(info.art);
        if (info.pos < 0.0f) {
            this.mBar.setVisibility(4);
        } else {
            this.mBar.setVisibility(0);
            this.mBar.set(info.pos);
        }
        Glyph glyph2 = this.mPlay;
        if (glyph2 != null) {
            glyph2.setKind(info.playing ? 2 : 1);
        }
    }

    private View speedCard() {
        LinearLayout linearLayoutTheVo = theVo();
        linearLayoutTheVo.setGravity(17);
        linearLayoutTheVo.setPadding(this.ui.s(20.0f), this.ui.s(20.0f), this.ui.s(20.0f), this.ui.s(20.0f));
        linearLayoutTheVo.addView(nhanHoa("Tốc độ", this.ui.sub, 11, 0.07f));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        linearLayout.setBaselineAligned(true);
        TextView textView = new TextView(this);
        this.spdSo = textView;
        textView.setText("--");
        this.spdSo.setTextColor(this.ui.text);
        this.spdSo.setTextSize(this.ui.sp(58.0f));
        this.spdSo.setTypeface(nang(800));
        this.spdSo.setIncludeFontPadding(false);
        this.spdSo.setLetterSpacing(-0.04f);
        linearLayout.addView(this.spdSo);
        TextView textView2 = new TextView(this);
        textView2.setText("km/h");
        textView2.setTextColor(this.ui.sub);
        textView2.setTextSize(this.ui.sp(14.0f));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.ui.s(6.0f);
        linearLayout.addView(textView2, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = this.ui.s(4.0f);
        linearLayoutTheVo.addView(linearLayout, layoutParams2);
        Ui ui = this.ui;
        this.spdBar = new ThanhTienDo(this, ui.card2, new int[]{ui.green, ui.orange});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, this.ui.s(5.0f));
        layoutParams3.topMargin = this.ui.s(8.0f);
        linearLayoutTheVo.addView(this.spdBar, layoutParams3);
        TextView textView3 = new TextView(this);
        this.spdTrip = textView3;
        textView3.setTextColor(this.ui.sub);
        this.spdTrip.setTextSize(this.ui.sp(12.0f));
        this.spdTrip.setTypeface(typeface);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = this.ui.s(8.0f);
        linearLayoutTheVo.addView(this.spdTrip, layoutParams4);
        hienToc(-1.0f, 0.0f);
        return linearLayoutTheVo;
    }

    private LinearLayout theVo() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(this.ui.the(r1.s(28.0f)));
        bongMem(linearLayout);
        return linearLayout;
    }

    private boolean tuKetLieuNeuLacSangDienThoai() {
        try {
            Display display = Build.VERSION.SDK_INT >= 30 ? getDisplay() : getWindowManager().getDefaultDisplay();
            if ((display != null ? display.getDisplayId() : 0) != 0) {
                return false;
            }
            finishAndRemoveTask();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void veChipNet() {
        boolean zGps = TrangThai.gps(this);
        boolean zBluetooth = TrangThai.bluetooth(this);
        boolean zWifi = TrangThai.wifi(this);
        String strDiDong = TrangThai.diDong(this);
        if (this.daDoNet && zGps == this.gpsCu && zBluetooth == this.btCu && zWifi == this.wifiCu) {
            String str = this.ddCu;
            if (strDiDong == null) {
                if (str == null) {
                    return;
                }
            } else if (strDiDong.equals(str)) {
                return;
            }
        }
        this.gpsCu = zGps;
        this.btCu = zBluetooth;
        this.wifiCu = zWifi;
        this.ddCu = strDiDong;
        this.daDoNet = true;
        int i = this.ui.night ? 1090519039 : 855638016;
        if (this.netCham == null) {
            this.netCham = new View(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(7.0f), this.ui.s(7.0f));
            layoutParams.rightMargin = this.ui.s(5.0f);
            this.chipNet.addView(this.netCham, layoutParams);
            TextView textViewChipChu = chipChu(12, this.ui.sub, true);
            this.netGps = textViewChipChu;
            textViewChipChu.setText("GPS");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = this.ui.s(10.0f);
            this.chipNet.addView(this.netGps, layoutParams2);
            Glyph glyphMini = mini(9, i, 14);
            this.netBt = glyphMini;
            this.chipNet.addView(glyphMini);
            Glyph glyphMini2 = mini(8, i, 15);
            this.netWifi = glyphMini2;
            this.chipNet.addView(glyphMini2);
            TextView textViewChipChu2 = chipChu(12, this.ui.text, true);
            this.netDd = textViewChipChu2;
            this.chipNet.addView(textViewChipChu2);
        }
        this.netCham.setBackground(Ui.round(zGps ? this.ui.green : i, this.ui.s(4.0f)));
        this.netGps.setTextColor(zGps ? this.ui.green : this.ui.sub);
        this.netBt.setColor(zBluetooth ? this.ui.blue : i);
        Glyph glyph = this.netWifi;
        if (zWifi) {
            i = this.ui.blue;
        }
        glyph.setColor(i);
        this.netDd.setText(strDiDong == null ? "" : strDiDong);
        this.netDd.setVisibility(strDiDong != null ? 0 : 8);
    }

    private GradientDrawable vienThuoc(int i, int i2) {
        GradientDrawable gradientDrawableRound = Ui.round(i, i2 / 2.0f);
        gradientDrawableRound.setStroke(Math.max(1, this.ui.dp(1.0f)), this.ui.vien);
        return gradientDrawableRound;
    }

    private View vienThuocApp(AppRepo.Entry entry) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(this.ui.s(8.0f), this.ui.s(9.0f), this.ui.s(16.0f), this.ui.s(9.0f));
        Ui ui = this.ui;
        linearLayout.setBackground(vienThuoc(ui.card, ui.s(36.0f)));
        linearLayout.setClickable(true);
        ImageView imageView = new ImageView(this);
        int iS = this.ui.s(30.0f);
        Bitmap bitmap = AppIcon.get(entry.pkg + "/" + entry.cls, entry.icon, iS, this.ui.night);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Drawable drawable = entry.icon;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iS, iS);
        layoutParams.rightMargin = this.ui.s(7.0f);
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(this);
        textView.setText(entry.label);
        textView.setTextColor(this.ui.text);
        textView.setTextSize(this.ui.sp(16.0f));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView);
        linearLayout.setOnClickListener(new m2(this, entry, 1));
        linearLayout.setOnTouchListener(nhanScale());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = this.ui.s(8.0f);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (tuKetLieuNeuLacSangDienThoai()) {
            return;
        }
        this.h.removeCallbacks(this.veLaiSauDoiCo);
        this.h.postDelayed(this.veLaiSauDoiCo, 120L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (tuKetLieuNeuLacSangDienThoai()) {
            return;
        }
        this.ui = new Ui(this);
        this.iconCu = coIcon();
        this.nightCu = this.ui.night;
        buildUi();
        moCsopenNeuCo();
        this.media.start(this, new k2(this));
        Ui.dangKyDoiDem(this.demDoi);
        this.speedo = new Speedo(this, new k2(this));
        this.weather = new Weather(this, new k2(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.h.removeCallbacks(this.veLaiSauDoiCo);
        Ui.boDangKyDoiDem(this.demDoi);
        AppRepo.unload(this.appCb);
        this.media.stop();
        Speedo speedo = this.speedo;
        if (speedo != null) {
            speedo.stop();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        int i = this.demVerCu;
        int i2 = Ui.demVer;
        if (i != i2) {
            this.demVerCu = i2;
            this.ui.refresh(this);
            AppIcon.clearCache();
            buildUi();
        }
        this.h.post(this.tick);
        this.h.post(this.nhipChip);
        try {
            registerReceiver(this.nghePin, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable unused) {
        }
        this.media.refresh();
        Speedo speedo = this.speedo;
        if (speedo != null) {
            speedo.start();
        }
        Weather weather = this.weather;
        if (weather != null) {
            weather.start();
        }
        reportPaneApp(null);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.h.removeCallbacks(this.tick);
        this.h.removeCallbacks(this.nhipChip);
        try {
            unregisterReceiver(this.nghePin);
        } catch (Throwable unused) {
        }
        Speedo speedo = this.speedo;
        if (speedo != null) {
            speedo.stop();
        }
    }
}
