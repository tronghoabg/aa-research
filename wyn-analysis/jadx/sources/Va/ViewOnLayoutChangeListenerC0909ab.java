package Va;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: Va.ab, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0909ab implements View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public static int f13995d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13996e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static int f13997f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13998a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13999b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14000c;

    public /* synthetic */ ViewOnLayoutChangeListenerC0909ab(int i5) {
        this.f13998a = i5;
    }

    public static String a(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 644889847829842669L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String b(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 'M');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f13998a) {
            case 0:
                int i17 = f13996e + 63;
                f13995d = i17 % 128;
                if (i17 % 2 != 0) {
                    Kb.u().C();
                    throw null;
                }
                if (Kb.u().C()) {
                    return;
                }
                f13996e = (f13995d + 117) % 128;
                try {
                    C0935cb.m((C0935cb) this.f14000c, (ViewGroup) this.f13999b, this);
                    f13996e = (f13995d + 77) % 128;
                    return;
                } catch (Throwable th) {
                    Ab.a0(b("￡\u0006\t￼\ufffb\u0006￮\t\u000f�\u0002￦\u0003\r\u000e\uffff\b\uffff\f￭\uffff\f\u0010\u0003�\uffff", 25 - TextUtils.indexOf((CharSequence) "", '0'), 179 - Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 26, false).intern(), b("\u000e\u0011\u0011￤\u0004\u0006\r\u0000\u0007￢\u0013\u0014\u000e\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011", 23 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 175, 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true).intern(), th, false);
                    return;
                }
            default:
                Object obj = this.f13999b;
                Pb pb2 = (Pb) this.f14000c;
                try {
                    ArrayList arrayList = new ArrayList();
                    pb2.B(obj, arrayList);
                    if (!(!arrayList.isEmpty())) {
                        return;
                    }
                    View viewT = pb2.t(obj);
                    if (viewT != null) {
                        int i18 = (f13997f + 41) % 128;
                        if (!pb2.f13616j.f13584e) {
                            f13997f = (i18 + 113) % 128;
                            viewT.removeOnLayoutChangeListener(this);
                        }
                    }
                    pb2.z(obj, arrayList);
                    pb2.m(new JSONObject(), arrayList.get(0), obj);
                    return;
                } catch (Throwable th2) {
                    Ab.a0(a(TextUtils.getOffsetBefore("", 0) + 61261, "䪫ꗕ鐛蝦\uf7aa\ue60f텑솓ム⌶Ꭾˆ紹汥岵伊빑꺕駵").intern(), a(22391 - Color.blue(0), "䪨ᷨ\ue471䳧ᝃﾞ䙎⻂\uf175妭‥袼匘㮟舀啡㷩葉泛㝙鿏晉캲").intern(), th2, false);
                    return;
                }
        }
    }
}
