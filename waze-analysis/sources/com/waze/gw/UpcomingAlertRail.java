package com.waze.gw;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class UpcomingAlertRail extends LinearLayout {
    private static final int DOCK_BOTTOM = 3;
    private static final int DOCK_LEFT = 0;
    private static final int DOCK_RIGHT = 1;
    private static final int DOCK_TOP = 2;
    private static final String PREFS = "waze_hud_gw";
    private int desiredX;
    private int desiredY;
    private int dock;
    private final TextView handle;
    private final Handler handler;
    private final LinearLayout items;
    private String lastSignature;
    private int lastSize;
    private Boolean portraitState;
    private final SharedPreferences prefs;
    private int previewCount;
    private boolean previewEnabled;
    private boolean previewMode;
    private List<String> previewRows;
    private int previewSize;
    private FrameLayout root;
    private boolean rootListenerInstalled;
    private final Runnable tick;
    private boolean vertical;

    public UpcomingAlertRail(Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
        this.dock = 0;
        this.desiredX = -1;
        this.desiredY = -1;
        this.lastSize = -1;
        this.vertical = true;
        this.lastSignature = "";
        this.previewEnabled = true;
        this.previewCount = 3;
        this.previewSize = 100;
        this.tick = new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    boolean z = UpcomingAlertRail.this.previewMode ? UpcomingAlertRail.this.previewEnabled : UpcomingAlertRail.this.prefs.getBoolean("upcoming_alerts", true);
                    int i2 = UpcomingAlertRail.this.previewMode ? UpcomingAlertRail.this.previewSize : UpcomingAlertRail.this.prefs.getInt("upcoming_size", 100);
                    if (i2 != UpcomingAlertRail.this.lastSize) {
                        UpcomingAlertRail.this.lastSize = i2;
                        float f2 = i2 / 100.0f;
                        UpcomingAlertRail.this.setScaleX(f2);
                        UpcomingAlertRail.this.setScaleY(f2);
                        UpcomingAlertRail.this.post(new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                UpcomingAlertRail.this.snapAndClamp(false);
                            }
                        });
                    }
                    List entries = (z || UpcomingAlertRail.this.previewMode) ? UpcomingAlertRail.this.readEntries() : new ArrayList();
                    int iMax = UpcomingAlertRail.this.previewMode ? UpcomingAlertRail.this.previewCount : Math.max(1, Math.min(3, UpcomingAlertRail.this.prefs.getInt("upcoming_count", 3)));
                    if (!UpcomingAlertRail.this.previewMode) {
                        iMax = Math.min(iMax, UpcomingAlertRail.this.isPortrait() ? 2 : 3);
                    }
                    int i3 = 0;
                    if (entries.size() > iMax) {
                        entries = new ArrayList(entries.subList(0, iMax));
                    }
                    String strSignature = UpcomingAlertRail.this.signature(entries);
                    if (!strSignature.equals(UpcomingAlertRail.this.lastSignature)) {
                        UpcomingAlertRail.this.lastSignature = strSignature;
                        UpcomingAlertRail.this.rebuild(entries);
                    }
                    float f3 = 1.0f;
                    if (UpcomingAlertRail.this.previewMode) {
                        UpcomingAlertRail upcomingAlertRail = UpcomingAlertRail.this;
                        if (!z) {
                            f3 = 0.32f;
                        }
                        upcomingAlertRail.setAlpha(f3);
                        UpcomingAlertRail upcomingAlertRail2 = UpcomingAlertRail.this;
                        if (entries.isEmpty()) {
                            i3 = 8;
                        }
                        upcomingAlertRail2.setVisibility(i3);
                    } else {
                        UpcomingAlertRail.this.setAlpha(1.0f);
                        UpcomingAlertRail upcomingAlertRail3 = UpcomingAlertRail.this;
                        if (!z || entries.isEmpty()) {
                            i3 = 8;
                        }
                        upcomingAlertRail3.setVisibility(i3);
                    }
                } catch (Throwable th) {
                }
                UpcomingAlertRail.this.handler.postDelayed(this, 500L);
            }
        };
        this.prefs = context.getSharedPreferences(PREFS, 0);
        setGravity(17);
        setPivotX(0.0f);
        setPivotY(0.0f);
        setPadding(dp(5), dp(5), dp(5), dp(5));
        setBackground(panelBackground());
        this.handle = new TextView(context);
        this.handle.setTextColor(-5855571);
        this.handle.setTextSize(14.0f);
        this.handle.setGravity(17);
        this.handle.setTypeface(Typeface.DEFAULT_BOLD);
        this.handle.setIncludeFontPadding(false);
        this.items = new LinearLayout(context);
        this.items.setGravity(17);
        configureDock(0, true);
        setupDrag();
    }

    public void attachToRoot(FrameLayout frameLayout) {
        this.root = frameLayout;
        if (!this.rootListenerInstalled) {
            this.rootListenerInstalled = true;
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.gw.UpcomingAlertRail.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int i10;
                    int i11 = i4 - i2;
                    if (i11 <= 0 || (i10 = i5 - i3) <= 0) {
                        return;
                    }
                    boolean z = i10 > i11;
                    if (UpcomingAlertRail.this.portraitState == null || UpcomingAlertRail.this.portraitState.booleanValue() != z) {
                        UpcomingAlertRail.this.restoreForOrientation(z);
                    } else {
                        UpcomingAlertRail.this.post(new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                UpcomingAlertRail.this.snapAndClamp(false);
                            }
                        });
                    }
                }
            });
        }
        post(new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.2
            @Override // java.lang.Runnable
            public void run() {
                UpcomingAlertRail.this.restoreForOrientation(UpcomingAlertRail.this.isPortrait());
            }
        });
    }

    public void setPreviewState(List<String> list, boolean z, int i2, int i3) {
        ArrayList arrayList;
        this.previewMode = true;
        this.previewEnabled = z;
        this.previewCount = Math.max(1, Math.min(3, i2));
        this.previewSize = Math.max(70, Math.min(160, i3));
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list);
        }
        this.previewRows = arrayList;
        this.root = null;
        this.desiredY = -1;
        this.desiredX = -1;
        configureDock(2, false);
        setOnTouchListener(null);
        this.lastSize = -1;
        this.lastSignature = "";
        this.handler.removeCallbacks(this.tick);
        this.handler.post(this.tick);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.handler.removeCallbacks(this.tick);
        this.handler.post(this.tick);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.handler.removeCallbacks(this.tick);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Entry> readEntries() {
        int i2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        List<String> list = this.previewMode ? this.previewRows : Gateway.hudAlerts;
        if (list == null) {
            return arrayList;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                String[] strArrSplit = it.next().split("\\t", -1);
                if (strArrSplit.length >= 5 && (i2 = Integer.parseInt(strArrSplit[3])) >= 0) {
                    String str = strArrSplit[4] != null ? strArrSplit[4] : "";
                    int iSpeedFromIcon = speedFromIcon(str);
                    if (this.previewMode || iSpeedFromIcon <= 0 || iSpeedFromIcon != Gateway.hudLimit) {
                        String lowerCase = iSpeedFromIcon > 0 ? "speed" : str.toLowerCase(Locale.US);
                        if (lowerCase.length() != 0 && hashSet.add(lowerCase)) {
                            arrayList.add(new Entry(str, strArrSplit[2], i2, iSpeedFromIcon));
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
        Collections.sort(arrayList, new Comparator<Entry>() { // from class: com.waze.gw.UpcomingAlertRail.4
            @Override // java.util.Comparator
            public int compare(Entry entry, Entry entry2) {
                return entry.meters - entry2.meters;
            }
        });
        return arrayList;
    }

    private int speedFromIcon(String str) {
        if (str == null || !str.toLowerCase(Locale.US).startsWith("speeddrop_")) {
            return -1;
        }
        try {
            int i2 = Integer.parseInt(str.substring(10));
            if (i2 < 10 || i2 > 160) {
                return -1;
            }
            return i2;
        } catch (Throwable th) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String signature(List<Entry> list) {
        StringBuilder sb = new StringBuilder(this.vertical ? ExifInterface.GPS_MEASUREMENT_INTERRUPTED : "H");
        for (Entry entry : list) {
            sb.append('|').append(entry.rawIcon).append(':').append(entry.distance).append(':').append(entry.meters);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rebuild(List<Entry> list) {
        this.items.removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            View viewMakeItem = makeItem(list.get(i2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp(66), -2);
            if (i2 > 0) {
                if (this.vertical) {
                    layoutParams.topMargin = dp(7);
                } else {
                    layoutParams.leftMargin = dp(7);
                }
            }
            this.items.addView(viewMakeItem, layoutParams);
        }
        requestLayout();
        post(new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.5
            @Override // java.lang.Runnable
            public void run() {
                UpcomingAlertRail.this.snapAndClamp(false);
            }
        });
    }

    private View makeItem(Entry entry) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(dp(3), dp(3), dp(3), dp(4));
        if (entry.speed > 0) {
            TextView textView = new TextView(getContext());
            textView.setText(String.valueOf(entry.speed));
            textView.setTextColor(-16777216);
            textView.setTextSize(entry.speed >= 100 ? 23.0f : 27.0f);
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            ModTypeface.applySpeed(textView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(dp(6), -6645087);
            textView.setBackground(gradientDrawable);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(dp(58), dp(58)));
        } else {
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            Bitmap bitmapAlertIcon = Signs.alertIcon(getContext(), entry.rawIcon);
            if (bitmapAlertIcon != null) {
                imageView.setImageBitmap(bitmapAlertIcon);
            }
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(dp(52), dp(52)));
        }
        TextView textView2 = new TextView(getContext());
        textView2.setText((entry.distance == null || entry.distance.length() <= 0) ? formatDistance(entry.meters) : entry.distance);
        textView2.setTextColor(-789515);
        textView2.setTextSize(14.0f);
        textView2.setGravity(17);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dp(3);
        linearLayout.addView(textView2, layoutParams);
        return linearLayout;
    }

    private String formatDistance(int i2) {
        return i2 < 1000 ? i2 + " m" : i2 < 10000 ? String.format(Locale.US, "%.1f km", Float.valueOf(i2 / 1000.0f)) : Math.round(i2 / 1000.0f) + " km";
    }

    private void configureDock(int i2, boolean z) {
        boolean z2 = i2 == 0 || i2 == 1;
        this.dock = i2;
        if (z || z2 != this.vertical) {
            this.vertical = z2;
            removeAllViews();
            if (this.vertical) {
                setOrientation(1);
                this.handle.setText("•••");
                this.items.setOrientation(1);
                addView(this.handle, new LinearLayout.LayoutParams(-1, dp(12)));
                addView(this.items, new LinearLayout.LayoutParams(-2, -2));
            } else {
                setOrientation(0);
                this.handle.setText("⋮");
                this.items.setOrientation(0);
                addView(this.handle, new LinearLayout.LayoutParams(dp(12), -1));
                addView(this.items, new LinearLayout.LayoutParams(-2, -2));
            }
            this.lastSignature = "";
            requestLayout();
        }
    }

    private void setupDrag() {
        final int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnTouchListener(new View.OnTouchListener(this) { // from class: com.waze.gw.UpcomingAlertRail.6
            float downX;
            float downY;
            boolean moved;
            float offsetX;
            float offsetY;
            final /* synthetic */ UpcomingAlertRail this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ViewGroup.LayoutParams layoutParams = this.this$0.getLayoutParams();
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    return true;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        if (this.this$0.getParent() != null) {
                            this.this$0.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.downX = motionEvent.getRawX();
                        this.downY = motionEvent.getRawY();
                        this.offsetX = this.downX - layoutParams2.leftMargin;
                        this.offsetY = this.downY - layoutParams2.topMargin;
                        this.moved = false;
                        break;
                    case 1:
                    case 3:
                        if (this.moved) {
                            this.this$0.chooseNearestDock();
                            break;
                        }
                        break;
                    case 2:
                        if (!this.moved && (Math.abs(motionEvent.getRawX() - this.downX) > scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.downY) > scaledTouchSlop)) {
                            this.moved = true;
                        }
                        if (this.moved) {
                            int[] iArrClamp = this.this$0.clamp((int) (motionEvent.getRawX() - this.offsetX), (int) (motionEvent.getRawY() - this.offsetY));
                            layoutParams2.gravity = 8388659;
                            layoutParams2.leftMargin = iArrClamp[0];
                            layoutParams2.topMargin = iArrClamp[1];
                            this.this$0.desiredX = iArrClamp[0];
                            this.this$0.desiredY = iArrClamp[1];
                            this.this$0.setLayoutParams(layoutParams2);
                            break;
                        }
                        break;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void chooseNearestDock() {
        int i2;
        if (this.root == null || this.root.getWidth() <= 0 || this.root.getHeight() <= 0) {
            return;
        }
        float width = getWidth() * Math.max(0.01f, getScaleX());
        float f2 = this.desiredX + (width / 2.0f);
        float height = this.desiredY + ((getHeight() * Math.max(0.01f, getScaleY())) / 2.0f);
        float width2 = this.root.getWidth() - f2;
        float height2 = this.root.getHeight() - height;
        if (width2 < f2) {
            f2 = width2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (height < f2) {
            i2 = 2;
        } else {
            height = f2;
        }
        if (height2 < height) {
            i2 = 3;
        }
        configureDock(i2, false);
        post(new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.7
            @Override // java.lang.Runnable
            public void run() {
                UpcomingAlertRail.this.snapAndClamp(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreForOrientation(boolean z) {
        if (this.root == null || this.root.getWidth() <= 0 || this.root.getHeight() <= 0) {
            return;
        }
        this.portraitState = Boolean.valueOf(z);
        String str = z ? "_p" : "_l";
        int i2 = this.prefs.getInt("uar_dock" + str, 0);
        this.desiredX = this.prefs.getInt("uar_x" + str, dp(8));
        this.desiredY = this.prefs.getInt("uar_y" + str, dp(z ? 180 : 150));
        configureDock(i2, false);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388659;
            layoutParams2.leftMargin = this.desiredX;
            layoutParams2.topMargin = this.desiredY;
            setLayoutParams(layoutParams2);
        }
        post(new Runnable() { // from class: com.waze.gw.UpcomingAlertRail.8
            @Override // java.lang.Runnable
            public void run() {
                UpcomingAlertRail.this.snapAndClamp(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void snapAndClamp(boolean z) {
        if (this.root == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        int iDp = dp(8);
        int i2 = this.desiredX >= 0 ? this.desiredX : iDp;
        int iDp2 = this.desiredY >= 0 ? this.desiredY : dp(150);
        int iRound = Math.round(getWidth() * Math.max(0.01f, getScaleX()));
        int iRound2 = Math.round(getHeight() * Math.max(0.01f, getScaleY()));
        if (this.dock != 0) {
            if (this.dock == 1) {
                iDp = (this.root.getWidth() - iRound) - iDp;
            } else if (this.dock == 2) {
                iDp2 = iDp;
                iDp = i2;
            } else {
                if (this.dock == 3) {
                    iDp2 = (this.root.getHeight() - iRound2) - iDp;
                }
                iDp = i2;
            }
        }
        int[] iArrClamp = clamp(iDp, iDp2);
        this.desiredX = iArrClamp[0];
        this.desiredY = iArrClamp[1];
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin != iArrClamp[0] || layoutParams2.topMargin != iArrClamp[1]) {
                layoutParams2.gravity = 8388659;
                layoutParams2.leftMargin = iArrClamp[0];
                layoutParams2.topMargin = iArrClamp[1];
                setLayoutParams(layoutParams2);
            }
        }
        if (z) {
            savePosition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] clamp(int i2, int i3) {
        int iMax;
        int iMax2;
        if (this.root != null && this.root.getWidth() > 0 && getWidth() > 0) {
            int iRound = Math.round(getWidth() * Math.max(0.01f, getScaleX()));
            int iRound2 = Math.round(getHeight() * Math.max(0.01f, getScaleY()));
            iMax = Math.max(0, Math.min(i2, Math.max(0, this.root.getWidth() - iRound)));
            iMax2 = Math.max(0, Math.min(i3, Math.max(0, this.root.getHeight() - iRound2)));
        } else {
            iMax = Math.max(0, i2);
            iMax2 = Math.max(0, i3);
        }
        return new int[]{iMax, iMax2};
    }

    private void savePosition() {
        String str = isPortrait() ? "_p" : "_l";
        this.prefs.edit().putInt("uar_dock" + str, this.dock).putInt("uar_x" + str, this.desiredX).putInt("uar_y" + str, this.desiredY).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPortrait() {
        return (this.root == null || this.root.getWidth() <= 0 || this.root.getHeight() <= 0) ? getResources().getConfiguration().orientation == 1 : this.root.getHeight() > this.root.getWidth();
    }

    private GradientDrawable panelBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1508304609);
        gradientDrawable.setCornerRadius(dp(14));
        gradientDrawable.setStroke(dp(1), 1144995656);
        return gradientDrawable;
    }

    private int dp(int i2) {
        return (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static final class Entry {
        final String distance;
        final int meters;
        final String rawIcon;
        final int speed;

        Entry(String str, String str2, int i2, int i3) {
            this.rawIcon = str;
            this.distance = str2;
            this.meters = i2;
            this.speed = i3;
        }
    }
}
