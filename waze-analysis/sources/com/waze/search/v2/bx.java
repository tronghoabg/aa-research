package com.waze.search.v2;

import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class bx extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f36207a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(Object obj, int i2) {
        super(1, obj, ck.class, "updateBottomSheetHeaderHeightLpp", "updateBottomSheetHeaderHeightLpp-0680j_4(F)V", 0);
        this.f36207a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f36207a) {
            case 0:
                float fM11178unboximpl = ((Dp) obj).m11178unboximpl();
                ck ckVar = (ck) this.receiver;
                ckVar.U(b.g(ckVar.N(), null, Dp.m11162boximpl(fM11178unboximpl), 1));
                break;
            case 1:
                com.waze.speech.k kVar = (com.waze.speech.k) obj;
                h.g.b.x.f(kVar, "p0");
                ((fi) this.receiver).aa(kVar);
                break;
            case 2:
                float fM11178unboximpl2 = ((Dp) obj).m11178unboximpl();
                ck ckVar2 = (ck) this.receiver;
                ckVar2.U(b.g(ckVar2.N(), Dp.m11162boximpl(fM11178unboximpl2), null, 2));
                break;
            case 3:
                com.waze.speech.k kVar2 = (com.waze.speech.k) obj;
                h.g.b.x.f(kVar2, "p0");
                ((fi) this.receiver).aa(kVar2);
                break;
            case 4:
                com.waze.speech.k kVar3 = (com.waze.speech.k) obj;
                h.g.b.x.f(kVar3, "p0");
                ((fi) this.receiver).aa(kVar3);
                break;
            case 5:
                ((ck) this.receiver).o.setValue(Dp.m11162boximpl(((Dp) obj).m11178unboximpl()));
                break;
            case 6:
                com.waze.reports_v2.c.a aVar = (com.waze.reports_v2.c.a) obj;
                h.g.b.x.f(aVar, "p0");
                ((com.waze.navigate.location_preview.bk) this.receiver).d(aVar);
                break;
            case 7:
                dw dwVar = (dw) obj;
                h.g.b.x.f(dwVar, "p0");
                ((fi) this.receiver).ap(dwVar);
                break;
            default:
                dw dwVar2 = (dw) obj;
                h.g.b.x.f(dwVar2, "p0");
                ((fi) this.receiver).ap(dwVar2);
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(Object obj, int i2, byte[] bArr) {
        super(1, obj, fi.class, "handleEvent", "handleEvent(Lcom/waze/search/v2/SearchV2Event;)V", 0);
        this.f36207a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(Object obj, int i2, char[] cArr) {
        super(1, obj, ck.class, "updateBottomSheetHeaderHeightSearch", "updateBottomSheetHeaderHeightSearch-0680j_4(F)V", 0);
        this.f36207a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(Object obj, int i2, float[] fArr) {
        super(1, obj, com.waze.navigate.location_preview.bk.class, "handleRequest", "handleRequest(Lcom/waze/navigate/location_preview/UIRequest;)V", 0);
        this.f36207a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(Object obj, int i2, boolean[] zArr) {
        super(1, obj, ck.class, "updateOverlayBottomButtonsHeight", "updateOverlayBottomButtonsHeight-0680j_4(F)V", 0);
        this.f36207a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bx(Object obj, int i2, byte[][] bArr) {
        super(1, obj, fi.class, "emitUIRequest", "emitUIRequest(Lcom/waze/search/v2/SearchV2UIRequest;)V", 0);
        this.f36207a = i2;
    }
}
