package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.control.CarPropertyState;

/* loaded from: classes2.dex */
public final /* synthetic */ class hgl implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hgl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [iev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v72, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r15v74, types: [afec, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        gwc gwcVar;
        switch (this.c) {
            case 0:
                hgk hgkVar = (hgk) this.b;
                ((hga) this.a).c.invoke(Float.valueOf(Float.intBitsToFloat((int) (hgkVar.c >> 32))), Float.valueOf(Float.intBitsToFloat((int) (hgkVar.c & 4294967295L))), Float.valueOf(hgkVar.b));
                break;
            case 1:
                hgk hgkVar2 = (hgk) this.b;
                ((hga) this.a).a.invoke(Float.valueOf(-Float.intBitsToFloat((int) (hgkVar2.d >> 32))), Float.valueOf(-Float.intBitsToFloat((int) (hgkVar2.d & 4294967295L))));
                break;
            case 2:
                hgk hgkVar3 = (hgk) this.b;
                ((hga) this.a).d.invoke(Float.valueOf(Float.intBitsToFloat((int) (hgkVar3.c >> 32))), Float.valueOf(Float.intBitsToFloat((int) (hgkVar3.c & 4294967295L))));
                break;
            case 3:
                hgk hgkVar4 = (hgk) this.b;
                ((hga) this.a).c.invoke(Float.valueOf(Float.intBitsToFloat((int) (hgkVar4.c >> 32))), Float.valueOf(Float.intBitsToFloat((int) (hgkVar4.c & 4294967295L))), Float.valueOf(2.0f));
                break;
            case 4:
                hgk hgkVar5 = (hgk) this.b;
                ((hga) this.a).b.invoke(Float.valueOf(dlv.a(hgkVar5.e)), Float.valueOf(dlv.b(hgkVar5.e)));
                break;
            case 5:
                hgv hgvVar = (hgv) this.b;
                if (hgvVar.c && (gwcVar = ((hgu) this.a).c) != null) {
                    gwcVar.f();
                }
                hgvVar.d.invoke();
                break;
            case 6:
                AudioManager audioManager = (AudioManager) ((affv) this.a).a;
                AudioFocusRequest audioFocusRequestM293m = ep$$ExternalSyntheticApiModelOutline1.m293m(((affv) this.b).a);
                yos yosVar = ypi.a;
                if (audioManager.requestAudioFocus(audioFocusRequestM293m) == 0) {
                    ((ynz) hmw.a.h().o(yosVar, "CarApp.H.Tem").ai(105)).u("Couldn't obtain audio focus for WebView template");
                }
                break;
            case 7:
                AudioManager audioManager2 = (AudioManager) ((affv) this.a).a;
                AudioFocusRequest audioFocusRequestM293m2 = ep$$ExternalSyntheticApiModelOutline1.m293m(((affv) this.b).a);
                yos yosVar2 = ypi.a;
                audioManager2.abandonAudioFocusRequest(audioFocusRequestM293m2);
                break;
            case 8:
                ((hss) this.a).i(this.b);
                break;
            case 9:
                yph yphVar = ipd.a;
                Context context = (Context) this.a;
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.CAPTURE_SECURE_VIDEO_OUTPUT");
                ipd.a.l().y("Using %s display", iCheckSelfPermission == 0 ? "secure" : "normal");
                break;
            case 10:
                gbx gbxVar = (gbx) this.b;
                int i = gbxVar.e;
                byd bydVar = (byd) this.a;
                if (bydVar.e() > i) {
                    bydVar.h(bydVar.e() - 1);
                    bydVar.e();
                }
                afec afecVar = gbxVar.c;
                if (afecVar != null) {
                    afecVar.invoke(Integer.valueOf(bydVar.e()));
                }
                break;
            case 11:
                byd bydVar2 = (byd) this.a;
                bydVar2.h(bydVar2.e() + 1);
                bydVar2.e();
                afec afecVar2 = ((gbx) this.b).c;
                if (afecVar2 != null) {
                    afecVar2.invoke(Integer.valueOf(bydVar2.e()));
                }
                break;
            case 12:
                Object obj = this.a;
                if (obj != null) {
                    ((cil) obj).a(7);
                }
                ((gde) this.b).d.invoke();
                break;
            case 13:
                ajab ajabVar = ((jut) this.b).c;
                if (((CharSequence) ajabVar.b()).length() != 0) {
                    Object obj2 = this.a;
                    String str = (String) ajabVar.b();
                    str.getClass();
                    ajabVar.d(afyh.z(str, afpt.e(str.length() - 1, 0)));
                    ((gdf) obj2).g.invoke(ajabVar.b());
                }
                break;
            case 14:
                ((jut) this.b).c.d("");
                ((gdf) this.a).g.invoke("");
                break;
            case 15:
                GhIcon ghIcon = (GhIcon) this.b;
                break;
            case 16:
                ((geu) this.b).t().h(this.a);
                break;
            case 17:
                this.b.invoke(this.a);
                break;
            case 18:
                rij rijVar = ((kjq) this.a).d;
                CarPropertyState carPropertyState = rijVar != null ? (CarPropertyState) rijVar.a.b(new rcy(rijVar, juq.c(((kjz) this.b).a), i)) : null;
                if (carPropertyState instanceof CarPropertyState) {
                }
                break;
            case 19:
                rij rijVar2 = ((kjq) this.a).d;
                if (rijVar2 != null) {
                    rijVar2.c.F(new rcs(this.b, 8));
                    break;
                }
                break;
            default:
                Object obj3 = this.a;
                int i2 = kkz.a;
                ((urg) this.b).c(new cct(1562340647, true, new jjb(obj3, 20)));
                break;
        }
        return afak.a;
    }

    public /* synthetic */ hgl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
