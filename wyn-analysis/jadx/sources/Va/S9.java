package Va;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
public final class S9 extends G9 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public R9 f13686b;

    public static String a(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 65028);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f13686b.a(this, view);
        } catch (Throwable th) {
            Ab.a0(a((char) Color.red(0), "촘婢븴⺒", "\ua9ff夤慶秘שּׂᷗ\ue88b뗑썧毳귷쎒싰覯\u2e6a辠ૡỉ좂\ude80㥬ꖈ\ueefe\ue170", ViewConfiguration.getPressedStateDuration() >> 16).intern(), a((char) (4142 - Color.red(0)), "擊♶⸶Ḑ", "鮒慟뒗Ჹ⻳왡跃귨\uf1ff\uf7b6࠴嚂㽘鴉ꋁ\ud835\ue209赵딡乑꺢罔垦淟⑁굍䣢寂", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1).intern(), th, false);
        }
        Object obj = this.f13381a;
        if (obj != null) {
            ((View.OnClickListener) obj).onClick(view);
        }
    }
}
