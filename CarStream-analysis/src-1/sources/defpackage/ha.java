package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.core.call.CallWatch;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ha implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ ha(qa qaVar, int i) {
        this.a = i;
        this.b = qaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MainActivity mainActivity = this.b.a;
                if (mainActivity != null) {
                    mainActivity.moHuongDan();
                    break;
                }
                break;
            case 1:
                qa qaVar = this.b;
                MainActivity mainActivity2 = qaVar.a;
                int iG = d8.g(mainActivity2, 24);
                LinearLayout linearLayoutA = ad.a(mainActivity2, 1);
                linearLayoutA.setBackground(k1.t(d8.n(), d8.g(mainActivity2, 24)));
                linearLayoutA.setPadding(iG, iG, iG, d8.g(mainActivity2, 20));
                linearLayoutA.addView(k1.o(mainActivity2, "Tên gói app Waze", 19, 1, d8.o()));
                TextView textViewO = k1.o(mainActivity2, "Waze có nhiều bản mod, mỗi bản một tên gói khác nhau. Gõ đúng tên gói của bản bạn đang cài thì app mới đọc được bong bóng của nó. Để trống là quay về bản chính chủ com.waze.", 14, 0, d8.p());
                textViewO.setLineSpacing(d8.g(mainActivity2, 4), 1.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = d8.g(mainActivity2, 10);
                linearLayoutA.addView(textViewO, layoutParams);
                EditText editText = new EditText(mainActivity2);
                editText.setText(yc.a(mainActivity2));
                editText.setSingleLine(true);
                editText.setInputType(524289);
                editText.setTextColor(d8.o());
                editText.setHintTextColor(d8.p());
                editText.setHint("com.waze");
                editText.setTextSize(15.0f);
                editText.setBackground(k1.t(k1.x(), d8.g(mainActivity2, 14)));
                editText.setPadding(d8.g(mainActivity2, 14), d8.g(mainActivity2, 14), d8.g(mainActivity2, 14), d8.g(mainActivity2, 14));
                editText.setSelection(editText.getText().length());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = d8.g(mainActivity2, 16);
                layoutParams2.bottomMargin = d8.g(mainActivity2, 6);
                linearLayoutA.addView(editText, layoutParams2);
                Dialog dialog = new Dialog(mainActivity2);
                dialog.requestWindowFeature(1);
                linearLayoutA.addView(k1.q(mainActivity2, "Lưu", new n6(qaVar, editText, dialog, 1)));
                linearLayoutA.addView(k1.r(mainActivity2, "Thôi", new i6(dialog, 2)));
                dialog.setContentView(linearLayoutA);
                if (dialog.getWindow() != null) {
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    dialog.getWindow().setLayout((int) (mainActivity2.getResources().getDisplayMetrics().widthPixels * 0.88f), -2);
                }
                dialog.show();
                break;
            case 2:
                MainActivity mainActivity3 = this.b.a;
                try {
                    Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + mainActivity3.getPackageName()));
                    intent.addFlags(268435456);
                    mainActivity3.startActivity(intent);
                    break;
                } catch (Throwable th) {
                    String.valueOf(th);
                    try {
                        Intent intent2 = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                        intent2.addFlags(268435456);
                        mainActivity3.startActivity(intent2);
                        return;
                    } catch (Throwable th2) {
                        String.valueOf(th2);
                        return;
                    }
                }
            case 3:
                MainActivity mainActivity4 = this.b.a;
                boolean z = r4.a;
                try {
                    mainActivity4.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS").addFlags(268435456));
                    break;
                } catch (Exception e) {
                    String.valueOf(e);
                    return;
                }
            case 4:
                qa qaVar2 = this.b;
                MainActivity mainActivity5 = qaVar2.a;
                int iG2 = d8.g(mainActivity5, 24);
                LinearLayout linearLayoutA2 = ad.a(mainActivity5, 1);
                linearLayoutA2.setBackground(k1.t(d8.n(), d8.g(mainActivity5, 24)));
                linearLayoutA2.setPadding(iG2, iG2, iG2, d8.g(mainActivity5, 20));
                linearLayoutA2.addView(k1.o(mainActivity5, "Thêm nguồn kênh", 19, 1, d8.o()));
                TextView textViewO2 = k1.o(mainActivity5, "Dán đường dẫn danh sách kênh dạng M3U / M3U8. App tải về, đọc tên và nhóm kênh rồi nhớ lại — mở trên xe là có ngay.\n\nThêm được nhiều nguồn: kênh của tất cả gộp làm một, trùng địa chỉ thì bỏ bớt. CarStream không kèm sẵn kênh nào.", 14, 0, d8.p());
                textViewO2.setLineSpacing(d8.g(mainActivity5, 4), 1.0f);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.topMargin = d8.g(mainActivity5, 10);
                linearLayoutA2.addView(textViewO2, layoutParams3);
                EditText editText2 = new EditText(mainActivity5);
                editText2.setSingleLine(true);
                editText2.setInputType(524305);
                editText2.setTextColor(d8.o());
                editText2.setHintTextColor(d8.p());
                editText2.setHint("https://…/danhsach.m3u");
                editText2.setTextSize(15.0f);
                editText2.setBackground(k1.t(k1.x(), d8.g(mainActivity5, 14)));
                editText2.setPadding(d8.g(mainActivity5, 14), d8.g(mainActivity5, 14), d8.g(mainActivity5, 14), d8.g(mainActivity5, 14));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.topMargin = d8.g(mainActivity5, 16);
                linearLayoutA2.addView(editText2, layoutParams4);
                TextView textViewO3 = k1.o(mainActivity5, "", 13, 0, d8.p());
                textViewO3.setPadding(0, d8.g(mainActivity5, 10), 0, 0);
                linearLayoutA2.addView(textViewO3);
                Dialog dialog2 = new Dialog(mainActivity5);
                dialog2.requestWindowFeature(1);
                TextView textViewQ = k1.q(mainActivity5, "Thêm và tải", null);
                textViewQ.setOnClickListener(new ka(qaVar2, editText2, dialog2, textViewO3, textViewQ));
                linearLayoutA2.addView(textViewQ);
                linearLayoutA2.addView(k1.r(mainActivity5, "Thôi", new i6(dialog2, 3)));
                dialog2.setContentView(linearLayoutA2);
                if (dialog2.getWindow() != null) {
                    dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    dialog2.getWindow().setLayout((int) (mainActivity5.getResources().getDisplayMetrics().widthPixels * 0.88f), -2);
                }
                dialog2.show();
                break;
            case 5:
                l6 l6Var = (l6) this.b.b;
                l6Var.b.confirm("Gỡ máy này khỏi key?", "Máy sẽ về màn hình nhập key và không xem được cho tới khi nhập lại.\nMỗi năm chỉ được gỡ 2 lần; hết lượt phải nhắn hỗ trợ.", "Gỡ máy này", new f(l6Var, 26));
                break;
            case 6:
                CallWatch.moTrangCapQuyen(this.b.a);
                break;
            default:
                ((l6) this.b.b).b.bindVietmapWidget();
                break;
        }
    }
}
