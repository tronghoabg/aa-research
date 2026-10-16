package com.unity3d.ads.core.data.datasource;

import Fe.e;
import com.google.android.gms.tasks.OnSuccessListener;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.util.List;
import ka.AbstractC3256n;
import kd.C3305a;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;
import uc.InterfaceC4266c;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements OnSuccessListener, InterfaceC4266c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f32676b;

    public /* synthetic */ a(l lVar, int i5) {
        this.f32675a = i5;
        this.f32676b = lVar;
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        C2529m c2529mD;
        C2529m c2529mD2;
        C2529m c2529mD3;
        C2529m c2529mD4;
        C2529m c2529mD5;
        C2529m c2529mD6;
        C2529m c2529mD7;
        C2529m c2529mD8;
        C2529m c2529mD9;
        C2529m c2529mD10;
        C2529m c2529mD11;
        C2529m c2529mD12;
        C2529m c2529mD13;
        C2529m c2529mD14;
        C2529m c2529mD15;
        switch (this.f32675a) {
            case 1:
                boolean z2 = obj instanceof List;
                l lVar = this.f32676b;
                if (z2) {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        c2529mD = e.z(new C3305a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                } else {
                    c2529mD = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                }
                AbstractC3256n.n(c2529mD, lVar);
                break;
            case 2:
                boolean z10 = obj instanceof List;
                l lVar2 = this.f32676b;
                if (z10) {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        c2529mD2 = e.z(new C3305a((String) obj4, (String) obj5, (String) list2.get(2)));
                    }
                } else {
                    c2529mD2 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading'.", "");
                }
                AbstractC3256n.n(c2529mD2, lVar2);
                break;
            case 3:
                boolean z11 = obj instanceof List;
                l lVar3 = this.f32676b;
                if (z11) {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        lVar3.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        c2529mD3 = e.z(new C3305a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                } else {
                    c2529mD3 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                }
                AbstractC3256n.n(c2529mD3, lVar3);
                break;
            case 4:
                boolean z12 = obj instanceof List;
                l lVar4 = this.f32676b;
                if (z12) {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        lVar4.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        c2529mD4 = e.z(new C3305a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                } else {
                    c2529mD4 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                }
                AbstractC3256n.n(c2529mD4, lVar4);
                break;
            case 5:
                boolean z13 = obj instanceof List;
                l lVar5 = this.f32676b;
                if (z13) {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        lVar5.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        c2529mD5 = e.z(new C3305a((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                } else {
                    c2529mD5 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                }
                AbstractC3256n.n(c2529mD5, lVar5);
                break;
            case 6:
                boolean z14 = obj instanceof List;
                l lVar6 = this.f32676b;
                if (z14) {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        lVar6.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        c2529mD6 = e.z(new C3305a((String) obj12, (String) obj13, (String) list6.get(2)));
                    }
                } else {
                    c2529mD6 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                }
                AbstractC3256n.n(c2529mD6, lVar6);
                break;
            case 7:
                boolean z15 = obj instanceof List;
                l lVar7 = this.f32676b;
                if (z15) {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        lVar7.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        c2529mD7 = e.z(new C3305a((String) obj14, (String) obj15, (String) list7.get(2)));
                    }
                } else {
                    c2529mD7 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                }
                AbstractC3256n.n(c2529mD7, lVar7);
                break;
            case 8:
                boolean z16 = obj instanceof List;
                l lVar8 = this.f32676b;
                if (z16) {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        lVar8.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        c2529mD8 = e.z(new C3305a((String) obj16, (String) obj17, (String) list8.get(2)));
                    }
                } else {
                    c2529mD8 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                }
                AbstractC3256n.n(c2529mD8, lVar8);
                break;
            case 9:
                boolean z17 = obj instanceof List;
                l lVar9 = this.f32676b;
                if (z17) {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        lVar9.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        c2529mD9 = e.z(new C3305a((String) obj18, (String) obj19, (String) list9.get(2)));
                    }
                } else {
                    c2529mD9 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                }
                AbstractC3256n.n(c2529mD9, lVar9);
                break;
            case 10:
                boolean z18 = obj instanceof List;
                l lVar10 = this.f32676b;
                if (z18) {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        lVar10.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        c2529mD10 = e.z(new C3305a((String) obj20, (String) obj21, (String) list10.get(2)));
                    }
                } else {
                    c2529mD10 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                }
                AbstractC3256n.n(c2529mD10, lVar10);
                break;
            case 11:
                boolean z19 = obj instanceof List;
                l lVar11 = this.f32676b;
                if (z19) {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        lVar11.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        c2529mD11 = e.z(new C3305a((String) obj22, (String) obj23, (String) list11.get(2)));
                    }
                } else {
                    c2529mD11 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                }
                AbstractC3256n.n(c2529mD11, lVar11);
                break;
            case 12:
                boolean z20 = obj instanceof List;
                l lVar12 = this.f32676b;
                if (z20) {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        lVar12.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        c2529mD12 = e.z(new C3305a((String) obj24, (String) obj25, (String) list12.get(2)));
                    }
                } else {
                    c2529mD12 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError'.", "");
                }
                AbstractC3256n.n(c2529mD12, lVar12);
                break;
            case 13:
                boolean z21 = obj instanceof List;
                l lVar13 = this.f32676b;
                if (z21) {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        lVar13.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj26 = list13.get(0);
                        AbstractC3340k.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        c2529mD13 = e.z(new C3305a((String) obj26, (String) obj27, (String) list13.get(2)));
                    }
                } else {
                    c2529mD13 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                }
                AbstractC3256n.n(c2529mD13, lVar13);
                break;
            case 14:
                boolean z22 = obj instanceof List;
                l lVar14 = this.f32676b;
                if (z22) {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        lVar14.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        AbstractC3340k.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        c2529mD14 = e.z(new C3305a((String) obj28, (String) obj29, (String) list14.get(2)));
                    }
                } else {
                    c2529mD14 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                }
                AbstractC3256n.n(c2529mD14, lVar14);
                break;
            default:
                boolean z23 = obj instanceof List;
                l lVar15 = this.f32676b;
                if (z23) {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        lVar15.invoke(new C2530n(C2515C.f34653a));
                        break;
                    } else {
                        Object obj30 = list15.get(0);
                        AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        AbstractC3340k.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        c2529mD15 = e.z(new C3305a((String) obj30, (String) obj31, (String) list15.get(2)));
                    }
                } else {
                    c2529mD15 = AbstractC3256n.d("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                }
                AbstractC3256n.n(c2529mD15, lVar15);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AndroidAppSetIdDataSource.invoke$lambda$1(this.f32676b, obj);
    }
}
