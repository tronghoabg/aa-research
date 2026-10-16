package com.waze.rtalerts;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.MoodManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.ai;
import com.waze.reports.bx;
import com.waze.reports.bz;
import com.waze.reports.cm;
import com.waze.ui.z.as;
import com.waze.view.button.ReportMenuButton;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35131a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f35132b = as.f(3);

    /* renamed from: c, reason: collision with root package name */
    private final LayoutInflater f35133c;

    /* renamed from: d, reason: collision with root package name */
    private final RtAlertItem f35134d;

    /* renamed from: e, reason: collision with root package name */
    private final Activity f35135e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f35136f = com.waze.shared_infra.o.b.a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f35137g = false;

    /* renamed from: h, reason: collision with root package name */
    private RtAlertsCommentData[] f35138h = null;

    l(Activity activity, RtAlertItem rtAlertItem) {
        this.f35135e = activity;
        this.f35133c = activity.getLayoutInflater();
        this.f35134d = rtAlertItem;
    }

    static /* bridge */ /* synthetic */ void b(l lVar, ImageView imageView, Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        bx bxVar = new bx(null, null, lVar.f35134d.getReportedBy(), null, false);
        bxVar.f33746i = bitmap;
        arrayList.add(bxVar);
        cm cmVarE = bz.e(imageView, arrayList, 0, new k(lVar));
        cmVarE.v();
        com.waze.inbox.e eVar = new com.waze.inbox.e(12);
        View viewFindViewById = cmVarE.findViewById(R.id.galleryCloseButton);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(eVar);
    }

    public static /* synthetic */ void d(l lVar) {
        lVar.f35137g = !lVar.f35137g;
        lVar.notifyDataSetChanged();
    }

    public static /* synthetic */ void e(l lVar) {
        lVar.f35137g = !lVar.f35137g;
        lVar.notifyDataSetChanged();
    }

    private static final void f(View view, int i2, String str) {
        TextView textView = (TextView) view.findViewById(i2);
        if (str == null || str.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void c(RtAlertsCommentData[] rtAlertsCommentDataArr) {
        this.f35138h = rtAlertsCommentDataArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int length;
        RtAlertsCommentData[] rtAlertsCommentDataArr = this.f35138h;
        if (rtAlertsCommentDataArr == null || (length = rtAlertsCommentDataArr.length) == 0) {
            return 2;
        }
        return length + 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        RtAlertsCommentData[] rtAlertsCommentDataArr = this.f35138h;
        if (rtAlertsCommentDataArr == null || i2 == 0) {
            return null;
        }
        return rtAlertsCommentDataArr[i2 - 1];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        RtAlertsCommentData[] rtAlertsCommentDataArr;
        if (i2 == 0) {
            return 0;
        }
        return (i2 == 1 && ((rtAlertsCommentDataArr = this.f35138h) == null || rtAlertsCommentDataArr.length == 0)) ? 2 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int length;
        String relativeTimeNTV;
        String timeRelative;
        if (i2 == 0) {
            if (view == null) {
                view = this.f35133c.inflate(R.layout.rtalerts_comments_list_header, (ViewGroup) null);
            }
            RtAlertItem rtAlertItem = this.f35134d;
            f(view, R.id.rtAlerterCommentsTitle, rtAlertItem.getTitle());
            f(view, R.id.rtAlerterCommentsDistance, this.f35136f.c(R.string.REPORT_COMMENTS_DISTANCE_FORMAT, rtAlertItem.getDistanceStr(), rtAlertItem.getUnit()));
            f(view, R.id.rtAlerterCommentsLocation, rtAlertItem.getLocationStr());
            f(view, R.id.rtAlerterCommentsText, rtAlertItem.getDescription());
            f(view, R.id.rtAlerterCommentsReporter, rtAlertItem.getReportedBy());
            f(view, R.id.rtAlerterCommentsNumComments, Integer.toString(rtAlertItem.getNumComments()));
            f(view, R.id.rtAlerterCommentsNumLikes, Integer.toString(rtAlertItem.getNumThumbsUp()));
            TextView textView = (TextView) view.findViewById(R.id.rtAlerterCommentsTime);
            if (this.f35137g) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(rtAlertItem.getTimeStampSec() * 1000);
                timeRelative = DateFormat.getDateTimeInstance(2, 3, NativeManager.getInstance().getLocale()).format(calendar.getTime());
            } else {
                timeRelative = rtAlertItem.getTimeRelative();
            }
            textView.setText(timeRelative);
            textView.setOnClickListener(new ai(this, 10));
            ImageView imageView = (ImageView) view.findViewById(R.id.rtAlerterCommentsIconBackground);
            int backgroundColor = rtAlertItem.getBackgroundColor() | (-16777216);
            imageView.getContext();
            imageView.setImageDrawable(new com.waze.sharedui.views.h(backgroundColor, 3));
            ImageView imageView2 = (ImageView) view.findViewById(R.id.rtAlerterCommentsIcon);
            imageView2.setImageResource(com.waze.view.popups.j.d(this.f35135e, rtAlertItem.getIcon()));
            if (rtAlertItem.hasImageUrl() && !rtAlertItem.getImageUrl().isEmpty()) {
                com.waze.utils.i.a().c(rtAlertItem.getImageUrl(), new j(this, view, imageView, imageView2));
            }
            return view;
        }
        RtAlertsCommentData[] rtAlertsCommentDataArr = this.f35138h;
        if (rtAlertsCommentDataArr == null || (length = rtAlertsCommentDataArr.length) == 0) {
            if (view == null) {
                view = this.f35133c.inflate(R.layout.rtalerts_comments_list_empty, (ViewGroup) null);
            }
            ((TextView) view).setText(this.f35136f.c(R.string.REPORT_COMMENTS_EMPTY, new Object[0]));
            if (viewGroup != null && viewGroup.getChildAt(0) != null) {
                view.setMinimumHeight(viewGroup.getHeight() - viewGroup.getChildAt(0).getHeight());
            }
            return view;
        }
        if (length != 0) {
            RtAlertsCommentData rtAlertsCommentData = rtAlertsCommentDataArr[i2 - 1];
            if (view == null) {
                view = this.f35133c.inflate(R.layout.rtalerts_comments_list_item, (ViewGroup) null);
            }
            ReportMenuButton reportMenuButton = (ReportMenuButton) view.findViewById(R.id.rtalerts_comments_item_wazer_image);
            TextView textView2 = (TextView) view.findViewById(R.id.rtalerts_comments_item_comment);
            TextView textView3 = (TextView) view.findViewById(R.id.rtalerts_comments_item_username);
            TextView textView4 = (TextView) view.findViewById(R.id.rtalerts_comments_item_time);
            view.setId(rtAlertsCommentData.mCommentID);
            reportMenuButton.h();
            reportMenuButton.e(MoodManager.getMoodDrawable(rtAlertsCommentData.mMood));
            reportMenuButton.setBackgroundColor(com.waze.utils.e.a(rtAlertsCommentData.mReportedBy));
            textView2.setText(rtAlertsCommentData.mDescription);
            String str = rtAlertsCommentData.mReportedBy;
            if (str == null || str.isEmpty()) {
                textView3.setText(this.f35136f.c(R.string.REPORT_COMMENTS_DEFAULT_NAME, new Object[0]));
            } else {
                textView3.setText(str);
            }
            if (this.f35137g) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(rtAlertsCommentData.m64Time * 1000);
                relativeTimeNTV = DateFormat.getDateTimeInstance(2, 3, NativeManager.getInstance().getLocale()).format(calendar2.getTime());
            } else {
                relativeTimeNTV = RtAlertsNativeManager.getInstance().getRelativeTimeNTV(rtAlertsCommentData.m64Time);
            }
            textView4.setText(relativeTimeNTV);
            textView4.setOnClickListener(new ai(this, 11));
            view.findViewById(R.id.rtalerts_comments_item_separator).setVisibility(i2 == this.f35138h.length ? 8 : 0);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
