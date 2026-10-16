package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class qc implements RecognitionListener {
    public final /* synthetic */ rc a;

    public qc(rc rcVar) {
        this.a = rcVar;
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        String str;
        rc rcVar = this.a;
        rcVar.d = false;
        q9 q9Var = rcVar.b;
        switch (i) {
            case 1:
                str = "Mạng quá chậm";
                break;
            case 2:
                str = "Lỗi mạng";
                break;
            case 3:
                str = "Lỗi thu âm";
                break;
            case 4:
                str = "Lỗi máy chủ";
                break;
            case 5:
                str = "Lỗi ứng dụng";
                break;
            case 6:
                str = "Không nghe thấy gì";
                break;
            case 7:
                str = "Không nghe rõ";
                break;
            case 8:
                str = "Micro đang bận";
                break;
            case 9:
                str = "Chưa cấp quyền micro";
                break;
            default:
                str = "Lỗi không rõ";
                break;
        }
        t9 t9Var = q9Var.a;
        t9Var.b();
        if (t9Var.j) {
            t9Var.j = false;
            t9Var.b.y();
        }
        t9Var.i(str, true);
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        String str = (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || stringArrayList.isEmpty()) ? null : stringArrayList.get(0);
        if (str != null) {
            t9 t9Var = this.a.b.a;
            t9Var.f.setText(str);
            t9Var.f.setSelection(str.length());
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SystemClock.elapsedRealtime();
        this.a.b.a.i("Đang nghe", false);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        rc rcVar = this.a;
        q9 q9Var = rcVar.b;
        rcVar.d = false;
        String str = (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || stringArrayList.isEmpty()) ? null : stringArrayList.get(0);
        if (str == null || str.trim().isEmpty()) {
            t9 t9Var = q9Var.a;
            t9Var.b();
            if (t9Var.j) {
                t9Var.j = false;
                t9Var.b.y();
            }
            t9Var.i("Không nghe rõ", true);
            return;
        }
        String strTrim = str.trim();
        t9 t9Var2 = q9Var.a;
        t9Var2.b();
        t9Var2.f.setText(strTrim);
        t9Var2.f.setSelection(strTrim.length());
        if (!t9Var2.i) {
            t9Var2.i(null, false);
            t9.a(t9Var2, strTrim);
        } else {
            t9Var2.i("Đang tìm: ".concat(strTrim), false);
            t9Var2.b.a();
            t9Var2.h(strTrim);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
    }
}
