package Va;

import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Ub extends Ba {

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13762h = {'7', 'i', 'm', 'm', 'l', 's', ' ', 'W', 'g', 'f', 'r', 'v', 'n', 'f', 'k', '\\', ']', 'm', 'i', 'q', ']', 'V', 'i', 'i', 'k', 'i', 'j', 'q', 'p', '0', 'j', 'l', 'Y', '`', 'q', 'i', 'm', 'm', 'B', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', '['};

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13763c = 1;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13764d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13765e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f13766f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13767g;

    public /* synthetic */ Ub() {
    }

    public static String d(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13762h, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.Ba
    public final void c() throws JSONException {
        switch (this.f13763c) {
            case 0:
                WebView webView = (WebView) this.f13764d;
                String originalUrl = webView.getOriginalUrl();
                Object objT = ((Vb) this.f13767g).f13801a.t(webView);
                Da da2 = new Da(25);
                da2.f13291f = this;
                da2.f13289d = originalUrl;
                da2.f13290e = objT;
                Cb.e(da2);
                break;
            case 1:
                Vb vb2 = (Vb) this.f13767g;
                ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = vb2.f13801a;
                int i5 = ViewOnLayoutChangeListenerC0910b.f14001p;
                ViewOnLayoutChangeListenerC0910b.f14002q = (i5 + 103) % 128;
                boolean z2 = viewOnLayoutChangeListenerC0910b.f14006j;
                int i10 = i5 + 13;
                ViewOnLayoutChangeListenerC0910b.f14002q = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 64 / 0;
                }
                if (z2) {
                    List listE = ViewOnLayoutChangeListenerC0910b.E(viewOnLayoutChangeListenerC0910b);
                    boolean z10 = this.f13766f;
                    WebView webView2 = (WebView) this.f13764d;
                    String str = (String) this.f13765e;
                    if (listE != null && !ViewOnLayoutChangeListenerC0910b.E(vb2.f13801a).isEmpty()) {
                        Iterator it = ViewOnLayoutChangeListenerC0910b.E(vb2.f13801a).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                Vb.e(vb2, webView2, str, z10);
                                break;
                            }
                        }
                        break;
                    } else {
                        Vb.e(vb2, webView2, str, z10);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObjectC = ((C1066n) this.f13767g).c(null, this.f13766f, false, false);
                try {
                    jSONObjectC.put(d("\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{0, 6, 0, 4}, true).intern(), (JSONArray) this.f13764d);
                } catch (JSONException e7) {
                    Ab.R(d("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{6, 23, 0, 0}, false).intern(), d("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{29, 24, 0, 24}, true).intern(), e7);
                }
                C1206y c1206y = new C1206y(6);
                c1206y.f14799e = this;
                c1206y.f14798d = jSONObjectC;
                Cb.j(c1206y);
                break;
        }
    }

    public Ub(C1066n c1066n, boolean z2, JSONArray jSONArray, S3.i iVar) {
        this.f13767g = c1066n;
        this.f13766f = z2;
        this.f13764d = jSONArray;
        this.f13765e = iVar;
    }

    public Ub(Vb vb2, WebView webView, String str, boolean z2) {
        this.f13767g = vb2;
        this.f13764d = webView;
        this.f13765e = str;
        this.f13766f = z2;
    }
}
