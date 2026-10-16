package u0;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: u0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4199w extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46404i;

    /* renamed from: j, reason: collision with root package name */
    public static final C4199w f46388j = new C4199w(0, 0);
    public static final C4199w k = new C4199w(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4199w f46389l = new C4199w(0, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C4199w f46390m = new C4199w(0, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C4199w f46391n = new C4199w(0, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C4199w f46392o = new C4199w(0, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C4199w f46393p = new C4199w(0, 6);

    /* renamed from: q, reason: collision with root package name */
    public static final C4199w f46394q = new C4199w(0, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final C4199w f46395r = new C4199w(0, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final C4199w f46396s = new C4199w(0, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final C4199w f46397t = new C4199w(0, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final C4199w f46398u = new C4199w(0, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final C4199w f46399v = new C4199w(0, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final C4199w f46400w = new C4199w(0, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final C4199w f46401x = new C4199w(0, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final C4199w f46402y = new C4199w(0, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final C4199w f46403z = new C4199w(0, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final C4199w f46380A = new C4199w(0, 17);

    /* renamed from: B, reason: collision with root package name */
    public static final C4199w f46381B = new C4199w(0, 18);

    /* renamed from: C, reason: collision with root package name */
    public static final C4199w f46382C = new C4199w(0, 19);

    /* renamed from: D, reason: collision with root package name */
    public static final C4199w f46383D = new C4199w(0, 20);

    /* renamed from: E, reason: collision with root package name */
    public static final C4199w f46384E = new C4199w(0, 21);

    /* renamed from: F, reason: collision with root package name */
    public static final C4199w f46385F = new C4199w(0, 22);

    /* renamed from: G, reason: collision with root package name */
    public static final C4199w f46386G = new C4199w(0, 23);

    /* renamed from: H, reason: collision with root package name */
    public static final C4199w f46387H = new C4199w(0, 24);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4199w(int i5, int i10) {
        super(i5);
        this.f46404i = i10;
    }

    @Override // tf.a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f46404i) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalLifecycleOwner");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    Lf.e eVar = Ef.S.f3698a;
                    choreographer = (Choreographer) Ef.H.I(Jf.n.f6132a, new C4202z(2, null));
                }
                AbstractC3340k.d(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
                Handler handlerV = xg.g.v(Looper.getMainLooper());
                AbstractC3340k.d(handlerV, "createAsync(Looper.getMainLooper())");
                B b5 = new B(choreographer, handlerV);
                return b5.plus(b5.k);
            case 7:
            case 8:
                return null;
            case 9:
                M.b("LocalAutofillTree");
                throw null;
            case 10:
                M.b("LocalClipboardManager");
                throw null;
            case 11:
                M.b("LocalDensity");
                throw null;
            case 12:
                M.b("LocalFocusManager");
                throw null;
            case 13:
                M.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                M.b("LocalFontLoader");
                throw null;
            case 15:
                M.b("LocalHapticFeedback");
                throw null;
            case 16:
                M.b("LocalInputManager");
                throw null;
            case 17:
                M.b("LocalLayoutDirection");
                throw null;
            case 18:
            case 19:
                return null;
            case 20:
                M.b("LocalTextToolbar");
                throw null;
            case 21:
                M.b("LocalUriHandler");
                throw null;
            case 22:
                M.b("LocalViewConfiguration");
                throw null;
            case 23:
                M.b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
