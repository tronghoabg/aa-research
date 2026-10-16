package com.carstream.tech.launcher;

import android.content.Context;
import android.graphics.Typeface;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.launcher.AppRepo;
import defpackage.b0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class LuoiApp {
    private final Context ctx;
    private ScrollView cuon;
    private GridLayout luoi;
    private TextView lyDo;
    private AppRepo.Listener nghListener;
    private final Nghe nghe;
    private final Ui ui;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface Nghe {
        void moApp(String str);
    }

    public LuoiApp(Context context, Nghe nghe) {
        this.ctx = context;
        this.nghe = nghe;
        this.ui = new Ui(context);
    }

    private int coBaoNhieuCot() {
        return Math.max(3, Math.min(8, Math.max(1, this.ctx.getResources().getDisplayMetrics().widthPixels / Math.max(1, this.ui.s(96.0f)))));
    }

    private void napApp() {
        AppRepo.Listener listener = new AppRepo.Listener() { // from class: com.carstream.tech.launcher.LuoiApp.1
            @Override // com.carstream.tech.launcher.AppRepo.Listener
            public void onApps(final List<AppRepo.Entry> list) {
                if (LuoiApp.this.luoi == null) {
                    return;
                }
                LuoiApp.this.luoi.post(new Runnable() { // from class: com.carstream.tech.launcher.LuoiApp.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LuoiApp.this.ve(list);
                    }
                });
            }
        };
        this.nghListener = listener;
        AppRepo.load(this.ctx, listener);
    }

    private View oApp(final AppRepo.Entry entry) {
        LinearLayout linearLayout = new LinearLayout(this.ctx);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int iS = this.ui.s(8.0f);
        linearLayout.setPadding(iS, iS, iS, iS);
        ImageView imageView = new ImageView(this.ctx);
        imageView.setImageDrawable(entry.icon);
        int iS2 = this.ui.s(56.0f);
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(iS2, iS2));
        TextView textView = new TextView(this.ctx);
        textView.setText(entry.label);
        textView.setTextColor(this.ui.sub);
        textView.setTextSize(0, this.ui.s(12.0f));
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ui.s(80.0f), -2);
        layoutParams.topMargin = this.ui.s(6.0f);
        linearLayout.addView(textView, layoutParams);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.carstream.tech.launcher.LuoiApp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (LuoiApp.this.nghe != null) {
                    Nghe nghe = LuoiApp.this.nghe;
                    AppRepo.Entry entry2 = entry;
                    nghe.moApp(entry2.pkg + "/" + entry2.cls);
                }
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ve(List<AppRepo.Entry> list) {
        GridLayout gridLayout = this.luoi;
        if (gridLayout == null || list == null) {
            return;
        }
        gridLayout.removeAllViews();
        Iterator<AppRepo.Entry> it = list.iterator();
        while (it.hasNext()) {
            this.luoi.addView(oApp(it.next()));
        }
    }

    public void capNhatLyDo() {
        TextView textView = this.lyDo;
        if (textView == null) {
            return;
        }
        try {
            Context context = this.ctx;
            int i = -1;
            try {
                i = Settings.Global.getInt(context.getContentResolver(), "adb_enabled", -1);
            } catch (Throwable unused) {
            }
            textView.setText(i == 0 ? "Gỡ lỗi USB đang tắt — bật trong Tùy chọn nhà phát triển trên điện thoại" : !b0.d(context) ? "Chưa ghép nối — mở CarStream trên điện thoại để ghép một lần" : !b0.t(context) ? "Wi-Fi trên điện thoại đang tắt — bật Wi-Fi rồi mở lại mục này" : b0.i(context) == 0 ? "Gỡ lỗi không dây đang tắt — bật lại trong Tùy chọn nhà phát triển" : b0.h != null ? b0.h : "Đang khởi động — chờ một lát rồi mở lại mục này");
        } catch (Throwable unused2) {
            this.lyDo.setText("");
        }
    }

    public void thaRa() {
        AppRepo.Listener listener = this.nghListener;
        if (listener != null) {
            AppRepo.unload(listener);
            this.nghListener = null;
        }
    }

    public View view() {
        ScrollView scrollView = this.cuon;
        if (scrollView != null) {
            return scrollView;
        }
        ScrollView scrollView2 = new ScrollView(this.ctx);
        this.cuon = scrollView2;
        scrollView2.setBackgroundColor(this.ui.bg);
        this.cuon.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(this.ctx);
        linearLayout.setOrientation(1);
        int iS = this.ui.s(16.0f);
        linearLayout.setPadding(iS, iS, iS, iS);
        TextView textView = new TextView(this.ctx);
        textView.setText("Launcher");
        textView.setTextColor(this.ui.text);
        textView.setTextSize(0, this.ui.s(22.0f));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(this.ui.s(4.0f), 0, 0, this.ui.s(4.0f));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this.ctx);
        this.lyDo = textView2;
        textView2.setTextColor(this.ui.sub);
        this.lyDo.setTextSize(0, this.ui.s(13.0f));
        this.lyDo.setPadding(this.ui.s(4.0f), 0, 0, this.ui.s(12.0f));
        linearLayout.addView(this.lyDo);
        capNhatLyDo();
        GridLayout gridLayout = new GridLayout(this.ctx);
        this.luoi = gridLayout;
        gridLayout.setColumnCount(coBaoNhieuCot());
        linearLayout.addView(this.luoi, new LinearLayout.LayoutParams(-1, -2));
        this.cuon.addView(linearLayout);
        napApp();
        return this.cuon;
    }
}
