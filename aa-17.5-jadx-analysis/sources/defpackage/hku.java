package defpackage;

import android.content.Context;
import android.service.personalcontext.hint.BundleHint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.projection.gearhead.R;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class hku implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hku(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v73, types: [gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v75, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        Integer num;
        switch (this.b) {
            case 0:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                if (gizVar.ordinal() == 0) {
                    ((cil) this.a).a(7);
                    z = true;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((hmq) this.a).b.invoke(hmi.a);
                break;
            case 4:
                ((czz) obj).getClass();
                Object obj2 = this.a;
                ((hmx) obj2).h.invoke();
                break;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
                webView.setWebViewClient(new hmt((hmx) this.a));
                break;
            case 6:
                WebView webView2 = (WebView) obj;
                webView2.getClass();
                WebSettings settings = webView2.getSettings();
                hmx hmxVar = (hmx) this.a;
                settings.setJavaScriptEnabled(hmxVar.e);
                webView2.getSettings().setDomStorageEnabled(hmxVar.c);
                webView2.getSettings().setBlockNetworkLoads(hmxVar.d);
                webView2.loadUrl(hmxVar.a);
                break;
            case 7:
                BundleHint.Builder hintTypeName = ((hqf) this.a).b.setHintTypeName((String) obj);
                hintTypeName.getClass();
                break;
            case 8:
                dec decVar = (dec) obj;
                decVar.getClass();
                decVar.a(htg.a, ((hth) this.a).d);
                break;
            case 9:
                break;
            case 10:
                Path path = (Path) obj;
                path.getClass();
                if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    if (Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 11:
                ((jst) this.a).a();
                break;
            case 12:
                dec decVar2 = (dec) obj;
                decVar2.getClass();
                Object obj3 = this.a;
                if (obj3 != null) {
                    daq.d(decVar2, (String) obj3);
                }
                break;
            case 13:
                break;
            case 14:
                giz gizVar2 = (giz) obj;
                gizVar2.getClass();
                break;
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((jva) this.a).g(false);
                if (zBooleanValue && (num = (Integer) lau.c().i().e()) != null && num.intValue() != 2) {
                    mar.a().b(omz.a, 0);
                }
                break;
            case 16:
                gim gimVar = (gim) obj;
                gimVar.getClass();
                yph yphVar = jva.a;
                yphVar.l().y("Received interaction event: %s.", gimVar);
                jva jvaVar = (jva) this.a;
                if (((Boolean) jvaVar.f.a()).booleanValue()) {
                    ((ype) yphVar.l().l(6, TimeUnit.SECONDS)).u("Speedbump is showing, ignoring user interaction");
                } else {
                    ghc ghcVar = jvaVar.d;
                    yob yobVar = ghc.a;
                    yop yopVarE = yobVar.e();
                    yos yosVar = ypi.a;
                    ((ynz) yopVarE.o(yosVar, "CarApp.H.Dis").ai(50)).y("SpeedbumpService.onUserInteraction called with event: %s", gimVar);
                    if (ghcVar.f) {
                        ajab ajabVar = ghcVar.h;
                        if (affa.f(gimVar, ajabVar.b())) {
                            ((ynz) yobVar.e().o(yosVar, "CarApp.H.Dis").ai(51)).u("Duplicate event received, not requesting permit.");
                        } else if ((gimVar instanceof gij) || (gimVar instanceof gih) || (gimVar instanceof gil)) {
                            ajabVar.d(gimVar);
                        }
                    } else {
                        ((ynz) yobVar.e().o(yosVar, "CarApp.H.Dis").ai(52)).u("Content moderation is not enabled, not requesting permit.");
                    }
                    ((gio) jvaVar.b.F(gio.class)).a();
                    jvaVar.k.d(gid.b);
                    gib gibVar = jvaVar.j;
                    if (gibVar == null) {
                        jvaVar.j = jvaVar.h();
                    } else {
                        gibVar.b();
                    }
                }
                break;
            case 17:
                ((jvo) this.a).k();
                break;
            case 18:
                ((Context) obj).getClass();
                View viewInflate = LayoutInflater.from((Context) this.a).inflate(R.layout.wrapper_menu_view, (ViewGroup) null, false);
                viewInflate.getClass();
                break;
            case 19:
                gkt gktVar = (gkt) obj;
                gktVar.getClass();
                ?? r6 = this.a;
                if (!r6.c()) {
                    r6.a(gktVar);
                }
                break;
            default:
                cst cstVar = (cst) obj;
                cstVar.getClass();
                this.a.b(Float.valueOf(Float.intBitsToFloat((int) (cstVar.l(0L) & 4294967295L))));
                break;
        }
        return afak.a;
    }
}
