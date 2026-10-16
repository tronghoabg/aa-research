package com.waze.rtalerts;

import android.app.Activity;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.exifinterface.media.ExifInterface;
import com.waze.R;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class RtAlertsComments extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    protected static RtAlertItem f35112f;

    /* renamed from: h, reason: collision with root package name */
    private ListView f35114h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35115k = true;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f35116l = null;
    private Boolean m = null;
    private final com.waze.shared_infra.o.a n = com.waze.shared_infra.o.b.a();

    /* renamed from: g, reason: collision with root package name */
    protected l f35113g = null;

    public static /* synthetic */ void l(RtAlertsComments rtAlertsComments, RtAlertsCommentData[] rtAlertsCommentDataArr) {
        if (rtAlertsCommentDataArr != null) {
            rtAlertsComments.f35113g.c(rtAlertsCommentDataArr);
            rtAlertsComments.f35113g.notifyDataSetChanged();
        }
        boolean z = true;
        if (rtAlertsCommentDataArr != null && rtAlertsCommentDataArr.length != 0) {
            z = false;
        }
        rtAlertsComments.m = Boolean.valueOf(z);
        if (rtAlertsComments.f35116l != null) {
            rtAlertsComments.r();
        }
    }

    public static /* synthetic */ void m(RtAlertsComments rtAlertsComments, boolean z) {
        rtAlertsComments.f35116l = Boolean.valueOf(z);
        if (!z) {
            rtAlertsComments.findViewById(R.id.rtalterts_comments_add_frame).setVisibility(8);
            rtAlertsComments.findViewById(R.id.rtalerts_comments_shadow).setVisibility(8);
        }
        if (rtAlertsComments.m != null) {
            rtAlertsComments.r();
        }
    }

    public static void o(Activity activity, RtAlertItem rtAlertItem) {
        f35112f = rtAlertItem;
        activity.startActivityForResult(new Intent(activity, (Class<?>) RtAlertsComments.class), ExifInterface.DATA_PACK_BITS_COMPRESSED);
    }

    public static /* synthetic */ boolean q(RtAlertsComments rtAlertsComments, int i2) {
        if (i2 != 4) {
            return false;
        }
        rtAlertsComments.s();
        return true;
    }

    private final void r() {
        if (this.f35116l.booleanValue() && this.m.booleanValue()) {
            com.waze.t.m(new com.waze.g.f(this, 16), 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        RtAlertsNativeManager.getInstance().postComment(f35112f.getId(), ((EditText) findViewById(R.id.rtalerts_comments_comment_text)).getText().toString());
        setResult(9);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        EditText editText = (EditText) findViewById(R.id.rtalerts_comments_comment_text);
        ImageView imageView = (ImageView) findViewById(R.id.rtalerts_comments_send);
        boolean z = editText.getText().length() > 0;
        if (z == this.f35115k) {
            return;
        }
        this.f35115k = z;
        imageView.setEnabled(z);
        if (z) {
            imageView.setImageResource(R.drawable.blue_comments_send_icon);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Drawable drawableMutate = getResources().getDrawable(R.drawable.blue_comments_send_icon).mutate();
        drawableMutate.setColorFilter(colorMatrixColorFilter);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            setResult(1002);
            finish();
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        setContentView(R.layout.rtalerts_comments);
        if (f35112f == null) {
            com.waze.shared_infra.i.h.c("Cannot open alerts comments this way. Please use show function and provide alert data!");
            finish();
            return;
        }
        findViewById(R.id.rtalterts_comments_close_button).setOnClickListener(new g(this));
        RtAlertsNativeManager rtAlertsNativeManager = RtAlertsNativeManager.getInstance();
        this.f35113g = new l(this, f35112f);
        ListView listView = (ListView) findViewById(R.id.rtalterts_comments_items);
        this.f35114h = listView;
        listView.setAdapter((ListAdapter) this.f35113g);
        rtAlertsNativeManager.getAlertsCommentData(f35112f.getId(), new p() { // from class: com.waze.rtalerts.e
            @Override // com.waze.rtalerts.p
            public final void a(RtAlertsCommentData[] rtAlertsCommentDataArr) {
                RtAlertsComments.l(this.f35120a, rtAlertsCommentDataArr);
            }
        });
        ((TextView) findViewById(R.id.rtalerts_comments_comment_text)).setHint(this.n.c(R.string.REPORT_COMMENTS_ADD, new Object[0]));
        v();
        EditText editText = (EditText) findViewById(R.id.rtalerts_comments_comment_text);
        editText.addTextChangedListener(new h(this));
        editText.setOnEditorActionListener(new com.waze.favorites.s(this, 4));
        findViewById(R.id.rtalerts_comments_send).setOnClickListener(new ai(this, 9));
        rtAlertsNativeManager.postCommentValidate(f35112f.getId(), new r() { // from class: com.waze.rtalerts.f
            @Override // com.waze.rtalerts.r
            public final void a(boolean z) {
                RtAlertsComments.m(this.f35121a, z);
            }
        });
        View viewFindViewById = findViewById(R.id.rtAlertsContainer);
        com.waze.shared_infra.g.e.c(viewFindViewById);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), viewFindViewById);
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
    }
}
