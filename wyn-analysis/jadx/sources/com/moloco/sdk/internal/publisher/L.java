package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class L extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28924a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f28925b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f28926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i5, InterfaceC3103c interfaceC3103c, int i10) {
        super(i5, interfaceC3103c);
        this.f28924a = i10;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i5 = this.f28924a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        InterfaceC3103c interfaceC3103c = (InterfaceC3103c) obj3;
        switch (i5) {
            case 0:
                L l10 = new L(3, interfaceC3103c, 0);
                l10.f28925b = zBooleanValue;
                l10.f28926c = zBooleanValue2;
                return l10.invokeSuspend(C2515C.f34653a);
            case 1:
                L l11 = new L(3, interfaceC3103c, 1);
                l11.f28925b = zBooleanValue;
                l11.f28926c = zBooleanValue2;
                return l11.invokeSuspend(C2515C.f34653a);
            case 2:
                L l12 = new L(3, interfaceC3103c, 2);
                l12.f28925b = zBooleanValue;
                l12.f28926c = zBooleanValue2;
                return l12.invokeSuspend(C2515C.f34653a);
            case 3:
                L l13 = new L(3, interfaceC3103c, 3);
                l13.f28925b = zBooleanValue;
                l13.f28926c = zBooleanValue2;
                return l13.invokeSuspend(C2515C.f34653a);
            case 4:
                L l14 = new L(3, interfaceC3103c, 4);
                l14.f28925b = zBooleanValue;
                l14.f28926c = zBooleanValue2;
                return l14.invokeSuspend(C2515C.f34653a);
            default:
                L l15 = new L(3, interfaceC3103c, 5);
                l15.f28925b = zBooleanValue;
                l15.f28926c = zBooleanValue2;
                return l15.invokeSuspend(C2515C.f34653a);
        }
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        boolean z2 = false;
        switch (this.f28924a) {
            case 0:
                kf.a aVar = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z10 = this.f28925b;
                boolean z11 = this.f28926c;
                if (z10 && z11) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 1:
                kf.a aVar2 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z12 = this.f28925b;
                boolean z13 = this.f28926c;
                if (z12 && z13) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                kf.a aVar3 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z14 = this.f28925b;
                boolean z15 = this.f28926c;
                if (z14 && z15) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 3:
                kf.a aVar4 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z16 = this.f28925b;
                boolean z17 = this.f28926c;
                if (z16 && z17) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                kf.a aVar5 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z18 = this.f28925b;
                boolean z19 = this.f28926c;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb2 = new StringBuilder("isAdDisplaying final: ");
                sb2.append(z18 && z19);
                sb2.append(", _isAdDisplaying: ");
                sb2.append(z18);
                sb2.append(", webViewIsDisplaying: ");
                sb2.append(z19);
                MolocoLogger.info$default(molocoLogger, "TemplateFullscreenAd", sb2.toString(), null, false, 12, null);
                if (z18 && z19) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                kf.a aVar6 = kf.a.f39711a;
                Fe.e.U(obj);
                boolean z20 = this.f28925b;
                boolean z21 = this.f28926c;
                if (z20 && z21) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
