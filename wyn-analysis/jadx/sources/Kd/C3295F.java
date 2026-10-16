package kd;

import ef.C2515C;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import uc.InterfaceC4266c;

/* renamed from: kd.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3295F implements InterfaceC4266c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f f39568b;

    public /* synthetic */ C3295F(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f fVar, int i5) {
        this.f39567a = i5;
        this.f39568b = fVar;
    }

    @Override // uc.InterfaceC4266c
    public final void c(Object obj) {
        switch (this.f39567a) {
            case 0:
                boolean z2 = obj instanceof List;
                tf.l lVar = this.f39568b.f30899b;
                if (!z2) {
                    lVar.invoke(new C3300K(AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", "")));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.invoke(new C3300K((String) list.get(0)));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.invoke(new C3300K(Fe.e.z(new C3305a((String) obj2, (String) obj3, (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                boolean z10 = obj instanceof List;
                tf.l lVar2 = this.f39568b.f30899b;
                if (!z10) {
                    lVar2.invoke(new C3300K(AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", "")));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.invoke(new C3300K(C2515C.f34653a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.invoke(new C3300K(Fe.e.z(new C3305a((String) obj4, (String) obj5, (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                boolean z11 = obj instanceof List;
                tf.l lVar3 = this.f39568b.f30899b;
                if (!z11) {
                    lVar3.invoke(new C3300K(AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", "")));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        if (list3.get(0) != null) {
                            Object obj6 = list3.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            lVar3.invoke(new C3300K((List) obj6));
                            break;
                        } else {
                            lVar3.invoke(new C3300K(AbstractC3256n.d("null-error", "Flutter api returned null value for non-null return value.", "")));
                            break;
                        }
                    } else {
                        Object obj7 = list3.get(0);
                        AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        lVar3.invoke(new C3300K(Fe.e.z(new C3305a((String) obj7, (String) obj8, (String) list3.get(2)))));
                        break;
                    }
                }
            default:
                boolean z12 = obj instanceof List;
                tf.l lVar4 = this.f39568b.f30899b;
                if (!z12) {
                    lVar4.invoke(new C3300K(AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", "")));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        if (list4.get(0) != null) {
                            Object obj9 = list4.get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            lVar4.invoke(new C3300K((Boolean) obj9));
                            break;
                        } else {
                            lVar4.invoke(new C3300K(AbstractC3256n.d("null-error", "Flutter api returned null value for non-null return value.", "")));
                            break;
                        }
                    } else {
                        Object obj10 = list4.get(0);
                        AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list4.get(1);
                        AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        lVar4.invoke(new C3300K(Fe.e.z(new C3305a((String) obj10, (String) obj11, (String) list4.get(2)))));
                        break;
                    }
                }
        }
    }
}
